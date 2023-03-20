// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public abstract class ag extends ek
{

    public ag(cn cn1)
    {
        super(cn1);
    }

    protected float func_439_a(int i, int j, int k)
    {
        if(field_615_ag.func_600_a(i, j - 1, k) == ly.field_337_v.field_376_bc)
        {
            return 10F;
        } else
        {
            return field_615_ag.func_598_c(i, j, k) - 0.5F;
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

    public boolean func_433_a()
    {
        int i = eo.b(field_611_ak);
        int j = eo.b(field_601_au.field_1697_b);
        int k = eo.b(field_609_am);
        return field_615_ag.func_600_a(i, j - 1, k) == ly.field_337_v.field_376_bc && field_615_ag.func_618_j(i, j, k) > 8 && super.func_433_a();
    }

    public int func_421_b()
    {
        return 120;
    }
}
