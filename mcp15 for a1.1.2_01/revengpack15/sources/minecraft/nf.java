// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class nf extends nq
{

    public nf(cn cn1, double d, double d1, double d2)
    {
        super(cn1, d, d1, d2, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.30000001192092896D;
        field_607_ao = (float)Math.random() * 0.2F + 0.1F;
        field_606_ap *= 0.30000001192092896D;
        field_663_i = 1.0F;
        field_662_j = 1.0F;
        field_661_k = 1.0F;
        field_670_b = 19 + field_630_aQ.nextInt(4);
        func_371_a(0.01F, 0.01F);
        field_664_h = 0.06F;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
    }

    public void func_406_a(ho ho, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.func_406_a(ho, f, f1, f2, f3, f4, f5);
    }

    public void func_370_e_()
    {
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        field_607_ao -= field_664_h;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_666_f-- <= 0)
        {
            func_395_F();
        }
        if(field_600_av)
        {
            if(Math.random() < 0.5D)
            {
                func_395_F();
            }
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
        gb gb1 = field_615_ag.func_599_f(eo.b(field_611_ak), eo.b(field_610_al), eo.b(field_609_am));
        if(gb1.func_879_d() || gb1.func_878_a())
        {
            double d = (float)(eo.b(field_610_al) + 1) - jp.func_288_b(field_615_ag.func_602_e(eo.b(field_611_ak), eo.b(field_610_al), eo.b(field_609_am)));
            if(field_610_al < d)
            {
                func_395_F();
            }
        }
    }
}
