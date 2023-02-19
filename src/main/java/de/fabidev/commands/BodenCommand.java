package de.fabidev.commands;

import de.fabidev.utils.GUI;
import de.fabidev.utils.Strings;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BodenCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {

        if(sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission(Strings.permissionBoden) || p.hasPermission(Strings.permissionAdmin)){
                GUI.openGUIBoden(p, 1);
            }else{
                p.sendMessage(Strings.noPermission);
            }
        }else{
            System.out.println(Strings.noConsoleCommand);
        }
        return false;
    }
}
