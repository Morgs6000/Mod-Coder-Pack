// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class cd extends nq
{

    public cd(cn cn1, kh kh1, kh kh2, float f)
    {
        super(cn1, kh1.field_611_ak, kh1.field_610_al, kh1.field_609_am, kh1.field_608_an, kh1.field_607_ao, kh1.field_606_ap);
        field_678_p = 0;
        field_677_q = 0;
        field_675_a = kh1;
        field_679_o = kh2;
        field_677_q = 3;
        field_676_r = f;
    }

    public void func_406_a(ho ho, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = ((float)field_678_p + f) / (float)field_677_q;
        f6 *= f6;
        double d = field_675_a.field_611_ak;
        double d1 = field_675_a.field_610_al;
        double d2 = field_675_a.field_609_am;
        double d3 = field_679_o.field_638_aI + (field_679_o.field_611_ak - field_679_o.field_638_aI) * (double)f;
        double d4 = field_679_o.field_637_aJ + (field_679_o.field_610_al - field_679_o.field_637_aJ) * (double)f + (double)field_676_r;
        double d5 = field_679_o.field_636_aK + (field_679_o.field_609_am - field_679_o.field_636_aK) * (double)f;
        double d6 = d + (d3 - d) * (double)f6;
        double d7 = d1 + (d4 - d1) * (double)f6;
        double d8 = d2 + (d5 - d2) * (double)f6;
        int i = eo.b(d6);
        int j = eo.b(d7 + (double)(field_645_aB / 2.0F));
        int k = eo.b(d8);
        float f7 = field_615_ag.func_598_c(i, j, k);
        d6 -= field_660_l;
        d7 -= field_659_m;
        d8 -= field_658_n;
        GL11.glColor4f(f7, f7, f7, 1.0F);
        kx.field_1233_a.func_853_a(field_675_a, (float)d6, (float)d7, (float)d8, field_675_a.field_605_aq, f);
    }

    public void func_370_e_()
    {
        field_678_p++;
        if(field_678_p == field_677_q)
        {
            func_395_F();
        }
    }

    public int func_404_c()
    {
        return 3;
    }

    private kh field_675_a;
    private kh field_679_o;
    private int field_678_p;
    private int field_677_q;
    private float field_676_r;
}
