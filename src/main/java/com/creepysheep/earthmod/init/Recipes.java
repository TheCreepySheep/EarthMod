package com.creepysheep.earthmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.Mixer), " s ", " r ", "lbl", 's', new ItemStack(ModItems.MixerSupport), 'r', new ItemStack(ModItems.MixerRotor), 'l', new ItemStack(ModItems.MixerBlade), 'b', new ItemStack(ModItems.MixerBowl));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerRotor), "   ", " ii", " ii", 'i', new ItemStack(ModItems.IronRod));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.IronRod), " i ", " i ", " i ", 'i', "ingotIron"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.MixerBlade), "   ", " bb", " bb", 'b', "ingotBrickNether" ));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerPanel), "ccc", "ccc", "ccc", 'c', new ItemStack(Blocks.stained_hardened_clay, 9, 9));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerBowl), "p p", "p p", "ppp", 'p', new ItemStack(ModItems.MixerPanel));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerSupport), "rrr", "   ", "   ", 'r', new ItemStack(ModItems.IronRod));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerSupport), "   ", "rrr", "   ", 'r', new ItemStack(ModItems.IronRod));
        GameRegistry.addRecipe(new ItemStack(ModItems.MixerSupport), "   ", "   ", "rrr", 'r', new ItemStack(ModItems.IronRod));
    }
}
