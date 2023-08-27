// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.Random;

public class dofix extends ff
{

    private ff a;

    protected dofix(int j, ff ff1)
    {
        super(j, ff1.bb, ff1.bn);
        a = ff1;
        c(ff1.bd);
        b(ff1.be / 3F);
        a(ff1.bl);
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 10;
    }

    public boolean a(hq hq, int j, int k, int l, int i1)
    {
        return super.a(hq, j, k, l, i1);
    }

    public void a(dy dy1, int j, int k, int l, dg dg, java.util.ArrayList arraylist)
    {
        int i1 = dy1.b(j, k, l);
        if(i1 == 0)
        {
            a(0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 1.0F);
            super.a(dy1, j, k, l, dg, arraylist);
            a(0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.a(dy1, j, k, l, dg, arraylist);
        } else
        if(i1 == 1)
        {
            a(0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F);
            super.a(dy1, j, k, l, dg, arraylist);
            a(0.5F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            super.a(dy1, j, k, l, dg, arraylist);
        } else
        if(i1 == 2)
        {
            a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
            super.a(dy1, j, k, l, dg, arraylist);
            a(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F);
            super.a(dy1, j, k, l, dg, arraylist);
        } else
        if(i1 == 3)
        {
            a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.5F);
            super.a(dy1, j, k, l, dg, arraylist);
            a(0.0F, 0.0F, 0.5F, 1.0F, 0.5F, 1.0F);
            super.a(dy1, j, k, l, dg, arraylist);
        }
        a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    public void b(dy dy1, int j, int k, int l, int i1)
    {
        if(dy1.x)
            return;
        if(dy1.c(j, k + 1, l).a())
        {
            dy1.d(j, k, l, a.bc);
        } else
        {
            g(dy1, j, k, l);
            g(dy1, j + 1, k - 1, l);
            g(dy1, j - 1, k - 1, l);
            g(dy1, j, k - 1, l - 1);
            g(dy1, j, k - 1, l + 1);
            g(dy1, j + 1, k + 1, l);
            g(dy1, j - 1, k + 1, l);
            g(dy1, j, k + 1, l - 1);
            g(dy1, j, k + 1, l + 1);
        }
        a.b(dy1, j, k, l, i1);
    }

    private void g(dy dy1, int j, int k, int l)
    {
        if(!i(dy1, j, k, l))
            return;
        byte byte0 = -1;
        if(i(dy1, j + 1, k + 1, l))
            byte0 = 0;
        if(i(dy1, j - 1, k + 1, l))
            byte0 = 1;
        if(i(dy1, j, k + 1, l + 1))
            byte0 = 2;
        if(i(dy1, j, k + 1, l - 1))
            byte0 = 3;
        if(byte0 < 0)
        {
            if(h(dy1, j + 1, k, l) && !h(dy1, j - 1, k, l))
                byte0 = 0;
            if(h(dy1, j - 1, k, l) && !h(dy1, j + 1, k, l))
                byte0 = 1;
            if(h(dy1, j, k, l + 1) && !h(dy1, j, k, l - 1))
                byte0 = 2;
            if(h(dy1, j, k, l - 1) && !h(dy1, j, k, l + 1))
                byte0 = 3;
        }
        if(byte0 < 0)
        {
            if(i(dy1, j - 1, k - 1, l))
                byte0 = 0;
            if(i(dy1, j + 1, k - 1, l))
                byte0 = 1;
            if(i(dy1, j, k - 1, l - 1))
                byte0 = 2;
            if(i(dy1, j, k - 1, l + 1))
                byte0 = 3;
        }
        if(byte0 >= 0)
            dy1.b(j, k, l, ((int) (byte0)));
    }

    private boolean h(dy dy1, int j, int k, int l)
    {
        return dy1.c(j, k, l).a();
    }

    private boolean i(dy dy1, int j, int k, int l)
    {
        int i1 = dy1.a(j, k, l);
        if(i1 == 0)
            return false;
        else
            return ff.n[i1].a() == 10;
    }

    public void b(dy dy1, int j, int k, int l, fc fc)
    {
        a.b(dy1, j, k, l, fc);
    }

    public void a(dy dy1, int j, int k, int l, int i1)
    {
        a.a(dy1, j, k, l, i1);
    }

    public float a(dj dj)
    {
        return a.a(dj);
    }

    public int a(int j, java.util.Random random)
    {
        return a.a(j, random);
    }

    public int a(java.util.Random random)
    {
        return a.a(random);
    }

    public int a(int j)
    {
        return a.a(j);
    }

    public int c()
    {
        return a.c();
    }

    public void a(dy dy1, int j, int k, int l, dj dj, aw aw)
    {
        a.a(dy1, j, k, l, dj, aw);
    }

    public boolean e()
    {
        return a.e();
    }

    public boolean a(int j, boolean flag)
    {
        return a.a(j, flag);
    }

    public boolean a(dy dy1, int j, int k, int l)
    {
        return a.a(dy1, j, k, l);
    }

    public void e(dy dy1, int j, int k, int l)
    {
        b(dy1, j, k, l, 0);
        a.e(dy1, j, k, l);
    }

    public void b(dy dy1, int j, int k, int l)
    {
        a.b(dy1, j, k, l);
    }

    public void a(dy dy1, int j, int k, int l, int i1, float f)
    {
        a.a(dy1, j, k, l, i1, f);
    }

    public void a_(dy dy1, int j, int k, int l, int i1)
    {
        a.a_(dy1, j, k, l, i1);
    }

    public void b(dy dy1, int j, int k, int l, dj dj)
    {
        a.b(dy1, j, k, l, dj);
    }

    public void a(dy dy1, int j, int k, int l, java.util.Random random)
    {
        a.a(dy1, j, k, l, random);
    }

    public boolean a(dy dy1, int j, int k, int l, fc fc)
    {
        return a.a(dy1, j, k, l, fc);
    }

    public void c(dy dy1, int j, int k, int l)
    {
        a.c(dy1, j, k, l);
    }
}
