// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class ie extends ff
{

    protected ie(int i, iq iq1)
    {
        super(i, iq1);
        bb = 97;
        if(iq1 == iq.e)
            bb++;
        float f = 0.5F;
        float f1 = 1.0F;
        a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 7;
    }

    public dg d(dy dy1, int i, int j, int k)
    {
        a(((hq) (dy1)), i, j, k);
        return super.d(dy1, i, j, k);
    }

    public void a(hq hq1, int i, int j, int k)
    {
        b(d(hq1.b(i, j, k)));
    }

    public void b(int i)
    {
        float f = 0.1875F;
        a(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
        if(i == 0)
            a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        if(i == 1)
            a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        if(i == 2)
            a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        if(i == 3)
            a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
    }

    public void b(dy dy1, int i, int j, int k, fc fc)
    {
        a(dy1, i, j, k, fc);
    }

    public boolean a(dy dy1, int i, int j, int k, fc fc)
    {
        if(bn == iq.e)
            return true;
        int l = dy1.b(i, j, k);
        if((l & 8) != 0)
        {
            if(dy1.a(i, j - 1, k) == bc)
                a(dy1, i, j - 1, k, fc);
            return true;
        }
        if(dy1.a(i, j + 1, k) == bc)
            dy1.b(i, j + 1, k, (l ^ 4) + 8);
        dy1.b(i, j, k, l ^ 4);
        dy1.b(i, j - 1, k, i, j, k);
        if(java.lang.Math.random() < 0.5D)
            dy1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_open", 1.0F, dy1.m.nextFloat() * 0.1F + 0.9F);
        else
            dy1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_close", 1.0F, dy1.m.nextFloat() * 0.1F + 0.9F);
        return true;
    }

    public void a(dy dy1, int i, int j, int k, boolean flag)
    {
        int l = dy1.b(i, j, k);
        if((l & 8) != 0)
        {
            if(dy1.a(i, j - 1, k) == bc)
                a(dy1, i, j - 1, k, flag);
            return;
        }
        boolean flag1 = (dy1.b(i, j, k) & 4) > 0;
        if(flag1 == flag)
            return;
        if(dy1.a(i, j + 1, k) == bc)
            dy1.b(i, j + 1, k, (l ^ 4) + 8);
        dy1.b(i, j, k, l ^ 4);
        dy1.b(i, j - 1, k, i, j, k);
        if(java.lang.Math.random() < 0.5D)
            dy1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_open", 1.0F, dy1.m.nextFloat() * 0.1F + 0.9F);
        else
            dy1.a((double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, "random.door_close", 1.0F, dy1.m.nextFloat() * 0.1F + 0.9F);
    }

    public void b(dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.b(i, j, k);
        if((i1 & 8) != 0)
        {
            if(dy1.a(i, j - 1, k) != bc)
                dy1.d(i, j, k, 0);
            if(l > 0 && ff.n[l].d())
                b(dy1, i, j - 1, k, l);
        } else
        {
            boolean flag = false;
            if(dy1.a(i, j + 1, k) != bc)
            {
                dy1.d(i, j, k, 0);
                flag = true;
            }
            if(!dy1.d(i, j - 1, k))
            {
                dy1.d(i, j, k, 0);
                flag = true;
                if(dy1.a(i, j + 1, k) == bc)
                    dy1.d(i, j + 1, k, 0);
            }
            if(flag)
                a_(dy1, i, j, k, i1);
            else
            if(l > 0 && ff.n[l].d())
            {
                boolean flag1 = dy1.n(i, j, k) || dy1.n(i, j + 1, k);
                a(dy1, i, j, k, flag1);
            }
        }
    }

    public int a(int i, java.util.Random random)
    {
        if((i & 8) != 0)
            return 0;
        if(bn == iq.e)
            return ez.az.aS;
        else
            return ez.at.aS;
    }

    public fr a(dy dy1, int i, int j, int k, aw aw, aw aw1)
    {
        a(((hq) (dy1)), i, j, k);
        return super.a(dy1, i, j, k, aw, aw1);
    }

    public int d(int i)
    {
        if((i & 4) == 0)
            return i - 1 & 3;
        else
            return i & 3;
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        if(j >= 127)
            return false;
        else
            return dy1.d(i, j - 1, k) && super.a(dy1, i, j, k) && super.a(dy1, i, j + 1, k);
    }
}
