// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class cm extends ff
{

    protected cm(int i, int j)
    {
        super(i, j, iq.n);
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        int l = dy1.b(i, j, k);
        float f = 0.125F;
        if(l == 2)
            a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        if(l == 3)
            a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        if(l == 4)
            a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        if(l == 5)
            a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        return super.d(dy1, i, j, k);
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 8;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        if(dy1.d(i - 1, j, k))
            return true;
        if(dy1.d(i + 1, j, k))
            return true;
        if(dy1.d(i, j, k - 1))
            return true;
        return dy1.d(i, j, k + 1);
    }

    public void c(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        if((i1 == 0 || l == 2) && dy1.d(i, j, k + 1))
            i1 = 2;
        if((i1 == 0 || l == 3) && dy1.d(i, j, k - 1))
            i1 = 3;
        if((i1 == 0 || l == 4) && dy1.d(i + 1, j, k))
            i1 = 4;
        if((i1 == 0 || l == 5) && dy1.d(i - 1, j, k))
            i1 = 5;
        dy1.b(i, j, k, i1);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        boolean flag = false;
        if(i1 == 2 && dy1.d(i, j, k + 1))
            flag = true;
        if(i1 == 3 && dy1.d(i, j, k - 1))
            flag = true;
        if(i1 == 4 && dy1.d(i + 1, j, k))
            flag = true;
        if(i1 == 5 && dy1.d(i - 1, j, k))
            flag = true;
        if(!flag)
        {
            a_(dy1, i, j, k, i1);
            dy1.d(i, j, k, 0);
        }
        super.b(dy1, i, j, k, l);
    }

    public int a(java.util.Random random)
    {
        return 1;
    }
}
