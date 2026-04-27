package net.omniforgestudios.gunsmithstoolkit.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.omniforgestudios.gunsmithstoolkit.GunSmithsToolKit;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, GunSmithsToolKit.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
