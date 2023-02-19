package de.fabidev.listeners;

import de.fabidev.Wandrand;
import de.fabidev.utils.GUI;
import de.fabidev.utils.Items;
import de.fabidev.utils.PlotChangeManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){

        try {
            if (e.getView().getTitle().equalsIgnoreCase("§6Seite 1")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 2);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 10);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                            if (items.returnItem().getType() == m) {
                                PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                            }
                    }
                }
                e.setCancelled(true);
            }else if (e.getView().getTitle().equalsIgnoreCase("§6Seite 2")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 3);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 1);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }
                e.setCancelled(true);
            }else if (e.getView().getTitle().equalsIgnoreCase("§6Seite 3")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 4);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 2);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 4")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 5);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 3);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 5")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 6);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 4);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 6")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 7);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 5);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 7")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 8);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 6);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 8")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 9);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 7);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 9")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 10);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 8);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§6Seite 10")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 1);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIRand((Player) e.getWhoClicked(), 9);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemRand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "border");
                        }
                    }
                }e.setCancelled(true);
            }else



                if (e.getView().getTitle().equalsIgnoreCase("§5Seite 1")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 2);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 8);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }
                e.setCancelled(true);
            }else if (e.getView().getTitle().equalsIgnoreCase("§5Seite 2")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 3);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 1);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }
                e.setCancelled(true);
            }else if (e.getView().getTitle().equalsIgnoreCase("§5Seite 3")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 4);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 2);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§5Seite 4")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 5);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 3);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§5Seite 5")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 6);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 4);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§5Seite 6")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 7);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 5);

                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§5Seite 7")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 8);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 6);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }e.setCancelled(true);
            }else  if (e.getView().getTitle().equalsIgnoreCase("§5Seite 8")){
                if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 1);
                }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                    GUI.openGUIWand((Player) e.getWhoClicked(), 7);
                }else {
                    Material m = e.getCurrentItem().getType();
                    if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                    }else{
                        e.getWhoClicked().closeInventory();
                        e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                        return;
                    }
                    for (Items items : Wandrand.wr.itemWand){
                        if (items.returnItem().getType() == m) {
                            PlotChangeManager.change(m, (Player) e.getWhoClicked(), "wall");
                        }
                    }
                }e.setCancelled(true);
            }else


                if (e.getView().getTitle().equalsIgnoreCase("§4Seite 1")){
                    if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                      //  e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 2);
                    }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                        //e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 5);
                    }else {
                        Material m = e.getCurrentItem().getType();
                        if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                        }else{
                            e.getWhoClicked().closeInventory();
                            e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                            return;
                        }
                        for (Items items : Wandrand.wr.itemBoden){
                            if (items.returnItem().getType() == m) {
                                PlotChangeManager.change(m, (Player) e.getWhoClicked(), "boden");
                            }
                        }
                    }
                    e.setCancelled(true);
                }else if (e.getView().getTitle().equalsIgnoreCase("§4Seite 2")){
                    if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 3);
                    }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 1);
                    }else {
                        Material m = e.getCurrentItem().getType();
                        if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                        }else{
                            e.getWhoClicked().closeInventory();
                            e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                            return;
                        }
                        for (Items items : Wandrand.wr.itemBoden){
                            if (items.returnItem().getType() == m) {
                                PlotChangeManager.change(m, (Player) e.getWhoClicked(), "boden");
                            }
                        }
                    }
                    e.setCancelled(true);
                }else if (e.getView().getTitle().equalsIgnoreCase("§4Seite 3")){
                    if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 4);
                    }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 2);
                    }else {
                        Material m = e.getCurrentItem().getType();
                        if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                        }else{
                            e.getWhoClicked().closeInventory();
                            e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                            return;
                        }
                        for (Items items : Wandrand.wr.itemBoden){
                            if (items.returnItem().getType() == m) {
                                PlotChangeManager.change(m, (Player) e.getWhoClicked(), "boden");
                            }
                        }
                    }e.setCancelled(true);
                }else  if (e.getView().getTitle().equalsIgnoreCase("§4Seite 4")){
                    if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 5);
                    }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 3);
                    }else {
                        Material m = e.getCurrentItem().getType();
                        if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                        }else{
                            e.getWhoClicked().closeInventory();
                            e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                            return;
                        }
                        for (Items items : Wandrand.wr.itemBoden){
                            if (items.returnItem().getType() == m) {
                                PlotChangeManager.change(m, (Player) e.getWhoClicked(), "boden");
                            }
                        }
                    }e.setCancelled(true);
                }else  if (e.getView().getTitle().equalsIgnoreCase("§4Seite 5")){
                    if (e.getCurrentItem().getType() == Material.GREEN_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 1);
                    }else if (e.getCurrentItem().getType() == Material.RED_STAINED_GLASS_PANE){
                       // e.getWhoClicked().closeInventory();
                        GUI.openGUIBoden((Player) e.getWhoClicked(), 4);
                    }else {
                        Material m = e.getCurrentItem().getType();
                        if (e.getCurrentItem().getItemMeta().getLore().get(0).equalsIgnoreCase("§aFreigeschaltet!")){
                        }else{
                            e.getWhoClicked().closeInventory();
                            e.getWhoClicked().sendMessage("§4Dieses Item hast du noch nicht freigeschaltet!");
                            return;
                        }
                        for (Items items : Wandrand.wr.itemBoden){
                            if (items.returnItem().getType() == m) {
                                PlotChangeManager.change(m, (Player) e.getWhoClicked(), "boden");
                            }
                        }
                    }e.setCancelled(true);
                }
        }catch (Exception ex){

        }





        /*
        if(e.getView().getTitle().equalsIgnoreCase(Strings.invBorder)){
            try {
                e.setCancelled(true);
                PlotChangeManager.change(e.getCurrentItem().getType(), (Player) e.getWhoClicked(), "border");
                e.getWhoClicked().closeInventory();
            }catch (Exception ex){

            }
        }else if (e.getView().getTitle().equalsIgnoreCase(Strings.invWall)){
            try {
                e.setCancelled(true);
                PlotChangeManager.change(e.getCurrentItem().getType(), (Player) e.getWhoClicked(), "boden");
                e.getWhoClicked().closeInventory();
            }catch (Exception ex){

            }
        }*/

    }



}
