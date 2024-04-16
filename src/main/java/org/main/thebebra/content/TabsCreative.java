package org.main.thebebra.content;

import org.main.thebebra.TheBebra;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.main.thebebra.content.items.RegistryItems;
import org.main.thebebra.content.blocks.RegistryBlocks;

public class TabsCreative {
    public static final ItemGroup THE_BEBRA = Registry.register(Registries.ITEM_GROUP,
                                                                new Identifier(TheBebra.MOD_ID, "thebebra"),
                                                                FabricItemGroup.builder().displayName(Text.translatable("tabs.thebebra"))
                                                                        .icon(() -> new ItemStack(RegistryItems.Bebronium_SWORD)).entries((displayContext, entries) -> {
                                                                            entries.add(RegistryItems.Bebronium_SWORD);
                                                                            entries.add(RegistryItems.Bebronium_SHOVEL);
                                                                            entries.add(RegistryItems.Bebronium_PICKAXE);
                                                                            entries.add(RegistryItems.Bebronium_AXE);
                                                                            entries.add(RegistryItems.Bebronium_HOE);
                                                                            entries.add(RegistryItems.Bebronium_HELMET);
                                                                            entries.add(RegistryItems.Bebronium_CHESTPLACE);
                                                                            entries.add(RegistryItems.Bebronium_LEGGINGS);
                                                                            entries.add(RegistryItems.Bebronium_BOOTS);
                                                                            entries.add(RegistryItems.Bebronium);
                                                                            entries.add(RegistryItems.Bebronium_RAW);
                                                                            entries.add(RegistryItems.Hipepsium_SWORD);
                                                                            entries.add(RegistryItems.Hipepsium_SHOVEL);
                                                                            entries.add(RegistryItems.Hipepsium_PICKAXE);
                                                                            entries.add(RegistryItems.Hipepsium_AXE);
                                                                            entries.add(RegistryItems.Hipepsium_HOE);
                                                                            entries.add(RegistryItems.Hipepsium);
                                                                            entries.add(RegistryItems.Hipepsium_RAW);
                                                                            entries.add(RegistryBlocks.TestBLOCK);

                                                                        }).build());
    public static void register() {
        TheBebra.LOGGER.info("Register TheBebra Creative Tabs");
    }
}