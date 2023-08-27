// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class by extends gc
{

    private boolean a;
    private static java.util.List b = new ArrayList();

    private boolean a(dy dy1, int i, int j, int k, boolean flag)
    {
        if(flag)
            b.add(((java.lang.Object) (new ht(i, j, k, dy1.c))));
        int l = 0;
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            ht ht1 = (ht)b.get(i1);
            if(ht1.a == i && ht1.b == j && ht1.c == k && ++l >= 8)
                return true;
        }

        return false;
    }

    protected by(int i, int j, boolean flag)
    {
        super(i, j);
        a = false;
        a = flag;
        a(true);
    }

    public int c()
    {
        return 2;
    }

    public void e(dy dy1, int i, int j, int k)
    {
        if(dy1.b(i, j, k) == 0)
            super.e(dy1, i, j, k);
        if(a)
        {
            dy1.g(i, j - 1, k, bc);
            dy1.g(i, j + 1, k, bc);
            dy1.g(i - 1, j, k, bc);
            dy1.g(i + 1, j, k, bc);
            dy1.g(i, j, k - 1, bc);
            dy1.g(i, j, k + 1, bc);
        }
    }

    public void b(dy dy1, int i, int j, int k)
    {
        if(a)
        {
            dy1.g(i, j - 1, k, bc);
            dy1.g(i, j + 1, k, bc);
            dy1.g(i - 1, j, k, bc);
            dy1.g(i + 1, j, k, bc);
            dy1.g(i, j, k - 1, bc);
            dy1.g(i, j, k + 1, bc);
        }
    }

    public boolean b(hq hq1, int i, int j, int k, int l)
    {
        if(!a)
            return false;
        int i1 = hq1.b(i, j, k);
        if(i1 == 5 && l == 1)
            return false;
        if(i1 == 3 && l == 3)
            return false;
        if(i1 == 4 && l == 2)
            return false;
        if(i1 == 1 && l == 5)
            return false;
        return i1 != 2 || l != 4;
    }

    private boolean g(dy dy1, int i, int j, int k)
    {
        int l = dy1.b(i, j, k);
        if(l == 5 && dy1.j(i, j - 1, k, 0))
            return true;
        if(l == 3 && dy1.j(i, j, k - 1, 2))
            return true;
        if(l == 4 && dy1.j(i, j, k + 1, 3))
            return true;
        if(l == 1 && dy1.j(i - 1, j, k, 4))
            return true;
        return l == 2 && dy1.j(i + 1, j, k, 5);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        boolean flag = g(dy1, i, j, k);
        for(; b.size() > 0 && dy1.c - ((ht)b.get(0)).d > 100L; b.remove(0));
        if(a)
        {
            if(flag)
            {
                dy1.b(i, j, k, ff.aQ.bc, dy1.b(i, j, k));
                if(a(dy1, i, j, k, true))
                {
                    dy1.a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, "random.fizz", 0.5F, 2.6F + (dy1.m.nextFloat() - dy1.m.nextFloat()) * 0.8F);
                    for(int l = 0; l < 5; l++)
                    {
                        double d1 = (double)i + random.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        double d2 = (double)j + random.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        double d3 = (double)k + random.nextDouble() * 0.59999999999999998D + 0.20000000000000001D;
                        dy1.a("smoke", d1, d2, d3, 0.0D, 0.0D, 0.0D);
                    }

                }
            }
        } else
        if(!flag && !a(dy1, i, j, k, false))
            dy1.b(i, j, k, ff.aR.bc, dy1.b(i, j, k));
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        super.b(dy1, i, j, k, l);
        dy1.h(i, j, k, bc);
    }

    public boolean d(dy dy1, int i, int j, int k, int l)
    {
        if(l == 0)
            return b(((hq) (dy1)), i, j, k, l);
        else
            return false;
    }

    public int a(int i, java.util.Random random)
    {
        return ff.aR.bc;
    }

    public boolean d()
    {
        return true;
    }

}
