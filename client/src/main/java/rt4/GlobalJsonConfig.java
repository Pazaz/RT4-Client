package rt4;

import com.google.gson.Gson;

import java.io.FileReader;

public class GlobalJsonConfig {
	public static GlobalJsonConfig instance = null;

	public static void load(String path) {
		Gson gson = new Gson();

		try {
			instance = gson.fromJson(new FileReader(path), GlobalJsonConfig.class);
		} catch (Exception ex) {
			System.err.println("No config.json file, using defaults");
		}
	}

	// ----

	String ip_management;
	String ip_address;
	int world;
	int server_port;
	int wl_port;
	int js5_port;
	boolean mouseWheelZoom = GlobalConfig.MOUSEWHEEL_ZOOM;
	public String pluginsFolder = "plugins";
}
