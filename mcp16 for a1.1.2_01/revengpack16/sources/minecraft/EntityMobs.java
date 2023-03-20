// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityMobs extends EntityCreature
    implements IMobs
{

    public EntityMobs(World world)
    {
        super(world);
        field_762_e = 2;
        health = 20;
    }

    public void func_425_j()
    {
        float f = func_382_a(1.0F);
        if(f > 0.5F)
        {
            field_701_U += 2;
        }
        super.func_425_j();
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_615_ag.field_1039_l == 0)
        {
            func_395_F();
        }
    }

    protected Entity func_438_i()
    {
        EntityPlayer entityplayer = field_615_ag.func_609_a(this, 16D);
        if(entityplayer != null && func_420_c(entityplayer))
        {
            return entityplayer;
        } else
        {
            return null;
        }
    }

    public boolean func_396_a(Entity entity, int i)
    {
        if(super.func_396_a(entity, i))
        {
            if(field_617_ae == entity || field_616_af == entity)
            {
                return true;
            }
            if(entity != this)
            {
                field_751_f = entity;
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void func_437_a(Entity entity, float f)
    {
        if((double)f < 2.5D && entity.boundingBox.field_1702_e > boundingBox.field_1697_b && entity.boundingBox.field_1697_b < boundingBox.field_1702_e)
        {
            attackTime = 20;
            entity.func_396_a(this, field_762_e);
        }
    }

    protected float func_439_a(int i, int j, int k)
    {
        return 0.5F - field_615_ag.func_598_c(i, j, k);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
    }

    public boolean func_433_a()
    {
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1108_b(boundingBox.field_1697_b);
        int k = MathHelper.func_1108_b(posZ);
        if(field_615_ag.func_641_a(EnumSkyBlock.Sky, i, j, k) > field_630_aQ.nextInt(32))
        {
            return false;
        } else
        {
            int l = field_615_ag.func_618_j(i, j, k);
            return l <= field_630_aQ.nextInt(8) && super.func_433_a();
        }
    }

    protected int field_762_e;
}
