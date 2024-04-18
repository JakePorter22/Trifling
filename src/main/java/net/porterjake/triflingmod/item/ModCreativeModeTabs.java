package net.porterjake.triflingmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.porterjake.triflingmod.Trifling;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Trifling.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PLUG_TAB = CREATIVE_MODE_TABS.register("plug_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MEAT_PLUG.get()))
                    .title(Component.translatable("creativetab.plug_tab"))
                    .displayItems((itemDisplayParameters, poutput) -> {
                        poutput.accept(ModItems.METAL_PLUG.get());
                        poutput.accept(ModItems.MEAT_PLUG.get());
                        poutput.accept(ModItems.BUTTER.get());
                        poutput.accept(ModItems.NOODLES.get());
                        poutput.accept(ModItems.BUTTERED_NOODLES.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
}
}
