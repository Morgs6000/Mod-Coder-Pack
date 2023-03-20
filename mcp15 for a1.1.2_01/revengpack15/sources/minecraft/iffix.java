// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class iffix extends ly
{

    protected iffix(int i, int j)
    {
        super(i, j, gb.field_1324_n);
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return null;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public mf func_255_a(cn cn1, int i, int j, int k, aj aj, aj aj1)
    {
        func_238_a(cn1, i, j, k);
        return super.func_255_a(cn1, i, j, k, aj, aj1);
    }

    public void func_238_a(nm nm1, int i, int j, int k)
    {
        int l = nm1.func_602_e(i, j, k);
        if(l >= 2 && l <= 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
        } else
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
        }
    }

    public int func_232_a(int i, int j)
    {
        if(j >= 6)
        {
            return field_378_bb - 16;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_210_f()
    {
        return 9;
    }

    public int func_229_a(Random random)
    {
        return 1;
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        return cn1.func_601_g(i, j - 1, k);
    }

    public void func_235_e(cn cn1, int i, int j, int k)
    {
        cn1.func_691_b(i, j, k, 15);
        func_304_h(cn1, i, j, k);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        boolean flag = false;
        if(!cn1.func_601_g(i, j - 1, k))
        {
            flag = true;
        }
        if(i1 == 2 && !cn1.func_601_g(i + 1, j, k))
        {
            flag = true;
        }
        if(i1 == 3 && !cn1.func_601_g(i - 1, j, k))
        {
            flag = true;
        }
        if(i1 == 4 && !cn1.func_601_g(i, j, k - 1))
        {
            flag = true;
        }
        if(i1 == 5 && !cn1.func_601_g(i, j, k + 1))
        {
            flag = true;
        }
        if(flag)
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
        } else
        if(l > 0 && ly.field_345_n[l].func_209_d() && mk.func_791_a(new mk(this, cn1, i, j, k)) == 3)
        {
            func_304_h(cn1, i, j, k);
        }
    }

    private void func_304_h(cn cn1, int i, int j, int k)
    {
        (new mk(this, cn1, i, j, k)).func_792_a(cn1.func_625_o(i, j, k));
    }
}
