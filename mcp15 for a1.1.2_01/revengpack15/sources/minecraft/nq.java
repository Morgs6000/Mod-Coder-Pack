// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class nq extends kh
{

    public nq(cn cn, double d, double d1, double d2, 
            double d3, double d4, double d5)
    {
        super(cn);
        field_667_e = 0;
        field_666_f = 0;
        func_371_a(0.2F, 0.2F);
        field_645_aB = field_643_aD / 2.0F;
        func_347_a(d, d1, d2);
        field_663_i = field_662_j = field_661_k = 1.0F;
        field_608_an = d3 + (double)((float)(Math.random() * 2D - 1.0D) * 0.4F);
        field_607_ao = d4 + (double)((float)(Math.random() * 2D - 1.0D) * 0.4F);
        field_606_ap = d5 + (double)((float)(Math.random() * 2D - 1.0D) * 0.4F);
        float f = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
        float f1 = eo.func_1109_a(field_608_an * field_608_an + field_607_ao * field_607_ao + field_606_ap * field_606_ap);
        field_608_an = (field_608_an / (double)f1) * (double)f * 0.40000000596046448D;
        field_607_ao = (field_607_ao / (double)f1) * (double)f * 0.40000000596046448D + 0.10000000149011612D;
        field_606_ap = (field_606_ap / (double)f1) * (double)f * 0.40000000596046448D;
        field_669_c = field_630_aQ.nextFloat() * 3F;
        field_668_d = field_630_aQ.nextFloat() * 3F;
        field_665_g = (field_630_aQ.nextFloat() * 0.5F + 0.5F) * 2.0F;
        field_666_f = (int)(4F / (field_630_aQ.nextFloat() * 0.9F + 0.1F));
        field_667_e = 0;
        field_640_aG = false;
    }

    public nq func_407_b(float f)
    {
        field_608_an *= f;
        field_607_ao = (field_607_ao - 0.10000000149011612D) * (double)f + 0.10000000149011612D;
        field_606_ap *= f;
        return this;
    }

    public nq func_405_d(float f)
    {
        func_371_a(0.2F * f, 0.2F * f);
        field_665_g *= f;
        return this;
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
        field_607_ao -= 0.040000000000000001D * (double)field_664_h;
        func_349_c(field_608_an, field_607_ao, field_606_ap);
        field_608_an *= 0.98000001907348633D;
        field_607_ao *= 0.98000001907348633D;
        field_606_ap *= 0.98000001907348633D;
        if(field_600_av)
        {
            field_608_an *= 0.69999998807907104D;
            field_606_ap *= 0.69999998807907104D;
        }
    }

    public void func_406_a(ho ho1, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = (float)(field_670_b % 16) / 16F;
        float f7 = f6 + 0.0624375F;
        float f8 = (float)(field_670_b / 16) / 16F;
        float f9 = f8 + 0.0624375F;
        float f10 = 0.1F * field_665_g;
        float f11 = (float)((field_614_ah + (field_611_ak - field_614_ah) * (double)f) - field_660_l);
        float f12 = (float)((field_613_ai + (field_610_al - field_613_ai) * (double)f) - field_659_m);
        float f13 = (float)((field_612_aj + (field_609_am - field_612_aj) * (double)f) - field_658_n);
        float f14 = func_382_a(f);
        ho1.func_987_a(field_663_i * f14, field_662_j * f14, field_661_k * f14);
        ho1.func_983_a(f11 - f1 * f10 - f4 * f10, f12 - f2 * f10, f13 - f3 * f10 - f5 * f10, f6, f9);
        ho1.func_983_a((f11 - f1 * f10) + f4 * f10, f12 + f2 * f10, (f13 - f3 * f10) + f5 * f10, f6, f8);
        ho1.func_983_a(f11 + f1 * f10 + f4 * f10, f12 + f2 * f10, f13 + f3 * f10 + f5 * f10, f7, f8);
        ho1.func_983_a((f11 + f1 * f10) - f4 * f10, f12 - f2 * f10, (f13 + f3 * f10) - f5 * f10, f7, f9);
    }

    public int func_404_c()
    {
        return 0;
    }

    public void func_352_a(hm hm)
    {
    }

    public void func_357_b(hm hm)
    {
    }

    protected int field_670_b;
    protected float field_669_c;
    protected float field_668_d;
    protected int field_667_e;
    protected int field_666_f;
    protected float field_665_g;
    protected float field_664_h;
    protected float field_663_i;
    protected float field_662_j;
    protected float field_661_k;
    public static double field_660_l;
    public static double field_659_m;
    public static double field_658_n;
}
