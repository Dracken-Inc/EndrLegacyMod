package mod.Gearrion.EnderLegacymod.Util;

import mod.Gearrion.EnderLegacymod.Blocks.ModBlocks;
import net.minecraftforge.oredict.OreDictionary;

public final class OreRegistry_TE extends OreDictionary{

public static final void init()	{

OreDictionary.registerOre("logEnderLog", ModBlocks.EnderLog);
OreDictionary.registerOre("treeEndLeaves", ModBlocks.End_Leaves);
System.out.println("OreDic Inited!!");
}}