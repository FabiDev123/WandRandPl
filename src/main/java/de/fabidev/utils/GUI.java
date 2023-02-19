package de.fabidev.utils;


import de.fabidev.Wandrand;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI {

    private static ItemStack nextPage = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
    private static ItemStack previousPage = new ItemStack(Material.RED_STAINED_GLASS_PANE);


    public static void openGUIBoden(Player p, int i){
        ItemMeta im = nextPage.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§aNächste Seite");
        im.setLore(lore);
        nextPage.setItemMeta(im);

        ItemMeta impre = previousPage.getItemMeta();
        lore.clear();
        lore.add("§cVorherige Seite");
        impre.setLore(lore);
        previousPage.setItemMeta(impre);


        switch (i) {
            case 1:
                Inventory inventory1 = Bukkit.createInventory(null, 54, "§4Seite 1");
                inventory1.setItem(53, nextPage);
                inventory1.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemBoden) {
                    items.setMeta(p);
                    if (items.returnItemsByName("knight") != null) {
                        inventory1.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory1);
                break;
            case 2:
                Inventory inventory2 = Bukkit.createInventory(null, 54, "§4Seite 2");
                inventory2.setItem(53, nextPage);
                inventory2.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemBoden) {
                    items.setMeta(p);
                    if (items.returnItemsByName("duke") != null) {
                        inventory2.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory2);
                break;
            case 3:
                Inventory inventory3 = Bukkit.createInventory(null, 54, "§4Seite 3");
                inventory3.setItem(53, nextPage);
                inventory3.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemBoden) {
                    items.setMeta(p);
                    if (items.returnItemsByName("senator") != null) {
                        inventory3.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory3);
                break;
            case 4:
                Inventory inventory4 = Bukkit.createInventory(null, 54, "§4Seite 4");
                inventory4.setItem(53, nextPage);
                inventory4.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemBoden) {
                    items.setMeta(p);
                    if (items.returnItemsByName("king") != null) {
                        inventory4.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory4);
                break;
            case 5:
                Inventory inventory5 = Bukkit.createInventory(null, 54, "§4Seite 5");
                inventory5.setItem(53, nextPage);
                inventory5.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemBoden) {
                    items.setMeta(p);
                    if (items.returnItemsByName("wandrand.boden.endstone_bricks") != null ||
                            items.returnItemsByName("wandrand.boden.packed_ice") != null ||
                            items.returnItemsByName("wandrand.boden.endstone") != null ||
                            items.returnItemsByName("wandrand.boden.crying_obsidian") != null ||
                            items.returnItemsByName("wandrand.boden.amethyst_block") != null ||
                            items.returnItemsByName("wandrand.boden.slimeblock") != null ||
                            items.returnItemsByName("wandrand.boden.honeyblock") != null ||
                            items.returnItemsByName("wandrand.boden.barrier") != null ||
                            items.returnItemsByName("wandrand.boden.mud") != null) {
                        inventory5.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory5);
                break;
        }




    }


    public static void openGUIWand(Player p, int i){
        ItemMeta im = nextPage.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§aNächste Seite");
        im.setLore(lore);
        nextPage.setItemMeta(im);


        ItemMeta impre = previousPage.getItemMeta();
        lore.clear();
        lore.add("§cVorherige Seite");
        impre.setLore(lore);
        previousPage.setItemMeta(impre);

        switch (i) {
            case 1:
                Inventory inventory1 = Bukkit.createInventory(null, 54, "§5Seite 1");
                inventory1.setItem(53, nextPage);
                inventory1.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("spieler") != null) {
                        inventory1.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory1);
                break;
            case 2:
                Inventory inventory2 = Bukkit.createInventory(null, 54, "§5Seite 2");
                inventory2.setItem(53, nextPage);
                inventory2.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("squire") != null) {
                        inventory2.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory2);
                break;
            case 3:
                Inventory inventory3 = Bukkit.createInventory(null, 54, "§5Seite 3");
                inventory3.setItem(53, nextPage);
                inventory3.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("knight") != null) {
                        inventory3.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory3);
                break;
            case 4:
                Inventory inventory4 = Bukkit.createInventory(null, 54, "§5Seite 4");
                inventory4.setItem(53, nextPage);
                inventory4.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("duke") != null) {
                        inventory4.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory4);
                break;
            case 5:
                Inventory inventory5 = Bukkit.createInventory(null, 54, "§5Seite 5");
                inventory5.setItem(53, nextPage);
                inventory5.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("senator") != null) {
                        inventory5.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory5);
                break;
            case 6:
                Inventory inventory6 = Bukkit.createInventory(null, 54, "§5Seite 6");
                inventory6.setItem(53, nextPage);
                inventory6.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("king") != null) {
                        inventory6.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory6);
                break;
            case 7:
                Inventory inventory7 = Bukkit.createInventory(null, 54, "§5Seite 7");
                inventory7.setItem(53, nextPage);
                inventory7.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("emperor") != null) {
                        inventory7.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory7);
                break;
            case 8:
                Inventory inventory8 = Bukkit.createInventory(null, 54, "§5Seite 8");
                inventory8.setItem(53, nextPage);
                inventory8.setItem(45, previousPage);
                for (Items items : Wandrand.wr.itemWand) {
                    items.setMeta(p);
                    if (items.returnItemsByName("wandrand.wand.barrier") != null ||
                            items.returnItemsByName("wandrand.wand.mud") != null ||
                            items.returnItemsByName("wandrand.wand.mud_bricks") != null) {
                        inventory8.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory8);
                break;

        }





    }

    public static void openGUIRand(Player p, int i){
        ItemMeta im = nextPage.getItemMeta();
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§aNächste Seite");
        im.setLore(lore);
        nextPage.setItemMeta(im);


        ItemMeta impre = previousPage.getItemMeta();
        lore.clear();
        lore.add("§cVorherige Seite");
        impre.setLore(lore);
        previousPage.setItemMeta(impre);

        //36 Felder pro GUI fenster

        switch (i){
            case 1:
                Inventory inventory1 = Bukkit.createInventory(null, 54, "§6Seite 1");
                inventory1.setItem(53, nextPage);
                inventory1.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("spieler") != null){
                        inventory1.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory1);
                break;
            case 2:
                Inventory inventory2 = Bukkit.createInventory(null, 54, "§6Seite 2");
                inventory2.setItem(53, nextPage);
                inventory2.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("squire") != null){
                        inventory2.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory2);
                break;
            case 3:
                Inventory inventory3 = Bukkit.createInventory(null, 54, "§6Seite 3");
                inventory3.setItem(53, nextPage);
                inventory3.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("knight") != null){
                        inventory3.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory3);
                break;
            case 4:
                Inventory inventory4 = Bukkit.createInventory(null, 54, "§6Seite 4");
                inventory4.setItem(53, nextPage);
                inventory4.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("duke") != null){
                        inventory4.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory4);
                break;
            case 5:
                Inventory inventory5 = Bukkit.createInventory(null, 54, "§6Seite 5");
                inventory5.setItem(53, nextPage);
                inventory5.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("senator") != null){
                        inventory5.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory5);
                break;
            case 6:
                Inventory inventory6 = Bukkit.createInventory(null, 54, "§6Seite 6");
                inventory6.setItem(53, nextPage);
                inventory6.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("king") != null){
                        inventory6.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory6);
                break;
            case 7:
                Inventory inventory7 = Bukkit.createInventory(null, 54, "§6Seite 7");
                inventory7.setItem(53, nextPage);
                inventory7.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("emperor") != null){
                        inventory7.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory7);
                break;
            case 8:
                Inventory inventory8 = Bukkit.createInventory(null, 54, "§6Seite 8");
                inventory8.setItem(53, nextPage);
                inventory8.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("wandrand.rand.purpur_slab") != null ||
                    items.returnItemsByName("wandrand.rand.endstone_slab") != null ||
                    items.returnItemsByName("wandrand.rand.end_stone") != null ||
                    items.returnItemsByName("wandrand.rand.end_stone_bricks") != null ||
                    items.returnItemsByName("wandrand.rand.glazed_terracotta") != null){
                        inventory8.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory8);
                break;
            case 9:
                Inventory inventory9 = Bukkit.createInventory(null, 54, "§6Seite 9");
                inventory9.setItem(53, nextPage);
                inventory9.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("wandrand.rand.wool") != null ||
                    items.returnItemsByName("wandrand.rand.terracotta") != null){
                        inventory9.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory9);
                break;
            case 10:
                Inventory inventory10 = Bukkit.createInventory(null, 54, "§6Seite 10");
                inventory10.setItem(53, nextPage);
                inventory10.setItem(45, previousPage);
                for (Items items: Wandrand.wr.itemRand){
                    items.setMeta(p);
                    if (items.returnItemsByName("wandrand.rand.concrete") != null ||
                    items.returnItemsByName("wandrand.rand.glass") != null){
                        inventory10.addItem(items.returnItem());
                    }
                }
                p.openInventory(inventory10);
                break;

        }

    }





}
