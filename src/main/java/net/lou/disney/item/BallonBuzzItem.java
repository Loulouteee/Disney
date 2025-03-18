
package net.lou.disney.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BallonBuzzItem extends Item {
	public BallonBuzzItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
