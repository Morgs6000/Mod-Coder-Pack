// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ac extends di
{

    public ac(int i, int j)
    {
        super(i);
        field_290_aT = 1;
        field_289_aU = 64;
        field_331_a = j;
    }

    public ev func_193_a(ev ev1, cn cn1, dm dm1)
    {
        float f = 1.0F;
        float f1 = dm1.field_602_at + (dm1.field_604_ar - dm1.field_602_at) * f;
        float f2 = dm1.field_603_as + (dm1.field_605_aq - dm1.field_603_as) * f;
        double d = dm1.field_614_ah + (dm1.field_611_ak - dm1.field_614_ah) * (double)f;
        double d1 = dm1.field_613_ai + (dm1.field_610_al - dm1.field_613_ai) * (double)f;
        double d2 = dm1.field_612_aj + (dm1.field_609_am - dm1.field_612_aj) * (double)f;
        aj aj1 = aj.func_1248_b(d, d1, d2);
        float f3 = eo.func_1114_b(-f2 * 0.01745329F - 3.141593F);
        float f4 = eo.func_1106_a(-f2 * 0.01745329F - 3.141593F);
        float f5 = -eo.func_1114_b(-f1 * 0.01745329F);
        float f6 = eo.func_1106_a(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        aj aj2 = aj1.func_1257_c((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        mf mf1 = cn1.func_642_a(aj1, aj2, field_331_a == 0);
        if(mf1 == null)
        {
            return ev1;
        }
        if(mf1.field_1167_a == 0)
        {
            int i = mf1.field_1166_b;
            int j = mf1.field_1172_c;
            int k = mf1.field_1171_d;
            if(field_331_a == 0)
            {
                if(cn1.func_599_f(i, j, k) == gb.field_1332_f && cn1.func_602_e(i, j, k) == 0)
                {
                    cn1.func_690_d(i, j, k, 0);
                    return new ev(di.field_260_av);
                }
                if(cn1.func_599_f(i, j, k) == gb.field_1331_g && cn1.func_602_e(i, j, k) == 0)
                {
                    cn1.func_690_d(i, j, k, 0);
                    return new ev(di.field_258_aw);
                }
            } else
            {
                if(field_331_a < 0)
                {
                    return new ev(di.field_262_au);
                }
                if(mf1.field_1170_e == 0)
                {
                    j--;
                }
                if(mf1.field_1170_e == 1)
                {
                    j++;
                }
                if(mf1.field_1170_e == 2)
                {
                    k--;
                }
                if(mf1.field_1170_e == 3)
                {
                    k++;
                }
                if(mf1.field_1170_e == 4)
                {
                    i--;
                }
                if(mf1.field_1170_e == 5)
                {
                    i++;
                }
                if(cn1.func_600_a(i, j, k) == 0 || !cn1.func_599_f(i, j, k).func_878_a())
                {
                    cn1.func_688_b(i, j, k, field_331_a, 0);
                    return new ev(di.field_262_au);
                }
            }
        } else
        if(field_331_a == 0 && (mf1.field_1168_g instanceof am))
        {
            return new ev(di.field_305_aE);
        }
        return ev1;
    }

    private int field_331_a;
}
