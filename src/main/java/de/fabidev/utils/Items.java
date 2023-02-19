package de.fabidev.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.ArrayList;

public class Items {

    ItemStack is;

    Material material;
    String rang;
    String permissionChest = "";


    public Items(Material m, String rang){
        this.material = m;
        this.rang = rang;
        is = new ItemStack(m);
    }

    public Items(Material m, String permissionChest, @Nullable int x){
        this.material = m;
        is = new ItemStack(m);
        this.permissionChest = permissionChest;
    }



    public ItemStack returnItem(){
        return is;
    }

    public Items returnItemsByName(String text){
        if (text.equalsIgnoreCase(rang)){
            return this;
        }else if (text.equalsIgnoreCase(permissionChest)){
            return this;
        }
        return null;
    }

    public void setMeta(Player p){
        if (permissionChest.equalsIgnoreCase("")){
            if (p.hasPermission(Strings.permissionEmperor)){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else if (p.hasPermission(Strings.permissionKing) && rang.equalsIgnoreCase("king")){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else if (p.hasPermission(Strings.permissionSenator) && rang.equalsIgnoreCase("senator")){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else if (p.hasPermission(Strings.permissionDuke) && rang.equalsIgnoreCase("duke")){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else if (p.hasPermission(Strings.permissionKnight) && rang.equalsIgnoreCase("knight")){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else if (p.hasPermission(Strings.permissionSquire) && rang.equalsIgnoreCase("squire")){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else if (rang.equalsIgnoreCase("spieler")){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else {
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§cDieses Item kannst du dir freischalten, indem du dir einen Rang kaufst!");
                im.setLore(s);
                is.setItemMeta(im);
            }
        }else {
            if (p.hasPermission(permissionChest)){
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§aFreigeschaltet!");
                im.setLore(s);
                is.setItemMeta(im);
            }else {
                ItemMeta im = is.getItemMeta();
                ArrayList<String> s = new ArrayList<>();
                s.add("§cDu hast dieses Item noch nicht freigeschaltet! Dieses kannst du in einer Chest ziehen!");
                im.setLore(s);
                is.setItemMeta(im);
            }
        }

    }






}
