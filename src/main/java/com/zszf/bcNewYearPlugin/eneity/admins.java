package com.zszf.bcNewYearPlugin.eneity;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class admins {
    public static String[] admin_id;

    public static String[] getAdmin_id() {
        return admin_id;
    }

    public Player[] getAdmin() {
        Player[] admins = new Player[admin_id.length];
        for (int i = 0; i < admin_id.length; i++) {
            admins[i] = Bukkit.getPlayer(admin_id[i]);
        }
        return admins;
    }
}
