package anes.ateor.food;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;


public class ModFoods {
    public static final FoodProperties NEBULAGAS = new FoodProperties.Builder().nutrition(10).saturationModifier(0.25f).build();

    public static final Consumable NEBULAGAS_CONSUMABLE = Consumables.defaultDrink()
            .consumeSeconds(2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.GLOWING, 3200, 255))).build();
}
