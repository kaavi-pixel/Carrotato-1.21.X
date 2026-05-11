package net.aroundforge.carrotato.registry;

import net.aroundforge.carrotato.Carrotato;
import net.aroundforge.carrotato.effect.SpicyStatusEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect SPICY_EFFECT = new SpicyStatusEffect();
    public static final RegistryEntry<StatusEffect> SPICY = registerStatusEffect("spicy", SPICY_EFFECT);

    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect effect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Carrotato.MOD_ID, name), effect);
    }

    public static void registerModEffects() {
        Carrotato.LOGGER.info("Registering Mod Effects for " + Carrotato.MOD_ID);
    }
}
