package de.fabidev;

import de.fabidev.commands.RandCommand;
import de.fabidev.commands.TestCommand;
import de.fabidev.commands.WandCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Wandrand extends JavaPlugin {

    @Override
    public void onEnable(){
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable(){

    }

    private void registerListeners(){

    }

    private void registerCommands(){
        this.getCommand("test").setExecutor(new TestCommand());
        this.getCommand("wand").setExecutor(new WandCommand());
        this.getCommand("rand").setExecutor(new RandCommand());
    }


}
