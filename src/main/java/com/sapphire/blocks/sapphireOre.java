package com.sapphire.blocks;

import com.sapphire.items.SapphireItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class sapphireOre extends Block {

    private Random rand = new Random();

    public sapphireOre(Material mat) {
        super(mat);
        this.setCreativeTab(SapphireBlocks.sapphireTab);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon("sapphire:blockSapphire");
    }

    public Item getItemDropped(int par1, Random rand, int par2) {
        return SapphireItems.sapphireIngot;
    }

    public int quantityDropped(Random rand) {
        return rand.nextInt(3) + 1;
    }

    @Override
    public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
        if (this.getItemDropped(metadata, rand, fortune) != Item.getItemFromBlock(this)) {
            return 1 + rand.nextInt(5);
        }
        return 0;
    }

}


