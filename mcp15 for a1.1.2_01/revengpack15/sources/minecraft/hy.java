// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class hy extends ly
{

    protected hy(int i, int j)
    {
        super(i, j, gb.field_1317_u);
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

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        float f = 0.0625F;
        return cf.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, (float)(j + 1) - f, (float)(k + 1) - f);
    }

    public cf func_246_f(cn cn1, int i, int j, int k)
    {
        float f = 0.0625F;
        return cf.func_1161_b((float)i + f, j, (float)k + f, (float)(i + 1) - f, j + 1, (float)(k + 1) - f);
    }

    public int func_218_a(int i)
    {
        if(i == 1)
        {
            return field_378_bb - 1;
        }
        if(i == 0)
        {
            return field_378_bb + 1;
        } else
        {
            return field_378_bb;
        }
    }

    public boolean func_242_c()
    {
        return false;
    }

    public boolean func_217_b()
    {
        return false;
    }

    public int func_210_f()
    {
        return 13;
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        if(!super.func_243_a(cn1, i, j, k))
        {
            return false;
        } else
        {
            return func_223_g(cn1, i, j, k);
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        if(!func_223_g(cn1, i, j, k))
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
        }
    }

    public boolean func_223_g(cn cn1, int i, int j, int k)
    {
        if(cn1.func_599_f(i - 1, j, k).func_878_a())
        {
            return false;
        }
        if(cn1.func_599_f(i + 1, j, k).func_878_a())
        {
            return false;
        }
        if(cn1.func_599_f(i, j, k - 1).func_878_a())
        {
            return false;
        }
        if(cn1.func_599_f(i, j, k + 1).func_878_a())
        {
            return false;
        } else
        {
            int l = cn1.func_600_a(i, j - 1, k);
            return l == ly.field_425_aW.field_376_bc || l == ly.field_393_F.field_376_bc;
        }
    }

    public void func_236_b(cn cn1, int i, int j, int k, kh kh1)
    {
        kh1.func_396_a(null, 1);
    }
}
