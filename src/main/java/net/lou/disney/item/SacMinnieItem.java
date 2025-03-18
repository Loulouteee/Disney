
package net.lou.disney.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SacMinnieItem extends Item {
	public SacMinnieItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
