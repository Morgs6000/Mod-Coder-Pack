// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class iz extends hi
{

    protected iz(int i, int j)
    {
        super(i, j, gb.field_1330_h, false);
        field_464_c = 0;
        field_463_b = j;
        func_253_b(true);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        field_464_c = 0;
        func_308_h(cn1, i, j, k);
        super.func_226_a(cn1, i, j, k, l);
    }

    public void func_306_f(cn cn1, int i, int j, int k, int l)
    {
        if(cn1.func_600_a(i, j, k) != field_376_bc)
        {
            return;
        }
        int i1 = cn1.func_602_e(i, j, k);
        if(i1 == 0 || i1 != l - 1)
        {
            return;
        } else
        {
            func_308_h(cn1, i, j, k);
            return;
        }
    }

    public void func_308_h(cn cn1, int i, int j, int k)
    {
        if(field_464_c++ >= 100)
        {
            return;
        }
        int l = cn1.func_599_f(i, j - 1, k).func_878_a() ? 16 : 0;
        int i1 = cn1.func_602_e(i, j, k);
        if(i1 == 0)
        {
            i1 = 1;
            cn1.func_691_b(i, j, k, 1);
        }
        l = func_309_g(cn1, i, j - 1, k, l);
        l = func_309_g(cn1, i, j, k - 1, l);
        l = func_309_g(cn1, i, j, k + 1, l);
        l = func_309_g(cn1, i - 1, j, k, l);
        l = func_309_g(cn1, i + 1, j, k, l);
        int j1 = l - 1;
        if(j1 < 10)
        {
            j1 = 1;
        }
        if(j1 != i1)
        {
            cn1.func_691_b(i, j, k, j1);
            func_306_f(cn1, i, j - 1, k, i1);
            func_306_f(cn1, i, j + 1, k, i1);
            func_306_f(cn1, i, j, k - 1, i1);
            func_306_f(cn1, i, j, k + 1, i1);
            func_306_f(cn1, i - 1, j, k, i1);
            func_306_f(cn1, i + 1, j, k, i1);
        }
    }

    private int func_309_g(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_600_a(i, j, k);
        if(i1 == ly.field_385_K.field_376_bc)
        {
            return 16;
        }
        if(i1 == field_376_bc)
        {
            int j1 = cn1.func_602_e(i, j, k);
            if(j1 != 0 && j1 > l)
            {
                return j1;
            }
        }
        return l;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        int l = cn1.func_602_e(i, j, k);
        if(l == 0)
        {
            field_464_c = 0;
            func_308_h(cn1, i, j, k);
        } else
        if(l == 1)
        {
            func_307_i(cn1, i, j, k);
        } else
        if(random.nextInt(10) == 0)
        {
            func_308_h(cn1, i, j, k);
        }
    }

    private void func_307_i(cn cn1, int i, int j, int k)
    {
        func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
        cn1.func_690_d(i, j, k, 0);
    }

    public int func_229_a(Random random)
    {
        return random.nextInt(20) != 0 ? 0 : 1;
    }

    public int func_240_a(int i, Random random)
    {
        return ly.field_333_z.field_376_bc;
    }

    public boolean func_217_b()
    {
        return !field_462_a;
    }

    public void func_310_a(boolean flag)
    {
        field_462_a = flag;
        field_378_bb = field_463_b + (flag ? 0 : 1);
    }

    public void func_254_a(cn cn1, int i, int j, int k, kh kh)
    {
        super.func_254_a(cn1, i, j, k, kh);
    }

    private int field_463_b;
    private int field_464_c;
}
