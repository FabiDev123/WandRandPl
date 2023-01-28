package de.fabidev.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUI {

    ItemStack isStoneWall = new ItemStack(Material.STONE);
    ItemMeta imStoneWall;
    ItemStack isDiamondWall = new ItemStack(Material.DIAMOND_BLOCK);
    ItemMeta imDiamondWall;
    ItemStack isEmeraldWall = new ItemStack(Material.EMERALD_BLOCK);
    ItemMeta imEmeraldWall;

    ItemStack isStoneBorder = new ItemStack(Material.STONE);
    ItemMeta imStoneBorder;
    ItemStack isDiamondBorder = new ItemStack(Material.DIAMOND_BLOCK);
    ItemMeta imDiamondBorder;
    ItemStack isEmeraldBorder = new ItemStack(Material.EMERALD_BLOCK);
    ItemMeta imEmeraldBorder;

    Inventory invWall = Bukkit.createInventory(null, 27, Strings.invWall);
    Inventory invBorder = Bukkit.createInventory(null, 27, Strings.invBorder);

    public GUI(){
        attachItemMeta();
        addItemsToInventories();
    }



    private void attachItemMeta() {
        imStoneWall = isStoneWall.getItemMeta();
        imStoneWall.setDisplayName(Strings.stoneWall);
        isStoneWall.setItemMeta(imStoneWall);

        imEmeraldWall = isEmeraldWall.getItemMeta();
        imEmeraldWall.setDisplayName(Strings.emeraldWall);
        isEmeraldWall.setItemMeta(imEmeraldWall);

        imDiamondWall = isDiamondWall.getItemMeta();
        imDiamondWall.setDisplayName(Strings.diamondWall);
        isDiamondWall.setItemMeta(imDiamondWall);

        imStoneBorder = isStoneBorder.getItemMeta();
        imStoneBorder.setDisplayName(Strings.stoneBorder);
        isStoneBorder.setItemMeta(imStoneBorder);

        imEmeraldBorder = isEmeraldBorder.getItemMeta();
        imEmeraldBorder.setDisplayName(Strings.emeraldBorder);
        isEmeraldBorder.setItemMeta(imEmeraldBorder);

        imDiamondBorder = isDiamondBorder.getItemMeta();
        imDiamondBorder.setDisplayName(Strings.diamondBorder);
        isDiamondBorder.setItemMeta(imDiamondBorder);

    }

    private void addItemsToInventories() {
        invWall.addItem(isStoneWall);
        invWall.addItem(isEmeraldWall);
        invWall.addItem(isDiamondWall);

        invBorder.addItem(isStoneBorder);
        invBorder.addItem(isEmeraldWall);
        invBorder.addItem(isDiamondBorder);
    }


}
