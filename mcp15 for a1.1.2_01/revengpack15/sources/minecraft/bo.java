// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class bo extends ag
{

    public bo(cn cn)
    {
        super(cn);
        field_760_a = false;
        field_728_u = "/mob/sheep.png";
        func_371_a(0.9F, 1.3F);
    }

    public boolean func_396_a(kh kh, int i)
    {
        if(!field_760_a && (kh instanceof ge))
        {
            field_760_a = true;
            int j = 1 + field_630_aQ.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                dx dx1 = func_394_a(ly.field_419_ac.field_376_bc, 1, 1.0F);
                dx1.field_607_ao += field_630_aQ.nextFloat() * 0.05F;
                dx1.field_608_an += (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.1F;
                dx1.field_606_ap += (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.1F;
            }

        }
        return super.func_396_a(kh, i);
    }

    public void func_352_a(hm hm1)
    {
        super.func_352_a(hm1);
        hm1.func_748_a("Sheared", field_760_a);
    }

    public void func_357_b(hm hm1)
    {
        super.func_357_b(hm1);
        field_760_a = hm1.func_760_m("Sheared");
    }

    protected String func_423_c()
    {
        return "mob.sheep";
    }

    protected String func_414_d()
    {
        return "mob.sheep";
    }

    protected String func_428_e()
    {
        return "mob.sheep";
    }

    public boolean field_760_a;
}
