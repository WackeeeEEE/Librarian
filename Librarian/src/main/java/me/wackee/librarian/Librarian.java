package me.wackee.librarian;

import me.wackee.librarian.commands.lbCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class Librarian extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!");

        getCommand("lb").setExecutor(new lbCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Goodbye World!");
    }
}
