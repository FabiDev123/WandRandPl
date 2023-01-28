package de.fabidev.utils;

import com.plotsquared.core.configuration.ConfigurationUtil;
import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.BlockBucket;
import com.plotsquared.core.plot.Plot;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class PlotChangeManager {

    public static void change(Material material, Player player, String where){

        PlotPlayer<Player> plotPlayer = PlotPlayer.from(player);
        Plot plot = plotPlayer.getCurrentPlot();
        Pattern
        if (plot != null){
            if(plot.getConnectedPlots().size() >1){
                for (Plot plots : plot.getConnectedPlots()){
                    if (plots.getOwners().contains(player.getUniqueId()) || player.hasPermission(Strings.permissionAdmin)){
                        plots.getPlotModificationManager().setComponent(Material.QUARTZ_BRICKS, , null, null);

                    }
                }
            }
        }else{
            player.sendMessage(Strings.notOnPlot);
        }

    }


}