package net.porterjake.triflingmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.porterjake.triflingmod.Trifling;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Trifling.MOD_ID);

    public static final RegistryObject<Item> METAL_PLUG = ITEMS.register("metal_plug",
            () ->  new Item(new Item.Properties()));

    public static final RegistryObject<Item> MEAT_PLUG = ITEMS.register("meat_plug",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NOODLES = ITEMS.register("noodles",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BUTTERED_NOODLES = ITEMS.register("buttered_noodles",
            () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
