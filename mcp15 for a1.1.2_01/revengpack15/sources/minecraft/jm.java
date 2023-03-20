// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class jm extends ly
{

    protected jm(int i, int j)
    {
        super(i, gb.field_1329_i);
        field_378_bb = j;
        float f = 0.375F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 1.0F, 0.5F + f);
        func_253_b(true);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(cn1.func_600_a(i, j + 1, k) == 0)
        {
            int l;
            for(l = 1; cn1.func_600_a(i, j - l, k) == field_376_bc; l++) { }
            if(l < 3)
            {
                int i1 = cn1.func_602_e(i, j, k);
                if(i1 == 15)
                {
                    cn1.func_690_d(i, j + 1, k, field_376_bc);
                    cn1.func_691_b(i, j, k, 0);
                } else
                {
                    cn1.func_691_b(i, j, k, i1 + 1);
                }
            }
        }
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_600_a(i, j - 1, k);
        if(l == field_376_bc)
        {
            return true;
        }
        if(l != ly.field_337_v.field_376_bc && l != ly.field_336_w.field_376_bc)
        {
            return false;
        }
        if(cn1.func_599_f(i - 1, j - 1, k) == gb.field_1332_f)
        {
            return true;
        }
        if(cn1.func_599_f(i + 1, j - 1, k) == gb.field_1332_f)
        {
            return true;
        }
        if(cn1.func_599_f(i, j - 1, k - 1) == gb.field_1332_f)
        {
            return true;
        }
        return cn1.func_599_f(i, j - 1, k + 1) == gb.field_1332_f;
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        func_303_h(cn1, i, j, k);
    }

    protected final void func_303_h(cn cn1, int i, int j, int k)
    {
        if(!func_223_g(cn1, i, j, k))
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
        }
    }

    public boolean func_223_g(cn cn1, int i, int j, int k)
    {
        return func_243_a(cn1, i, j, k);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return null;
    }

    public int func_240_a(int i, Random random)
    {
        return di.field_302_aH.field_291_aS;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 1;
    }
}
