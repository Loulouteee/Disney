
package net.lou.disney.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class CarrouselDeLancelotItem extends RecordItem {
	public CarrouselDeLancelotItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("disney:carrousel")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 27580);
	}
}
