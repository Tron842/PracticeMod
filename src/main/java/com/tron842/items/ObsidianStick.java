package com.tron842.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Brody Atto on 08/01/2015.
 */
public class ObsidianStick extends Item {

    public static Item oStick;

    public static void mainRegistry() {
        initializeItem();
        regesterItem();
    }

    public static void initializeItem() {
        oStick = new ObsidianStick();
        oStick.setUnlocalizedName("ostick");
        oStick.setCreativeTab(CreativeTabs.tabAllSearch.tabMisc);

    }

    public static void regesterItem() {
        GameRegistry.registerItem(oStick, oStick.getUnlocalizedName());
    }

/*    @Override
    public String getItemStackDisplayName(ItemStack p_77653_1_) {
        return EnumChatFormatting.RED + "Obsidian Stick";
    }

   */
}
