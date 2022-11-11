package com.zszf.bcNewYearPlugin.command;

import com.zszf.bcNewYearPlugin.eneity.admins;
import com.zszf.bcNewYearPlugin.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

public class stopParkourExecutor implements CommandExecutor {
    @Override
    @ParametersAreNonnullByDefault
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(args.length != 0){
            return false;
        }
        Player p = (Player) sender;
        Player[] admins_id = Objects.requireNonNull(main.instance.getConfig().getObject("admins", admins.class)).getAdmin();
        for (Player player : admins_id) {
            if (p == player) {
                main.isStartParkour = false;
                break;
            }
        }
        return true;
    }
}
