package apple;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Save implements Runnable {
    private static JavaPlugin plugin;
    private static long hourDelay = 60 * 60 * 60 * 20;

    public static void initialize(JavaPlugin pl) {
        plugin = pl;
    }

    public static void saveNow() {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/save-all [flush]");
    }

    @Override
    public void run() {
        Bukkit.getServer().broadcastMessage(ChatColor.GRAY + "Saving the server!");
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "/save-all");
        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, this, hourDelay);
    }
}
