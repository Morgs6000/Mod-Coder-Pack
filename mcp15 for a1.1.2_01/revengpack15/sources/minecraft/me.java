// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class me extends di
{

    public me(int i)
    {
        super(i);
        field_290_aT = 1;
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
        mf mf1 = cn1.func_642_a(aj1, aj2, true);
        if(mf1 == null)
        {
            return ev1;
        }
        if(mf1.field_1167_a == 0)
        {
            int i = mf1.field_1166_b;
            int j = mf1.field_1172_c;
            int k = mf1.field_1171_d;
            cn1.func_674_a(new dc(cn1, (float)i + 0.5F, (float)j + 1.5F, (float)k + 0.5F));
            ev1.field_1615_a--;
        }
        return ev1;
    }
}
