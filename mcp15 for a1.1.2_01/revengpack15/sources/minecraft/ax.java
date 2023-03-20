// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ax extends dq
{

    public ax(cn cn1)
    {
        super(cn1);
        field_728_u = "/mob/spider.png";
        func_371_a(1.4F, 0.9F);
        field_722_aa = 0.8F;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.75D - 0.5D;
    }

    protected kh func_438_i()
    {
        float f = func_382_a(1.0F);
        if(f < 0.5F)
        {
            double d = 16D;
            return field_615_ag.func_609_a(this, d);
        } else
        {
            return null;
        }
    }

    protected String func_423_c()
    {
        return "mob.spider";
    }

    protected String func_414_d()
    {
        return "mob.spider";
    }

    protected String func_428_e()
    {
        return "mob.spiderdeath";
    }

    protected void func_437_a(kh kh1, float f)
    {
        float f1 = func_382_a(1.0F);
        if(f1 > 0.5F && field_630_aQ.nextInt(100) == 0)
        {
            field_751_f = null;
            return;
        }
        if(f > 2.0F && f < 6F && field_630_aQ.nextInt(10) == 0)
        {
            if(field_600_av)
            {
                double d = kh1.field_611_ak - field_611_ak;
                double d1 = kh1.field_609_am - field_609_am;
                float f2 = eo.func_1109_a(d * d + d1 * d1);
                field_608_an = (d / (double)f2) * 0.5D * 0.80000001192092896D + field_608_an * 0.20000000298023224D;
                field_606_ap = (d1 / (double)f2) * 0.5D * 0.80000001192092896D + field_606_ap * 0.20000000298023224D;
                field_607_ao = 0.40000000596046448D;
            }
        } else
        {
            super.func_437_a(kh1, f);
        }
    }

    public void func_352_a(hm hm)
    {
        super.func_352_a(hm);
    }

    public void func_357_b(hm hm)
    {
        super.func_357_b(hm);
    }

    protected int func_422_g()
    {
        return di.field_253_I.field_291_aS;
    }
}
