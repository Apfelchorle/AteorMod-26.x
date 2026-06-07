package anes.ateor.item;

import anes.ateor.AteorMod;
import anes.ateor.block.ModBlocks;
import anes.ateor.food.ModFoods;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import java.util.function.Function;


public class ModItems {

    public static final Item NEBULAGAS = registerItem("nebulagas", properties -> new Item(properties
            .food(ModFoods.NEBULAGAS, ModFoods.NEBULAGAS_CONSUMABLE)));
    public static final Item NEBULA = registerItem("nebula", Item::new);
    public static final Item UNPROCESSED_NEBULA = registerItem("unprocessed_nebula", Item::new);
    public static final Item NEBULA_PICKAXE = registerItem("nebula_pickaxe", properties -> new Item(properties.pickaxe(ToolMaterial.NETHERITE,12,3)));
    public static final Item NEBULA_STICKS = registerItem("nebula_stick", Item::new);


    private static Item registerItem(String name, Function<Item.Properties, Item> itemFunction) {

        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, name),
                itemFunction.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(AteorMod.MOD_ID, name)))));
    }
    public static void registerModItem() {
        AteorMod.LOGGER.info("Registering ModItems for " + AteorMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(NEBULAGAS);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(NEBULA);
            output.accept(UNPROCESSED_NEBULA);
            output.accept(NEBULA_STICKS);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.BUILDING_BLOCKS).register(output -> {
            output.accept(ModBlocks.NEBULA_FRAGMENT_BLOCK);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(output -> {
            output.accept(ModItems.NEBULA_PICKAXE);
        });
    }
}
