// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class nl extends nq
{

    public nl(cn cn, double d, double d1, double d2)
    {
        this(cn, d, d1, d2, 1.0F);
    }

    public nl(cn cn, double d, double d1, double d2, 
            float f)
    {
        super(cn, d, d1, d2, 0.0D, 0.0D, 0.0D);
        field_608_an *= 0.10000000149011612D;
        field_607_ao *= 0.10000000149011612D;
        field_606_ap *= 0.10000000149011612D;
        field_663_i = field_662_j = field_661_k = (float)(Math.random() * 0.30000001192092896D);
        field_665_g *= 0.75F;
        field_665_g *= f;
        field_671_a = field_665_g;
        field_666_f = (int)(8D / (Math.random() * 0.80000000000000004D + 0.20000000000000001D));
        field_666_f *= f;
        field_633_aN = false;
    }

    public void func_406_a(ho ho, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = (((float)field_667_e + f) / (float)field_666_f) * 32F;
        if(f6 < 0.0F)
        {
            f6 = 0.0F;
        }
        if(f6 > 1.0F)
        {
            f6 = 1.0F;
        }
        field_665_g = field_671_a * f6;
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
        field_670_b = 7 - (field_667_e * 8) / field_666_f;
        field_607_ao += 0.0040000000000000001D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        if(field_610_al == field_613_ai)
        {
            field_608_an *= 1.1000000000000001D;
            field_606_ap *= 1.1000000000000001D;
        }
        field_608_an *= 0.95999997854232788D;
        field_607_ao *= 0.95999997854232788D;
        field_606_ap *= 0.95999997854232788D;
        if(field_600_av)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }

    float field_671_a;
}
