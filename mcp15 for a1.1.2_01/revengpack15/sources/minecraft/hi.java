// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class hi extends ly
{

    protected hi(int i, int j, gb gb, boolean flag)
    {
        super(i, j, gb);
        field_462_a = flag;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_260_c(nm nm1, int i, int j, int k, int l)
    {
        int i1 = nm1.func_600_a(i, j, k);
        if(!field_462_a && i1 == field_376_bc)
        {
            return false;
        } else
        {
            return super.func_260_c(nm1, i, j, k, l);
        }
    }

    protected boolean field_462_a;
}
