// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class iw extends nq
{

    public iw(cn cn, double d, double d1, double d2, 
            double d3, double d4, double d5, ly ly1)
    {
        super(cn, d, d1, d2, d3, d4, d5);
        field_670_b = ly1.field_378_bb;
        field_664_h = ly1.field_357_bm;
        field_663_i = field_662_j = field_661_k = 0.6F;
        field_665_g /= 2.0F;
    }

    public int func_404_c()
    {
        return 1;
    }

    public void func_406_a(ho ho1, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = ((float)(field_670_b % 16) + field_669_c / 4F) / 16F;
        float f7 = f6 + 0.01560938F;
        float f8 = ((float)(field_670_b / 16) + field_668_d / 4F) / 16F;
        float f9 = f8 + 0.01560938F;
        float f10 = 0.1F * field_665_g;
        float f11 = (float)((field_614_ah + (field_611_ak - field_614_ah) * (double)f) - field_660_l);
        float f12 = (float)((field_613_ai + (field_610_al - field_613_ai) * (double)f) - field_659_m);
        float f13 = (float)((field_612_aj + (field_609_am - field_612_aj) * (double)f) - field_658_n);
        float f14 = func_382_a(f);
        ho1.func_987_a(f14 * field_663_i, f14 * field_662_j, f14 * field_661_k);
        ho1.func_983_a(f11 - f1 * f10 - f4 * f10, f12 - f2 * f10, f13 - f3 * f10 - f5 * f10, f6, f9);
        ho1.func_983_a((f11 - f1 * f10) + f4 * f10, f12 + f2 * f10, (f13 - f3 * f10) + f5 * f10, f6, f8);
        ho1.func_983_a(f11 + f1 * f10 + f4 * f10, f12 + f2 * f10, f13 + f3 * f10 + f5 * f10, f7, f8);
        ho1.func_983_a((f11 + f1 * f10) - f4 * f10, f12 - f2 * f10, (f13 + f3 * f10) - f5 * f10, f7, f9);
    }
}
