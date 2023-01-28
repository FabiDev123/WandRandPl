package de.fabidev.utils;

import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.Plot;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class PlotChangeManager {

    public static void change(Material material, Player player, String where){

        PlotPlayer<Player> plotPlayer = PlotPlayer.from(player);
        Plot plot = plotPlayer.getCurrentPlot();
        if (plot != null){

        }

    }


}
