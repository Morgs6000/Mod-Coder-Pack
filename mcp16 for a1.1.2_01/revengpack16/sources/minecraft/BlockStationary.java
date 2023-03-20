// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockStationary extends BlockFluids
{

    protected BlockStationary(int i, Material material)
    {
        super(i, material);
        func_253_b(false);
        if(material == Material.lava)
        {
            func_253_b(true);
        }
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        super.func_226_a(world, i, j, k, l);
        if(world.func_600_a(i, j, k) == blockID)
        {
            func_302_j(world, i, j, k);
        }
    }

    private void func_302_j(World world, int i, int j, int k)
    {
        int l = world.func_602_e(i, j, k);
        world.field_1043_h = true;
        world.func_643_a(i, j, k, blockID - 1, l);
        world.func_701_b(i, j, k, i, j, k);
        world.func_681_h(i, j, k, blockID - 1);
        world.field_1043_h = false;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        if(material == Material.lava)
        {
            int l = random.nextInt(3);
            for(int i1 = 0; i1 < l; i1++)
            {
                i += random.nextInt(3) - 1;
                j++;
                k += random.nextInt(3) - 1;
                int j1 = world.func_600_a(i, j, k);
                if(j1 == 0)
                {
                    if(func_301_k(world, i - 1, j, k) || func_301_k(world, i + 1, j, k) || func_301_k(world, i, j, k - 1) || func_301_k(world, i, j, k + 1) || func_301_k(world, i, j - 1, k) || func_301_k(world, i, j + 1, k))
                    {
                        world.func_690_d(i, j, k, Block.fire.blockID);
                        return;
                    }
                    continue;
                }
                if(Block.allBlocks[j1].material.func_880_c())
                {
                    return;
                }
            }

        }
    }

    private boolean func_301_k(World world, int i, int j, int k)
    {
        return world.func_599_f(i, j, k).func_876_e();
    }
}
