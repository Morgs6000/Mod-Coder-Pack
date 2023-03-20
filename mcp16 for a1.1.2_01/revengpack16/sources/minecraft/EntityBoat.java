// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class EntityBoat extends Entity
{

    public EntityBoat(World world)
    {
        super(world);
        field_807_a = 0;
        field_806_b = 0;
        field_808_c = 1;
        field_618_ad = true;
        func_371_a(1.5F, 0.6F);
        field_645_aB = field_643_aD / 2.0F;
        field_640_aG = false;
    }

    public AxisAlignedBB func_383_b_(Entity entity)
    {
        return entity.boundingBox;
    }

    public AxisAlignedBB func_372_f_()
    {
        return boundingBox;
    }

    public boolean func_385_d_()
    {
        return true;
    }

    public EntityBoat(World world, double d, double d1, double d2)
    {
        this(world);
        func_347_a(d, d1 + (double)field_645_aB, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        field_614_ah = d;
        field_613_ai = d1;
        field_612_aj = d2;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.0D - 0.30000001192092896D;
    }

    public boolean func_396_a(Entity entity, int i)
    {
        field_808_c = -field_808_c;
        field_806_b = 10;
        field_807_a += i * 10;
        if(field_807_a > 40)
        {
            for(int j = 0; j < 3; j++)
            {
                func_394_a(Block.planks.blockID, 1, 0.0F);
            }

            for(int k = 0; k < 2; k++)
            {
                func_394_a(Item.stick.swiftedIndex, 1, 0.0F);
            }

            func_395_F();
        }
        return true;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_806_b > 0)
        {
            field_806_b--;
        }
        if(field_807_a > 0)
        {
            field_807_a--;
        }
        field_614_ah = posX;
        field_613_ai = posY;
        field_612_aj = posZ;
        int i = 5;
        double d = 0.0D;
        for(int j = 0; j < i; j++)
        {
            double d2 = (boundingBox.field_1697_b + ((boundingBox.field_1702_e - boundingBox.field_1697_b) * (double)(j + 0)) / (double)i) - 0.125D;
            double d4 = (boundingBox.field_1697_b + ((boundingBox.field_1702_e - boundingBox.field_1697_b) * (double)(j + 1)) / (double)i) - 0.125D;
            AxisAlignedBB axisalignedbb = AxisAlignedBB.func_1161_b(boundingBox.field_1698_a, d2, boundingBox.field_1704_c, boundingBox.field_1703_d, d4, boundingBox.field_1701_f);
            if(field_615_ag.func_707_b(axisalignedbb, Material.water))
            {
                d += 1.0D / (double)i;
            }
        }

        double d1 = d * 2D - 1.0D;
        motionY += 0.039999999105930328D * d1;
        if(field_617_ae != null)
        {
            motionX += field_617_ae.motionX * 0.20000000000000001D;
            motionZ += field_617_ae.motionZ * 0.20000000000000001D;
        }
        double d3 = 0.40000000000000002D;
        if(motionX < -d3)
        {
            motionX = -d3;
        }
        if(motionX > d3)
        {
            motionX = d3;
        }
        if(motionZ < -d3)
        {
            motionZ = -d3;
        }
        if(motionZ > d3)
        {
            motionZ = d3;
        }
        if(onGround)
        {
            motionX *= 0.5D;
            motionY *= 0.5D;
            motionZ *= 0.5D;
        }
        func_349_c(motionX, motionY, motionZ);
        double d5 = Math.sqrt(motionX * motionX + motionZ * motionZ);
        if(d5 > 0.14999999999999999D)
        {
            double d6 = Math.cos(((double)rotationYaw * 3.1415926535897931D) / 180D);
            double d8 = Math.sin(((double)rotationYaw * 3.1415926535897931D) / 180D);
            for(int i1 = 0; (double)i1 < 1.0D + d5 * 60D; i1++)
            {
                double d11 = field_630_aQ.nextFloat() * 2.0F - 1.0F;
                double d13 = (double)(field_630_aQ.nextInt(2) * 2 - 1) * 0.69999999999999996D;
                if(field_630_aQ.nextBoolean())
                {
                    double d14 = (posX - d6 * d11 * 0.80000000000000004D) + d8 * d13;
                    double d16 = posZ - d8 * d11 * 0.80000000000000004D - d6 * d13;
                    field_615_ag.func_694_a("splash", d14, posY - 0.125D, d16, motionX, motionY, motionZ);
                } else
                {
                    double d15 = posX + d6 + d8 * d11 * 0.69999999999999996D;
                    double d17 = (posZ + d8) - d6 * d11 * 0.69999999999999996D;
                    field_615_ag.func_694_a("splash", d15, posY - 0.125D, d17, motionX, motionY, motionZ);
                }
            }

        }
        if(field_599_aw && d5 > 0.14999999999999999D)
        {
            func_395_F();
            for(int k = 0; k < 3; k++)
            {
                func_394_a(Block.planks.blockID, 1, 0.0F);
            }

            for(int l = 0; l < 2; l++)
            {
                func_394_a(Item.stick.swiftedIndex, 1, 0.0F);
            }

        } else
        {
            motionX *= 0.99000000953674316D;
            motionY *= 0.94999998807907104D;
            motionZ *= 0.99000000953674316D;
        }
        rotationPitch = 0.0F;
        double d7 = rotationYaw;
        double d9 = field_614_ah - posX;
        double d10 = field_612_aj - posZ;
        if(d9 * d9 + d10 * d10 > 0.001D)
        {
            d7 = (float)((Math.atan2(d10, d9) * 180D) / 3.1415926535897931D);
        }
        double d12;
        for(d12 = d7 - (double)rotationYaw; d12 >= 180D; d12 -= 360D) { }
        for(; d12 < -180D; d12 += 360D) { }
        if(d12 > 20D)
        {
            d12 = 20D;
        }
        if(d12 < -20D)
        {
            d12 = -20D;
        }
        rotationYaw += d12;
        func_376_c(rotationYaw, rotationPitch);
        List list = field_615_ag.func_659_b(this, boundingBox.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                Entity entity = (Entity)list.get(j1);
                if(entity != field_617_ae && entity.func_385_d_() && (entity instanceof EntityBoat))
                {
                    entity.func_380_f(this);
                }
            }

        }
        if(field_617_ae != null && field_617_ae.field_646_aA)
        {
            field_617_ae = null;
        }
    }

    protected void func_366_i_()
    {
        double d = Math.cos(((double)rotationYaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
        double d1 = Math.sin(((double)rotationYaw * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
        field_617_ae.func_347_a(posX + d, posY + func_402_h() + field_617_ae.func_388_v(), posZ + d1);
    }

    protected void func_352_a(NBTTagCompound nbttagcompound)
    {
    }

    protected void func_357_b(NBTTagCompound nbttagcompound)
    {
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public boolean func_353_a(EntityPlayer entityplayer)
    {
        entityplayer.func_386_g(this);
        return true;
    }

    public int field_807_a;
    public int field_806_b;
    public int field_808_c;
}
