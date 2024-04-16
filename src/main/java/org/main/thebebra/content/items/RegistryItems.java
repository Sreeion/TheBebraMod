package org.main.thebebra.content.items;

import org.main.thebebra.TheBebra;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.main.thebebra.content.CustomArmorMaterial;
import org.main.thebebra.content.CustomToolMaterial;

public class RegistryItems {
    // Bebronium set
    public static final Item Bebronium = registerItem("bebronium", new Item(new FabricItemSettings()));
    public static final Item Bebronium_RAW = registerItem("raw_bebronium", new Item(new FabricItemSettings()));
    public static final Item Bebronium_SWORD = registerItem("bebronium_sword", new SwordItem(CustomToolMaterial.BEBRONIUM, 9, -2.7F, new FabricItemSettings()));
    public static final Item Bebronium_SHOVEL = registerItem("bebronium_shovel", new ShovelItem(CustomToolMaterial.BEBRONIUM, 7.5F, -3F, new FabricItemSettings()));
    public static final Item Bebronium_PICKAXE = registerItem("bebronium_pickaxe", new PickaxeItem(CustomToolMaterial.BEBRONIUM, 7, -2.8F, new FabricItemSettings()));
    public static final Item Bebronium_AXE = registerItem("bebronium_axe", new AxeItem(CustomToolMaterial.BEBRONIUM, 10, -3.5F, new FabricItemSettings()));
    public static final Item Bebronium_HOE = registerItem("bebronium_hoe", new HoeItem(CustomToolMaterial.BEBRONIUM, 0, 0, new FabricItemSettings()));
    public static final Item Bebronium_BOOTS = registerItem("bebronium_boots", new ArmorItem(CustomArmorMaterial.BEBRONIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item Bebronium_LEGGINGS = registerItem("bebronium_leggings", new ArmorItem(CustomArmorMaterial.BEBRONIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item Bebronium_CHESTPLACE = registerItem("bebronium_chestplate", new ArmorItem(CustomArmorMaterial.BEBRONIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item Bebronium_HELMET = registerItem("bebronium_helmet", new ArmorItem(CustomArmorMaterial.BEBRONIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    // Hipepsium set
    public static final Item Hipepsium = registerItem("hipepsium", new Item(new FabricItemSettings()));
    public static final Item Hipepsium_SWORD = registerItem("hipepsium_sword", new SwordItem(CustomToolMaterial.HIPEPSIUM, 11, -2.9F, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheBebra.MOD_ID, name), item);
    }

    public static void register() {
        TheBebra.LOGGER.info("Register items TheBebra");
    }
}

