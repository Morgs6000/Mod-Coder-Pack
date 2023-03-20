// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntitySlime extends EntityLiving
    implements IMobs
{

    public EntitySlime(World world)
    {
        super(world);
        field_769_d = 0;
        field_770_c = 1;
        field_728_u = "/mob/slime.png";
        field_770_c = 1 << field_630_aQ.nextInt(3);
        field_645_aB = 0.0F;
        field_769_d = field_630_aQ.nextInt(20) + 10;
        func_441_c(field_770_c);
    }

    public void func_441_c(int i)
    {
        field_770_c = i;
        func_371_a(0.6F * (float)i, 0.6F * (float)i);
        health = i * i;
        func_347_a(posX, posY, posZ);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
        nbttagcompound.func_758_a("Size", field_770_c - 1);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
        field_770_c = nbttagcompound.func_756_e("Size") + 1;
    }

    public void func_370_e_()
    {
        field_767_b = field_768_a;
        boolean flag = onGround;
        super.func_370_e_();
        if(onGround && !flag)
        {
            for(int i = 0; i < field_770_c * 8; i++)
            {
                float f = field_630_aQ.nextFloat() * 3.141593F * 2.0F;
                float f1 = field_630_aQ.nextFloat() * 0.5F + 0.5F;
                float f2 = MathHelper.func_1106_a(f) * (float)field_770_c * 0.5F * f1;
                float f3 = MathHelper.func_1114_b(f) * (float)field_770_c * 0.5F * f1;
                field_615_ag.func_694_a("slime", posX + (double)f2, boundingBox.field_1697_b, posZ + (double)f3, 0.0D, 0.0D, 0.0D);
            }

            if(field_770_c > 2)
            {
                field_615_ag.func_623_a(this, "mob.slime", func_413_f(), ((field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F) / 0.8F);
            }
            field_768_a = -0.5F;
        }
        field_768_a = field_768_a * 0.6F;
    }

    protected void func_418_b_()
    {
        EntityPlayer entityplayer = field_615_ag.func_609_a(this, 16D);
        if(entityplayer != null)
        {
            func_426_b(entityplayer, 10F);
        }
        if(onGround && field_769_d-- <= 0)
        {
            field_769_d = field_630_aQ.nextInt(20) + 10;
            if(entityplayer != null)
            {
                field_769_d /= 3;
            }
            field_697_Y = true;
            if(field_770_c > 1)
            {
                field_615_ag.func_623_a(this, "mob.slime", func_413_f(), ((field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F) * 0.8F);
            }
            field_768_a = 1.0F;
            field_700_V = 1.0F - field_630_aQ.nextFloat() * 2.0F;
            field_699_W = 1 * field_770_c;
        } else
        {
            field_697_Y = false;
            if(onGround)
            {
                field_700_V = field_699_W = 0.0F;
            }
        }
    }

    public void func_395_F()
    {
        if(field_770_c > 1 && health == 0)
        {
            for(int i = 0; i < 4; i++)
            {
                float f = (((float)(i % 2) - 0.5F) * (float)field_770_c) / 4F;
                float f1 = (((float)(i / 2) - 0.5F) * (float)field_770_c) / 4F;
                EntitySlime entityslime = new EntitySlime(field_615_ag);
                entityslime.func_441_c(field_770_c / 2);
                entityslime.func_365_c(posX + (double)f, posY + 0.5D, posZ + (double)f1, field_630_aQ.nextFloat() * 360F, 0.0F);
                field_615_ag.func_674_a(entityslime);
            }

        }
        super.func_395_F();
    }

    public void func_362_b(EntityPlayer entityplayer)
    {
        if(field_770_c > 1 && func_420_c(entityplayer) && (double)func_379_d(entityplayer) < 0.59999999999999998D * (double)field_770_c && entityplayer.func_396_a(this, field_770_c))
        {
            field_615_ag.func_623_a(this, "mob.slimeattack", 1.0F, (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
        }
    }

    protected String func_414_d()
    {
        return "mob.slime";
    }

    protected String func_428_e()
    {
        return "mob.slime";
    }

    protected int func_422_g()
    {
        if(field_770_c == 1)
        {
            return Item.slimeBall.swiftedIndex;
        } else
        {
            return 0;
        }
    }

    public boolean func_433_a()
    {
        Chunk chunk = field_615_ag.func_673_a(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY));
        return (field_770_c == 1 || field_615_ag.field_1039_l > 0) && field_630_aQ.nextInt(10) == 0 && chunk.func_997_a(0x3ad8025fL).nextInt(10) == 0 && posY < 16D;
    }

    protected float func_413_f()
    {
        return 0.6F;
    }

    public float field_768_a;
    public float field_767_b;
    private int field_769_d;
    public int field_770_c;
}
