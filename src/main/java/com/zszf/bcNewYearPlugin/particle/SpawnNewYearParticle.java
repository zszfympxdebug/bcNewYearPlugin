package com.zszf.bcNewYearPlugin.particle;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;

import java.util.Random;

public class SpawnNewYearParticle {
    public void SpawnParticle(Location base, int count, Particle particle) {
        Random r = new Random();
        World world = base.getWorld();
        double x = r.nextInt(20) - 10 + base.getX();
        double y = r.nextInt(20) - 10 + base.getY();
        double z = r.nextInt(20) - 10 + base.getZ();
        Location location = new Location(base.getWorld(), x, y, z);
        world.spawnParticle(particle, location, count);
    }
}
