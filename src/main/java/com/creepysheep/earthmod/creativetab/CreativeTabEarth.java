package com.creepysheep.earthmod.creativetab;

import com.creepysheep.earthmod.init.ModItems;
import com.creepysheep.earthmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEarth
{
    public static final CreativeTabs EARTH_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ModItems.itemtest;
        }
    };
}
