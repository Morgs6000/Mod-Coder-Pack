// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class hs extends ff
{

    protected hs(int i, int j)
    {
        super(i, j, iq.n);
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
        return 12;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        if(dy1.d(i - 1, j, k))
            return true;
        if(dy1.d(i + 1, j, k))
            return true;
        if(dy1.d(i, j, k - 1))
            return true;
        if(dy1.d(i, j, k + 1))
            return true;
        return dy1.d(i, j - 1, k);
    }

    public void c(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        int j1 = i1 & 8;
        i1 &= 7;
        if(l == 1 && dy1.d(i, j - 1, k))
            i1 = 5 + dy1.m.nextInt(2);
        if(l == 2 && dy1.d(i, j, k + 1))
            i1 = 4;
        if(l == 3 && dy1.d(i, j, k - 1))
            i1 = 3;
        if(l == 4 && dy1.d(i + 1, j, k))
            i1 = 2;
        if(l == 5 && dy1.d(i - 1, j, k))
            i1 = 1;
        dy1.b(i, j, k, i1 + j1);
    }

    public void e(dy dy1, int i, int j, int k)
    {
        if(dy1.d(i - 1, j, k))
            dy1.b(i, j, k, 1);
        else
        if(dy1.d(i + 1, j, k))
            dy1.b(i, j, k, 2);
        else
        if(dy1.d(i, j, k - 1))
            dy1.b(i, j, k, 3);
        else
        if(dy1.d(i, j, k + 1))
            dy1.b(i, j, k, 4);
        else
        if(dy1.d(i, j - 1, k))
            dy1.b(i, j, k, 5 + dy1.m.nextInt(2));
        g(dy1, i, j, k);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        if(g(dy1, i, j, k))
        {
            int i1 = dy1.b(i, j, k) & 7;
            boolean flag = false;
            if(!dy1.d(i - 1, j, k) && i1 == 1)
                flag = true;
            if(!dy1.d(i + 1, j, k) && i1 == 2)
                flag = true;
            if(!dy1.d(i, j, k - 1) && i1 == 3)
                flag = true;
            if(!dy1.d(i, j, k + 1) && i1 == 4)
                flag = true;
            if(!dy1.d(i, j - 1, k) && i1 == 5)
                flag = true;
            if(flag)
            {
                a_(dy1, i, j, k, dy1.b(i, j, k));
                dy1.d(i, j, k, 0);
            }
        }
    }

    private boolean g(dy dy1, int i, int j, int k)
    {
        if(!a(dy1, i, j, k))
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
            return false;
        } else
        {
            return true;
        }
    }

    public void a(hq hq1, int i, int j, int k)
    {
        int l = hq1.b(i, j, k) & 7;
        float f = 0.1875F;
        if(l == 1)
            a(0.0F, 0.2F, 0.5F - f, f * 2.0F, 0.8F, 0.5F + f);
        else
        if(l == 2)
            a(1.0F - f * 2.0F, 0.2F, 0.5F - f, 1.0F, 0.8F, 0.5F + f);
        else
        if(l == 3)
            a(0.5F - f, 0.2F, 0.0F, 0.5F + f, 0.8F, f * 2.0F);
        else
        if(l == 4)
        {
            a(0.5F - f, 0.2F, 1.0F - f * 2.0F, 0.5F + f, 0.8F, 1.0F);
        } else
        {
            float f1 = 0.25F;
            a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
    }

    public void b(dy dy1, int i, int j, int k, fc fc)
    {
        a(dy1, i, j, k, fc);
    }

    public boolean a(dy dy1, int i, int j, int k, fc fc)
    {
        int l = dy1.b(i, j, k);
        int i1 = l & 7;
        int j1 = 8 - (l & 8);
        dy1.b(i, j, k, i1 + j1);
        dy1.b(i, j, k, i, j, k);
        dy1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.click", 0.3F, j1 <= 0 ? 0.5F : 0.6F);
        dy1.g(i, j, k, bc);
        if(i1 == 1)
            dy1.g(i - 1, j, k, bc);
        else
        if(i1 == 2)
            dy1.g(i + 1, j, k, bc);
        else
        if(i1 == 3)
            dy1.g(i, j, k - 1, bc);
        else
        if(i1 == 4)
            dy1.g(i, j, k + 1, bc);
        else
            dy1.g(i, j - 1, k, bc);
        return true;
    }

    public void b(dy dy1, int i, int j, int k)
    {
        int l = dy1.b(i, j, k);
        if((l & 8) > 0)
        {
            dy1.g(i, j, k, bc);
            int i1 = l & 7;
            if(i1 == 1)
                dy1.g(i - 1, j, k, bc);
            else
            if(i1 == 2)
                dy1.g(i + 1, j, k, bc);
            else
            if(i1 == 3)
                dy1.g(i, j, k - 1, bc);
            else
            if(i1 == 4)
                dy1.g(i, j, k + 1, bc);
            else
                dy1.g(i, j - 1, k, bc);
        }
        super.b(dy1, i, j, k);
    }

    public boolean b(hq hq1, int i, int j, int k, int l)
    {
        return (hq1.b(i, j, k) & 8) > 0;
    }

    public boolean d(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        if((i1 & 8) == 0)
            return false;
        int j1 = i1 & 7;
        if(j1 == 5 && l == 1)
            return true;
        if(j1 == 4 && l == 2)
            return true;
        if(j1 == 3 && l == 3)
            return true;
        if(j1 == 2 && l == 4)
            return true;
        return j1 == 1 && l == 5;
    }

    public boolean d()
    {
        return true;
    }
}
