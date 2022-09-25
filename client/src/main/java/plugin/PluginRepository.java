package plugin;

import plugin.api.MiniMenuEntry;
import plugin.api.MiniMenuType;
import rt4.*;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Responsible for loading and broadcasting methods to all plugins.
 * @author ceikry
 */
public class PluginRepository {
    static HashMap<PluginInfo, Plugin> loadedPlugins = new HashMap<>();

    public static void registerPlugin(PluginInfo info, Plugin plugin) {
        loadedPlugins.put(info, plugin);
    }

    public static void reloadPlugins() {
        loadedPlugins.clear();
        Init();
    }

    public static void Init() {
        File pluginsDirectory = new File(GlobalJsonConfig.instance.pluginsFolder);

        if (!pluginsDirectory.exists()) {
            System.out.println("Skipping plugin initialization - " + pluginsDirectory.getAbsolutePath() + " does not exist.");
            return;
        }

        try {
            URL[] classPath = {pluginsDirectory.toURI().toURL()};
            URLClassLoader loader = new URLClassLoader(classPath);

            for(File file : Objects.requireNonNull(pluginsDirectory.listFiles())) {
                if(!file.isDirectory()) continue;
                if(file.getName().equals("META-INF")) continue;

                File infoFile = new File(file.getAbsoluteFile() + File.separator + "plugin.properties");
                File pluginRoot = new File(file.getAbsoluteFile() + File.separator + "plugin.class");

                if (!pluginRoot.exists()) {
                    System.err.println("Unable to load plugin " + file.getName() + " because plugin.class is absent!");
                    continue;
                }

                Class<?> clazz = loader.loadClass(file.getName() + ".plugin");

                PluginInfo info;
                if (infoFile.exists())
                    info = PluginInfo.loadFromFile(infoFile);
                else
                    info = PluginInfo.loadFromClass(clazz);

                if (info == null) {
                    System.err.println("Unable to load plugin " + file.getName() + " because it contains no information about author, version, etc!");
                    continue;
                }

                try {
                    Plugin thisPlugin = (Plugin) clazz.newInstance();
                    thisPlugin._init();
                    registerPlugin(info, thisPlugin);
                } catch (Exception e) {
                    System.err.println("Error loading plugin " + file.getName() + ":");
                    e.printStackTrace();
                    return;
                }

                List<File> otherClasses = Arrays.stream(Objects.requireNonNull(file.listFiles()))
                        .filter((f) ->
                                !f.getName().equals("plugin.class") && f.getName().contains(".class"))
                        .collect(Collectors.toList());

                for (File f : otherClasses) {
                    loader.loadClass(file.getName() + "." + f.getName().replace(".class",""));
                }

                System.out.println("Successfully loaded plugin " + file.getName() + ", version " + info.version);
            }
        } catch (Exception e) {
            System.err.println("Unexpected exception during plugin initialization:");
            e.printStackTrace();
        }
    }

    public static void Update() {
        loadedPlugins.values().forEach(Plugin::Update);
    }

    public static void Draw() {
        loadedPlugins.values().forEach(Plugin::_draw);
    }

    public static void NPCOverheadDraw(Npc npc, int screenX, int screenY) {
        loadedPlugins.values().forEach((plugin) -> plugin.NPCOverheadDraw(npc, screenX, screenY));
    }

    public static void PlayerOverheadDraw(Player player, int screenX, int screenY) {
        loadedPlugins.values().forEach((plugin) -> plugin.PlayerOverheadDraw(player, screenX, screenY));
    }

    public static void ProcessCommand(JagString commandStr) {
        String[] tokens = commandStr.toString().split(" ");
        String[] args = Arrays.copyOfRange(tokens, 1, tokens.length);
        loadedPlugins.values().forEach((plugin) -> plugin.ProcessCommand(tokens[0], args));
    }

    public static void ComponentDraw(int componentIndex, Component component, int screenX, int screenY) {
        loadedPlugins.values().forEach((plugin) -> plugin.ComponentDraw(componentIndex, component, screenX, screenY));
    }

    public static void OnVarpUpdate(int id, int value) {
        loadedPlugins.values().forEach((plugin) -> plugin.OnVarpUpdate(id, value));
    }

    public static void OnXPUpdate(int skill, int xp) {
        loadedPlugins.values().forEach((plugin) -> plugin.OnXPUpdate(skill, xp));
    }

    public static void OnLogout() {
        loadedPlugins.values().forEach(Plugin::OnLogout);
    }

    public static void DrawMiniMenu(MiniMenuEntry entry) {
        loadedPlugins.values().forEach((plugin) -> plugin.DrawMiniMenu(entry));
    }
}
