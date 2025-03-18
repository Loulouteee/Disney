
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lou.disney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.lou.disney.DisneyMod;

public class DisneyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DisneyMod.MODID);
	public static final RegistryObject<SoundEvent> POUPEE = REGISTRY.register("poupee", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "poupee")));
	public static final RegistryObject<SoundEvent> CARROUSEL = REGISTRY.register("carrousel", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "carrousel")));
	public static final RegistryObject<SoundEvent> PIRATES = REGISTRY.register("pirates", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "pirates")));
	public static final RegistryObject<SoundEvent> SPACE = REGISTRY.register("space", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "space")));
	public static final RegistryObject<SoundEvent> MANOR = REGISTRY.register("manor", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "manor")));
	public static final RegistryObject<SoundEvent> TOUR_AMBIANCE = REGISTRY.register("tour_ambiance", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "tour_ambiance")));
	public static final RegistryObject<SoundEvent> PETER = REGISTRY.register("peter", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "peter")));
	public static final RegistryObject<SoundEvent> BTM = REGISTRY.register("btm", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "btm")));
	public static final RegistryObject<SoundEvent> RATATOUILLE = REGISTRY.register("ratatouille", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("disney", "ratatouille")));
}
