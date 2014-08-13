package com.creepysheep.earthmod.init;

import com.creepysheep.earthmod.item.ItemEarth;
import com.creepysheep.earthmod.item.ItemTest;
import com.creepysheep.earthmod.item.ItemTest2;
import com.creepysheep.earthmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEarth itemtest = new ItemTest();
    public static final ItemEarth itemtest2 = new ItemTest2();

    public static void init()
    {
        GameRegistry.registerItem(itemtest, "Test");
        GameRegistry.registerItem(itemtest2, "Test2");
    }
}