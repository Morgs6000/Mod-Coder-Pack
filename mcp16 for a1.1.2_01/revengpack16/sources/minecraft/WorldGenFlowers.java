// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class WorldGenFlowers extends WorldGenerator
{

    public WorldGenFlowers(int i)
    {
        field_885_a = i;
    }

    public boolean func_516_a(World world, Random random, int i, int j, int k)
    {
        for(int l = 0; l < 64; l++)
        {
            int i1 = (i + random.nextInt(8)) - random.nextInt(8);
            int j1 = (j + random.nextInt(4)) - random.nextInt(4);
            int k1 = (k + random.nextInt(8)) - random.nextInt(8);
            if(world.func_600_a(i1, j1, k1) == 0 && ((BlockFlower)Block.allBlocks[field_885_a]).func_223_g(world, i1, j1, k1))
            {
                world.func_634_a(i1, j1, k1, field_885_a);
            }
        }

        return true;
    }

    private int field_885_a;
}
