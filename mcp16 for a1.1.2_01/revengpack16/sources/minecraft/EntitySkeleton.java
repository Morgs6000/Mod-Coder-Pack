// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntitySkeleton extends EntityMobs
{

    public EntitySkeleton(World world)
    {
        super(world);
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
            if(f > 0.5F && field_615_ag.func_647_i(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY), MathHelper.func_1108_b(posZ)) && field_630_aQ.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                fire = 300;
            }
        }
        super.func_425_j();
    }

    protected void func_437_a(Entity entity, float f)
    {
        if(f < 10F)
        {
            double d = entity.posX - posX;
            double d1 = entity.posZ - posZ;
            if(attackTime == 0)
            {
                EntityArrow entityarrow = new EntityArrow(field_615_ag, this);
                entityarrow.posY += 1.3999999761581421D;
                double d2 = entity.posY - 0.20000000298023224D - entityarrow.posY;
                float f1 = MathHelper.func_1109_a(d * d + d1 * d1) * 0.2F;
                field_615_ag.func_623_a(this, "random.bow", 1.0F, 1.0F / (field_630_aQ.nextFloat() * 0.4F + 0.8F));
                field_615_ag.func_674_a(entityarrow);
                entityarrow.func_408_a(d, d2 + (double)f1, d1, 0.6F, 12F);
                attackTime = 30;
            }
            rotationYaw = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - 90F;
            field_750_g = true;
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
        return Item.arrow.swiftedIndex;
    }
}
