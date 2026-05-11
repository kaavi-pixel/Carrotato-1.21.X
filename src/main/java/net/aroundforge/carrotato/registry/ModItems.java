package net.aroundforge.carrotato.registry;

import net.aroundforge.carrotato.Carrotato;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final FoodComponent CHILI_FOOD = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(ModEffects.SPICY, 200, 0), 0.5f)
            .build();

    public static final FoodComponent HOT_SAUCE_FOOD = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(ModEffects.SPICY, 600, 0), 1.0f)
            .build();

    public static final FoodComponent SPICY_CHILI_CON_CARNE_FOOD = new FoodComponent.Builder()
            .nutrition(10)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(ModEffects.SPICY, 1200, 1), 1.0f)
            .build();

    public static final FoodComponent SPICY_FRIED_CHICKEN_FOOD = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(ModEffects.SPICY, 800, 0), 1.0f)
            .build();

    public static final Item CHILI = registerItem("chili", new Item(new Item.Settings().food(CHILI_FOOD)));
    public static final Item CHILI_SEEDS = registerItem("chili_seeds",
            new AliasedBlockItem(ModBlocks.CHILI_CROP, new Item.Settings()));

    public static final Item DRIED_CHILI = registerItem("dried_chili",
            new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final Item CHILI_POWDER = registerItem("chili_powder", new Item(new Item.Settings()));

    public static final Item HOT_SAUCE = registerItem("hot_sauce", new Item(new Item.Settings().food(HOT_SAUCE_FOOD).maxCount(16)));
    public static final Item SPICY_CHILI_CON_CARNE = registerItem("spicy_chili_con_carne", new Item(new Item.Settings().food(SPICY_CHILI_CON_CARNE_FOOD).maxCount(1)));
    public static final Item SPICY_FRIED_CHICKEN = registerItem("spicy_fried_chicken", new Item(new Item.Settings().food(SPICY_FRIED_CHICKEN_FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Carrotato.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Carrotato.LOGGER.info("Registering Mod Items for " + Carrotato.MOD_ID);
    }
}
