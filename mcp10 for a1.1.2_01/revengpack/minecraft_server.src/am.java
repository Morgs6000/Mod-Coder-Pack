// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class am extends cn
{

    int a;
    boolean b[];
    int c[];

    protected am(int i1, iq iq1)
    {
        super(i1, iq1);
        a = 0;
        b = new boolean[4];
        c = new int[4];
    }

    private void i(dy dy1, int i1, int j1, int k1)
    {
        int l1 = dy1.b(i1, j1, k1);
        dy1.a(i1, j1, k1, bc + 1, l1);
        dy1.b(i1, j1, k1, i1, j1, k1);
        dy1.f(i1, j1, k1);
    }

    public void a(dy dy1, int i1, int j1, int k1, java.util.Random random)
    {
        int l1 = g(dy1, i1, j1, k1);
        boolean flag = true;
        if(l1 > 0)
        {
            int i2 = -100;
            a = 0;
            i2 = e(dy1, i1 - 1, j1, k1, i2);
            i2 = e(dy1, i1 + 1, j1, k1, i2);
            i2 = e(dy1, i1, j1, k1 - 1, i2);
            i2 = e(dy1, i1, j1, k1 + 1, i2);
            int j2 = i2 + d;
            if(j2 >= 8 || i2 < 0)
                j2 = -1;
            if(g(dy1, i1, j1 + 1, k1) >= 0)
            {
                int l2 = g(dy1, i1, j1 + 1, k1);
                if(l2 >= 8)
                    j2 = l2;
                else
                    j2 = l2 + 8;
            }
            if(a >= 2 && bn == iq.f)
                if(dy1.d(i1, j1 - 1, k1))
                    j2 = 0;
                else
                if(dy1.c(i1, j1 - 1, k1) == bn && dy1.b(i1, j1, k1) == 0)
                    j2 = 0;
            if(bn == iq.g && l1 < 8 && j2 < 8 && j2 > l1 && random.nextInt(4) != 0)
            {
                j2 = l1;
                flag = false;
            }
            if(j2 != l1)
            {
                l1 = j2;
                if(l1 < 0)
                {
                    dy1.d(i1, j1, k1, 0);
                } else
                {
                    dy1.b(i1, j1, k1, l1);
                    dy1.h(i1, j1, k1, bc);
                    dy1.g(i1, j1, k1, bc);
                }
            } else
            if(flag)
                i(dy1, i1, j1, k1);
        } else
        {
            i(dy1, i1, j1, k1);
        }
        if(l(dy1, i1, j1 - 1, k1))
        {
            if(l1 >= 8)
                dy1.b(i1, j1 - 1, k1, bc, l1);
            else
                dy1.b(i1, j1 - 1, k1, bc, l1 + 8);
        } else
        if(l1 >= 0 && (l1 == 0 || k(dy1, i1, j1 - 1, k1)))
        {
            boolean aflag[] = j(dy1, i1, j1, k1);
            int k2 = l1 + d;
            if(l1 >= 8)
                k2 = 1;
            if(k2 >= 8)
                return;
            if(aflag[0])
                f(dy1, i1 - 1, j1, k1, k2);
            if(aflag[1])
                f(dy1, i1 + 1, j1, k1, k2);
            if(aflag[2])
                f(dy1, i1, j1, k1 - 1, k2);
            if(aflag[3])
                f(dy1, i1, j1, k1 + 1, k2);
        }
    }

    private void f(dy dy1, int i1, int j1, int k1, int l1)
    {
        if(l(dy1, i1, j1, k1))
        {
            int i2 = dy1.a(i1, j1, k1);
            if(i2 > 0)
                if(bn == iq.g)
                    h(dy1, i1, j1, k1);
                else
                    ff.n[i2].a_(dy1, i1, j1, k1, dy1.b(i1, j1, k1));
            dy1.b(i1, j1, k1, bc, l1);
        }
    }

    private int a(dy dy1, int i1, int j1, int k1, int l1, int i2)
    {
        int j2 = 1000;
        for(int k2 = 0; k2 < 4; k2++)
        {
            if(k2 == 0 && i2 == 1 || k2 == 1 && i2 == 0 || k2 == 2 && i2 == 3 || k2 == 3 && i2 == 2)
                continue;
            int l2 = i1;
            int i3 = j1;
            int j3 = k1;
            if(k2 == 0)
                l2--;
            if(k2 == 1)
                l2++;
            if(k2 == 2)
                j3--;
            if(k2 == 3)
                j3++;
            if(k(dy1, l2, i3, j3) || dy1.c(l2, i3, j3) == bn && dy1.b(l2, i3, j3) == 0)
                continue;
            if(!k(dy1, l2, i3 - 1, j3))
                return l1;
            if(l1 >= 4)
                continue;
            int k3 = a(dy1, l2, i3, j3, l1 + 1, k2);
            if(k3 < j2)
                j2 = k3;
        }

        return j2;
    }

    private boolean[] j(dy dy1, int i1, int j1, int k1)
    {
        for(int l1 = 0; l1 < 4; l1++)
        {
            c[l1] = 1000;
            int j2 = i1;
            int i3 = j1;
            int j3 = k1;
            if(l1 == 0)
                j2--;
            if(l1 == 1)
                j2++;
            if(l1 == 2)
                j3--;
            if(l1 == 3)
                j3++;
            if(k(dy1, j2, i3, j3) || dy1.c(j2, i3, j3) == bn && dy1.b(j2, i3, j3) == 0)
                continue;
            if(!k(dy1, j2, i3 - 1, j3))
                c[l1] = 0;
            else
                c[l1] = a(dy1, j2, i3, j3, 1, l1);
        }

        int i2 = c[0];
        for(int k2 = 1; k2 < 4; k2++)
            if(c[k2] < i2)
                i2 = c[k2];

        for(int l2 = 0; l2 < 4; l2++)
            b[l2] = c[l2] == i2;

        return b;
    }

    private boolean k(dy dy1, int i1, int j1, int k1)
    {
        int l1 = dy1.a(i1, j1, k1);
        if(l1 == ff.aF.bc || l1 == ff.aM.bc || l1 == ff.aE.bc || l1 == ff.aG.bc || l1 == ff.aY.bc)
            return true;
        if(l1 == 0)
            return false;
        iq iq1 = ff.n[l1].bn;
        return iq1.a();
    }

    protected int e(dy dy1, int i1, int j1, int k1, int l1)
    {
        int i2 = g(dy1, i1, j1, k1);
        if(i2 < 0)
            return l1;
        if(i2 == 0)
            a++;
        if(i2 >= 8)
            i2 = 0;
        return l1 >= 0 && i2 >= l1 ? l1 : i2;
    }

    private boolean l(dy dy1, int i1, int j1, int k1)
    {
        iq iq1 = dy1.c(i1, j1, k1);
        if(iq1 == bn)
            return false;
        if(iq1 == iq.g)
            return false;
        else
            return !k(dy1, i1, j1, k1);
    }

    public void e(dy dy1, int i1, int j1, int k1)
    {
        super.e(dy1, i1, j1, k1);
        if(dy1.a(i1, j1, k1) == bc)
            dy1.h(i1, j1, k1, bc);
    }
}
