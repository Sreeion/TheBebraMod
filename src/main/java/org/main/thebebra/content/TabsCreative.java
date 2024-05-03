package org.main.thebebra.content;

import org.main.thebebra.TheBebra;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.main.thebebra.content.items.Items;
import org.main.thebebra.content.blocks.Blocks;

public class TabsCreative {
    public static final ItemGroup THE_BEBRA = Registry.register(Registries.ITEM_GROUP,
                                                                new Identifier(TheBebra.MOD_ID, "thebebra"),
                                                                FabricItemGroup.builder().displayName(Text.translatable("tabs.thebebra"))
                                                                        .icon(() -> new ItemStack(Items.Bebronium_SWORD)).entries((displayContext, entries) -> {
                                                                            entries.add(Items.Bebronium_SWORD);
                                                                            entries.add(Items.Bebronium_SHOVEL);
                                                                            entries.add(Items.Bebronium_PICKAXE);
                                                                            entries.add(Items.Bebronium_AXE);
                                                                            entries.add(Items.Bebronium_HOE);
                                                                            entries.add(Items.Bebronium_HELMET);
                                                                            entries.add(Items.Bebronium_CHESTPLACE);
                                                                            entries.add(Items.Bebronium_LEGGINGS);
                                                                            entries.add(Items.Bebronium_BOOTS);
                                                                            entries.add(Items.Bebronium);
                                                                            entries.add(Items.Bebronium_RAW);
                                                                            entries.add(Items.Hipepsium_SWORD);
                                                                            entries.add(Items.Hipepsium_SHOVEL);
                                                                            entries.add(Items.Hipepsium_PICKAXE);
                                                                            entries.add(Items.Hipepsium_AXE);
                                                                            entries.add(Items.Hipepsium_HOE);
                                                                            entries.add(Items.Hipepsium);
                                                                            entries.add(Items.Hipepsium_RAW);
                                                                            entries.add(Blocks.TestBLOCK);

                                                                        }).build());
    public static void register() {
        TheBebra.LOGGER.info("Register TheBebra Creative Tabs");
    }
}