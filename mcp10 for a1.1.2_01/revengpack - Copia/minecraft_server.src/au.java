// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class au extends ff
{

    private boolean a;

    public au(int i, int j, boolean flag)
    {
        super(i, j, iq.d);
        if(flag)
            a(true);
        a = flag;
    }

    public int c()
    {
        return 30;
    }

    public void b(dy dy1, int i, int j, int k, fc fc)
    {
        g(dy1, i, j, k);
        super.b(dy1, i, j, k, fc);
    }

    public void b(dy dy1, int i, int j, int k, dj dj)
    {
        g(dy1, i, j, k);
        super.b(dy1, i, j, k, dj);
    }

    public boolean a(dy dy1, int i, int j, int k, fc fc)
    {
        g(dy1, i, j, k);
        return super.a(dy1, i, j, k, fc);
    }

    private void g(dy dy1, int i, int j, int k)
    {
        h(dy1, i, j, k);
        if(bc == ff.aO.bc)
            dy1.d(i, j, k, ff.aP.bc);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(bc == ff.aP.bc)
            dy1.d(i, j, k, ff.aO.bc);
    }

    public int a(int i, java.util.Random random)
    {
        return ez.aA.aS;
    }

    public int a(java.util.Random random)
    {
        return 4 + random.nextInt(2);
    }

    private void h(dy dy1, int i, int j, int k)
    {
        java.util.Random random = dy1.m;
        double d = 0.0625D;
        for(int l = 0; l < 6; l++)
        {
            double d1 = (float)i + random.nextFloat();
            double d2 = (float)j + random.nextFloat();
            double d3 = (float)k + random.nextFloat();
            if(l == 0 && !dy1.d(i, j + 1, k))
                d2 = (double)(j + 1) + d;
            if(l == 1 && !dy1.d(i, j - 1, k))
                d2 = (double)(j + 0) - d;
            if(l == 2 && !dy1.d(i, j, k + 1))
                d3 = (double)(k + 1) + d;
            if(l == 3 && !dy1.d(i, j, k - 1))
                d3 = (double)(k + 0) - d;
            if(l == 4 && !dy1.d(i + 1, j, k))
                d1 = (double)(i + 1) + d;
            if(l == 5 && !dy1.d(i - 1, j, k))
                d1 = (double)(i + 0) - d;
            if(d1 < (double)i || d1 > (double)(i + 1) || d2 < 0.0D || d2 > (double)(j + 1) || d3 < (double)k || d3 > (double)(k + 1))
                dy1.a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
        }

    }
}
