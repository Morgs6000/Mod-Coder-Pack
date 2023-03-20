// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class cq extends nq
{

    public cq(cn cn1, double d, double d1, double d2)
    {
        super(cn1, d, d1, d2, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.80000001192092896D;
        field_607_ao *= 0.80000001192092896D;
        field_606_ap *= 0.80000001192092896D;
        field_607_ao = field_630_aQ.nextFloat() * 0.4F + 0.05F;
        field_663_i = field_662_j = field_661_k = 1.0F;
        field_665_g *= field_630_aQ.nextFloat() * 2.0F + 0.2F;
        field_674_a = field_665_g;
        field_666_f = (int)(16D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_633_aN = false;
        field_670_b = 49;
    }

    public float func_382_a(float f)
    {
        return 1.0F;
    }

    public void func_406_a(ho ho, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = ((float)field_667_e + f) / (float)field_666_f;
        field_665_g = field_674_a * (1.0F - f6 * f6);
        super.func_406_a(ho, f, f1, f2, f3, f4, f5);
    }

    public void func_370_e_()
    {
        field_614_ah = field_611_ak;
        field_613_ai = field_610_al;
        field_612_aj = field_609_am;
        if(field_667_e++ >= field_666_f)
        {
            func_395_F();
        }
        float f = (float)field_667_e / (float)field_666_f;
        if(field_630_aQ.nextFloat() > f)
        {
            field_615_ag.func_694_a("smoke", field_611_ak, field_610_al, field_609_am, field_608_an, field_607_ao, field_606_ap);
        }
        field_607_ao -= 0.029999999999999999D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.99900001287460327D;
        field_607_ao *= 0.99900001287460327D;
        field_606_ap *= 0.99900001287460327D;
        if(field_600_av)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }

    private float field_674_a;
}
