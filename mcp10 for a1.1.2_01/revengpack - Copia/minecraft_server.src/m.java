// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.util.Random;

public class m extends gn
{

    protected m(int i, int j)
    {
        super(i, j);
        bb = j;
        a(true);
        float f = 0.5F;
        a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }

    protected boolean b(int i)
    {
        return i == ff.aB.bc;
    }

    public void a(dy dy1, int i, int j, int k, java.util.Random random)
    {
        super.a(dy1, i, j, k, random);
        if(dy1.h(i, j + 1, k) >= 9)
        {
            int l = dy1.b(i, j, k);
            if(l < 7)
            {
                float f = h(dy1, i, j, k);
                if(random.nextInt((int)(100F / f)) == 0)
                {
                    l++;
                    dy1.b(i, j, k, l);
                }
            }
        }
    }

    private float h(dy dy1, int i, int j, int k)
    {
        float f = 1.0F;
        int l = dy1.a(i, j, k - 1);
        int i1 = dy1.a(i, j, k + 1);
        int j1 = dy1.a(i - 1, j, k);
        int k1 = dy1.a(i + 1, j, k);
        int l1 = dy1.a(i - 1, j, k - 1);
        int i2 = dy1.a(i + 1, j, k - 1);
        int j2 = dy1.a(i + 1, j, k + 1);
        int k2 = dy1.a(i - 1, j, k + 1);
        boolean flag = j1 == bc || k1 == bc;
        boolean flag1 = l == bc || i1 == bc;
        boolean flag2 = l1 == bc || i2 == bc || j2 == bc || k2 == bc;
        for(int l2 = i - 1; l2 <= i + 1; l2++)
        {
            for(int i3 = k - 1; i3 <= k + 1; i3++)
            {
                int j3 = dy1.a(l2, j - 1, i3);
                float f1 = 0.0F;
                if(j3 == ff.aB.bc)
                {
                    f1 = 1.0F;
                    if(dy1.b(l2, j - 1, i3) > 0)
                        f1 = 3F;
                }
                if(l2 != i || i3 != k)
                    f1 /= 4F;
                f += f1;
            }

        }

        if(flag2 || flag && flag1)
            f /= 2.0F;
        return f;
    }

    public int a()
    {
        return 6;
    }

    public void a(dy dy1, int i, int j, int k, int l)
    {
        super.a(dy1, i, j, k, l);
        for(int i1 = 0; i1 < 3; i1++)
            if(dy1.m.nextInt(15) <= l)
            {
                float f = 0.7F;
                float f1 = dy1.m.nextFloat() * f + (1.0F - f) * 0.5F;
                float f2 = dy1.m.nextFloat() * f + (1.0F - f) * 0.5F;
                float f3 = dy1.m.nextFloat() * f + (1.0F - f) * 0.5F;
                fn fn1 = new fn(dy1, (float)i + f1, (float)j + f2, (float)k + f3, new gp(ez.Q));
                fn1.ad = 10;
                dy1.a(((dj) (fn1)));
            }

    }

    public int a(int i, java.util.Random random)
    {
        java.lang.System.out.println((new StringBuilder()).append("Get resource: ").append(i).toString());
        if(i == 7)
            return ez.R.aS;
        else
            return -1;
    }

    public int a(java.util.Random random)
    {
        return 1;
    }
}
