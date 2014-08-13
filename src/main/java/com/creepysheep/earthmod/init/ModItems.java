package com.creepysheep.earthmod.init;

import com.creepysheep.earthmod.item.*;
import com.creepysheep.earthmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemEarth itemtest = new ItemTest();
    public static final ItemEarth itemtest2 = new ItemTest2();
    public static final ItemEarth MixerSupport = new ItemMixerSupport();
    public static final ItemEarth MixerBowl = new ItemMixerBowl();
    public static final ItemEarth MixerRotor = new ItemMixerRotor();
    public static final ItemEarth MixerBlade = new ItemMixerBlade();
    public static final ItemEarth IronRod = new ItemIronRod();

    public static void init()
    {
        GameRegistry.registerItem(itemtest, "Test");
        GameRegistry.registerItem(itemtest2, "Test2");
        GameRegistry.registerItem(MixerSupport, "MixerSupport");
        GameRegistry.registerItem(MixerBowl, "MixerBowl");
        GameRegistry.registerItem(MixerRotor, "MixerRotor");
        GameRegistry.registerItem(MixerBlade, "MixerBlade");
        GameRegistry.registerItem(IronRod, "IronRod");
    }
}