// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class mi extends ly
{

    protected mi(int i)
    {
        super(i, gb.field_1336_b);
        field_378_bb = 87;
        func_253_b(true);
        func_213_a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        func_256_d(255);
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return cf.func_1161_b(i + 0, j + 0, k + 0, i + 1, j + 1, k + 1);
    }

    public boolean func_217_b()
    {
        return false;
    }

    public boolean func_242_c()
    {
        return false;
    }

    public int func_232_a(int i, int j)
    {
        if(i == 1 && j > 0)
        {
            return field_378_bb - 1;
        }
        if(i == 1)
        {
            return field_378_bb;
        } else
        {
            return 2;
        }
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(random.nextInt(5) == 0)
        {
            if(func_274_i(cn1, i, j, k))
            {
                cn1.func_691_b(i, j, k, 7);
            } else
            {
                int l = cn1.func_602_e(i, j, k);
                if(l > 0)
                {
                    cn1.func_691_b(i, j, k, l - 1);
                } else
                if(!func_275_h(cn1, i, j, k))
                {
                    cn1.func_690_d(i, j, k, ly.field_336_w.field_376_bc);
                }
            }
        }
    }

    public void func_254_a(cn cn1, int i, int j, int k, kh kh)
    {
        if(cn1.field_1037_n.nextInt(4) == 0)
        {
            cn1.func_690_d(i, j, k, ly.field_336_w.field_376_bc);
        }
    }

    private boolean func_275_h(cn cn1, int i, int j, int k)
    {
        int l = 0;
        for(int i1 = i - l; i1 <= i + l; i1++)
        {
            for(int j1 = k - l; j1 <= k + l; j1++)
            {
                if(cn1.func_600_a(i1, j + 1, j1) == ly.field_447_aA.field_376_bc)
                {
                    return true;
                }
            }

        }

        return false;
    }

    private boolean func_274_i(cn cn1, int i, int j, int k)
    {
        for(int l = i - 4; l <= i + 4; l++)
        {
            for(int i1 = j; i1 <= j + 1; i1++)
            {
                for(int j1 = k - 4; j1 <= k + 4; j1++)
                {
                    if(cn1.func_599_f(l, i1, j1) == gb.field_1332_f)
                    {
                        return true;
                    }
                }

            }

        }

        return false;
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        super.func_226_a(cn1, i, j, k, l);
        gb gb1 = cn1.func_599_f(i, j + 1, k);
        if(gb1.func_878_a())
        {
            cn1.func_690_d(i, j, k, ly.field_336_w.field_376_bc);
        }
    }

    public int func_240_a(int i, Random random)
    {
        return ly.field_336_w.func_240_a(0, random);
    }
}
