// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockLeaves extends BlockLeavesBase
{

    protected BlockLeaves(int i, int j)
    {
        super(i, j, Material.leaves, false);
        field_464_c = 0;
        field_463_b = j;
        func_253_b(true);
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        field_464_c = 0;
        func_308_h(world, i, j, k);
        super.func_226_a(world, i, j, k, l);
    }

    public void func_306_f(World world, int i, int j, int k, int l)
    {
        if(world.func_600_a(i, j, k) != blockID)
        {
            return;
        }
        int i1 = world.func_602_e(i, j, k);
        if(i1 == 0 || i1 != l - 1)
        {
            return;
        } else
        {
            func_308_h(world, i, j, k);
            return;
        }
    }

    public void func_308_h(World world, int i, int j, int k)
    {
        if(field_464_c++ >= 100)
        {
            return;
        }
        int l = world.func_599_f(i, j - 1, k).func_878_a() ? 16 : 0;
        int i1 = world.func_602_e(i, j, k);
        if(i1 == 0)
        {
            i1 = 1;
            world.func_691_b(i, j, k, 1);
        }
        l = func_309_g(world, i, j - 1, k, l);
        l = func_309_g(world, i, j, k - 1, l);
        l = func_309_g(world, i, j, k + 1, l);
        l = func_309_g(world, i - 1, j, k, l);
        l = func_309_g(world, i + 1, j, k, l);
        int j1 = l - 1;
        if(j1 < 10)
        {
            j1 = 1;
        }
        if(j1 != i1)
        {
            world.func_691_b(i, j, k, j1);
            func_306_f(world, i, j - 1, k, i1);
            func_306_f(world, i, j + 1, k, i1);
            func_306_f(world, i, j, k - 1, i1);
            func_306_f(world, i, j, k + 1, i1);
            func_306_f(world, i - 1, j, k, i1);
            func_306_f(world, i + 1, j, k, i1);
        }
    }

    private int func_309_g(World world, int i, int j, int k, int l)
    {
        int i1 = world.func_600_a(i, j, k);
        if(i1 == Block.wood.blockID)
        {
            return 16;
        }
        if(i1 == blockID)
        {
            int j1 = world.func_602_e(i, j, k);
            if(j1 != 0 && j1 > l)
            {
                return j1;
            }
        }
        return l;
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        int l = world.func_602_e(i, j, k);
        if(l == 0)
        {
            field_464_c = 0;
            func_308_h(world, i, j, k);
        } else
        if(l == 1)
        {
            func_307_i(world, i, j, k);
        } else
        if(random.nextInt(10) == 0)
        {
            func_308_h(world, i, j, k);
        }
    }

    private void func_307_i(World world, int i, int j, int k)
    {
        func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
        world.func_690_d(i, j, k, 0);
    }

    public int func_229_a(Random random)
    {
        return random.nextInt(20) != 0 ? 0 : 1;
    }

    public int func_240_a(int i, Random random)
    {
        return Block.sapling.blockID;
    }

    public boolean func_217_b()
    {
        return !field_462_a;
    }

    public void func_310_a(boolean flag)
    {
        field_462_a = flag;
        field_378_bb = field_463_b + (flag ? 0 : 1);
    }

    public void func_254_a(World world, int i, int j, int k, Entity entity)
    {
        super.func_254_a(world, i, j, k, entity);
    }

    private int field_463_b;
    private int field_464_c;
}
