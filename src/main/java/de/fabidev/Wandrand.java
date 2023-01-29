package de.fabidev;

import de.fabidev.commands.RandCommand;
import de.fabidev.commands.TestCommand;
import de.fabidev.commands.WandCommand;
import de.fabidev.listeners.InventoryClickListener;
import de.fabidev.utils.GUI;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Wandrand extends JavaPlugin {

    public static GUI gui = new GUI();



    @Override
    public void onEnable(){
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable(){

    }

    private void registerListeners(){
        this.getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }

    private void registerCommands(){
        this.getCommand("test").setExecutor(new TestCommand());
        this.getCommand("wand").setExecutor(new WandCommand());
        this.getCommand("rand").setExecutor(new RandCommand());
    }


}
