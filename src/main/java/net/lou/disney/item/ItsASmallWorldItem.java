
package net.lou.disney.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ItsASmallWorldItem extends RecordItem {
	public ItsASmallWorldItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("disney:poupee")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 5020);
	}
}
