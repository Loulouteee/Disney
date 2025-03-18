
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lou.disney.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.lou.disney.DisneyMod;

public class DisneyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DisneyMod.MODID);
	public static final RegistryObject<CreativeModeTab> DISNEY = REGISTRY.register("disney",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.disney.disney")).icon(() -> new ItemStack(DisneyModItems.SAC_DLP_PETIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DisneyModItems.BALLONMINNIE.get());
				tabData.accept(DisneyModItems.BALLON_STITCH.get());
				tabData.accept(DisneyModItems.BALLON_BUZZ.get());
				tabData.accept(DisneyModItems.BALLON_CITROUILLE.get());
				tabData.accept(DisneyModItems.ITS_A_SMALL_WORLD.get());
				tabData.accept(DisneyModItems.PHANTOM_MANOR.get());
				tabData.accept(DisneyModItems.PIRATES_OF_CARAIBAN.get());
				tabData.accept(DisneyModItems.CARROUSEL_DE_LANCELOT.get());
				tabData.accept(DisneyModItems.SPACE_MOUNTAIN_MISSION_2.get());
				tabData.accept(DisneyModItems.TOUR_DE_LA_TERREUR_AMBIANCE.get());
				tabData.accept(DisneyModItems.SAC_BOB_GRAND.get());
				tabData.accept(DisneyModItems.SAC_CAPTAIN_AMERICA.get());
				tabData.accept(DisneyModItems.SAC_DLP.get());
				tabData.accept(DisneyModItems.SAC_MINNIE.get());
				tabData.accept(DisneyModItems.SAC_DLP_PETIT.get());
				tabData.accept(DisneyModItems.SAC_MINNIE_PETIT.get());
				tabData.accept(DisneyModItems.SAC_CAPTAINE_AMERICA_GRAND.get());
				tabData.accept(DisneyModItems.SAC_BOB_PETIT.get());
				tabData.accept(DisneyModItems.SAC_STITCH_PETIT.get());
				tabData.accept(DisneyModItems.SAC_STITCH_GRAND.get());
				tabData.accept(DisneyModItems.SAC_WINNIE_PETIT.get());
				tabData.accept(DisneyModItems.SAC_WINNIE_GRAND.get());
				tabData.accept(DisneyModItems.PETER_PAN_FLIGHT.get());
				tabData.accept(DisneyModItems.BIG_THUNDER_MOUNTAIN.get());
				tabData.accept(DisneyModItems.RATATOUILLE.get());
				tabData.accept(DisneyModItems.BALLON_MICKEY.get());
				tabData.accept(DisneyModItems.BALLON_R_2D_2.get());
				tabData.accept(DisneyModItems.BALLON_UP.get());
			}).withSearchBar().build());
}
