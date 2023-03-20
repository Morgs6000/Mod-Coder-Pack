// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class an extends ff
{

    protected an(int i, int j)
    {
        super(i, j, iq.u);
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

    public dg d(dy dy1, int i, int j, int k)
    {
        float f1 = 0.0625F;
        return dg.b((float)i + f1, j, (float)k + f1, (float)(i + 1) - f1, (float)(j + 1) - f1, (float)(k + 1) - f1);
    }

    public int a(int i)
    {
        if(i == 1)
            return bb - 1;
        if(i == 0)
            return bb + 1;
        else
            return bb;
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 13;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        if(!super.a(dy1, i, j, k))
            return false;
        else
            return f(dy1, i, j, k);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        if(!f(dy1, i, j, k))
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
    }

    public boolean f(dy dy1, int i, int j, int k)
    {
        if(dy1.c(i - 1, j, k).a())
            return false;
        if(dy1.c(i + 1, j, k).a())
            return false;
        if(dy1.c(i, j, k - 1).a())
            return false;
        if(dy1.c(i, j, k + 1).a())
        {
            return false;
        } else
        {
            int l = dy1.a(i, j - 1, k);
            return l == ff.aW.bc || l == ff.F.bc;
        }
    }

    public void a(dy dy1, int i, int j, int k, dj dj1)
    {
        dj1.a(((dj) (null)), 1);
    }
}
