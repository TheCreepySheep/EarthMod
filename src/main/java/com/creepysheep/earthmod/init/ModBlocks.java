package com.creepysheep.earthmod.init;

import com.creepysheep.earthmod.block.BlockCPost;
import com.creepysheep.earthmod.block.BlockCementMixer;
import com.creepysheep.earthmod.block.BlockEarth;
import com.creepysheep.earthmod.block.BlockTest;
import com.creepysheep.earthmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockEarth test = new BlockTest();
    public static final BlockEarth blockCPost = new BlockCPost();
    public static final BlockEarth Mixer = new BlockCementMixer();

    public static void init()
    {
        GameRegistry.registerBlock(test, "blockTest");
        GameRegistry.registerBlock(blockCPost, "concretePost");
        GameRegistry.registerBlock(Mixer, "cementMixer");
    }


}
