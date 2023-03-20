// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class WorldGenLiquids extends WorldGenerator
{

    public WorldGenLiquids(int i)
    {
        field_865_a = i;
    }

    public boolean func_516_a(World world, Random random, int i, int j, int k)
    {
        if(world.func_600_a(i, j + 1, k) != Block.stone.blockID)
        {
            return false;
        }
        if(world.func_600_a(i, j - 1, k) != Block.stone.blockID)
        {
            return false;
        }
        if(world.func_600_a(i, j, k) != 0 && world.func_600_a(i, j, k) != Block.stone.blockID)
        {
            return false;
        }
        int l = 0;
        if(world.func_600_a(i - 1, j, k) == Block.stone.blockID)
        {
            l++;
        }
        if(world.func_600_a(i + 1, j, k) == Block.stone.blockID)
        {
            l++;
        }
        if(world.func_600_a(i, j, k - 1) == Block.stone.blockID)
        {
            l++;
        }
        if(world.func_600_a(i, j, k + 1) == Block.stone.blockID)
        {
            l++;
        }
        int i1 = 0;
        if(world.func_600_a(i - 1, j, k) == 0)
        {
            i1++;
        }
        if(world.func_600_a(i + 1, j, k) == 0)
        {
            i1++;
        }
        if(world.func_600_a(i, j, k - 1) == 0)
        {
            i1++;
        }
        if(world.func_600_a(i, j, k + 1) == 0)
        {
            i1++;
        }
        if(l == 3 && i1 == 1)
        {
            world.func_690_d(i, j, k, field_865_a);
        }
        return true;
    }

    private int field_865_a;
}
