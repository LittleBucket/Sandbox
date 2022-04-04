package com.sandbox.theres_sand_in_mi_pants;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Theres_Sand_In_Mi_Pants extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("SANDBOX PLUGIN IS WORKING. GOOD JOB BIG BOI");
        getServer().getPluginManager().registerEvents(this,this);
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Bukkit.broadcastMessage("Welcome to the server");
        Bukkit.broadcastMessage("Welcome to the server" + " " + event.getPlayer().getName());
    }

    @EventHandler

    public void onBlockBreak(BlockBreakEvent event){
        //spits out long text of broken block rather then just block name itself
        // Bukkit.broadcastMessage(event.getPlayer().getName() + "Has broken" + " " + event.getBlock().getBlockData());

        //Lists cord of where player is looking
        // Bukkit.broadcastMessage(event.getPlayer().getName() + "Is Looking at" + " " + event.getPlayer().getTargetBlock(null,3).getLocation());
    }


    @Override
    public void onDisable() {
        System.out.println("SANDBOX IS CLOSING NOW. WHY IS IT SO DARK.");
    }
}
