// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockIce extends BlockBreakable
{

    public BlockIce(int i, int j)
    {
        super(i, j, Material.ice, false);
        field_355_bo = 0.98F;
        func_253_b(true);
    }

    public int func_234_g()
    {
        return 1;
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return super.func_260_c(iblockaccess, i, j, k, 1 - l);
    }

    public void func_214_b(World world, int i, int j, int k)
    {
        Material material = world.func_599_f(i, j - 1, k);
        if(material.func_880_c() || material.func_879_d())
        {
            world.func_690_d(i, j, k, Block.waterStill.blockID);
        }
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        if(world.func_641_a(EnumSkyBlock.Block, i, j, k) > 11 - Block.field_341_r[blockID])
        {
            func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
            world.func_690_d(i, j, k, Block.waterMoving.blockID);
        }
    }
}
