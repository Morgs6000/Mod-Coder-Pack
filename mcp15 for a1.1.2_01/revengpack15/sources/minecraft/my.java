// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class my extends ly
{

    protected my(int i)
    {
        super(i, gb.field_1336_b);
        field_378_bb = 3;
        func_253_b(true);
    }

    public int func_211_a(nm nm1, int i, int j, int k, int l)
    {
        if(l == 1)
        {
            return 0;
        }
        if(l == 0)
        {
            return 2;
        }
        gb gb1 = nm1.func_599_f(i, j + 1, k);
        return gb1 != gb.field_1319_s && gb1 != gb.field_1318_t ? 3 : 68;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(cn1.func_618_j(i, j + 1, k) < 4 && cn1.func_599_f(i, j + 1, k).func_881_b())
        {
            if(random.nextInt(4) != 0)
            {
                return;
            }
            cn1.func_690_d(i, j, k, ly.field_336_w.field_376_bc);
        } else
        if(cn1.func_618_j(i, j + 1, k) >= 9)
        {
            int l = (i + random.nextInt(3)) - 1;
            int i1 = (j + random.nextInt(5)) - 3;
            int j1 = (k + random.nextInt(3)) - 1;
            if(cn1.func_600_a(l, i1, j1) == ly.field_336_w.field_376_bc && cn1.func_618_j(l, i1 + 1, j1) >= 4 && !cn1.func_599_f(l, i1 + 1, j1).func_881_b())
            {
                cn1.func_690_d(l, i1, j1, ly.field_337_v.field_376_bc);
            }
        }
    }

    public int func_240_a(int i, Random random)
    {
        return ly.field_336_w.func_240_a(0, random);
    }
}
