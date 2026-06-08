package anes.ateor.CustomCreativeTab;

import anes.ateor.AteorMod;
import anes.ateor.block.ModBlocks;
import anes.ateor.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class ModTabs {

    public static final CreativeModeTab WOOL_TAB = Registry.register(
        BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, "wool"),
        FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.PINK_WOOL_STAIRS))
            .title(Component.translatable("creativemodetab.ateormod.wool"))
            .displayItems((parameters, output) -> {
                output.accept(ModBlocks.WOOL_SLABS);
                output.accept(ModBlocks.WOOL_STAIRS);
                output.accept(ModBlocks.PINK_WOOL_SLABS);
                output.accept(ModBlocks.PINK_WOOL_STAIRS);
                output.accept(ModBlocks.BLACK_WOOL_SLABS);
                output.accept(ModBlocks.BLACK_WOOL_STAIRS);
                output.accept(ModBlocks.BLUE_WOOL_SLABS);
                output.accept(ModBlocks.BLUE_WOOL_STAIRS);
                output.accept(ModBlocks.YELLOW_WOOL_SLABS);
                output.accept(ModBlocks.YELLOW_WOOL_STAIRS);
                output.accept(ModBlocks.MAGENTA_WOOL_SLABS);
                output.accept(ModBlocks.MAGENTA_WOOL_STAIRS);
                output.accept(ModBlocks.LIGHT_BLUE_WOOL_SLABS);
                output.accept(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                output.accept(ModBlocks.GREEN_WOOL_SLABS);
                output.accept(ModBlocks.GREEN_WOOL_STAIRS);
                output.accept(ModBlocks.ORANGE_WOOL_SLABS);
                output.accept(ModBlocks.ORANGE_WOOL_STAIRS);
                output.accept(ModBlocks.BROWN_WOOL_SLABS);
                output.accept(ModBlocks.BROWN_WOOL_STAIRS);
                output.accept(ModBlocks.GRAY_WOOL_SLABS);
                output.accept(ModBlocks.GRAY_WOOL_STAIRS);
                output.accept(ModBlocks.LIGHT_GRAY_WOOL_SLABS);
                output.accept(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                output.accept(ModBlocks.LIME_WOOL_SLABS);
                output.accept(ModBlocks.LIME_WOOL_STAIRS);
            })
            .build()
    );

    public static final CreativeModeTab NEBULA_TAB = Registry.register(
        BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, "nebula_items"),
        FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.NEBULAGAS))
            .title(
                Component.translatable("creativemodetab.ateormod.nebula_items")
            )
            .displayItems((parameters, output) -> {
                // this basicly just adds items to a custom creative tab
                // output.accept( item goes here );
                output.accept(ModItems.NEBULAGAS);
                output.accept(ModItems.NEBULA);
                output.accept(ModBlocks.NEBULA_FRAGMENT_BLOCK);
                output.accept(ModItems.UNPROCESSED_NEBULA);
                output.accept(ModBlocks.NEBULA_PLANKS);
                output.accept(ModBlocks.NEBULA_LOG);
                output.accept(ModItems.NEBULA_STICKS);
                output.accept(ModBlocks.NEBULA_SLABS);
                output.accept(ModBlocks.NEBULA_STAIRS);
                // minecraft new update preview blocks
                output.accept(ModBlocks.WOOL_SLABS);
                output.accept(ModBlocks.WOOL_STAIRS);
                output.accept(ModBlocks.PINK_WOOL_SLABS);
                output.accept(ModBlocks.PINK_WOOL_STAIRS);
                output.accept(ModBlocks.BLACK_WOOL_SLABS);
                output.accept(ModBlocks.BLACK_WOOL_STAIRS);
                output.accept(ModBlocks.BLUE_WOOL_SLABS);
                output.accept(ModBlocks.BLUE_WOOL_STAIRS);
                output.accept(ModBlocks.YELLOW_WOOL_SLABS);
                output.accept(ModBlocks.YELLOW_WOOL_STAIRS);
                // output.accept(ModBlocks.CYAN_WOOL_SLABS);
                // output.accept(ModBlocks.CYAN_WOOL_STAIRS);
            })
            .build()
    );

    public static void registertabs() {
        AteorMod.LOGGER.info(
            "Registering CreativeModTabs for " + AteorMod.MOD_ID
        );
    }
}
