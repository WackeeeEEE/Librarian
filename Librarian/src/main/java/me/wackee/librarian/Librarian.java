package me.wackee.librarian;

import org.bukkit.plugin.java.JavaPlugin;

public final class Librarian extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Goodbye World!");
    }
}
