package net.omniforgestudios.gunsmithstoolkit.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.omniforgestudios.gunsmithstoolkit.GunSmithsToolKit;
import net.omniforgestudios.gunsmithstoolkit.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GunSmithsToolKit.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCHEM_TAB = CREATIVE_MODE_TABS.register("schem_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PISTOL_SCHEM_TIER_FIVE.get()))
                    .title(Component.translatable("creativetab.schem_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PISTOL_SCHEM_TIER_FIVE.get());
                        pOutput.accept(ModItems.PISTOL_SCHEM_TIER_FOUR.get());
                        pOutput.accept(ModItems.PISTOL_SCHEM_TIER_THREE.get());
                        pOutput.accept(ModItems.PISTOL_SCHEM_TIER_TWO.get());
                        pOutput.accept(ModItems.PISTOL_SCHEM_TIER_ONE.get());

                        pOutput.accept(ModItems.SMG_SCHEM_TIER_FIVE.get());
                        pOutput.accept(ModItems.SMG_SCHEM_TIER_FOUR.get());
                        pOutput.accept(ModItems.SMG_SCHEM_TIER_THREE.get());
                        pOutput.accept(ModItems.SMG_SCHEM_TIER_TWO.get());
                        pOutput.accept(ModItems.SMG_SCHEM_TIER_ONE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
