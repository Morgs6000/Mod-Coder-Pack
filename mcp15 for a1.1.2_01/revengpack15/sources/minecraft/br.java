// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class br extends ly
{

    protected br(int i, int j)
    {
        super(i, j, gb.field_1324_n);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        float f = 0.125F;
        if(l == 2)
        {
            func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
        if(l == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
        if(l == 4)
        {
            func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        if(l == 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
        return super.func_221_d(cn1, i, j, k);
    }

    public cf func_246_f(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        float f = 0.125F;
        if(l == 2)
        {
            func_213_a(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
        }
        if(l == 3)
        {
            func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
        }
        if(l == 4)
        {
            func_213_a(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        if(l == 5)
        {
            func_213_a(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
        }
        return super.func_246_f(cn1, i, j, k);
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
        return 8;
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        if(cn1.func_601_g(i - 1, j, k))
        {
            return true;
        }
        if(cn1.func_601_g(i + 1, j, k))
        {
            return true;
        }
        if(cn1.func_601_g(i, j, k - 1))
        {
            return true;
        }
        return cn1.func_601_g(i, j, k + 1);
    }

    public void func_258_d(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        if((i1 == 0 || l == 2) && cn1.func_601_g(i, j, k + 1))
        {
            i1 = 2;
        }
        if((i1 == 0 || l == 3) && cn1.func_601_g(i, j, k - 1))
        {
            i1 = 3;
        }
        if((i1 == 0 || l == 4) && cn1.func_601_g(i + 1, j, k))
        {
            i1 = 4;
        }
        if((i1 == 0 || l == 5) && cn1.func_601_g(i - 1, j, k))
        {
            i1 = 5;
        }
        cn1.func_691_b(i, j, k, i1);
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_602_e(i, j, k);
        boolean flag = false;
        if(i1 == 2 && cn1.func_601_g(i, j, k + 1))
        {
            flag = true;
        }
        if(i1 == 3 && cn1.func_601_g(i, j, k - 1))
        {
            flag = true;
        }
        if(i1 == 4 && cn1.func_601_g(i + 1, j, k))
        {
            flag = true;
        }
        if(i1 == 5 && cn1.func_601_g(i - 1, j, k))
        {
            flag = true;
        }
        if(!flag)
        {
            func_259_b_(cn1, i, j, k, i1);
            cn1.func_690_d(i, j, k, 0);
        }
        super.func_226_a(cn1, i, j, k, l);
    }

    public int func_229_a(Random random)
    {
        return 1;
    }
}
