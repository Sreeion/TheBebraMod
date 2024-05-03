package org.main.thebebra;

import net.fabricmc.api.ModInitializer;
import org.main.thebebra.content.blocks.Blocks;
import org.main.thebebra.content.items.Items;
import org.main.thebebra.content.TabsCreative;
import org.main.thebebra.util.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheBebra implements ModInitializer {
    public static final String MOD_ID = "thebebra";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        TabsCreative.register();
        Items.register();
        Blocks.register();
        Registry.RegisterMod();
    }
}
