package mod.Gearrion.EnderLegacymod.world;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.Gearrion.EnderLegacymod.world.biome.BiomeRegistry;
import mod.Gearrion.EnderLegacymod.world.chunk.ChunkProviderTrueEnd;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTrueEnd extends WorldProvider{

	@Override
	public void registerWorldChunkManager(){
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeTrueEnd, 0.0F);
        this.dimensionId = 8;
        this.hasNoSky = true;
	}
	
	/**
     * Returns a new chunk provider which generates chunks for this world
     */
	public IChunkProvider createChunkGeneration(){
		return new ChunkProviderTrueEnd(this.worldObj, this.worldObj.getSeed(), true);
	}


    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     */
	@Override
    public float calculateCelestialAngle(long p_76563_1_, float p_76563_3_)
    {
        return 0.0F;
    }

    /**
     * Returns array with sunrise/sunset colors
     */
	@Override @SideOnly(Side.CLIENT)
    public float[] calcSunriseSunsetColors(float p_76560_1_, float p_76560_2_)
    {
        return null;
    }

    /**
     * Return Vec3D with biome specific fog color
     
	@Override @SideOnly(Side.CLIENT)
    public Vec3 getFogColor(float p_76562_1_, float p_76562_2_)
    {
        int i = 10518688;
        float f2 = MathHelper.cos(p_76562_1_ * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

        if (f2 < 0.0F)
        {
            f2 = 0.0F;
        }

        if (f2 > 1.0F)
        {
            f2 = 1.0F;
        }

        float f3 = (float)(i >> 16 & 255) / 255.0F;
        float f4 = (float)(i >> 8 & 255) / 255.0F;
        float f5 = (float)(i & 255) / 255.0F;
        f3 *= f2 * 0.0F + 0.15F;
        f4 *= f2 * 0.0F + 0.15F;
        f5 *= f2 * 0.0F + 0.15F;
        return Vec3.createVectorHelper((double)f3, (double)f4, (double)f5);
    }
    */

	@Override @SideOnly(Side.CLIENT)
    public boolean isSkyColored()
    {
        return false;
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere()
    {
        return true;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    @Override
    public boolean isSurfaceWorld()
    {
        return true;
    }

    /**
     * the y level at which clouds are rendered.
     */
    @Override  @SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 8.0F;
    }

    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    @Override
    public boolean canCoordinateBeSpawn(int p_76566_1_, int p_76566_2_)
    {
        return this.worldObj.getTopBlock(p_76566_1_, p_76566_2_).getMaterial().blocksMovement();
    }

    /**
     * Gets the hard-coded portal location to use when entering this dimension.
     */
    @Override
    public ChunkCoordinates getEntrancePortalLocation()
    {
        return new ChunkCoordinates(100, 50, 0);
    }

    public int getAverageGroundLevel()
    {
        return 50;
    }

    /**
     * Returns true if the given X,Z coordinate should show environmental fog.
     */
    @Override @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int p_76568_1_, int p_76568_2_)
    {
        return true;
    }

    /**
     * Returns the dimension's name, e.g. "The End", "Nether", or "Overworld".
     */
    @Override
    public String getDimensionName()
    {
        return "True End";
    }
}