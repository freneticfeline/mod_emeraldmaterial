package net.unladenswallow.minecraft.emeraldmaterial.item;

import net.minecraft.item.ItemAxe;

/**
 * It would be easier to simply instantiate ItemAxe with the Emerald material,
 * but unfortunately the ItemAxe constructor is protected, so extending it
 * is the next best solution. 
 */
public class ItemEmeraldAxe extends ItemAxe {

public ItemEmeraldAxe() {
		super(ItemEmeraldTool.material);
		setUnlocalizedName("emeraldAxe");
	}

}