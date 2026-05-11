package net.aroundforge.carrotato.world;

import net.aroundforge.carrotato.Carrotato;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModWorldGeneration {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHILI_CROP_CONFIGURED_KEY = registerKey("chili_crop", RegistryKeys.CONFIGURED_FEATURE);
    public static final RegistryKey<PlacedFeature> CHILI_CROP_PLACED_KEY = registerKey("chili_crop", RegistryKeys.PLACED_FEATURE);

    private static <T> RegistryKey<T> registerKey(String name, RegistryKey<net.minecraft.registry.Registry<T>> registry) {
        return RegistryKey.of(registry, Identifier.of(Carrotato.MOD_ID, name));
    }

    public static void generate() {
        // This will be called to register the biome modifications
    }
}
