// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class BlockFlower extends Block
{

    protected BlockFlower(int i, int j)
    {
        super(i, Material.plants);
        field_378_bb = j;
        func_253_b(true);
        float f = 0.2F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);
    }

    public boolean func_243_a(World world, int i, int j, int k)
    {
        return func_269_b(world.func_600_a(i, j - 1, k));
    }

    protected boolean func_269_b(int i)
    {
        return i == Block.grass.blockID || i == Block.dirt.blockID || i == Block.tilledField.blockID;
    }

    public void func_226_a(World world, int i, int j, int k, int l)
    {
        super.func_226_a(world, i, j, k, l);
        func_268_h(world, i, j, k);
    }

    public void func_208_a(World world, int i, int j, int k, Random random)
    {
        func_268_h(world, i, j, k);
    }

    protected final void func_268_h(World world, int i, int j, int k)
    {
        if(!func_223_g(world, i, j, k))
        {
            func_259_b_(world, i, j, k, world.func_602_e(i, j, k));
            world.func_690_d(i, j, k, 0);
        }
    }

    public boolean func_223_g(World world, int i, int j, int k)
    {
        return (world.func_618_j(i, j, k) >= 8 || world.func_647_i(i, j, k)) && func_269_b(world.func_600_a(i, j - 1, k));
    }

    public AxisAlignedBB func_221_d(World world, int i, int j, int k)
    {
        return null;
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
        return 1;
    }
}
