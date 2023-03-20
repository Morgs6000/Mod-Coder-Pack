// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ek extends ge
{

    public ek(cn cn1)
    {
        super(cn1);
        field_750_g = false;
    }

    protected void func_418_b_()
    {
        field_750_g = false;
        float f = 16F;
        if(field_751_f == null)
        {
            field_751_f = func_438_i();
            if(field_751_f != null)
            {
                field_749_a = field_615_ag.func_702_a(this, field_751_f, f);
            }
        } else
        if(!field_751_f.func_354_B())
        {
            field_751_f = null;
        } else
        {
            float f1 = field_751_f.func_379_d(this);
            if(func_420_c(field_751_f))
            {
                func_437_a(field_751_f, f1);
            }
        }
        if(!field_750_g && field_751_f != null && (field_749_a == null || field_630_aQ.nextInt(20) == 0))
        {
            field_749_a = field_615_ag.func_702_a(this, field_751_f, f);
        } else
        if(field_749_a == null && field_630_aQ.nextInt(80) == 0 || field_630_aQ.nextInt(80) == 0)
        {
            boolean flag = false;
            int j = -1;
            int k = -1;
            int l = -1;
            float f2 = -99999F;
            for(int i1 = 0; i1 < 10; i1++)
            {
                int j1 = eo.b((field_611_ak + (double)field_630_aQ.nextInt(13)) - 6D);
                int k1 = eo.b((field_610_al + (double)field_630_aQ.nextInt(7)) - 3D);
                int l1 = eo.b((field_609_am + (double)field_630_aQ.nextInt(13)) - 6D);
                float f3 = func_439_a(j1, k1, l1);
                if(f3 > f2)
                {
                    f2 = f3;
                    j = j1;
                    k = k1;
                    l = l1;
                    flag = true;
                }
            }

            if(flag)
            {
                field_749_a = field_615_ag.func_637_a(this, j, k, l, 10F);
            }
        }
        int i = eo.b(field_601_au.field_1697_b);
        boolean flag1 = func_397_g_();
        boolean flag2 = func_359_G();
        field_604_ar = 0.0F;
        if(field_749_a == null || field_630_aQ.nextInt(100) == 0)
        {
            super.func_418_b_();
            field_749_a = null;
            return;
        }
        aj aj1 = field_749_a.func_1205_a(this);
        for(double d = field_644_aC * 2.0F; aj1 != null && aj1.func_1255_d(field_611_ak, aj1.field_1775_b, field_609_am) < d * d;)
        {
            field_749_a.func_1206_a();
            if(field_749_a.func_1207_b())
            {
                aj1 = null;
                field_749_a = null;
            } else
            {
                aj1 = field_749_a.func_1205_a(this);
            }
        }

        field_697_Y = false;
        if(aj1 != null)
        {
            double d1 = aj1.field_1776_a - field_611_ak;
            double d2 = aj1.field_1779_c - field_609_am;
            double d3 = aj1.field_1775_b - (double)i;
            float f4 = (float)((Math.atan2(d2, d1) * 180D) / 3.1415927410125732D) - 90F;
            float f5 = f4 - field_605_aq;
            field_699_W = field_722_aa;
            for(; f5 < -180F; f5 += 360F) { }
            for(; f5 >= 180F; f5 -= 360F) { }
            if(f5 > 30F)
            {
                f5 = 30F;
            }
            if(f5 < -30F)
            {
                f5 = -30F;
            }
            field_605_aq += f5;
            if(field_750_g && field_751_f != null)
            {
                double d4 = field_751_f.field_611_ak - field_611_ak;
                double d5 = field_751_f.field_609_am - field_609_am;
                float f7 = field_605_aq;
                field_605_aq = (float)((Math.atan2(d5, d4) * 180D) / 3.1415927410125732D) - 90F;
                float f6 = (((f7 - field_605_aq) + 90F) * 3.141593F) / 180F;
                field_700_V = -eo.func_1106_a(f6) * field_699_W * 1.0F;
                field_699_W = eo.func_1114_b(f6) * field_699_W * 1.0F;
            }
            if(d3 > 0.0D)
            {
                field_697_Y = true;
            }
        }
        if(field_751_f != null)
        {
            func_426_b(field_751_f, 30F);
        }
        if(field_599_aw)
        {
            field_697_Y = true;
        }
        if(field_630_aQ.nextFloat() < 0.8F && (flag1 || flag2))
        {
            field_697_Y = true;
        }
    }

    protected void func_437_a(kh kh1, float f)
    {
    }

    protected float func_439_a(int i, int j, int k)
    {
        return 0.0F;
    }

    protected kh func_438_i()
    {
        return null;
    }

    public boolean func_433_a()
    {
        int i = eo.b(field_611_ak);
        int j = eo.b(field_601_au.field_1697_b);
        int k = eo.b(field_609_am);
        return super.func_433_a() && func_439_a(i, j, k) >= 0.0F;
    }

    private bl field_749_a;
    protected kh field_751_f;
    protected boolean field_750_g;
}
