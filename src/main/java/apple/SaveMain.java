package apple;


import org.bukkit.plugin.java.JavaPlugin;

public class SaveMain extends JavaPlugin {
    @Override
    public void onEnable() {
        (new Save()).initialize(this);
        System.out.println("[FoundationAutoSave] enabled");
    }

    public void onDisable() {
        Save.saveNow();
        System.out.println("[FoundationAutoSave] Saved the server!");
    }
}
