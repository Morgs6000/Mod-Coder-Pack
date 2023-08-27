// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public abstract class cn extends ff
{

    protected int d;

    protected cn(int j, iq iq1)
    {
        super(j, (iq1 != iq.g ? 12 : 14) * 16 + 13, iq1);
        d = 1;
        float f = 0.0F;
        float f1 = 0.0F;
        if(iq1 == iq.g)
            d = 2;
        a(0.0F + f1, 0.0F + f, 0.0F + f1, 1.0F + f1, 1.0F + f, 1.0F + f1);
        a(true);
    }

    public static float b(int j)
    {
        if(j >= 8)
            j = 0;
        float f = (float)(j + 1) / 9F;
        return f;
    }

    public int a(int j)
    {
        if(j == 0 || j == 1)
            return bb;
        else
            return bb + 1;
    }

    protected int g(dy dy1, int j, int k, int l)
    {
        if(dy1.c(j, k, l) != bn)
            return -1;
        else
            return dy1.b(j, k, l);
    }

    protected int b(hq hq1, int j, int k, int l)
    {
        if(hq1.c(j, k, l) != bn)
            return -1;
        int i1 = hq1.b(j, k, l);
        if(i1 >= 8)
            i1 = 0;
        return i1;
    }

    public boolean b()
    {
        return false;
    }

    public boolean a(int j, boolean flag)
    {
        return flag && j == 0;
    }

    public boolean a(hq hq1, int j, int k, int l, int i1)
    {
        iq iq1 = hq1.c(j, k, l);
        if(iq1 == bn)
            return false;
        if(iq1 == iq.r)
            return false;
        if(i1 == 1)
            return true;
        else
            return super.a(hq1, j, k, l, i1);
    }

    public dg d(dy dy1, int j, int k, int l)
    {
        return null;
    }

    public int a()
    {
        return 4;
    }

    public int a(int j, java.util.Random random)
    {
        return 0;
    }

    public int a(java.util.Random random)
    {
        return 0;
    }

    private aw c(hq hq1, int j, int k, int l)
    {
        aw aw1 = ((aw)null).b(0.0D, 0.0D, 0.0D);
        int i1 = b(hq1, j, k, l);
        for(int j1 = 0; j1 < 4; j1++)
        {
            int k1 = j;
            int l1 = k;
            int i2 = l;
            if(j1 == 0)
                k1--;
            if(j1 == 1)
                i2--;
            if(j1 == 2)
                k1++;
            if(j1 == 3)
                i2++;
            int j2 = b(hq1, k1, l1, i2);
            if(j2 < 0)
            {
                if(hq1.c(k1, l1, i2).c())
                    continue;
                j2 = b(hq1, k1, l1 - 1, i2);
                if(j2 >= 0)
                {
                    int k2 = j2 - (i1 - 8);
                    aw1 = aw1.c((k1 - j) * k2, (l1 - k) * k2, (i2 - l) * k2);
                }
                continue;
            }
            if(j2 >= 0)
            {
                int l2 = j2 - i1;
                aw1 = aw1.c((k1 - j) * l2, (l1 - k) * l2, (i2 - l) * l2);
            }
        }

        if(hq1.b(j, k, l) >= 8)
        {
            boolean flag = false;
            if(flag || a(hq1, j, k, l - 1, 2))
                flag = true;
            if(flag || a(hq1, j, k, l + 1, 3))
                flag = true;
            if(flag || a(hq1, j - 1, k, l, 4))
                flag = true;
            if(flag || a(hq1, j + 1, k, l, 5))
                flag = true;
            if(flag || a(hq1, j, k + 1, l - 1, 2))
                flag = true;
            if(flag || a(hq1, j, k + 1, l + 1, 3))
                flag = true;
            if(flag || a(hq1, j - 1, k + 1, l, 4))
                flag = true;
            if(flag || a(hq1, j + 1, k + 1, l, 5))
                flag = true;
            if(flag)
                aw1 = aw1.b().c(0.0D, -6D, 0.0D);
        }
        aw1 = aw1.b();
        return aw1;
    }

    public void a(dy dy1, int j, int k, int l, dj dj, aw aw1)
    {
        aw aw2 = c(((hq) (dy1)), j, k, l);
        aw1.a += aw2.a;
        aw1.b += aw2.b;
        aw1.c += aw2.c;
    }

    public int c()
    {
        if(bn == iq.f)
            return 5;
        return bn != iq.g ? 0 : 30;
    }

    public void a(dy dy1, int j, int k, int l, java.util.Random random)
    {
        super.a(dy1, j, k, l, random);
    }

    public void e(dy dy1, int j, int k, int l)
    {
        i(dy1, j, k, l);
    }

    public void b(dy dy1, int j, int k, int l, int i1)
    {
        i(dy1, j, k, l);
    }

    private void i(dy dy1, int j, int k, int l)
    {
        if(dy1.a(j, k, l) != bc)
            return;
        if(bn == iq.g)
        {
            boolean flag = false;
            if(flag || dy1.c(j, k, l - 1) == iq.f)
                flag = true;
            if(flag || dy1.c(j, k, l + 1) == iq.f)
                flag = true;
            if(flag || dy1.c(j - 1, k, l) == iq.f)
                flag = true;
            if(flag || dy1.c(j + 1, k, l) == iq.f)
                flag = true;
            if(flag || dy1.c(j, k + 1, l) == iq.f)
                flag = true;
            if(flag)
            {
                int i1 = dy1.b(j, k, l);
                if(i1 == 0)
                    dy1.d(j, k, l, ff.aq.bc);
                else
                if(i1 <= 4)
                    dy1.d(j, k, l, ff.x.bc);
                h(dy1, j, k, l);
            }
        }
    }

    protected void h(dy dy1, int j, int k, int l)
    {
        dy1.a((float)j + 0.5F, (float)k + 0.5F, (float)l + 0.5F, "random.fizz", 0.5F, 2.6F + (dy1.m.nextFloat() - dy1.m.nextFloat()) * 0.8F);
        for(int i1 = 0; i1 < 8; i1++)
            dy1.a("largesmoke", (double)j + java.lang.Math.random(), (double)k + 1.2D, (double)l + java.lang.Math.random(), 0.0D, 0.0D, 0.0D);

    }
}
