// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class ax extends ff
{

    private cr a;

    protected ax(int i, int j, cr cr1)
    {
        super(i, j, iq.d);
        a = cr1;
        a(true);
        float f = 0.0625F;
        a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
    }

    public int c()
    {
        return 20;
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        return null;
    }

    public boolean b()
    {
        return false;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        return dy1.d(i, j - 1, k);
    }

    public void e(dy dy1, int i, int j, int k)
    {
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        boolean flag = false;
        if(!dy1.d(i, j - 1, k))
            flag = true;
        if(flag)
        {
            a_(dy1, i, j, k, dy1.b(i, j, k));
            dy1.d(i, j, k, 0);
        }
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        if(dy1.b(i, j, k) == 0)
        {
            return;
        } else
        {
            g(dy1, i, j, k);
            return;
        }
    }

    public void a(dy dy1, int i, int j, int k, dj dj)
    {
        if(dy1.b(i, j, k) == 1)
        {
            return;
        } else
        {
            g(dy1, i, j, k);
            return;
        }
    }

    private void g(dy dy1, int i, int j, int k)
    {
        boolean flag = dy1.b(i, j, k) == 1;
        boolean flag1 = false;
        float f = 0.125F;
        java.util.List list = null;
        if(a == cr.a)
            list = dy1.b(((dj) (null)), dg.b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        if(a == cr.b)
            list = dy1.a(is.class, dg.b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        if(a == cr.c)
            list = dy1.a(fc.class, dg.b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (double)j + 0.25D, (float)(k + 1) - f));
        if(list.size() > 0)
            flag1 = true;
        if(flag1 && !flag)
        {
            dy1.b(i, j, k, 1);
            dy1.g(i, j, k, bc);
            dy1.g(i, j - 1, k, bc);
            dy1.b(i, j, k, i, j, k);
            dy1.a((double)i + 0.5D, (double)j + 0.10000000000000001D, (double)k + 0.5D, "random.click", 0.3F, 0.6F);
        }
        if(!flag1 && flag)
        {
            dy1.b(i, j, k, 0);
            dy1.g(i, j, k, bc);
            dy1.g(i, j - 1, k, bc);
            dy1.b(i, j, k, i, j, k);
            dy1.a((double)i + 0.5D, (double)j + 0.10000000000000001D, (double)k + 0.5D, "random.click", 0.3F, 0.5F);
        }
        if(flag1)
            dy1.h(i, j, k, bc);
    }

    public void b(dy dy1, int i, int j, int k)
    {
        int l = dy1.b(i, j, k);
        if(l > 0)
        {
            dy1.g(i, j, k, bc);
            dy1.g(i, j - 1, k, bc);
        }
        super.b(dy1, i, j, k);
    }

    public void a(hq hq1, int i, int j, int k)
    {
        boolean flag = hq1.b(i, j, k) == 1;
        float f = 0.0625F;
        if(flag)
            a(f, 0.0F, f, 1.0F - f, 0.03125F, 1.0F - f);
        else
            a(f, 0.0F, f, 1.0F - f, 0.0625F, 1.0F - f);
    }

    public boolean b(hq hq1, int i, int j, int k, int l)
    {
        return hq1.b(i, j, k) > 0;
    }

    public boolean d(dy dy1, int i, int j, int k, int l)
    {
        if(dy1.b(i, j, k) == 0)
            return false;
        else
            return l == 1;
    }

    public boolean d()
    {
        return true;
    }
}
