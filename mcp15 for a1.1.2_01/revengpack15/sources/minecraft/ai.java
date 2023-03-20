// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ai extends ly
{

    public ai(int i, int j, boolean flag)
    {
        super(i, j, gb.field_1334_d);
        if(flag)
        {
            func_253_b(true);
        }
        field_468_a = flag;
    }

    public int func_206_a()
    {
        return 30;
    }

    public void func_233_b(cn cn1, int i, int j, int k, dm dm)
    {
        func_320_h(cn1, i, j, k);
        super.func_233_b(cn1, i, j, k, dm);
    }

    public void func_254_a(cn cn1, int i, int j, int k, kh kh)
    {
        func_320_h(cn1, i, j, k);
        super.func_254_a(cn1, i, j, k, kh);
    }

    public boolean func_250_a(cn cn1, int i, int j, int k, dm dm)
    {
        func_320_h(cn1, i, j, k);
        return super.func_250_a(cn1, i, j, k, dm);
    }

    private void func_320_h(cn cn1, int i, int j, int k)
    {
        func_319_i(cn1, i, j, k);
        if(field_376_bc == ly.field_433_aO.field_376_bc)
        {
            cn1.func_690_d(i, j, k, ly.field_432_aP.field_376_bc);
        }
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(field_376_bc == ly.field_432_aP.field_376_bc)
        {
            cn1.func_690_d(i, j, k, ly.field_433_aO.field_376_bc);
        }
    }

    public int func_240_a(int i, Random random)
    {
        return di.field_309_aA.field_291_aS;
    }

    public int func_229_a(Random random)
    {
        return 4 + random.nextInt(2);
    }

    public void func_247_b(cn cn1, int i, int j, int k, Random random)
    {
        if(field_468_a)
        {
            func_319_i(cn1, i, j, k);
        }
    }

    private void func_319_i(cn cn1, int i, int j, int k)
    {
        Random random = cn1.field_1037_n;
        double d = 0.0625D;
        for(int l = 0; l < 6; l++)
        {
            double d1 = (float)i + random.nextFloat();
            double d2 = (float)j + random.nextFloat();
            double d3 = (float)k + random.nextFloat();
            if(l == 0 && !cn1.func_601_g(i, j + 1, k))
            {
                d2 = (double)(j + 1) + d;
            }
            if(l == 1 && !cn1.func_601_g(i, j - 1, k))
            {
                d2 = (double)(j + 0) - d;
            }
            if(l == 2 && !cn1.func_601_g(i, j, k + 1))
            {
                d3 = (double)(k + 1) + d;
            }
            if(l == 3 && !cn1.func_601_g(i, j, k - 1))
            {
                d3 = (double)(k + 0) - d;
            }
            if(l == 4 && !cn1.func_601_g(i + 1, j, k))
            {
                d1 = (double)(i + 1) + d;
            }
            if(l == 5 && !cn1.func_601_g(i - 1, j, k))
            {
                d1 = (double)(i + 0) - d;
            }
            if(d1 < (double)i || d1 > (double)(i + 1) || d2 < 0.0D || d2 > (double)(j + 1) || d3 < (double)k || d3 > (double)(k + 1))
            {
                cn1.func_694_a("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
            }
        }

    }

    private boolean field_468_a;
}
