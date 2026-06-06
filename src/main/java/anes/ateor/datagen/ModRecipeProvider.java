package anes.ateor.datagen;

import anes.ateor.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() { // makes recipes n shi
                List<ItemLike> NEBULAGAS_CONSUMABLES = List.of(ModItems.NEBULAGAS);

                shapeless(RecipeCategory.BREWING, ModItems.NEBULAGAS)
                        .requires(ModItems.NEBULA)
                        .requires(Items.GLASS_BOTTLE)
                        .unlockedBy(getHasName(ModItems.NEBULA), has(ModItems.NEBULA))
                        .group("nebulagas")
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "ateor recipes";
    }
}
