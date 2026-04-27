package net.omniforgestudios.gunsmithstoolkit.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.omniforgestudios.gunsmithstoolkit.GunSmithsToolKit;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GunSmithsToolKit.MOD_ID);

    public static final RegistryObject<Item> PISTOL_SCHEM_TIER_ONE = ITEMS.register("pistol_schem_tier_one",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOL_SCHEM_TIER_TWO = ITEMS.register("pistol_schem_tier_two",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOL_SCHEM_TIER_THREE = ITEMS.register("pistol_schem_tier_three",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOL_SCHEM_TIER_FOUR = ITEMS.register("pistol_schem_tier_four",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PISTOL_SCHEM_TIER_FIVE = ITEMS.register("pistol_schem_tier_five",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SMG_SCHEM_TIER_FIVE = ITEMS.register("smg_schem_tier_five",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMG_SCHEM_TIER_FOUR = ITEMS.register("smg_schem_tier_four",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMG_SCHEM_TIER_THREE = ITEMS.register("smg_schem_tier_three",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMG_SCHEM_TIER_TWO = ITEMS.register("smg_schem_tier_two",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMG_SCHEM_TIER_ONE = ITEMS.register("smg_schem_tier_one",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
