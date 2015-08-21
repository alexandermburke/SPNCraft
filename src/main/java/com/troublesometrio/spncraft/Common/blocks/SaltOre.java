package com.troublesometrio.spncraft.Common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SaltOre extends Block {

public SaltOre() {
	super(Material.iron);
	setHarvestLevel("pickaxe",0);
}

}