
package net.lou.disney.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BallonMickeyItem extends Item {
	public BallonMickeyItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
