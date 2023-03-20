// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class cw extends dq
{

    public cw(cn cn1)
    {
        super(cn1);
        field_728_u = "/mob/skeleton.png";
    }

    protected String func_423_c()
    {
        return "mob.skeleton";
    }

    protected String func_414_d()
    {
        return "mob.skeletonhurt";
    }

    protected String func_428_e()
    {
        return "mob.skeletonhurt";
    }

    public void func_425_j()
    {
        if(field_615_ag.func_624_b())
        {
            float f = func_382_a(1.0F);
            if(f > 0.5F && field_615_ag.func_647_i(eo.b(field_611_ak), eo.b(field_610_al), eo.b(field_609_am)) && field_630_aQ.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                field_627_aT = 300;
            }
        }
        super.func_425_j();
    }

    protected void func_437_a(kh kh1, float f)
    {
        if(f < 10F)
        {
            double d = kh1.field_611_ak - field_611_ak;
            double d1 = kh1.field_609_am - field_609_am;
            if(field_711_K == 0)
            {
                kg kg1 = new kg(field_615_ag, this);
                kg1.field_610_al += 1.3999999761581421D;
                double d2 = kh1.field_610_al - 0.20000000298023224D - kg1.field_610_al;
                float f1 = eo.func_1109_a(d * d + d1 * d1) * 0.2F;
                field_615_ag.func_623_a(this, "random.bow", 1.0F, 1.0F / (field_630_aQ.nextFloat() * 0.4F + 0.8F));
                field_615_ag.func_674_a(kg1);
                kg1.func_408_a(d, d2 + (double)f1, d1, 0.6F, 12F);
                field_711_K = 30;
            }
            field_605_aq = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
            field_750_g = true;
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
        return di.field_226_j.field_291_aS;
    }
}
