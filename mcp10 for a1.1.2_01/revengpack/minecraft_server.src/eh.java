// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class eh extends ff
{

    protected eh(int i, int j)
    {
        super(i, j, iq.c);
    }

    public int a(int i)
    {
        return bb + (i != 1 ? 0 : 1);
    }

    public boolean a(dy dy1, int i, int j, int k, fc fc)
    {
        int l = dy1.b(i, j, k);
        if(l > 0)
        {
            f(dy1, i, j, k, l);
            return true;
        } else
        {
            return false;
        }
    }

    public void f(dy dy1, int i, int j, int k, int l)
    {
        dy1.a(((java.lang.String) (null)), i, j, k);
        dy1.b(i, j, k, 0);
        int i1 = (ez.aQ.aS + l) - 1;
        float f1 = 0.7F;
        double d = (double)(dy1.m.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
        double d1 = (double)(dy1.m.nextFloat() * f1) + (double)(1.0F - f1) * 0.20000000000000001D + 0.59999999999999998D;
        double d2 = (double)(dy1.m.nextFloat() * f1) + (double)(1.0F - f1) * 0.5D;
        fn fn1 = new fn(dy1, (double)i + d, (double)j + d1, (double)k + d2, new gp(i1));
        fn1.ad = 10;
        dy1.a(((dj) (fn1)));
    }

    public void a(dy dy1, int i, int j, int k, int l, float f1)
    {
        if(dy1.x)
            return;
        if(l > 0)
            f(dy1, i, j, k, l);
        super.a(dy1, i, j, k, l, f1);
    }
}
