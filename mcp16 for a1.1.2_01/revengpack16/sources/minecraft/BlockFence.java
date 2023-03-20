// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;

public class BlockFence extends Block
{

    public BlockFence(int i, int j)
    {
        super(i, j, Material.wood);
    }

    public void func_230_a(World world, int i, int j, int k, AxisAlignedBB axisalignedbb, ArrayList arraylist)
    {
        arraylist.add(AxisAlignedBB.func_1161_b(i, j, k, i + 1, (double)j + 1.5D, k + 1));
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        if(world.func_600_a(i, j - 1, k) == blockID)
        {
            return false;
        }
        if(!world.func_599_f(i, j - 1, k).func_878_a())
        {
            return false;
        } else
        {
            return super.func_243_a(world, i, j, k);
        }
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 11;
    }
}
