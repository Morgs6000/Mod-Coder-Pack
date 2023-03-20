// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntitySpider extends EntityMobs
{

    public EntitySpider(World world)
    {
        super(world);
        field_728_u = "/mob/spider.png";
        func_371_a(1.4F, 0.9F);
        field_722_aa = 0.8F;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.75D - 0.5D;
    }

    protected Entity func_438_i()
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

    protected void func_437_a(Entity entity, float f)
    {
        float f1 = func_382_a(1.0F);
        if(f1 > 0.5F && field_630_aQ.nextInt(100) == 0)
        {
            field_751_f = null;
            return;
        }
        if(f > 2.0F && f < 6F && field_630_aQ.nextInt(10) == 0)
        {
            if(onGround)
            {
                double d = entity.posX - posX;
                double d1 = entity.posZ - posZ;
                float f2 = MathHelper.func_1109_a(d * d + d1 * d1);
                motionX = (d / (double)f2) * 0.5D * 0.80000001192092896D + motionX * 0.20000000298023224D;
                motionZ = (d1 / (double)f2) * 0.5D * 0.80000001192092896D + motionZ * 0.20000000298023224D;
                motionY = 0.40000000596046448D;
            }
        } else
        {
            super.func_437_a(entity, f);
        }
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
    }

    protected int func_422_g()
    {
        return Item.silk.swiftedIndex;
    }
}
