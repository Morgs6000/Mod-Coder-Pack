// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class EntitySnowball extends Entity
{

    public EntitySnowball(World world)
    {
        super(world);
        field_816_b = -1;
        field_815_c = -1;
        field_814_d = -1;
        field_813_e = 0;
        field_812_f = false;
        field_817_a = 0;
        field_809_i = 0;
        func_371_a(0.25F, 0.25F);
    }

    public boolean func_384_a(double d)
    {
        double d1 = boundingBox.func_1164_b() * 4D;
        d1 *= 64D;
        return d < d1 * d1;
    }

    public EntitySnowball(World world, EntityLiving entityliving)
    {
        super(world);
        field_816_b = -1;
        field_815_c = -1;
        field_814_d = -1;
        field_813_e = 0;
        field_812_f = false;
        field_817_a = 0;
        field_809_i = 0;
        field_811_g = entityliving;
        func_371_a(0.25F, 0.25F);
        func_365_c(entityliving.posX, entityliving.posY, entityliving.posZ, entityliving.rotationYaw, entityliving.rotationPitch);
        posX -= MathHelper.func_1114_b((rotationYaw / 180F) * 3.141593F) * 0.16F;
        posY -= 0.10000000149011612D;
        posZ -= MathHelper.func_1106_a((rotationYaw / 180F) * 3.141593F) * 0.16F;
        func_347_a(posX, posY, posZ);
        field_645_aB = 0.0F;
        float f = 0.4F;
        motionX = -MathHelper.func_1106_a((rotationYaw / 180F) * 3.141593F) * MathHelper.func_1114_b((rotationPitch / 180F) * 3.141593F) * f;
        motionZ = MathHelper.func_1114_b((rotationYaw / 180F) * 3.141593F) * MathHelper.func_1114_b((rotationPitch / 180F) * 3.141593F) * f;
        motionY = -MathHelper.func_1106_a((rotationPitch / 180F) * 3.141593F) * f;
        func_467_a(motionX, motionY, motionZ, 1.5F, 1.0F);
    }

    public void func_467_a(double d, double d1, double d2, float f, 
            float f1)
    {
        float f2 = MathHelper.func_1109_a(d * d + d1 * d1 + d2 * d2);
        d /= f2;
        d1 /= f2;
        d2 /= f2;
        d += field_630_aQ.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d1 += field_630_aQ.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d2 += field_630_aQ.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d *= f;
        d1 *= f;
        d2 *= f;
        motionX = d;
        motionY = d1;
        motionZ = d2;
        float f3 = MathHelper.func_1109_a(d * d + d2 * d2);
        field_603_as = rotationYaw = (float)((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
        field_602_at = rotationPitch = (float)((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);
        field_810_h = 0;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_817_a > 0)
        {
            field_817_a--;
        }
        if(field_812_f)
        {
            int i = field_615_ag.func_600_a(field_816_b, field_815_c, field_814_d);
            if(i != field_813_e)
            {
                field_812_f = false;
                motionX *= field_630_aQ.nextFloat() * 0.2F;
                motionY *= field_630_aQ.nextFloat() * 0.2F;
                motionZ *= field_630_aQ.nextFloat() * 0.2F;
                field_810_h = 0;
                field_809_i = 0;
            } else
            {
                field_810_h++;
                if(field_810_h == 1200)
                {
                    func_395_F();
                }
                return;
            }
        } else
        {
            field_809_i++;
        }
        Vec3D vec3d = Vec3D.func_1248_b(posX, posY, posZ);
        Vec3D vec3d1 = Vec3D.func_1248_b(posX + motionX, posY + motionY, posZ + motionZ);
        MovingObjectPosition movingobjectposition = field_615_ag.func_645_a(vec3d, vec3d1);
        vec3d = Vec3D.func_1248_b(posX, posY, posZ);
        vec3d1 = Vec3D.func_1248_b(posX + motionX, posY + motionY, posZ + motionZ);
        if(movingobjectposition != null)
        {
            vec3d1 = Vec3D.func_1248_b(movingobjectposition.field_1169_f.field_1776_a, movingobjectposition.field_1169_f.field_1775_b, movingobjectposition.field_1169_f.field_1779_c);
        }
        Entity entity = null;
        List list = field_615_ag.func_659_b(this, boundingBox.func_1170_a(motionX, motionY, motionZ).func_1177_b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            Entity entity1 = (Entity)list.get(j);
            if(!entity1.func_401_c_() || entity1 == field_811_g && field_809_i < 5)
            {
                continue;
            }
            float f2 = 0.3F;
            AxisAlignedBB axisalignedbb = entity1.boundingBox.func_1177_b(f2, f2, f2);
            MovingObjectPosition movingobjectposition1 = axisalignedbb.func_1169_a(vec3d, vec3d1);
            if(movingobjectposition1 == null)
            {
                continue;
            }
            double d1 = vec3d.func_1251_c(movingobjectposition1.field_1169_f);
            if(d1 < d || d == 0.0D)
            {
                entity = entity1;
                d = d1;
            }
        }

        if(entity != null)
        {
            movingobjectposition = new MovingObjectPosition(entity);
        }
        if(movingobjectposition != null)
        {
            if(movingobjectposition.field_1168_g != null)
            {
                if(!movingobjectposition.field_1168_g.func_396_a(field_811_g, 0));
            }
            for(int k = 0; k < 8; k++)
            {
                field_615_ag.func_694_a("snowballpoof", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
            }

            func_395_F();
        }
        posX += motionX;
        posY += motionY;
        posZ += motionZ;
        float f = MathHelper.func_1109_a(motionX * motionX + motionZ * motionZ);
        rotationYaw = (float)((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
        for(rotationPitch = (float)((Math.atan2(motionY, f) * 180D) / 3.1415927410125732D); rotationPitch - field_602_at < -180F; field_602_at -= 360F) { }
        for(; rotationPitch - field_602_at >= 180F; field_602_at += 360F) { }
        for(; rotationYaw - field_603_as < -180F; field_603_as -= 360F) { }
        for(; rotationYaw - field_603_as >= 180F; field_603_as += 360F) { }
        rotationPitch = field_602_at + (rotationPitch - field_602_at) * 0.2F;
        rotationYaw = field_603_as + (rotationYaw - field_603_as) * 0.2F;
        float f1 = 0.99F;
        float f3 = 0.03F;
        if(func_397_g_())
        {
            for(int l = 0; l < 4; l++)
            {
                float f4 = 0.25F;
                field_615_ag.func_694_a("bubble", posX - motionX * (double)f4, posY - motionY * (double)f4, posZ - motionZ * (double)f4, motionX, motionY, motionZ);
            }

            f1 = 0.8F;
        }
        motionX *= f1;
        motionY *= f1;
        motionZ *= f1;
        motionY -= f3;
        func_347_a(posX, posY, posZ);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_749_a("xTile", (short)field_816_b);
        nbttagcompound.func_749_a("yTile", (short)field_815_c);
        nbttagcompound.func_749_a("zTile", (short)field_814_d);
        nbttagcompound.func_761_a("inTile", (byte)field_813_e);
        nbttagcompound.func_761_a("shake", (byte)field_817_a);
        nbttagcompound.func_761_a("inGround", (byte)(field_812_f ? 1 : 0));
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        field_816_b = nbttagcompound.func_745_d("xTile");
        field_815_c = nbttagcompound.func_745_d("yTile");
        field_814_d = nbttagcompound.func_745_d("zTile");
        field_813_e = nbttagcompound.func_746_c("inTile") & 0xff;
        field_817_a = nbttagcompound.func_746_c("shake") & 0xff;
        field_812_f = nbttagcompound.func_746_c("inGround") == 1;
    }

    public void func_362_b(EntityPlayer entityplayer)
    {
        if(field_812_f && field_811_g == entityplayer && field_817_a <= 0 && entityplayer.field_778_b.func_504_a(new ItemStack(Item.arrow.swiftedIndex, 1)))
        {
            field_615_ag.func_623_a(this, "random.pop", 0.2F, ((field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            entityplayer.func_443_a_(this, 1);
            func_395_F();
        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    private int field_816_b;
    private int field_815_c;
    private int field_814_d;
    private int field_813_e;
    private boolean field_812_f;
    public int field_817_a;
    private EntityLiving field_811_g;
    private int field_810_h;
    private int field_809_i;
}
