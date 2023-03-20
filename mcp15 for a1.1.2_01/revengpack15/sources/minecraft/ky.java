// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ky extends mq
{

    protected ky(int i, int j)
    {
        super(i, j);
        float f = 0.2F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    protected boolean func_269_b(int i)
    {
        return ly.field_343_p[i];
    }

    public boolean func_223_g(cn cn1, int i, int j, int k)
    {
        return cn1.func_618_j(i, j, k) <= 13 && func_269_b(cn1.func_600_a(i, j - 1, k));
    }
}
