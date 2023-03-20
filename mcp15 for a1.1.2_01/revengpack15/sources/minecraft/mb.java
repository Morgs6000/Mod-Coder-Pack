// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class mb extends dq
{

    public mb(cn cn1)
    {
        super(cn1);
        field_728_u = "/mob/zombie.png";
        field_722_aa = 0.5F;
        field_762_e = 5;
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

    protected String func_423_c()
    {
        return "mob.zombie";
    }

    protected String func_414_d()
    {
        return "mob.zombiehurt";
    }

    protected String func_428_e()
    {
        return "mob.zombiedeath";
    }

    protected int func_422_g()
    {
        return di.field_251_J.field_291_aS;
    }
}
