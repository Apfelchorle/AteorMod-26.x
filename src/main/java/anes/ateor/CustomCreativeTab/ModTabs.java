package anes.ateor.CustomCreativeTab;


import anes.ateor.AteorMod;
import anes.ateor.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

    public static final CreativeModeTab NEBULA_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, "nebula_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.NEBULAGAS))
                    .title(Component.translatable("creativemodetab.ateormod.nebula_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.NEBULAGAS);
                        output.accept(ModItems.NEBULA);
                    }).build());

    public static void registertabs() {


        AteorMod.LOGGER.info("Registering CreativeModTabs for " + AteorMod.MOD_ID );
    }
}
