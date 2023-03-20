// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fz extends ff
{

    protected fz(int i)
    {
        super(i, iq.b);
        bb = 87;
        a(true);
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        c(255);
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return dg.b(i + 0, j + 0, k + 0, i + 1, j + 1, k + 1);
    }

    public boolean b()
    {
        return false;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(random.nextInt(5) == 0)
            if(h(dy1, i, j, k))
            {
                dy1.b(i, j, k, 7);
            } else
            {
                int l = dy1.b(i, j, k);
                if(l > 0)
                    dy1.b(i, j, k, l - 1);
                else
                if(!g(dy1, i, j, k))
                    dy1.d(i, j, k, ff.w.bc);
            }
    }

    public void b(dy dy1, int i, int j, int k, dj dj)
    {
        if(dy1.m.nextInt(4) == 0)
            dy1.d(i, j, k, ff.w.bc);
    }

    private boolean g(dy dy1, int i, int j, int k)
    {
        int l = 0;
        for(int i1 = i - l; i1 <= i + l; i1++)
        {
            for(int j1 = k - l; j1 <= k + l; j1++)
                if(dy1.a(i1, j + 1, j1) == ff.aA.bc)
                    return true;

        }

        return false;
    }

    private boolean h(dy dy1, int i, int j, int k)
    {
        for(int l = i - 4; l <= i + 4; l++)
        {
            for(int i1 = j; i1 <= j + 1; i1++)
            {
                for(int j1 = k - 4; j1 <= k + 4; j1++)
                    if(dy1.c(l, i1, j1) == iq.f)
                        return true;

            }

        }

        return false;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        super.b(dy1, i, j, k, l);
        iq iq1 = dy1.c(i, j + 1, k);
        if(iq1.a())
            dy1.d(i, j, k, ff.w.bc);
    }

    public int a(int i, java.util.Random random)
    {
        return ff.w.a(0, random);
    }
}
