// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class dp extends nq
{

    public dp(cn cn, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        super(cn, d, d1, d2, d3, d4, d5);
        field_608_an = d3 + (double)((float)(Math.random() * 2D - 1.0D) * 0.05F);
        field_607_ao = d4 + (double)((float)(Math.random() * 2D - 1.0D) * 0.05F);
        field_606_ap = d5 + (double)((float)(Math.random() * 2D - 1.0D) * 0.05F);
        field_663_i = field_662_j = field_661_k = field_630_aQ.nextFloat() * 0.3F + 0.7F;
        field_665_g = field_630_aQ.nextFloat() * field_630_aQ.nextFloat() * 6F + 1.0F;
        field_666_f = (int)(16D / ((double)field_630_aQ.nextFloat() * 0.80000000000000004D + 0.20000000000000001D)) + 2;
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
        if(field_667_e++ >= field_666_f)
        {
            func_395_F();
        }
        field_670_b = 7 - (field_667_e * 8) / field_666_f;
        field_607_ao += 0.0040000000000000001D;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.89999997615814209D;
        field_607_ao *= 0.89999997615814209D;
        field_606_ap *= 0.89999997615814209D;
        if(field_600_av)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }
}
