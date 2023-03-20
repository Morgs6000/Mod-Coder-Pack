// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntitySheep extends EntityAnimals
{

    public EntitySheep(World world)
    {
        super(world);
        field_760_a = false;
        field_728_u = "/mob/sheep.png";
        func_371_a(0.9F, 1.3F);
    }

    public boolean func_396_a(Entity entity, int i)
    {
        if(!field_760_a && (entity instanceof EntityLiving))
        {
            field_760_a = true;
            int j = 1 + field_630_aQ.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                EntityItem entityitem = func_394_a(Block.cloth.blockID, 1, 1.0F);
                entityitem.motionY += field_630_aQ.nextFloat() * 0.05F;
                entityitem.motionX += (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.1F;
                entityitem.motionZ += (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.1F;
            }

        }
        return super.func_396_a(entity, i);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
        nbttagcompound.func_748_a("Sheared", field_760_a);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
        field_760_a = nbttagcompound.func_760_m("Sheared");
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
