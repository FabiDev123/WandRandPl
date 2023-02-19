package de.fabidev;

import com.sk89q.worldedit.world.registry.ItemMaterial;
import de.fabidev.commands.BodenCommand;
import de.fabidev.commands.RandCommand;
import de.fabidev.commands.TestCommand;
import de.fabidev.commands.WandCommand;
import de.fabidev.listeners.InventoryClickListener;
import de.fabidev.utils.GUI;
import de.fabidev.utils.Items;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class Wandrand extends JavaPlugin {

    public ArrayList<Items> itemRand = new ArrayList<>();
    public ArrayList<Items> itemWand = new ArrayList<>();
    public ArrayList<Items> itemBoden = new ArrayList<>();

    public static GUI gui = new GUI();
    public static Wandrand wr;



    @Override
    public void onEnable(){
        registerCommands();
        registerListeners();
        wr = this;
        registerRandBloecke();
        registerWandBloecke();
        registerBodenBloecke();
    }

    @Override
    public void onDisable(){

    }

    private void registerListeners(){
        this.getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }

    private void registerCommands(){
        this.getCommand("wand").setExecutor(new WandCommand());
        this.getCommand("rand").setExecutor(new RandCommand());
        this.getCommand("boden").setExecutor(new BodenCommand());
    }

    private void registerBodenBloecke(){
        String type = "knight";
        itemBoden.add(new Items(Material.SANDSTONE, type));
        itemBoden.add(new Items(Material.RED_SANDSTONE, type));
        itemBoden.add(new Items(Material.DIAMOND_BLOCK, type));
        itemBoden.add(new Items(Material.EMERALD_BLOCK, type));
        itemBoden.add(new Items(Material.STONE_BRICKS, type));
        itemBoden.add(new Items(Material.SHROOMLIGHT, type));
        itemBoden.add(new Items(Material.NETHERRACK, type));
        itemBoden.add(new Items(Material.DIORITE, type));
        itemBoden.add(new Items(Material.ANDESITE, type));
        itemBoden.add(new Items(Material.GRANITE, type));
        itemBoden.add(new Items(Material.CRIMSON_PLANKS, type));
        itemBoden.add(new Items(Material.WARPED_PLANKS, type));
        itemBoden.add(new Items(Material.OAK_PLANKS, type));
        itemBoden.add(new Items(Material.SPRUCE_PLANKS, type));
        itemBoden.add(new Items(Material.BIRCH_PLANKS, type));
        itemBoden.add(new Items(Material.JUNGLE_PLANKS, type));
        itemBoden.add(new Items(Material.ACACIA_PLANKS, type));
        itemBoden.add(new Items(Material.DARK_OAK_PLANKS, type));
        itemBoden.add(new Items(Material.MANGROVE_PLANKS, type));

        type = "duke";
        itemBoden.add(new Items(Material.DARK_PRISMARINE, type));
        itemBoden.add(new Items(Material.PRISMARINE_BRICKS, type));
        itemBoden.add(new Items(Material.PURPUR_BLOCK, type));
        itemBoden.add(new Items(Material.RED_NETHER_BRICKS, type));
        itemBoden.add(new Items(Material.NETHER_BRICKS, type));
        itemBoden.add(new Items(Material.SEA_LANTERN, type));
        itemBoden.add(new Items(Material.COBBLED_DEEPSLATE, type));
        itemBoden.add(new Items(Material.PRISMARINE, type));

        type = "senator";
        itemBoden.add(new Items(Material.OBSIDIAN, type));
        itemBoden.add(new Items(Material.SMOOTH_BASALT, type));
        itemBoden.add(new Items(Material.MOSS_BLOCK, type));

        type = "king";
        itemBoden.add(new Items(Material.VERDANT_FROGLIGHT, type));
        itemBoden.add(new Items(Material.HONEYCOMB_BLOCK, type));
        itemBoden.add(new Items(Material.OXIDIZED_COPPER, type));


        itemBoden.add(new Items(Material.END_STONE_BRICKS, "wandrand.boden.endstone_bricks", 0));
        itemBoden.add(new Items(Material.PACKED_ICE, "wandrand.boden.packed_ice", 0));
        itemBoden.add(new Items(Material.END_STONE, "wandrand.boden.endstone", 0));
        itemBoden.add(new Items(Material.CRYING_OBSIDIAN, "wandrand.boden.crying_obsidian", 0));
        itemBoden.add(new Items(Material.AMETHYST_BLOCK, "wandrand.boden.amethyst_block", 0));
        itemBoden.add(new Items(Material.SLIME_BLOCK, "wandrand.boden.slimeblock", 0));
        itemBoden.add(new Items(Material.HONEY_BLOCK, "wandrand.boden.honeyblock", 0));
        itemBoden.add(new Items(Material.BARRIER, "wandrand.boden.barrier", 0));
        itemBoden.add(new Items(Material.MUD, "wandrand.boden.mud", 0));


    }

    private void registerWandBloecke(){
        String type = "spieler";
        itemWand.add(new Items(Material.REDSTONE_BLOCK, type));
        itemWand.add(new Items(Material.QUARTZ_BLOCK, type));
        itemWand.add(new Items(Material.LAPIS_BLOCK, type));
        itemWand.add(new Items(Material.COAL_BLOCK, type));

        type = "squire";
        itemWand.add(new Items(Material.GLOWSTONE, type));
        itemWand.add(new Items(Material.IRON_BLOCK, type));
        itemWand.add(new Items(Material.GOLD_BLOCK, type));


        type = "knight";
        itemWand.add(new Items(Material.SANDSTONE, type));
        itemWand.add(new Items(Material.RED_SANDSTONE, type));
        itemWand.add(new Items(Material.DIAMOND_BLOCK, type));
        itemWand.add(new Items(Material.EMERALD_BLOCK, type));
        itemWand.add(new Items(Material.STONE_BRICKS, type));
        itemWand.add(new Items(Material.SHROOMLIGHT, type));
        itemWand.add(new Items(Material.NETHERRACK, type));
        itemWand.add(new Items(Material.DIORITE, type));
        itemWand.add(new Items(Material.ANDESITE, type));
        itemWand.add(new Items(Material.GRANITE, type));
        itemWand.add(new Items(Material.CRIMSON_PLANKS, type));
        itemWand.add(new Items(Material.WARPED_PLANKS, type));
        itemWand.add(new Items(Material.OAK_PLANKS, type));
        itemWand.add(new Items(Material.SPRUCE_PLANKS, type));
        itemWand.add(new Items(Material.BIRCH_PLANKS, type));
        itemWand.add(new Items(Material.JUNGLE_PLANKS, type));
        itemWand.add(new Items(Material.ACACIA_PLANKS, type));
        itemWand.add(new Items(Material.DARK_OAK_PLANKS, type));
        itemWand.add(new Items(Material.MANGROVE_PLANKS, type));


        type = "duke";
        itemWand.add(new Items(Material.DARK_PRISMARINE, type));
        itemWand.add(new Items(Material.PRISMARINE_BRICKS, type));
        itemWand.add(new Items(Material.PURPUR_BLOCK, type));
        itemWand.add(new Items(Material.RED_NETHER_BRICKS, type));
        itemWand.add(new Items(Material.NETHER_BRICKS, type));
        itemWand.add(new Items(Material.SEA_LANTERN, type));
        itemWand.add(new Items(Material.COBBLED_DEEPSLATE, type));
        itemWand.add(new Items(Material.BOOKSHELF, type));
        itemWand.add(new Items(Material.PRISMARINE, type));
        itemWand.add(new Items(Material.PUMPKIN, type));
        itemWand.add(new Items(Material.MELON, type));
        itemWand.add(new Items(Material.HAY_BLOCK, type));


        type = "senator";
        itemWand.add(new Items(Material.END_STONE_BRICKS, type));
        itemWand.add(new Items(Material.OBSIDIAN, type));
        itemWand.add(new Items(Material.TARGET, type));
        itemWand.add(new Items(Material.PACKED_ICE, type));
        itemWand.add(new Items(Material.SMOOTH_BASALT, type));
        itemWand.add(new Items(Material.MOSS_BLOCK, type));
        itemWand.add(new Items(Material.OAK_WOOD, type));


        type = "king";
        itemWand.add(new Items(Material.RAW_GOLD_BLOCK, type));
        itemWand.add(new Items(Material.RAW_COPPER_BLOCK, type));
        itemWand.add(new Items(Material.RAW_IRON_BLOCK, type));
        itemWand.add(new Items(Material.END_STONE, type));
        itemWand.add(new Items(Material.MAGMA_BLOCK, type));
        itemWand.add(new Items(Material.VERDANT_FROGLIGHT, type));
        itemWand.add(new Items(Material.HONEYCOMB_BLOCK, type));
        itemWand.add(new Items(Material.BONE_BLOCK, type));
        itemWand.add(new Items(Material.OXIDIZED_COPPER, type));


        type = "emperor";
        itemWand.add(new Items(Material.CRYING_OBSIDIAN, type));
        itemWand.add(new Items(Material.AMETHYST_BLOCK, type));
        itemWand.add(new Items(Material.HONEY_BLOCK, type));
        itemWand.add(new Items(Material.SLIME_BLOCK, type));

        itemWand.add(new Items(Material.BARRIER, "wandrand.wand.barrier", 0));
        itemWand.add(new Items(Material.MUD, "wandrand.wand.mud", 0));
        itemWand.add(new Items(Material.MUD_BRICKS, "wandrand.wand.mud_bricks", 0));


    }


    private void registerRandBloecke(){
        String type = "spieler";
        itemRand.add(new Items(Material.QUARTZ_SLAB, type));
        itemRand.add(new Items(Material.SMOOTH_STONE_SLAB, type));
        itemRand.add(new Items(Material.COBBLESTONE_SLAB, type));
        itemRand.add(new Items(Material.WAXED_WEATHERED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.COAL_BLOCK, type));
        itemRand.add(new Items(Material.LAPIS_BLOCK, type));
        itemRand.add(new Items(Material.QUARTZ_BLOCK, type));
        itemRand.add(new Items(Material.REDSTONE_BLOCK, type));
        itemRand.add(new Items(Material.WHITE_WOOL, type));
        itemRand.add(new Items(Material.BLACK_WOOL, type));
        itemRand.add(new Items(Material.WHITE_TERRACOTTA, type));
        itemRand.add(new Items(Material.BLACK_TERRACOTTA, type));
        itemRand.add(new Items(Material.WHITE_CONCRETE, type));
        itemRand.add(new Items(Material.BLACK_CONCRETE, type));
        itemRand.add(new Items(Material.WHITE_STAINED_GLASS, type));
        itemRand.add(new Items(Material.BLACK_STAINED_GLASS, type));
        //16


        type = "squire";
        itemRand.add(new Items(Material.OAK_SLAB, type));
        itemRand.add(new Items(Material.JUNGLE_SLAB,type));
        itemRand.add(new Items(Material.ACACIA_SLAB, type));
        itemRand.add(new Items(Material.DARK_OAK_SLAB, type));
        itemRand.add(new Items(Material.MANGROVE_SLAB, type));
        itemRand.add(new Items(Material.BIRCH_SLAB, type));
        itemRand.add(new Items(Material.SPRUCE_SLAB, type));
        itemRand.add(new Items(Material.CRIMSON_SLAB, type));
        itemRand.add(new Items(Material.WARPED_SLAB, type));
        itemRand.add(new Items(Material.STONE_SLAB, type));
        itemRand.add(new Items(Material.SMOOTH_STONE_SLAB, type));
        itemRand.add(new Items(Material.GOLD_BLOCK, type));
        itemRand.add(new Items(Material.IRON_BLOCK, type));
        itemRand.add(new Items(Material.GLOWSTONE, type));
        //14

        type = "knight";
        itemRand.add(new Items(Material.SMOOTH_SANDSTONE_SLAB, type));
        itemRand.add(new Items(Material.RED_SANDSTONE_SLAB, type));
        itemRand.add(new Items(Material.BRICK_SLAB, type));
        itemRand.add(new Items(Material.GRANITE_SLAB, type));
        itemRand.add(new Items(Material.POLISHED_GRANITE_SLAB, type));
        itemRand.add(new Items(Material.DIORITE_SLAB, type));
        itemRand.add(new Items(Material.POLISHED_DIORITE_SLAB, type));
        itemRand.add(new Items(Material.ANDESITE_SLAB, type));
        itemRand.add(new Items(Material.POLISHED_ANDESITE_SLAB, type));
        itemRand.add(new Items(Material.STONE_BRICK_SLAB, type));
        itemRand.add(new Items(Material.MOSSY_STONE_BRICK_SLAB, type));
        itemRand.add(new Items(Material.SANDSTONE, type));
        itemRand.add(new Items(Material.RED_SANDSTONE, type));
        itemRand.add(new Items(Material.DIAMOND_BLOCK, type));
        itemRand.add(new Items(Material.EMERALD_BLOCK, type));
        itemRand.add(new Items(Material.STONE_BRICKS, type));
        itemRand.add(new Items(Material.SHROOMLIGHT, type));
        itemRand.add(new Items(Material.REDSTONE_LAMP, type));
        itemRand.add(new Items(Material.OAK_PLANKS, type));
        itemRand.add(new Items(Material.SPRUCE_PLANKS, type));
        itemRand.add(new Items(Material.BIRCH_PLANKS, type));
        itemRand.add(new Items(Material.JUNGLE_PLANKS, type));
        itemRand.add(new Items(Material.ACACIA_PLANKS, type));
        itemRand.add(new Items(Material.DARK_OAK_PLANKS, type));
        itemRand.add(new Items(Material.MANGROVE_PLANKS, type));
        itemRand.add(new Items(Material.CRIMSON_PLANKS, type));
        itemRand.add(new Items(Material.WARPED_PLANKS, type));
        itemRand.add(new Items(Material.DIORITE, type));
        itemRand.add(new Items(Material.ANDESITE, type));
        itemRand.add(new Items(Material.GRANITE, type));
        //30

        type = "duke";
        itemRand.add(new Items(Material.PRISMARINE_BRICK_SLAB, type));
        itemRand.add(new Items(Material.DARK_PRISMARINE_SLAB, type));
        itemRand.add(new Items(Material.COBBLED_DEEPSLATE_SLAB, type));
        itemRand.add(new Items(Material.POLISHED_DEEPSLATE_SLAB, type));
        itemRand.add(new Items(Material.DEEPSLATE_BRICK_SLAB, type));
        itemRand.add(new Items(Material.DEEPSLATE_TILE_SLAB, type));
        itemRand.add(new Items(Material.DARK_PRISMARINE, type));
        itemRand.add(new Items(Material.PRISMARINE_BRICKS, type));
        itemRand.add(new Items(Material.PURPUR_BLOCK, type));
        itemRand.add(new Items(Material.SEA_LANTERN, type));
        itemRand.add(new Items(Material.BOOKSHELF, type));
        itemRand.add(new Items(Material.PRISMARINE, type));
        itemRand.add(new Items(Material.PUMPKIN, type));
        itemRand.add(new Items(Material.MELON, type));
        itemRand.add(new Items(Material.HAY_BLOCK, type));
        itemRand.add(new Items(Material.DEEPSLATE, type));
        itemRand.add(new Items(Material.COBBLED_DEEPSLATE, type));
        itemRand.add(new Items(Material.CHISELED_DEEPSLATE, type));
        itemRand.add(new Items(Material.POLISHED_DEEPSLATE, type));
        itemRand.add(new Items(Material.DEEPSLATE_BRICKS, type));
        itemRand.add(new Items(Material.CRACKED_DEEPSLATE_BRICKS, type));
        itemRand.add(new Items(Material.DEEPSLATE_TILES, type));
        itemRand.add(new Items(Material.CRACKED_DEEPSLATE_TILES, type));
        itemRand.add(new Items(Material.INFESTED_DEEPSLATE, type));
        //24

        type = "senator";
        itemRand.add(new Items(Material.NETHER_BRICK_SLAB, type));
        itemRand.add(new Items(Material.RED_NETHER_BRICK_SLAB, type));
        itemRand.add(new Items(Material.CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.EXPOSED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.WEATHERED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.OXIDIZED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.WAXED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.WAXED_EXPOSED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB, type));
        itemRand.add(new Items(Material.BLACKSTONE_SLAB, type));
        itemRand.add(new Items(Material.POLISHED_BLACKSTONE_SLAB, type));
        itemRand.add(new Items(Material.POLISHED_BLACKSTONE_BRICK_SLAB, type));
        itemRand.add(new Items(Material.RAW_IRON_BLOCK, type));
        itemRand.add(new Items(Material.RAW_COPPER_BLOCK, type));
        itemRand.add(new Items(Material.TARGET, type));
        itemRand.add(new Items(Material.MOSS_BLOCK, type));
        itemRand.add(new Items(Material.PACKED_ICE, type));
        itemRand.add(new Items(Material.NETHER_BRICKS, type));
        itemRand.add(new Items(Material.RED_NETHER_BRICKS, type));
        itemRand.add(new Items(Material.OAK_WOOD, type));
        itemRand.add(new Items(Material.SPRUCE_WOOD, type));
        itemRand.add(new Items(Material.BIRCH_WOOD, type));
        itemRand.add(new Items(Material.JUNGLE_WOOD, type));
        itemRand.add(new Items(Material.ACACIA_WOOD, type));
        itemRand.add(new Items(Material.DARK_OAK_WOOD, type));
        itemRand.add(new Items(Material.MANGROVE_WOOD, type));
        //26

        type = "king";
        itemRand.add(new Items(Material.RAW_GOLD_BLOCK, type));
        itemRand.add(new Items(Material.BEACON, type));
        itemRand.add(new Items(Material.SOUL_LANTERN, type));
        itemRand.add(new Items(Material.OBSIDIAN, type));
        itemRand.add(new Items(Material.VERDANT_FROGLIGHT, type));
        itemRand.add(new Items(Material.HONEYCOMB_BLOCK, type));
        itemRand.add(new Items(Material.BONE_BLOCK, type));
        itemRand.add(new Items(Material.OXIDIZED_COPPER, type));
        //8

        type = "emperor";
        itemRand.add(new Items(Material.SLIME_BLOCK, type));
        itemRand.add(new Items(Material.HONEY_BLOCK, type));
        itemRand.add(new Items(Material.MAGMA_BLOCK, type));
        itemRand.add(new Items(Material.ENCHANTING_TABLE, type));
        itemRand.add(new Items(Material.AMETHYST_BLOCK, type));
        //5

        itemRand.add(new Items(Material.PURPUR_SLAB, "wandrand.rand.purpur_slab", 0));
        itemRand.add(new Items(Material.END_STONE_BRICK_SLAB, "wandrand.rand.endstone_slab", 0));
        itemRand.add(new Items(Material.END_STONE, "wandrand.rand.end_stone", 0));
        itemRand.add(new Items(Material.END_STONE_BRICKS, "wandrand.rand.end_stone_bricks", 0));

        String perm = "wandrand.rand.glazed_terracotta";
        itemRand.add(new Items(Material.WHITE_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.GRAY_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.BLACK_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.BROWN_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.RED_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.ORANGE_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.YELLOW_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.LIME_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.GREEN_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.CYAN_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.BLUE_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.PURPLE_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.MAGENTA_GLAZED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.PINK_GLAZED_TERRACOTTA, perm, 0));
        //20


        perm = "wandrand.rand.wool";
        itemRand.add(new Items(Material.LIGHT_GRAY_WOOL, perm, 0));
        itemRand.add(new Items(Material.GRAY_WOOL, perm, 0));
        itemRand.add(new Items(Material.BROWN_WOOL, perm, 0));
        itemRand.add(new Items(Material.RED_WOOL, perm, 0));
        itemRand.add(new Items(Material.ORANGE_WOOL, perm, 0));
        itemRand.add(new Items(Material.YELLOW_WOOL, perm, 0));
        itemRand.add(new Items(Material.LIME_WOOL, perm, 0));
        itemRand.add(new Items(Material.GREEN_WOOL, perm, 0));
        itemRand.add(new Items(Material.CYAN_WOOL, perm, 0));
        itemRand.add(new Items(Material.LIGHT_BLUE_WOOL, perm, 0));
        itemRand.add(new Items(Material.BLUE_WOOL, perm, 0));
        itemRand.add(new Items(Material.PURPLE_WOOL, perm, 0));
        itemRand.add(new Items(Material.MAGENTA_WOOL, perm, 0));
        itemRand.add(new Items(Material.PINK_WOOL, perm, 0));

        perm = "wandrand.rand.terracotta";
        itemRand.add(new Items(Material.LIGHT_GRAY_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.GRAY_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.BROWN_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.RED_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.ORANGE_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.YELLOW_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.LIME_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.GREEN_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.CYAN_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.LIGHT_BLUE_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.BLUE_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.PURPLE_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.MAGENTA_TERRACOTTA, perm, 0));
        itemRand.add(new Items(Material.PINK_TERRACOTTA, perm, 0));
        //28

        perm = "wandrand.rand.concrete";
        itemRand.add(new Items(Material.LIGHT_GRAY_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.GRAY_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.BROWN_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.RED_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.ORANGE_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.YELLOW_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.LIME_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.GREEN_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.CYAN_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.LIGHT_BLUE_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.BLUE_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.PURPLE_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.MAGENTA_CONCRETE, perm, 0));
        itemRand.add(new Items(Material.PINK_CONCRETE, perm, 0));

        perm = "wandrand.rand.glass";
        itemRand.add(new Items(Material.LIGHT_GRAY_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.GRAY_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.BROWN_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.RED_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.ORANGE_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.YELLOW_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.LIME_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.GREEN_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.CYAN_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.LIGHT_BLUE_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.BLUE_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.PURPLE_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.MAGENTA_STAINED_GLASS, perm, 0));
        itemRand.add(new Items(Material.PINK_STAINED_GLASS, perm, 0));
        //28





    }





}
