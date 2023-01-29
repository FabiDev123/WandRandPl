package de.fabidev.listeners;

import de.fabidev.utils.PlotChangeManager;
import de.fabidev.utils.Strings;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        if(e.getView().getTitle().equalsIgnoreCase(Strings.invBorder)){
            e.setCancelled(true);
            PlotChangeManager.change(e.getCurrentItem().getType(), (Player)e.getWhoClicked(), "border");
            e.getWhoClicked().closeInventory();
        }else if (e.getView().getTitle().equalsIgnoreCase(Strings.invWall)){
            e.setCancelled(true);
            PlotChangeManager.change(e.getCurrentItem().getType(), (Player)e.getWhoClicked(), "wall");
            e.getWhoClicked().closeInventory();
        }

    }


}
