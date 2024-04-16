package org.main.thebebra.mixins;

import net.minecraft.client.gui.screen.TitleScreen;
import org.main.thebebra.TheBebra;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TheBebraMixins {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        System.out.println(TheBebra.MOD_ID + "Mixins Loaded");
    }
}