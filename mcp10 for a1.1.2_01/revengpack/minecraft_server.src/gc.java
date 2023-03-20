// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class gc extends ff
{

    protected gc(int i, int j)
    {
        super(i, j, iq.n);
        a(true);
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
        return 2;
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
        if(l == 1 && dy1.d(i, j - 1, k))
            i1 = 5;
        if(l == 2 && dy1.d(i, j, k + 1))
            i1 = 4;
        if(l == 3 && dy1.d(i, j, k - 1))
            i1 = 3;
        if(l == 4 && dy1.d(i + 1, j, k))
            i1 = 2;
        if(l == 5 && dy1.d(i - 1, j, k))
            i1 = 1;
        dy1.b(i, j, k, i1);
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        super.a(dy1, i, j, k, random);
        if(dy1.b(i, j, k) == 0)
            e(dy1, i, j, k);
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
            dy1.b(i, j, k, 5);
        g(dy1, i, j, k);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        if(g(dy1, i, j, k))
        {
            int i1 = dy1.b(i, j, k);
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

    public fr a(dy dy1, int i, int j, int k, aw aw, aw aw1)
    {
        int l = dy1.b(i, j, k) & 7;
        float f = 0.15F;
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
            float f1 = 0.1F;
            a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, 0.6F, 0.5F + f1);
        }
        return super.a(dy1, i, j, k, aw, aw1);
    }
}
