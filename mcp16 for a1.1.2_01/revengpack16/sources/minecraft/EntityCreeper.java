// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityCreeper extends EntityMobs
{

    public EntityCreeper(World world)
    {
        super(world);
        field_766_c = 30;
        field_765_d = -1;
        field_728_u = "/mob/creeper.png";
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
    }

    protected void func_418_b_()
    {
        field_763_b = field_764_a;
        if(field_764_a > 0 && field_765_d < 0)
        {
            field_764_a--;
        }
        if(field_765_d >= 0)
        {
            field_765_d = 2;
        }
        super.func_418_b_();
        if(field_765_d != 1)
        {
            field_765_d = -1;
        }
    }

    protected String func_414_d()
    {
        return "mob.creeper";
    }

    protected String func_428_e()
    {
        return "mob.creeperdeath";
    }

    public void func_419_b(Entity entity)
    {
        super.func_419_b(entity);
        if(entity instanceof EntitySkeleton)
        {
            func_367_b(Item.record13.swiftedIndex + field_630_aQ.nextInt(2), 1);
        }
    }

    protected void func_437_a(Entity entity, float f)
    {
        if(field_765_d <= 0 && f < 3F || field_765_d > 0 && f < 7F)
        {
            if(field_764_a == 0)
            {
                field_615_ag.func_623_a(this, "random.fuse", 1.0F, 0.5F);
            }
            field_765_d = 1;
            field_764_a++;
            if(field_764_a == field_766_c)
            {
                field_615_ag.func_676_a(this, posX, posY, posZ, 3F);
                func_395_F();
            }
            field_750_g = true;
        }
    }

    public float func_440_b(float f)
    {
        return ((float)field_763_b + (float)(field_764_a - field_763_b) * f) / (float)(field_766_c - 2);
    }

    protected int func_422_g()
    {
        return Item.gunpowder.swiftedIndex;
    }

    int field_764_a;
    int field_763_b;
    int field_766_c;
    int field_765_d;
}
