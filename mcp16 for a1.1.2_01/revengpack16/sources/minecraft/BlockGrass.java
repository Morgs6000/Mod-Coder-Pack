// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockGrass extends Block
{

    protected BlockGrass(int i)
    {
        super(i, Material.ground);
        field_378_bb = 3;
        func_253_b(true);
    }

    public int func_211_a(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return 0;
        }
        if(l == 0)
        {
            return 2;
        }
        Material material = iblockaccess.func_599_f(i, j + 1, k);
        return material != Material.snow && material != Material.builtSnow ? 3 : 68;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        if(world.func_618_j(i, j + 1, k) < 4 && world.func_599_f(i, j + 1, k).func_881_b())
        {
            if(random.nextInt(4) != 0)
            {
                return;
            }
            world.func_690_d(i, j, k, Block.dirt.blockID);
        } else
        if(world.func_618_j(i, j + 1, k) >= 9)
        {
            int l = (i + random.nextInt(3)) - 1;
            int i1 = (j + random.nextInt(5)) - 3;
            int j1 = (k + random.nextInt(3)) - 1;
            if(world.func_600_a(l, i1, j1) == Block.dirt.blockID && world.func_618_j(l, i1 + 1, j1) >= 4 && !world.func_599_f(l, i1 + 1, j1).func_881_b())
            {
                world.func_690_d(l, i1, j1, Block.grass.blockID);
            }
        }
    }

    public int func_240_a(int i, Random random)
    {
        return Block.dirt.func_240_a(0, random);
    }
}
