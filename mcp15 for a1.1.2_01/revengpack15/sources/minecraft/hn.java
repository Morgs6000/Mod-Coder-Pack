// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class hn extends jp
{

    protected hn(int i, gb gb1)
    {
        super(i, gb1);
        func_253_b(false);
        if(gb1 == gb.field_1331_g)
        {
            func_253_b(true);
        }
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        super.func_226_a(cn1, i, j, k, l);
        if(cn1.func_600_a(i, j, k) == field_376_bc)
        {
            func_302_j(cn1, i, j, k);
        }
    }

    private void func_302_j(cn cn1, int i, int j, int k)
    {
        int l = cn1.func_602_e(i, j, k);
        cn1.field_1043_h = true;
        cn1.func_643_a(i, j, k, field_376_bc - 1, l);
        cn1.func_701_b(i, j, k, i, j, k);
        cn1.func_681_h(i, j, k, field_376_bc - 1);
        cn1.field_1043_h = false;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(field_356_bn == gb.field_1331_g)
        {
            int l = random.nextInt(3);
            for(int i1 = 0; i1 < l; i1++)
            {
                i += random.nextInt(3) - 1;
                j++;
                k += random.nextInt(3) - 1;
                int j1 = cn1.func_600_a(i, j, k);
                if(j1 == 0)
                {
                    if(func_301_k(cn1, i - 1, j, k) || func_301_k(cn1, i + 1, j, k) || func_301_k(cn1, i, j, k - 1) || func_301_k(cn1, i, j, k + 1) || func_301_k(cn1, i, j - 1, k) || func_301_k(cn1, i, j + 1, k))
                    {
                        cn1.func_690_d(i, j, k, ly.field_402_as.field_376_bc);
                        return;
                    }
                    continue;
                }
                if(ly.field_345_n[j1].field_356_bn.func_880_c())
                {
                    return;
                }
            }

        }
    }

    private boolean func_301_k(cn cn1, int i, int j, int k)
    {
        return cn1.func_599_f(i, j, k).func_876_e();
    }
}
