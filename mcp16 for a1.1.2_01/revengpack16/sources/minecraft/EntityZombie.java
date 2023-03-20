// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityZombie extends EntityMobs
{

    public EntityZombie(World world)
    {
        super(world);
        field_728_u = "/mob/zombie.png";
        field_722_aa = 0.5F;
        field_762_e = 5;
    }

    public void func_425_j()
    {
        if(field_615_ag.func_624_b())
        {
            float f = func_382_a(1.0F);
            if(f > 0.5F && field_615_ag.func_647_i(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY), MathHelper.func_1108_b(posZ)) && field_630_aQ.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                fire = 300;
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
        return Item.feather.swiftedIndex;
    }
}
