// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class br extends p
{

    private int b;
    private int c;

    protected br(int i, int j)
    {
        super(i, j, iq.h, false);
        c = 0;
        b = j;
        a(true);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        c = 0;
        g(dy1, i, j, k);
        super.b(dy1, i, j, k, l);
    }

    public void e(dy dy1, int i, int j, int k, int l)
    {
        if(dy1.a(i, j, k) != bc)
            return;
        int i1 = dy1.b(i, j, k);
        if(i1 == 0 || i1 != l - 1)
        {
            return;
        } else
        {
            g(dy1, i, j, k);
            return;
        }
    }

    public void g(dy dy1, int i, int j, int k)
    {
        if(c++ >= 100)
            return;
        int l = ((int) (dy1.c(i, j - 1, k).a() ? 16 : 0));
        int i1 = dy1.b(i, j, k);
        if(i1 == 0)
        {
            i1 = 1;
            dy1.b(i, j, k, 1);
        }
        l = f(dy1, i, j - 1, k, l);
        l = f(dy1, i, j, k - 1, l);
        l = f(dy1, i, j, k + 1, l);
        l = f(dy1, i - 1, j, k, l);
        l = f(dy1, i + 1, j, k, l);
        int j1 = l - 1;
        if(j1 < 10)
            j1 = 1;
        if(j1 != i1)
        {
            dy1.b(i, j, k, j1);
            e(dy1, i, j - 1, k, i1);
            e(dy1, i, j + 1, k, i1);
            e(dy1, i, j, k - 1, i1);
            e(dy1, i, j, k + 1, i1);
            e(dy1, i - 1, j, k, i1);
            e(dy1, i + 1, j, k, i1);
        }
    }

    private int f(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.a(i, j, k);
        if(i1 == ff.K.bc)
            return 16;
        if(i1 == bc)
        {
            int j1 = dy1.b(i, j, k);
            if(j1 != 0 && j1 > l)
                return j1;
        }
        return l;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        int l = dy1.b(i, j, k);
        if(l == 0)
        {
            c = 0;
            g(dy1, i, j, k);
        } else
        if(l == 1)
            h(dy1, i, j, k);
        else
        if(random.nextInt(10) == 0)
            g(dy1, i, j, k);
    }

    private void h(dy dy1, int i, int j, int k)
    {
        a_(dy1, i, j, k, dy1.b(i, j, k));
        dy1.d(i, j, k, 0);
    }

    public int a(java.util.Random random)
    {
        return random.nextInt(20) != 0 ? 0 : 1;
    }

    public int a(int i, java.util.Random random)
    {
        return ff.z.bc;
    }

    public boolean b()
    {
        return !a;
    }

    public void b(dy dy1, int i, int j, int k, dj dj)
    {
        super.b(dy1, i, j, k, dj);
    }
}
