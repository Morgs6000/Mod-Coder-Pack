// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
//import net.minecraft.client.Minecraft;

public class la extends bi
{

    public la(Minecraft minecraft, cn cn, dl dl, gy gy1)
    {
        super(minecraft, cn, dl);
        field_796_bh = 0;
        field_789_bo = new eu(null);
        field_797_bg = gy1;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        func_464_J();
    }

    public void func_462_n()
    {
        func_464_J();
    }

    public void func_464_J()
    {
        if(field_796_bh++ == 20)
        {
            if(!field_778_b.func_500_a(field_789_bo))
            {
                field_797_bg.func_847_a(new m(-1, field_778_b.field_843_a));
                field_797_bg.func_847_a(new m(-2, field_778_b.field_848_c));
                field_797_bg.func_847_a(new m(-3, field_778_b.field_842_b));
                field_789_bo = field_778_b.func_512_i();
            }
            field_796_bh = 0;
        }
        double d = field_611_ak - field_795_bi;
        double d1 = field_601_au.field_1697_b - field_794_bj;
        double d2 = field_610_al - field_793_bk;
        double d3 = field_609_am - field_792_bl;
        double d4 = field_605_aq - field_791_bm;
        double d5 = field_604_ar - field_790_bn;
        boolean flag = d1 != 0.0D || d2 != 0.0D || d != 0.0D || d3 != 0.0D;
        boolean flag1 = d4 != 0.0D || d5 != 0.0D;
        if(flag && flag1)
        {
            field_797_bg.func_847_a(new ch(field_611_ak, field_601_au.field_1697_b, field_610_al, field_609_am, field_605_aq, field_604_ar, field_600_av));
        } else
        if(flag)
        {
            field_797_bg.func_847_a(new s(field_611_ak, field_601_au.field_1697_b, field_610_al, field_609_am, field_600_av));
        } else
        if(flag1)
        {
            field_797_bg.func_847_a(new mh(field_605_aq, field_604_ar, field_600_av));
        } else
        {
            field_797_bg.func_847_a(new eh(field_600_av));
        }
        if(flag)
        {
            field_795_bi = field_611_ak;
            field_794_bj = field_601_au.field_1697_b;
            field_793_bk = field_610_al;
            field_792_bl = field_609_am;
        }
        if(flag1)
        {
            field_791_bm = field_605_aq;
            field_790_bn = field_604_ar;
        }
    }

    protected void func_446_a(dx dx1)
    {
        System.out.println("Dropping?");
        ha ha1 = new ha(dx1);
        field_797_bg.func_847_a(ha1);
        dx1.field_611_ak = (double)ha1.field_530_b / 32D;
        dx1.field_610_al = (double)ha1.field_529_c / 32D;
        dx1.field_609_am = (double)ha1.field_528_d / 32D;
        dx1.field_608_an = (double)ha1.field_527_e / 128D;
        dx1.field_607_ao = (double)ha1.field_526_f / 128D;
        dx1.field_606_ap = (double)ha1.field_525_g / 128D;
    }

    public void func_461_a(String s1)
    {
        field_797_bg.func_847_a(new ij(s1));
    }

    public void func_457_w()
    {
        super.func_457_w();
        field_797_bg.func_847_a(new hf(this, 1));
    }

    private gy field_797_bg;
    private int field_796_bh;
    private double field_795_bi;
    private double field_794_bj;
    private double field_793_bk;
    private double field_792_bl;
    private float field_791_bm;
    private float field_790_bn;
    private eu field_789_bo;
}
