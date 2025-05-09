package org.main.thebebra.content.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.main.thebebra.TheBebra;

public class Blocks {
    public static final Block Bebronium_ORE = registerBlock("bebronium_ore", new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DIAMOND_ORE)));
    public static final Block Deepslate_Bebronium_ORE = registerBlock("deepslate_bebronium_ore", new Block(FabricBlockSettings.copyOf(net.minecraft.block.Blocks.DEEPSLATE_DIAMOND_ORE)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TheBebra.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TheBebra.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void register() {
        TheBebra.LOGGER.info("Register blocks TheBebra");
    }
}
