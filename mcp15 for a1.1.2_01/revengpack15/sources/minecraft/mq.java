// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class mq extends ly
{

    protected mq(int i, int j)
    {
        super(i, gb.field_1329_i);
        field_378_bb = j;
        func_253_b(true);
        float f = 0.2F;
        func_213_a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3F, 0.5F + f);
    }

    public boolean func_243_a(cn cn1, int i, int j, int k)
    {
        return func_269_b(cn1.func_600_a(i, j - 1, k));
    }

    protected boolean func_269_b(int i)
    {
        return i == ly.field_337_v.field_376_bc || i == ly.field_336_w.field_376_bc || i == ly.field_446_aB.field_376_bc;
    }

    public void func_226_a(cn cn1, int i, int j, int k, int l)
    {
        super.func_226_a(cn1, i, j, k, l);
        func_268_h(cn1, i, j, k);
    }

    public void func_208_a(cn cn1, int i, int j, int k, Random random)
    {
        func_268_h(cn1, i, j, k);
    }

    protected final void func_268_h(cn cn1, int i, int j, int k)
    {
        if(!func_223_g(cn1, i, j, k))
        {
            func_259_b_(cn1, i, j, k, cn1.func_602_e(i, j, k));
            cn1.func_690_d(i, j, k, 0);
        }
    }

    public boolean func_223_g(cn cn1, int i, int j, int k)
    {
        return (cn1.func_618_j(i, j, k) >= 8 || cn1.func_647_i(i, j, k)) && func_269_b(cn1.func_600_a(i, j - 1, k));
    }

    public cf func_221_d(cn cn1, int i, int j, int k)
    {
        return null;
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
