package de.fabidev.commands;

import com.plotsquared.core.plot.Plot;
import de.fabidev.utils.PlotChangeManager;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {

        PlotChangeManager.change(Material.DIAMOND_BLOCK, (Player) commandSender, "border");
        PlotChangeManager.change(Material.EMERALD_BLOCK, (Player) commandSender, "wall");


        return false;
    }
}
