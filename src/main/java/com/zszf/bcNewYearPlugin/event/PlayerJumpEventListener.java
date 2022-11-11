package com.zszf.bcNewYearPlugin.event;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import com.zszf.bcNewYearPlugin.main;
import com.zszf.bcNewYearPlugin.particle.SpawnNewYearParticle;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJumpEventListener implements Listener {
    @EventHandler
    public void onPlayerJump(PlayerJumpEvent e){
        if(main.isStartParkour){
            SpawnNewYearParticle spawnNewYearParticle = new SpawnNewYearParticle();
            spawnNewYearParticle.SpawnParticle(e.getPlayer().getLocation(),  10, Particle.GLOW);
        }
    }
}
