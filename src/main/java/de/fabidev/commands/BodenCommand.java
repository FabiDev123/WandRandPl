package de.fabidev.commands;

import com.plotsquared.core.PlotAPI;
import com.plotsquared.core.PlotSquared;
import com.plotsquared.core.configuration.ConfigurationUtil;
import com.plotsquared.core.location.Location;
import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.BlockBucket;
import com.plotsquared.core.plot.Plot;
import com.plotsquared.core.util.RegionManager;
import com.sk89q.worldedit.function.pattern.Pattern;
import de.fabidev.Wandrand;
import de.fabidev.utils.GUI;
import de.fabidev.utils.PlotChangeManager;
import de.fabidev.utils.Strings;
import org.bukkit.Material;
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
            if (p.hasPermission(Strings.permissionRand) || p.hasPermission(Strings.permissionAdmin)){
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
