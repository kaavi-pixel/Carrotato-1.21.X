package net.aroundforge.carrotato.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;

public class SpicyStatusEffect extends StatusEffect {
    public SpicyStatusEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF4500); // Orange-Red color
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (!entity.hasStatusEffect(StatusEffects.FIRE_RESISTANCE)) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 40, 0, false, false, false));
        }
        return super.applyUpdateEffect(entity, amplifier);
    }
}
