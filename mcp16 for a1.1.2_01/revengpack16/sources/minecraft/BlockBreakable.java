// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class BlockBreakable extends Block
{

    protected BlockBreakable(int i, int j, Material material, boolean flag)
    {
        super(i, j, material);
        field_465_a = flag;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_260_c(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        int i1 = iblockaccess.func_600_a(i, j, k);
        if(!field_465_a && i1 == blockID)
        {
            return false;
        } else
        {
            return super.func_260_c(iblockaccess, i, j, k, l);
        }
    }

    private boolean field_465_a;
}
