// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class dv extends cs
{

    private final boolean a;

    protected dv(int i, boolean flag)
    {
        super(i, iq.d);
        a = flag;
        bb = 45;
    }

    public int a(int i, java.util.Random random)
    {
        return ff.aC.bc;
    }

    public void e(dy dy1, int i, int j, int k)
    {
        super.e(dy1, i, j, k);
        g(dy1, i, j, k);
    }

    private void g(dy dy1, int i, int j, int k)
    {
        int l = dy1.a(i, j, k - 1);
        int i1 = dy1.a(i, j, k + 1);
        int j1 = dy1.a(i - 1, j, k);
        int k1 = dy1.a(i + 1, j, k);
        byte byte0 = 3;
        if(ff.p[l] && !ff.p[i1])
            byte0 = 3;
        if(ff.p[i1] && !ff.p[l])
            byte0 = 2;
        if(ff.p[j1] && !ff.p[k1])
            byte0 = 5;
        if(ff.p[k1] && !ff.p[j1])
            byte0 = 4;
        dy1.b(i, j, k, ((int) (byte0)));
    }

    public int a(int i)
    {
        if(i == 1)
            return ff.u.bc;
        if(i == 0)
            return ff.u.bc;
        if(i == 3)
            return bb - 1;
        else
            return bb;
    }

    public boolean a(dy dy1, int i, int j, int k, fc fc1)
    {
        df df1 = (df)dy1.k(i, j, k);
        fc1.a(df1);
        return true;
    }

    public static void a(boolean flag, dy dy1, int i, int j, int k)
    {
        int l = dy1.b(i, j, k);
        as as = dy1.k(i, j, k);
        if(flag)
            dy1.d(i, j, k, ff.aD.bc);
        else
            dy1.d(i, j, k, ff.aC.bc);
        dy1.b(i, j, k, l);
        dy1.a(i, j, k, as);
    }

    protected as a_()
    {
        return ((as) (new df()));
    }
}
