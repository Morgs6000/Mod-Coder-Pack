// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class il extends ff
{

    private int a[];
    private int b[];

    protected il(int i, int j)
    {
        super(i, j, iq.l);
        a = new int[256];
        b = new int[256];
        a(ff.y.bc, 5, 20);
        a(ff.K.bc, 5, 5);
        a(ff.L.bc, 30, 60);
        a(ff.ao.bc, 30, 20);
        a(ff.an.bc, 15, 100);
        a(ff.ac.bc, 30, 60);
        a(true);
    }

    private void a(int i, int j, int k)
    {
        a[i] = j;
        b[i] = k;
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 3;
    }

    public int a(java.util.Random random)
    {
        return 0;
    }

    public int c()
    {
        return 10;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        int l = dy1.b(i, j, k);
        if(l < 15)
        {
            dy1.b(i, j, k, l + 1);
            dy1.h(i, j, k, bc);
        }
        if(!g(dy1, i, j, k))
        {
            if(!dy1.d(i, j - 1, k) || l > 3)
                dy1.d(i, j, k, 0);
            return;
        }
        if(!b(((hq) (dy1)), i, j - 1, k) && l == 15 && random.nextInt(4) == 0)
        {
            dy1.d(i, j, k, 0);
            return;
        }
        if(l % 2 == 0 && l > 2)
        {
            a(dy1, i + 1, j, k, 300, random);
            a(dy1, i - 1, j, k, 300, random);
            a(dy1, i, j - 1, k, 200, random);
            a(dy1, i, j + 1, k, 250, random);
            a(dy1, i, j, k - 1, 300, random);
            a(dy1, i, j, k + 1, 300, random);
            for(int i1 = i - 1; i1 <= i + 1; i1++)
            {
                for(int j1 = k - 1; j1 <= k + 1; j1++)
                {
                    for(int k1 = j - 1; k1 <= j + 4; k1++)
                    {
                        if(i1 == i && k1 == j && j1 == k)
                            continue;
                        int l1 = 100;
                        if(k1 > j + 1)
                            l1 += (k1 - (j + 1)) * 100;
                        int i2 = h(dy1, i1, k1, j1);
                        if(i2 > 0 && random.nextInt(l1) <= i2)
                            dy1.d(i1, k1, j1, bc);
                    }

                }

            }

        }
    }

    private void a(dy dy1, int i, int j, int k, int l, java.util.Random random)
    {
        int i1 = b[dy1.a(i, j, k)];
        if(random.nextInt(l) < i1)
        {
            boolean flag = dy1.a(i, j, k) == ff.an.bc;
            if(random.nextInt(2) == 0)
                dy1.d(i, j, k, bc);
            else
                dy1.d(i, j, k, 0);
            if(flag)
                ff.an.a(dy1, i, j, k, 0);
        }
    }

    private boolean g(dy dy1, int i, int j, int k)
    {
        if(b(((hq) (dy1)), i + 1, j, k))
            return true;
        if(b(((hq) (dy1)), i - 1, j, k))
            return true;
        if(b(((hq) (dy1)), i, j - 1, k))
            return true;
        if(b(((hq) (dy1)), i, j + 1, k))
            return true;
        if(b(((hq) (dy1)), i, j, k - 1))
            return true;
        return b(((hq) (dy1)), i, j, k + 1);
    }

    private int h(dy dy1, int i, int j, int k)
    {
        int l = 0;
        if(dy1.a(i, j, k) != 0)
        {
            return 0;
        } else
        {
            l = f(dy1, i + 1, j, k, l);
            l = f(dy1, i - 1, j, k, l);
            l = f(dy1, i, j - 1, k, l);
            l = f(dy1, i, j + 1, k, l);
            l = f(dy1, i, j, k - 1, l);
            l = f(dy1, i, j, k + 1, l);
            return l;
        }
    }

    public boolean e()
    {
        return false;
    }

    public boolean b(hq hq1, int i, int j, int k)
    {
        return a[hq1.a(i, j, k)] > 0;
    }

    public int f(dy dy1, int i, int j, int k, int l)
    {
        int i1 = a[dy1.a(i, j, k)];
        if(i1 > l)
            return i1;
        else
            return l;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        return dy1.d(i, j - 1, k) || g(dy1, i, j, k);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        if(!dy1.d(i, j - 1, k) && !g(dy1, i, j, k))
        {
            dy1.d(i, j, k, 0);
            return;
        } else
        {
            return;
        }
    }

    public void e(dy dy1, int i, int j, int k)
    {
        if(!dy1.d(i, j - 1, k) && !g(dy1, i, j, k))
        {
            dy1.d(i, j, k, 0);
            return;
        } else
        {
            dy1.h(i, j, k, bc);
            return;
        }
    }
}
