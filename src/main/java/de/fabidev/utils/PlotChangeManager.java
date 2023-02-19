package de.fabidev.utils;

import com.plotsquared.core.configuration.ConfigurationUtil;
import com.plotsquared.core.location.Location;
import com.plotsquared.core.player.PlotPlayer;
import com.plotsquared.core.plot.BlockBucket;
import com.plotsquared.core.plot.Plot;
import com.sk89q.worldedit.function.pattern.Pattern;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class PlotChangeManager {

    public static void change(Material material, Player player, String where) {

        if (where.equalsIgnoreCase("boden")) {
            PlotPlayer<Player> plotPlayer = PlotPlayer.from(player);
            Plot plot = plotPlayer.getCurrentPlot();
            if (plot != null && plot.getOwners().size() > 0) {
                if (plot.isOwner(plotPlayer.getUUID()) || player.hasPermission(Strings.permissionAdmin)) {
                    for (Plot plot1 : plot.getConnectedPlots()) {
                        Location bottom = plot1.getBottomAbs();
                        Location top = plot1.getTopAbs();
                        for (int x = bottom.getX() - 9; x <= top.getX()+ 1; x++) {
                            for (int z = bottom.getZ() - 9; z <= top.getZ() + 1; z++) {
                                org.bukkit.Location loc = new org.bukkit.Location(player.getWorld(), x, -64, z);
                                player.getWorld().getBlockAt(loc).setType(material);
                            }
                        }
                    }
                }else {
                    player.closeInventory();
                    player.sendMessage("§4§lDu bist nicht der Eigentümer dieses Plots!");
                }
            }else {
                player.closeInventory();
                player.sendMessage("§4§lDu befindest dich auf keinem Plot");
            }
        } else {
            PlotPlayer<Player> plotPlayer = PlotPlayer.from(player);
            Pattern pattern = ((BlockBucket) ConfigurationUtil.BLOCK_BUCKET.parseString(material.name())).toPattern();
            Plot plot = plotPlayer.getCurrentPlot();
            if (plot != null && plot.getOwners().size() > 0) {
                if (plot.isOwner(plotPlayer.getUUID()) || player.hasPermission(Strings.permissionAdmin)) {
                    if (plot.getConnectedPlots().size() > 1) {
                        for (Plot plots : plotPlayer.getCurrentPlot().getConnectedPlots()) {
                            plots.getArea().getPlotManager().setComponent(plots.getId(), where, pattern, null, null);
                        }
                    } else {
                        plot.getArea().getPlotManager().setComponent(plot.getId(), where, pattern, null, null);
                    }
                }else {
                    player.closeInventory();
                    player.sendMessage("§4§lDu bist nicht der Eigentümer dieses Plots!");
                }
            }else {
                player.closeInventory();
                player.sendMessage("§4§lDu befindest dich auf keinem Plot");
            }
        }


    }


}
