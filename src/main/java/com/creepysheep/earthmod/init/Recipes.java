package com.creepysheep.earthmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.Mixer), " s ", " r ", "lbl", 's', new ItemStack(ModItems.MixerSupport), 'r', new ItemStack(ModItems.MixerRotor), 'l', new ItemStack(ModItems.MixerBlade), 'b', new ItemStack(ModItems.MixerBowl));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerRotor), "   ", " ii", " ii", 'i', new ItemStack(ModItems.IronRod));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.IronRod), " i ", " i ", " i ", 'i', "ingotIron"));
        //GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.test), new ItemStack(ModItems.itemtest2), new ItemStack(ModItems.itemtest2));
        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemtest), " s ", "sss", " s ", 's', "stickWood"));
        //GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.test), new ItemStack(ModItems.itemtest2), new ItemStack(ModItems.itemtest2)));
    }
}
