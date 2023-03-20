// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class EntityArrow extends Entity
{

    public EntityArrow(World world)
    {
        super(world);
        xTile = -1;
        yTile = -1;
        zTile = -1;
        inTile = 0;
        inGround = false;
        arrowShake = 0;
        field_680_i = 0;
        func_371_a(0.5F, 0.5F);
    }

    public EntityArrow(World world, EntityLiving entityliving)
    {
        super(world);
        xTile = -1;
        yTile = -1;
        zTile = -1;
        inTile = 0;
        inGround = false;
        arrowShake = 0;
        field_680_i = 0;
        field_682_g = entityliving;
        func_371_a(0.5F, 0.5F);
        func_365_c(entityliving.posX, entityliving.posY, entityliving.posZ, entityliving.rotationYaw, entityliving.rotationPitch);
        posX -= MathHelper.func_1114_b((rotationYaw / 180F) * 3.141593F) * 0.16F;
        posY -= 0.10000000149011612D;
        posZ -= MathHelper.func_1106_a((rotationYaw / 180F) * 3.141593F) * 0.16F;
        func_347_a(posX, posY, posZ);
        field_645_aB = 0.0F;
        motionX = -MathHelper.func_1106_a((rotationYaw / 180F) * 3.141593F) * MathHelper.func_1114_b((rotationPitch / 180F) * 3.141593F);
        motionZ = MathHelper.func_1114_b((rotationYaw / 180F) * 3.141593F) * MathHelper.func_1114_b((rotationPitch / 180F) * 3.141593F);
        motionY = -MathHelper.func_1106_a((rotationPitch / 180F) * 3.141593F);
        func_408_a(motionX, motionY, motionZ, 1.5F, 1.0F);
    }

    public void func_408_a(double d, double d1, double d2, float f, 
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
        field_681_h = 0;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(arrowShake > 0)
        {
            arrowShake--;
        }
        if(inGround)
        {
            int i = field_615_ag.func_600_a(xTile, yTile, zTile);
            if(i != inTile)
            {
                inGround = false;
                motionX *= field_630_aQ.nextFloat() * 0.2F;
                motionY *= field_630_aQ.nextFloat() * 0.2F;
                motionZ *= field_630_aQ.nextFloat() * 0.2F;
                field_681_h = 0;
                field_680_i = 0;
            } else
            {
                field_681_h++;
                if(field_681_h == 1200)
                {
                    func_395_F();
                }
                return;
            }
        } else
        {
            field_680_i++;
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
            if(!entity1.func_401_c_() || entity1 == field_682_g && field_680_i < 5)
            {
                continue;
            }
            float f3 = 0.3F;
            AxisAlignedBB axisalignedbb = entity1.boundingBox.func_1177_b(f3, f3, f3);
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
                if(movingobjectposition.field_1168_g.func_396_a(field_682_g, 4))
                {
                    field_615_ag.func_623_a(this, "random.drr", 1.0F, 1.2F / (field_630_aQ.nextFloat() * 0.2F + 0.9F));
                    func_395_F();
                } else
                {
                    motionX *= -0.10000000149011612D;
                    motionY *= -0.10000000149011612D;
                    motionZ *= -0.10000000149011612D;
                    rotationYaw += 180F;
                    field_603_as += 180F;
                    field_680_i = 0;
                }
            } else
            {
                xTile = movingobjectposition.field_1166_b;
                yTile = movingobjectposition.field_1172_c;
                zTile = movingobjectposition.field_1171_d;
                inTile = field_615_ag.func_600_a(xTile, yTile, zTile);
                motionX = (float)(movingobjectposition.field_1169_f.field_1776_a - posX);
                motionY = (float)(movingobjectposition.field_1169_f.field_1775_b - posY);
                motionZ = (float)(movingobjectposition.field_1169_f.field_1779_c - posZ);
                float f = MathHelper.func_1109_a(motionX * motionX + motionY * motionY + motionZ * motionZ);
                posX -= (motionX / (double)f) * 0.05000000074505806D;
                posY -= (motionY / (double)f) * 0.05000000074505806D;
                posZ -= (motionZ / (double)f) * 0.05000000074505806D;
                field_615_ag.func_623_a(this, "random.drr", 1.0F, 1.2F / (field_630_aQ.nextFloat() * 0.2F + 0.9F));
                inGround = true;
                arrowShake = 7;
            }
        }
        posX += motionX;
        posY += motionY;
        posZ += motionZ;
        float f1 = MathHelper.func_1109_a(motionX * motionX + motionZ * motionZ);
        rotationYaw = (float)((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
        for(rotationPitch = (float)((Math.atan2(motionY, f1) * 180D) / 3.1415927410125732D); rotationPitch - field_602_at < -180F; field_602_at -= 360F) { }
        for(; rotationPitch - field_602_at >= 180F; field_602_at += 360F) { }
        for(; rotationYaw - field_603_as < -180F; field_603_as -= 360F) { }
        for(; rotationYaw - field_603_as >= 180F; field_603_as += 360F) { }
        rotationPitch = field_602_at + (rotationPitch - field_602_at) * 0.2F;
        rotationYaw = field_603_as + (rotationYaw - field_603_as) * 0.2F;
        float f2 = 0.99F;
        float f4 = 0.03F;
        if(func_397_g_())
        {
            for(int k = 0; k < 4; k++)
            {
                float f5 = 0.25F;
                field_615_ag.func_694_a("bubble", posX - motionX * (double)f5, posY - motionY * (double)f5, posZ - motionZ * (double)f5, motionX, motionY, motionZ);
            }

            f2 = 0.8F;
        }
        motionX *= f2;
        motionY *= f2;
        motionZ *= f2;
        motionY -= f4;
        func_347_a(posX, posY, posZ);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_749_a("xTile", (short)xTile);
        nbttagcompound.func_749_a("yTile", (short)yTile);
        nbttagcompound.func_749_a("zTile", (short)zTile);
        nbttagcompound.func_761_a("inTile", (byte)inTile);
        nbttagcompound.func_761_a("shake", (byte)arrowShake);
        nbttagcompound.func_761_a("inGround", (byte)(inGround ? 1 : 0));
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        xTile = nbttagcompound.func_745_d("xTile");
        yTile = nbttagcompound.func_745_d("yTile");
        zTile = nbttagcompound.func_745_d("zTile");
        inTile = nbttagcompound.func_746_c("inTile") & 0xff;
        arrowShake = nbttagcompound.func_746_c("shake") & 0xff;
        inGround = nbttagcompound.func_746_c("inGround") == 1;
    }

    public void func_362_b(EntityPlayer entityplayer)
    {
        if(inGround && field_682_g == entityplayer && arrowShake <= 0 && entityplayer.field_778_b.func_504_a(new ItemStack(Item.arrow.swiftedIndex, 1)))
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

    private int xTile;
    private int yTile;
    private int zTile;
    private int inTile;
    private boolean inGround;
    public int arrowShake;
    private EntityLiving field_682_g;
    private int field_681_h;
    private int field_680_i;
}
