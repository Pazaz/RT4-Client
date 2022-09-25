package plugin;

import plugin.annotations.PluginMeta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

/**
 * A data class for storing information about plugins.
 * @author ceikry
 */
class PluginInfo {
  double version;
  String author;
  String description;

  public PluginInfo(String author, String description, double version) {
    this.version = version;
    this.author = author;
    this.description = description;
  }

  public static PluginInfo loadFromFile(File file) {
    Properties prop = new Properties();

    try {
      prop.load(new FileReader(file));
    } catch (FileNotFoundException e) {
      System.err.println("File does not exist! - " + file.getAbsolutePath());
      return new PluginInfo("", "", 0.0);
    } catch (IOException e) {
      e.printStackTrace();
      return new PluginInfo("", "", 0.0);
    }

    return new PluginInfo(
            prop.get("AUTHOR").toString(),
            prop.get("DESCRIPTION").toString(),
            Double.parseDouble(prop.get("VERSION").toString())
    );
  }

  public static PluginInfo loadFromClass(Class<?> clazz) {
    PluginMeta info = clazz.getAnnotation(PluginMeta.class);

    if (info == null) {
      return null;
    }

    return new PluginInfo(
            info.author(),
            info.description(),
            info.version()
    );
  }

    @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PluginInfo that = (PluginInfo) o;
    return Double.compare(that.version, version) == 0 && Objects.equals(author, that.author) && Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, author, description);
  }
}
