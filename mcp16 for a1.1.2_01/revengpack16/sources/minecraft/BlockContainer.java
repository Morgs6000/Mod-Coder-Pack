// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public abstract class BlockContainer extends Block
{

    protected BlockContainer(int i, Material material)
    {
        super(i, material);
        field_342_q[i] = true;
    }

    protected BlockContainer(int i, int j, Material material)
    {
        super(i, j, material);
    }

    public void func_235_e(World world, int i, int j, int k)
    {
        super.func_235_e(world, i, j, k);
        world.func_654_a(i, j, k, func_283_a_());
    }

    public void func_214_b(World world, int i, int j, int k)
    {
        super.func_214_b(world, i, j, k);
        world.func_692_l(i, j, k);
    }

    protected abstract TileEntity func_283_a_();
}
