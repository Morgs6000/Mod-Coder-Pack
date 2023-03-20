// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class cg extends ff
{

    protected cg(int i, int j)
    {
        super(i, iq.i);
        bb = j;
        float f1 = 0.375F;
        a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 1.0F, 0.5F + f1);
        a(true);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(dy1.a(i, j + 1, k) == 0)
        {
            int l;
            for(l = 1; dy1.a(i, j - l, k) == bc; l++);
            if(l < 3)
            {
                int i1 = dy1.b(i, j, k);
                if(i1 == 15)
                {
                    dy1.d(i, j + 1, k, bc);
                    dy1.b(i, j, k, 0);
                } else
                {
                    dy1.b(i, j, k, i1 + 1);
                }
            }
        }
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        int l = dy1.a(i, j - 1, k);
        if(l == bc)
            return true;
        if(l != ff.v.bc && l != ff.w.bc)
            return false;
        if(dy1.c(i - 1, j - 1, k) == iq.f)
            return true;
        if(dy1.c(i + 1, j - 1, k) == iq.f)
            return true;
        if(dy1.c(i, j - 1, k - 1) == iq.f)
            return true;
        return dy1.c(i, j - 1, k + 1) == iq.f;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        g(dy1, i, j, k);
    }

    protected final void g(dy dy1, int i, int j, int k)
    {
        if(!f(dy1, i, j, k))
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
    }

    public boolean f(dy dy1, int i, int j, int k)
    {
        return a(dy1, i, j, k);
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public int a(int i, java.util.Random random)
    {
        return ez.aH.aS;
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 1;
    }
}
