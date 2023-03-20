// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class am extends ag
{

    public am(cn cn)
    {
        super(cn);
        field_761_a = false;
        field_728_u = "/mob/cow.png";
        func_371_a(0.9F, 1.3F);
    }

    public void func_352_a(hm hm)
    {
        super.func_352_a(hm);
    }

    public void func_357_b(hm hm)
    {
        super.func_357_b(hm);
    }

    protected String func_423_c()
    {
        return "mob.cow";
    }

    protected String func_414_d()
    {
        return "mob.cowhurt";
    }

    protected String func_428_e()
    {
        return "mob.cowhurt";
    }

    protected float func_413_f()
    {
        return 0.4F;
    }

    protected int func_422_g()
    {
        return di.field_306_aD.field_291_aS;
    }

    public boolean func_353_a(dm dm1)
    {
        ev ev1 = dm1.field_778_b.func_494_a();
        if(ev1 != null && ev1.field_1617_c == di.field_262_au.field_291_aS)
        {
            dm1.field_778_b.func_472_a(dm1.field_778_b.field_847_d, new ev(di.field_305_aE));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean field_761_a;
}
