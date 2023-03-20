// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class dh extends ff
{

    private boolean a;

    public dh(int i, int j)
    {
        super(i, j, iq.n);
        a = true;
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
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
        return 5;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        return dy1.d(i, j - 1, k);
    }

    private void g(dy dy1, int i, int j, int k)
    {
        int l = dy1.b(i, j, k);
        int i1 = 0;
        a = false;
        boolean flag = dy1.n(i, j, k);
        a = true;
        if(flag)
        {
            i1 = 15;
        } else
        {
            for(int j1 = 0; j1 < 4; j1++)
            {
                int l1 = i;
                int j2 = k;
                if(j1 == 0)
                    l1--;
                if(j1 == 1)
                    l1++;
                if(j1 == 2)
                    j2--;
                if(j1 == 3)
                    j2++;
                i1 = f(dy1, l1, j, j2, i1);
                if(dy1.d(l1, j, j2) && !dy1.d(i, j + 1, k))
                {
                    i1 = f(dy1, l1, j + 1, j2, i1);
                    continue;
                }
                if(!dy1.d(l1, j, j2))
                    i1 = f(dy1, l1, j - 1, j2, i1);
            }

            if(i1 > 0)
                i1--;
            else
                i1 = 0;
        }
        if(l != i1)
        {
            dy1.b(i, j, k, i1);
            dy1.b(i, j, k, i, j, k);
            if(i1 > 0)
                i1--;
            for(int k1 = 0; k1 < 4; k1++)
            {
                int i2 = i;
                int k2 = k;
                int l2 = j - 1;
                if(k1 == 0)
                    i2--;
                if(k1 == 1)
                    i2++;
                if(k1 == 2)
                    k2--;
                if(k1 == 3)
                    k2++;
                if(dy1.d(i2, j, k2))
                    l2 += 2;
                int i3 = f(dy1, i2, j, k2, -1);
                if(i3 >= 0 && i3 != i1)
                    g(dy1, i2, j, k2);
                i3 = f(dy1, i2, l2, k2, -1);
                if(i3 >= 0 && i3 != i1)
                    g(dy1, i2, l2, k2);
            }

            if(l == 0 || i1 == 0)
            {
                dy1.g(i, j, k, bc);
                dy1.g(i - 1, j, k, bc);
                dy1.g(i + 1, j, k, bc);
                dy1.g(i, j, k - 1, bc);
                dy1.g(i, j, k + 1, bc);
                dy1.g(i, j - 1, k, bc);
                dy1.g(i, j + 1, k, bc);
            }
        }
    }

    private void h(dy dy1, int i, int j, int k)
    {
        if(dy1.a(i, j, k) != bc)
        {
            return;
        } else
        {
            dy1.g(i, j, k, bc);
            dy1.g(i - 1, j, k, bc);
            dy1.g(i + 1, j, k, bc);
            dy1.g(i, j, k - 1, bc);
            dy1.g(i, j, k + 1, bc);
            dy1.g(i, j - 1, k, bc);
            dy1.g(i, j + 1, k, bc);
            return;
        }
    }

    public void e(dy dy1, int i, int j, int k)
    {
        super.e(dy1, i, j, k);
        g(dy1, i, j, k);
        dy1.g(i, j + 1, k, bc);
        dy1.g(i, j - 1, k, bc);
        h(dy1, i - 1, j, k);
        h(dy1, i + 1, j, k);
        h(dy1, i, j, k - 1);
        h(dy1, i, j, k + 1);
        if(dy1.d(i - 1, j, k))
            h(dy1, i - 1, j + 1, k);
        else
            h(dy1, i - 1, j - 1, k);
        if(dy1.d(i + 1, j, k))
            h(dy1, i + 1, j + 1, k);
        else
            h(dy1, i + 1, j - 1, k);
        if(dy1.d(i, j, k - 1))
            h(dy1, i, j + 1, k - 1);
        else
            h(dy1, i, j - 1, k - 1);
        if(dy1.d(i, j, k + 1))
            h(dy1, i, j + 1, k + 1);
        else
            h(dy1, i, j - 1, k + 1);
    }

    public void b(dy dy1, int i, int j, int k)
    {
        super.b(dy1, i, j, k);
        dy1.g(i, j + 1, k, bc);
        dy1.g(i, j - 1, k, bc);
        g(dy1, i, j, k);
        h(dy1, i - 1, j, k);
        h(dy1, i + 1, j, k);
        h(dy1, i, j, k - 1);
        h(dy1, i, j, k + 1);
        if(dy1.d(i - 1, j, k))
            h(dy1, i - 1, j + 1, k);
        else
            h(dy1, i - 1, j - 1, k);
        if(dy1.d(i + 1, j, k))
            h(dy1, i + 1, j + 1, k);
        else
            h(dy1, i + 1, j - 1, k);
        if(dy1.d(i, j, k - 1))
            h(dy1, i, j + 1, k - 1);
        else
            h(dy1, i, j - 1, k - 1);
        if(dy1.d(i, j, k + 1))
            h(dy1, i, j + 1, k + 1);
        else
            h(dy1, i, j - 1, k + 1);
    }

    private int f(dy dy1, int i, int j, int k, int l)
    {
        if(dy1.a(i, j, k) != bc)
            return l;
        int i1 = dy1.b(i, j, k);
        if(i1 > l)
            return i1;
        else
            return l;
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        boolean flag = a(dy1, i, j, k);
        if(!flag)
        {
            a_(dy1, i, j, k, i1);
            dy1.d(i, j, k, 0);
        } else
        {
            g(dy1, i, j, k);
        }
        super.b(dy1, i, j, k, l);
    }

    public int a(int i, java.util.Random random)
    {
        return ez.aA.aS;
    }

    public boolean d(dy dy1, int i, int j, int k, int l)
    {
        if(!a)
            return false;
        else
            return b(((hq) (dy1)), i, j, k, l);
    }

    public boolean b(hq hq1, int i, int j, int k, int l)
    {
        if(!a)
            return false;
        if(hq1.b(i, j, k) == 0)
            return false;
        if(l == 1)
            return true;
        boolean flag = dh.b(hq1, i - 1, j, k) || !hq1.d(i - 1, j, k) && dh.b(hq1, i - 1, j - 1, k);
        boolean flag1 = dh.b(hq1, i + 1, j, k) || !hq1.d(i + 1, j, k) && dh.b(hq1, i + 1, j - 1, k);
        boolean flag2 = dh.b(hq1, i, j, k - 1) || !hq1.d(i, j, k - 1) && dh.b(hq1, i, j - 1, k - 1);
        boolean flag3 = dh.b(hq1, i, j, k + 1) || !hq1.d(i, j, k + 1) && dh.b(hq1, i, j - 1, k + 1);
        if(!hq1.d(i, j + 1, k))
        {
            if(hq1.d(i - 1, j, k) && dh.b(hq1, i - 1, j + 1, k))
                flag = true;
            if(hq1.d(i + 1, j, k) && dh.b(hq1, i + 1, j + 1, k))
                flag1 = true;
            if(hq1.d(i, j, k - 1) && dh.b(hq1, i, j + 1, k - 1))
                flag2 = true;
            if(hq1.d(i, j, k + 1) && dh.b(hq1, i, j + 1, k + 1))
                flag3 = true;
        }
        if(!flag2 && !flag1 && !flag && !flag3 && l >= 2 && l <= 5)
            return true;
        if(l == 2 && flag2 && !flag && !flag1)
            return true;
        if(l == 3 && flag3 && !flag && !flag1)
            return true;
        if(l == 4 && flag && !flag2 && !flag3)
            return true;
        return l == 5 && flag1 && !flag2 && !flag3;
    }

    public boolean d()
    {
        return a;
    }

    public static boolean b(hq hq1, int i, int j, int k)
    {
        int l = hq1.a(i, j, k);
        if(l == ff.aw.bc)
            return true;
        if(l == 0)
            return false;
        return ff.n[l].d();
    }
}
