// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class he extends fc
{

    public he(int i, int j)
    {
        super(i, j, gb.field_1320_r, false);
        field_355_bo = 0.98F;
        func_253_b(true);
    }

    public int func_234_g()
    {
        return 1;
    }

    public boolean func_260_c(nm nm, int i, int j, int k, int l)
    {
        return super.func_260_c(nm, i, j, k, 1 - l);
    }

    public void func_214_b(cn cn1, int i, int j, int k)
    {
        gb gb1 = cn1.func_599_f(i, j - 1, k);
        if(gb1.func_880_c() || gb1.func_879_d())
        {
            cn1.func_690_d(i, j, k, ly.field_401_B.field_376_bc);
        }
    }

    public int func_229_a(Random random)
    {
        return 0;
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        if(cn1.func_641_a(by.Block, i, j, k) > 11 - ly.field_341_r[field_376_bc])
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, ly.field_399_C.field_376_bc);
        }
    }
}
