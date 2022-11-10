package com.zszf.bcNewYearPlugin;

import com.zszf.bcNewYearPlugin.command.startParkourExecutor;
import com.zszf.bcNewYearPlugin.eneity.admins;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

public class main extends JavaPlugin {
    public static JavaPlugin instance;
    public final Logger logger = Bukkit.getLogger();
    public final FileConfiguration config = getConfig();
    public static boolean isStartParkour;

    @Override
    public void onEnable(){
        logger.info("Enable bcNewYearPlugin");
        config.getObject("admins", admins.class);
        String[] admins_id = com.zszf.bcNewYearPlugin.eneity.admins.getAdmin_id();
        logger.info("管理员有："+ Arrays.toString(admins_id));
        logger.info("祝你看到这句话时过年过的开开心心！");
        Objects.requireNonNull(Bukkit.getPluginCommand("startparkour")).setExecutor(new startParkourExecutor());
        logger.info("命令处理器加载完成");

        instance = this;
    }

    @Override
    public void onLoad(){
        saveDefaultConfig();
    }

    @Override
    public void onDisable(){
        logger.info("啊，过年活动好快啊！");
    }
}
