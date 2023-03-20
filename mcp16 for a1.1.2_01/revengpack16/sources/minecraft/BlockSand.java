// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockSand extends Block
{

    public BlockSand(int i, int j)
    {
        super(i, j, Material.sand);
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        world.func_681_h(i, j, k, blockID);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        world.func_681_h(i, j, k, blockID);
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        func_315_h(world, i, j, k);
    }

    private void func_315_h(World world, int i, int j, int k)
    {
        int l = i;
        int i1 = j;
        int j1 = k;
        if(func_316_a_(world, l, i1 - 1, j1) && i1 >= 0)
        {
            EntityFallingSand entityfallingsand = new EntityFallingSand(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, blockID);
            if(field_466_a)
            {
                while(!entityfallingsand.field_646_aA) 
                {
                    entityfallingsand.func_370_e_();
                }
            } else
            {
                world.func_674_a(entityfallingsand);
            }
        }
    }

    public int func_206_a()
    {
        return 3;
    }

    public static boolean func_316_a_(World world, int i, int j, int k)
    {
        int l = world.func_600_a(i, j, k);
        if(l == 0)
        {
            return true;
        }
        if(l == Block.fire.blockID)
        {
            return true;
        }
        Material material = Block.allBlocks[l].material;
        if(material == Material.water)
        {
            return true;
        }
        return material == Material.lava;
    }

    public static boolean field_466_a = false;

}
