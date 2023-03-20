// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockStep extends Block
{

    public BlockStep(int i, boolean flag)
    {
        super(i, 6, Material.rock);
        field_469_a = flag;
        if(!flag)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
        }
        func_256_d(255);
    }

    public int func_218_a(int i)
    {
        return i > 1 ? 5 : 6;
    }

    public boolean func_217_b()
    {
        return field_469_a;
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        if(this != Block.stairSingle)
        {
            return;
        } else
        {
            return;
        }
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        if(this != Block.stairSingle)
        {
            super.func_235_e(world, i, j, k);
        }
        int l = world.func_600_a(i, j - 1, k);
        if(l == stairSingle.blockID)
        {
            world.func_690_d(i, j, k, 0);
            world.func_690_d(i, j - 1, k, Block.stairDouble.blockID);
        }
    }

    public int func_240_a(int i, Random random)
    {
        return Block.stairSingle.blockID;
    }

    public boolean func_242_c()
    {
        return field_469_a;
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        if(this != Block.stairSingle)
        {
            super.func_260_c(iblockaccess, i, j, k, l);
        }
        if(l == 1)
        {
            return true;
        }
        if(!super.func_260_c(iblockaccess, i, j, k, l))
        {
            return false;
        }
        if(l == 0)
        {
            return true;
        } else
        {
            return iblockaccess.func_600_a(i, j, k) != blockID;
        }
    }

    private boolean field_469_a;
}
