package net.tv.twitch.chrono_fish.casino;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Casino extends JavaPlugin {

    private static Logger myLogger;

    @Override
    public void onEnable() {
        myLogger = getLogger();
        registerCommands();
        Bukkit.getPluginManager().registerEvents(new CasinoEvent() ,this);
    }

    @Override
    public void onDisable() {
        // save information to local file
    }

    public void registerCommands(){
        getCommand("shop").setExecutor(new CasinoCommand());
    }

    public static void putLogger(String message){
        myLogger.info(message);
    }
}
