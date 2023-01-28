package de.fabidev.utils;

import com.plotsquared.core.configuration.ConfigurationUtil;
import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.BlockBucket;
import com.plotsquared.core.plot.Plot;
import com.sk89q.worldedit.function.pattern.Pattern;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class PlotChangeManager {

    public static void change(Material material, Player player, String where){

        PlotPlayer<Player> plotPlayer = PlotPlayer.from(player);
        Pattern pattern = ((BlockBucket)ConfigurationUtil.BLOCK_BUCKET.parseString(material.name())).toPattern();
        Plot plot = plotPlayer.getCurrentPlot();
        if(plot != null && plot.getOwners().size() > 0){
            if(plot.getConnectedPlots().size() > 1){
                for (Plot plots : plotPlayer.getCurrentPlot().getConnectedPlots()){
                    plots.getArea().getPlotManager().setComponent(plots.getId(), where, pattern, null, null);
                }
            }else{
                plot.getArea().getPlotManager().setComponent(plot.getId(), where, pattern, null, null);
            }
        }

    }


}
