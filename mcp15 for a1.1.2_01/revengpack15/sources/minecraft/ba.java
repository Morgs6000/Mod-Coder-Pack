// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ba extends nq
{

    public ba(cn cn1, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        super(cn1, d, d1, d2, d3, d4, d5);
        field_663_i = 1.0F;
        field_662_j = 1.0F;
        field_661_k = 1.0F;
        field_670_b = 32;
        func_371_a(0.02F, 0.02F);
        field_665_g = field_665_g * (field_630_aQ.nextFloat() * 0.6F + 0.2F);
        field_608_an = d3 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
        field_607_ao = d4 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
        field_606_ap = d5 * 0.20000000298023224D + (double)((float)(Math.random() * 2D - 1.0D) * 0.02F);
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
    }

    public void func_370_e_()
    {
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_607_ao += 0.002D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.85000002384185791D;
        field_607_ao *= 0.85000002384185791D;
        field_606_ap *= 0.85000002384185791D;
        if(field_615_ag.func_599_f(eo.b(field_611_ak), eo.b(field_610_al), eo.b(field_609_am)) != gb.field_1332_f)
        {
            func_395_F();
        }
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
    }
}
