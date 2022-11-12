package com.zszf.bcNewYearPlugin;

import com.zszf.bcNewYearPlugin.command.startParkourExecutor;
import com.zszf.bcNewYearPlugin.command.stopParkourExecutor;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class main extends JavaPlugin {
    public static JavaPlugin instance;
    public static boolean isStartParkour;
    public final Logger logger = Bukkit.getLogger();
    public final FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        logger.info("Enable bcNewYearPlugin");
        logger.info("祝你看到这句话时过年过的开开心心！");
        Objects.requireNonNull(Bukkit.getPluginCommand("startparkour")).setExecutor(new startParkourExecutor());
        Objects.requireNonNull(Bukkit.getPluginCommand("stopparkout")).setExecutor(new stopParkourExecutor());
        logger.info("命令处理器加载完成");

        instance = this;
    }

    @Override
    public void onLoad() {
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        logger.info("啊，过年活动好快啊！");
    }
}
