// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class mv extends ag
{

    public mv(cn cn)
    {
        super(cn);
        field_759_a = false;
        field_728_u = "/mob/pig.png";
        func_371_a(0.9F, 0.9F);
        field_759_a = false;
    }

    public void func_352_a(hm hm1)
    {
        super.func_352_a(hm1);
        hm1.func_748_a("Saddle", field_759_a);
    }

    public void func_357_b(hm hm1)
    {
        super.func_357_b(hm1);
        field_759_a = hm1.func_760_m("Saddle");
    }

    protected String func_423_c()
    {
        return "mob.pig";
    }

    protected String func_414_d()
    {
        return "mob.pig";
    }

    protected String func_428_e()
    {
        return "mob.pigdeath";
    }

    public boolean func_353_a(dm dm1)
    {
        if(field_759_a)
        {
            dm1.func_386_g(this);
            return true;
        } else
        {
            return false;
        }
    }

    protected int func_422_g()
    {
        return di.field_272_ao.field_291_aS;
    }

    public boolean field_759_a;
}
