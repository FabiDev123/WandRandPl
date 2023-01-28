package de.fabidev;

import de.fabidev.commands.TestCommand;
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
    }


}
