// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public abstract class Entity
{

    public Entity(World world)
    {
        field_620_ab = field_655_a++;
        field_619_ac = 1.0D;
        field_618_ad = false;
        onGround = false;
        field_597_ay = false;
        field_596_az = true;
        field_646_aA = false;
        field_645_aB = 0.0F;
        field_644_aC = 0.6F;
        field_643_aD = 1.8F;
        field_642_aE = 0.0F;
        field_641_aF = 0.0F;
        field_640_aG = true;
        fallDistance = 0.0F;
        field_653_b = 1;
        field_635_aL = 0.0F;
        field_634_aM = 0.0F;
        field_633_aN = false;
        field_632_aO = 0.0F;
        field_631_aP = false;
        field_630_aQ = new Random();
        field_629_aR = 0;
        field_628_aS = 1;
        fire = 0;
        field_626_aU = 300;
        field_625_aV = false;
        field_624_aW = 0;
        air = 300;
        field_651_c = true;
        field_621_aZ = false;
        field_615_ag = world;
        func_347_a(0.0D, 0.0D, 0.0D);
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Entity)
        {
            return ((Entity)obj).field_620_ab == field_620_ab;
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return field_620_ab;
    }

    protected void func_374_q()
    {
        if(field_615_ag == null)
        {
            return;
        }
        do
        {
            if(posY <= 0.0D)
            {
                break;
            }
            func_347_a(posX, posY, posZ);
            if(field_615_ag.func_697_a(this, boundingBox).size() == 0)
            {
                break;
            }
            posY++;
        } while(true);
        motionX = motionY = motionZ = 0.0D;
        rotationPitch = 0.0F;
    }

    public void func_395_F()
    {
        field_646_aA = true;
    }

    protected void func_371_a(float f, float f1)
    {
        field_644_aC = f;
        field_643_aD = f1;
    }

    protected void func_376_c(float f, float f1)
    {
        rotationYaw = f;
        rotationPitch = f1;
    }

    public void func_347_a(double d, double d1, double d2)
    {
        posX = d;
        posY = d1;
        posZ = d2;
        float f = field_644_aC / 2.0F;
        float f1 = field_643_aD;
        boundingBox.func_1165_c(d - (double)f, (d1 - (double)field_645_aB) + (double)field_635_aL, d2 - (double)f, d + (double)f, (d1 - (double)field_645_aB) + (double)field_635_aL + (double)f1, d2 + (double)f);
    }

    public void func_346_d(float f, float f1)
    {
        float f2 = rotationPitch;
        float f3 = rotationYaw;
        rotationYaw += (double)f * 0.14999999999999999D;
        rotationPitch -= (double)f1 * 0.14999999999999999D;
        if(rotationPitch < -90F)
        {
            rotationPitch = -90F;
        }
        if(rotationPitch > 90F)
        {
            rotationPitch = 90F;
        }
        field_602_at += rotationPitch - f2;
        field_603_as += rotationYaw - f3;
    }

    public void func_370_e_()
    {
        func_391_y();
    }

    public void func_391_y()
    {
        if(field_616_af != null && field_616_af.field_646_aA)
        {
            field_616_af = null;
        }
        field_629_aR++;
        field_642_aE = field_641_aF;
        field_614_ah = posX;
        field_613_ai = posY;
        field_612_aj = posZ;
        field_602_at = rotationPitch;
        field_603_as = rotationYaw;
        if(func_397_g_())
        {
            if(!field_625_aV && !field_651_c)
            {
                float f = MathHelper.func_1109_a(motionX * motionX * 0.20000000298023224D + motionY * motionY + motionZ * motionZ * 0.20000000298023224D) * 0.2F;
                if(f > 1.0F)
                {
                    f = 1.0F;
                }
                field_615_ag.func_623_a(this, "random.splash", f, 1.0F + (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.4F);
                float f1 = MathHelper.func_1108_b(boundingBox.field_1697_b);
                for(int i = 0; (float)i < 1.0F + field_644_aC * 20F; i++)
                {
                    float f2 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    float f4 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    field_615_ag.func_694_a("bubble", posX + (double)f2, f1 + 1.0F, posZ + (double)f4, motionX, motionY - (double)(field_630_aQ.nextFloat() * 0.2F), motionZ);
                }

                for(int j = 0; (float)j < 1.0F + field_644_aC * 20F; j++)
                {
                    float f3 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    float f5 = (field_630_aQ.nextFloat() * 2.0F - 1.0F) * field_644_aC;
                    field_615_ag.func_694_a("splash", posX + (double)f3, f1 + 1.0F, posZ + (double)f5, motionX, motionY, motionZ);
                }

            }
            fallDistance = 0.0F;
            field_625_aV = true;
            fire = 0;
        } else
        {
            field_625_aV = false;
        }
        if(fire > 0)
        {
            if(fire % 20 == 0)
            {
                func_396_a(null, 1);
            }
            fire--;
        }
        if(func_359_G())
        {
            func_396_a(null, 10);
            fire = 600;
        }
        if(posY < -64D)
        {
            func_369_E();
        }
        field_651_c = false;
    }

    protected void func_369_E()
    {
        func_395_F();
    }

    public boolean func_403_b(double d, double d1, double d2)
    {
        AxisAlignedBB axisalignedbb = boundingBox.func_1166_c(d, d1, d2);
        List list = field_615_ag.func_697_a(this, axisalignedbb);
        if(list.size() > 0)
        {
            return false;
        }
        return !field_615_ag.func_662_b(axisalignedbb);
    }

    public void func_349_c(double d, double d1, double d2)
    {
        if(field_633_aN)
        {
            boundingBox.func_1174_d(d, d1, d2);
            posX = (boundingBox.field_1698_a + boundingBox.field_1703_d) / 2D;
            posY = (boundingBox.field_1697_b + (double)field_645_aB) - (double)field_635_aL;
            posZ = (boundingBox.field_1704_c + boundingBox.field_1701_f) / 2D;
            return;
        }
        double d3 = posX;
        double d4 = posZ;
        double d5 = d;
        double d6 = d1;
        double d7 = d2;
        AxisAlignedBB axisalignedbb = boundingBox.func_1160_c();
        boolean flag = onGround && func_381_o();
        if(flag)
        {
            double d8 = 0.050000000000000003D;
            for(; d != 0.0D && field_615_ag.func_697_a(this, boundingBox.func_1166_c(d, -1D, 0.0D)).size() == 0; d5 = d)
            {
                if(d < d8 && d >= -d8)
                {
                    d = 0.0D;
                    continue;
                }
                if(d > 0.0D)
                {
                    d -= d8;
                } else
                {
                    d += d8;
                }
            }

            for(; d2 != 0.0D && field_615_ag.func_697_a(this, boundingBox.func_1166_c(0.0D, -1D, d2)).size() == 0; d7 = d2)
            {
                if(d2 < d8 && d2 >= -d8)
                {
                    d2 = 0.0D;
                    continue;
                }
                if(d2 > 0.0D)
                {
                    d2 -= d8;
                } else
                {
                    d2 += d8;
                }
            }

        }
        List list = field_615_ag.func_697_a(this, boundingBox.func_1170_a(d, d1, d2));
        for(int i = 0; i < list.size(); i++)
        {
            d1 = ((AxisAlignedBB)list.get(i)).func_1172_b(boundingBox, d1);
        }

        boundingBox.func_1174_d(0.0D, d1, 0.0D);
        if(!field_596_az && d6 != d1)
        {
            d = d1 = d2 = 0.0D;
        }
        boolean flag1 = onGround || d6 != d1 && d6 < 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            d = ((AxisAlignedBB)list.get(j)).func_1163_a(boundingBox, d);
        }

        boundingBox.func_1174_d(d, 0.0D, 0.0D);
        if(!field_596_az && d5 != d)
        {
            d = d1 = d2 = 0.0D;
        }
        for(int k = 0; k < list.size(); k++)
        {
            d2 = ((AxisAlignedBB)list.get(k)).func_1162_c(boundingBox, d2);
        }

        boundingBox.func_1174_d(0.0D, 0.0D, d2);
        if(!field_596_az && d7 != d2)
        {
            d = d1 = d2 = 0.0D;
        }
        if(field_634_aM > 0.0F && flag1 && field_635_aL < 0.05F && (d5 != d || d7 != d2))
        {
            double d9 = d;
            double d11 = d1;
            double d13 = d2;
            d = d5;
            d1 = field_634_aM;
            d2 = d7;
            AxisAlignedBB axisalignedbb1 = boundingBox.func_1160_c();
            boundingBox.func_1171_b(axisalignedbb);
            List list1 = field_615_ag.func_697_a(this, boundingBox.func_1170_a(d, d1, d2));
            for(int j2 = 0; j2 < list1.size(); j2++)
            {
                d1 = ((AxisAlignedBB)list1.get(j2)).func_1172_b(boundingBox, d1);
            }

            boundingBox.func_1174_d(0.0D, d1, 0.0D);
            if(!field_596_az && d6 != d1)
            {
                d = d1 = d2 = 0.0D;
            }
            for(int k2 = 0; k2 < list1.size(); k2++)
            {
                d = ((AxisAlignedBB)list1.get(k2)).func_1163_a(boundingBox, d);
            }

            boundingBox.func_1174_d(d, 0.0D, 0.0D);
            if(!field_596_az && d5 != d)
            {
                d = d1 = d2 = 0.0D;
            }
            for(int l2 = 0; l2 < list1.size(); l2++)
            {
                d2 = ((AxisAlignedBB)list1.get(l2)).func_1162_c(boundingBox, d2);
            }

            boundingBox.func_1174_d(0.0D, 0.0D, d2);
            if(!field_596_az && d7 != d2)
            {
                d = d1 = d2 = 0.0D;
            }
            if(d9 * d9 + d13 * d13 >= d * d + d2 * d2)
            {
                d = d9;
                d1 = d11;
                d2 = d13;
                boundingBox.func_1171_b(axisalignedbb1);
            } else
            {
                field_635_aL += 0.5D;
            }
        }
        posX = (boundingBox.field_1698_a + boundingBox.field_1703_d) / 2D;
        posY = (boundingBox.field_1697_b + (double)field_645_aB) - (double)field_635_aL;
        posZ = (boundingBox.field_1704_c + boundingBox.field_1701_f) / 2D;
        field_599_aw = d5 != d || d7 != d2;
        field_598_ax = d6 != d1;
        onGround = d6 != d1 && d6 < 0.0D;
        field_597_ay = field_599_aw || field_598_ax;
        if(onGround)
        {
            if(fallDistance > 0.0F)
            {
                func_400_c(fallDistance);
                fallDistance = 0.0F;
            }
        } else
        if(d1 < 0.0D)
        {
            fallDistance -= d1;
        }
        if(d5 != d)
        {
            motionX = 0.0D;
        }
        if(d6 != d1)
        {
            motionY = 0.0D;
        }
        if(d7 != d2)
        {
            motionZ = 0.0D;
        }
        double d10 = posX - d3;
        double d12 = posZ - d4;
        field_641_aF += (double)MathHelper.func_1109_a(d10 * d10 + d12 * d12) * 0.59999999999999998D;
        if(field_640_aG && !flag)
        {
            int l = MathHelper.func_1108_b(posX);
            int j1 = MathHelper.func_1108_b(posY - 0.20000000298023224D - (double)field_645_aB);
            int l1 = MathHelper.func_1108_b(posZ);
            int i3 = field_615_ag.func_600_a(l, j1, l1);
            if(field_641_aF > (float)field_653_b && i3 > 0)
            {
                field_653_b++;
                StepSound stepsound = Block.allBlocks[i3].stepSound;
                if(field_615_ag.func_600_a(l, j1 + 1, l1) == Block.snow.blockID)
                {
                    stepsound = Block.snow.stepSound;
                    field_615_ag.func_623_a(this, stepsound.func_1145_d(), stepsound.func_1147_b() * 0.15F, stepsound.func_1144_c());
                } else
                if(!Block.allBlocks[i3].material.func_879_d())
                {
                    field_615_ag.func_623_a(this, stepsound.func_1145_d(), stepsound.func_1147_b() * 0.15F, stepsound.func_1144_c());
                }
                Block.allBlocks[i3].func_254_a(field_615_ag, l, j1, l1, this);
            }
        }
        int i1 = MathHelper.func_1108_b(boundingBox.field_1698_a);
        int k1 = MathHelper.func_1108_b(boundingBox.field_1697_b);
        int i2 = MathHelper.func_1108_b(boundingBox.field_1704_c);
        int j3 = MathHelper.func_1108_b(boundingBox.field_1703_d);
        int k3 = MathHelper.func_1108_b(boundingBox.field_1702_e);
        int l3 = MathHelper.func_1108_b(boundingBox.field_1701_f);
        for(int i4 = i1; i4 <= j3; i4++)
        {
            for(int j4 = k1; j4 <= k3; j4++)
            {
                for(int k4 = i2; k4 <= l3; k4++)
                {
                    int l4 = field_615_ag.func_600_a(i4, j4, k4);
                    if(l4 > 0)
                    {
                        Block.allBlocks[l4].func_236_b(field_615_ag, i4, j4, k4, this);
                    }
                }

            }

        }

        field_635_aL *= 0.4F;
        boolean flag2 = func_397_g_();
        if(field_615_ag.func_605_c(boundingBox))
        {
            func_355_a(1);
            if(!flag2)
            {
                fire++;
                if(fire == 0)
                {
                    fire = 300;
                }
            }
        } else
        if(fire <= 0)
        {
            fire = -field_628_aS;
        }
        if(flag2 && fire > 0)
        {
            field_615_ag.func_623_a(this, "random.fizz", 0.7F, 1.6F + (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.4F);
            fire = -field_628_aS;
        }
    }

    public boolean func_381_o()
    {
        return false;
    }

    public AxisAlignedBB func_372_f_()
    {
        return null;
    }

    protected void func_355_a(int i)
    {
        func_396_a(null, i);
    }

    protected void func_400_c(float f)
    {
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(boundingBox.func_1177_b(0.0D, -0.40000000596046448D, 0.0D), Material.water, this);
    }

    public boolean func_393_a(Material material)
    {
        double d = posY + (double)func_373_s();
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1110_d(MathHelper.func_1108_b(d));
        int k = MathHelper.func_1108_b(posZ);
        int l = field_615_ag.func_600_a(i, j, k);
        if(l != 0 && Block.allBlocks[l].material == material)
        {
            float f = BlockFluids.func_288_b(field_615_ag.func_602_e(i, j, k)) - 0.1111111F;
            float f1 = (float)(j + 1) - f;
            return d < (double)f1;
        } else
        {
            return false;
        }
    }

    protected float func_373_s()
    {
        return 0.0F;
    }

    public boolean func_359_G()
    {
        return field_615_ag.func_689_a(boundingBox.func_1177_b(0.0D, -0.40000000596046448D, 0.0D), Material.lava);
    }

    public void func_351_a(float f, float f1, float f2)
    {
        float f3 = MathHelper.func_1113_c(f * f + f1 * f1);
        if(f3 < 0.01F)
        {
            return;
        }
        if(f3 < 1.0F)
        {
            f3 = 1.0F;
        }
        f3 = f2 / f3;
        f *= f3;
        f1 *= f3;
        float f4 = MathHelper.func_1106_a((rotationYaw * 3.141593F) / 180F);
        float f5 = MathHelper.func_1114_b((rotationYaw * 3.141593F) / 180F);
        motionX += f * f5 - f1 * f4;
        motionZ += f1 * f5 + f * f4;
    }

    public float func_382_a(float f)
    {
        int i = MathHelper.func_1108_b(posX);
        double d = (boundingBox.field_1702_e - boundingBox.field_1697_b) * 0.66000000000000003D;
        int j = MathHelper.func_1108_b((posY - (double)field_645_aB) + d);
        int k = MathHelper.func_1108_b(posZ);
        return field_615_ag.func_598_c(i, j, k);
    }

    public void func_398_a(World world)
    {
        field_615_ag = world;
    }

    public void func_399_b(double d, double d1, double d2, float f, 
            float f1)
    {
        field_614_ah = posX = d;
        field_613_ai = posY = d1;
        field_612_aj = posZ = d2;
        rotationYaw = f;
        rotationPitch = f1;
        field_635_aL = 0.0F;
        double d3 = field_603_as - f;
        if(d3 < -180D)
        {
            field_603_as += 360F;
        }
        if(d3 >= 180D)
        {
            field_603_as -= 360F;
        }
        func_347_a(posX, posY, posZ);
    }

    public void func_365_c(double d, double d1, double d2, float f, 
            float f1)
    {
        field_614_ah = posX = d;
        field_613_ai = posY = d1 + (double)field_645_aB;
        field_612_aj = posZ = d2;
        rotationYaw = f;
        rotationPitch = f1;
        func_347_a(posX, posY, posZ);
    }

    public float func_379_d(Entity entity)
    {
        float f = (float)(posX - entity.posX);
        float f1 = (float)(posY - entity.posY);
        float f2 = (float)(posZ - entity.posZ);
        return MathHelper.func_1113_c(f * f + f1 * f1 + f2 * f2);
    }

    public double func_360_d(double d, double d1, double d2)
    {
        double d3 = posX - d;
        double d4 = posY - d1;
        double d5 = posZ - d2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public double func_361_e(double d, double d1, double d2)
    {
        double d3 = posX - d;
        double d4 = posY - d1;
        double d5 = posZ - d2;
        return (double)MathHelper.func_1109_a(d3 * d3 + d4 * d4 + d5 * d5);
    }

    public double func_387_e(Entity entity)
    {
        double d = posX - entity.posX;
        double d1 = posY - entity.posY;
        double d2 = posZ - entity.posZ;
        return d * d + d1 * d1 + d2 * d2;
    }

    public void func_362_b(EntityPlayer entityplayer)
    {
    }

    public void func_380_f(Entity entity)
    {
        if(entity.field_617_ae == this || entity.field_616_af == this)
        {
            return;
        }
        double d = entity.posX - posX;
        double d1 = entity.posZ - posZ;
        double d2 = MathHelper.func_1107_a(d, d1);
        if(d2 >= 0.0099999997764825821D)
        {
            d2 = MathHelper.func_1109_a(d2);
            d /= d2;
            d1 /= d2;
            double d3 = 1.0D / d2;
            if(d3 > 1.0D)
            {
                d3 = 1.0D;
            }
            d *= d3;
            d1 *= d3;
            d *= 0.05000000074505806D;
            d1 *= 0.05000000074505806D;
            d *= 1.0F - field_632_aO;
            d1 *= 1.0F - field_632_aO;
            func_348_f(-d, 0.0D, -d1);
            entity.func_348_f(d, 0.0D, d1);
        }
    }

    public void func_348_f(double d, double d1, double d2)
    {
        motionX += d;
        motionY += d1;
        motionZ += d2;
    }

    public boolean func_396_a(Entity entity, int i)
    {
        return false;
    }

    public boolean func_401_c_()
    {
        return false;
    }

    public boolean func_385_d_()
    {
        return false;
    }

    public void func_364_b(Entity entity, int i)
    {
    }

    public boolean func_390_a(Vec3D vec3d)
    {
        double d = posX - vec3d.field_1776_a;
        double d1 = posY - vec3d.field_1775_b;
        double d2 = posZ - vec3d.field_1779_c;
        double d3 = d * d + d1 * d1 + d2 * d2;
        return func_384_a(d3);
    }

    public boolean func_384_a(double d)
    {
        double d1 = boundingBox.func_1164_b();
        d1 *= 64D * field_619_ac;
        return d < d1 * d1;
    }

    public String func_356_x()
    {
        return null;
    }

    public boolean func_358_c(NBTTagCompound nbttagcompound)
    {
        String s = func_389_H();
        if(field_646_aA || s == null)
        {
            return false;
        } else
        {
            nbttagcompound.func_754_a("id", s);
            func_363_d(nbttagcompound);
            return true;
        }
    }

    public void func_363_d(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_762_a("Pos", func_375_a(new double[] {
            posX, posY, posZ
        }));
        nbttagcompound.func_762_a("Motion", func_375_a(new double[] {
            motionX, motionY, motionZ
        }));
        nbttagcompound.func_762_a("Rotation", func_377_a(new float[] {
            rotationYaw, rotationPitch
        }));
        nbttagcompound.func_744_a("FallDistance", fallDistance);
        nbttagcompound.func_749_a("Fire", (short)fire);
        nbttagcompound.func_749_a("Air", (short)air);
        nbttagcompound.func_748_a("OnGround", onGround);
        func_352_a(nbttagcompound);
    }

    public void func_368_e(NBTTagCompound nbttagcompound)
    {
        NBTTagList nbttaglist = nbttagcompound.func_753_l("Pos");
        NBTTagList nbttaglist1 = nbttagcompound.func_753_l("Motion");
        NBTTagList nbttaglist2 = nbttagcompound.func_753_l("Rotation");
        func_347_a(0.0D, 0.0D, 0.0D);
        motionX = ((NBTTagDouble)nbttaglist1.func_741_a(0)).doubleValue;
        motionY = ((NBTTagDouble)nbttaglist1.func_741_a(1)).doubleValue;
        motionZ = ((NBTTagDouble)nbttaglist1.func_741_a(2)).doubleValue;
        field_614_ah = field_638_aI = posX = ((NBTTagDouble)nbttaglist.func_741_a(0)).doubleValue;
        field_613_ai = field_637_aJ = posY = ((NBTTagDouble)nbttaglist.func_741_a(1)).doubleValue;
        field_612_aj = field_636_aK = posZ = ((NBTTagDouble)nbttaglist.func_741_a(2)).doubleValue;
        field_603_as = rotationYaw = ((NBTTagFloat)nbttaglist2.func_741_a(0)).floatValue;
        field_602_at = rotationPitch = ((NBTTagFloat)nbttaglist2.func_741_a(1)).floatValue;
        fallDistance = nbttagcompound.func_752_g("FallDistance");
        fire = nbttagcompound.func_745_d("Fire");
        air = nbttagcompound.func_745_d("Air");
        onGround = nbttagcompound.func_760_m("OnGround");
        func_347_a(posX, posY, posZ);
        func_357_b(nbttagcompound);
    }

    protected final String func_389_H()
    {
        return EntityList.func_1083_b(this);
    }

    protected abstract void func_357_b(NBTTagCompound nbttagcompound);

    protected abstract void func_352_a(NBTTagCompound nbttagcompound);

    protected NBTTagList func_375_a(double ad[])
    {
        NBTTagList nbttaglist = new NBTTagList();
        double ad1[] = ad;
        int i = ad1.length;
        for(int j = 0; j < i; j++)
        {
            double d = ad1[j];
            nbttaglist.func_742_a(new NBTTagDouble(d));
        }

        return nbttaglist;
    }

    protected NBTTagList func_377_a(float af[])
    {
        NBTTagList nbttaglist = new NBTTagList();
        float af1[] = af;
        int i = af1.length;
        for(int j = 0; j < i; j++)
        {
            float f = af1[j];
            nbttaglist.func_742_a(new NBTTagFloat(f));
        }

        return nbttaglist;
    }

    public float func_392_h_()
    {
        return field_643_aD / 2.0F;
    }

    public EntityItem func_367_b(int i, int j)
    {
        return func_394_a(i, j, 0.0F);
    }

    public EntityItem func_394_a(int i, int j, float f)
    {
        EntityItem entityitem = new EntityItem(field_615_ag, posX, posY + (double)f, posZ, new ItemStack(i, j));
        entityitem.field_805_c = 10;
        field_615_ag.func_674_a(entityitem);
        return entityitem;
    }

    public boolean func_354_B()
    {
        return !field_646_aA;
    }

    public boolean func_345_I()
    {
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1108_b(posY + (double)func_373_s());
        int k = MathHelper.func_1108_b(posZ);
        return field_615_ag.func_601_g(i, j, k);
    }

    public boolean func_353_a(EntityPlayer entityplayer)
    {
        return false;
    }

    public AxisAlignedBB func_383_b_(Entity entity)
    {
        return null;
    }

    public void func_350_p()
    {
        if(field_616_af.field_646_aA)
        {
            field_616_af = null;
            return;
        }
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        func_370_e_();
        field_616_af.func_366_i_();
        field_647_e += field_616_af.rotationYaw - field_616_af.field_603_as;
        field_649_d += field_616_af.rotationPitch - field_616_af.field_602_at;
        for(; field_647_e >= 180D; field_647_e -= 360D) { }
        for(; field_647_e < -180D; field_647_e += 360D) { }
        for(; field_649_d >= 180D; field_649_d -= 360D) { }
        for(; field_649_d < -180D; field_649_d += 360D) { }
        double d = field_647_e * 0.5D;
        double d1 = field_649_d * 0.5D;
        float f = 10F;
        if(d > (double)f)
        {
            d = f;
        }
        if(d < (double)(-f))
        {
            d = -f;
        }
        if(d1 > (double)f)
        {
            d1 = f;
        }
        if(d1 < (double)(-f))
        {
            d1 = -f;
        }
        field_647_e -= d;
        field_649_d -= d1;
        rotationYaw += d;
        rotationPitch += d1;
    }

    protected void func_366_i_()
    {
        field_617_ae.func_347_a(posX, posY + func_402_h() + field_617_ae.func_388_v(), posZ);
    }

    public double func_388_v()
    {
        return (double)field_645_aB;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.75D;
    }

    public void func_386_g(Entity entity)
    {
        field_649_d = 0.0D;
        field_647_e = 0.0D;
        if(field_616_af == entity)
        {
            field_616_af.field_617_ae = null;
            field_616_af = null;
            func_365_c(entity.posX, entity.boundingBox.field_1697_b + (double)entity.field_643_aD, entity.posZ, rotationYaw, rotationPitch);
            return;
        }
        if(field_616_af != null)
        {
            field_616_af.field_617_ae = null;
        }
        if(entity.field_617_ae != null)
        {
            entity.field_617_ae.field_616_af = null;
        }
        field_616_af = entity;
        entity.field_617_ae = this;
    }

    public void func_378_a(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        func_347_a(d, d1, d2);
        func_376_c(f, f1);
    }

    private static int field_655_a = 0;
    public int field_620_ab;
    public double field_619_ac;
    public boolean field_618_ad;
    public Entity field_617_ae;
    public Entity field_616_af;
    protected World field_615_ag;
    public double field_614_ah;
    public double field_613_ai;
    public double field_612_aj;
    public double posX;
    public double posY;
    public double posZ;
    public double motionX;
    public double motionY;
    public double motionZ;
    public float rotationYaw;
    public float rotationPitch;
    public float field_603_as;
    public float field_602_at;
    public final AxisAlignedBB boundingBox = AxisAlignedBB.func_1168_a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    public boolean onGround;
    public boolean field_599_aw;
    public boolean field_598_ax;
    public boolean field_597_ay;
    public boolean field_596_az;
    public boolean field_646_aA;
    public float field_645_aB;
    public float field_644_aC;
    public float field_643_aD;
    public float field_642_aE;
    public float field_641_aF;
    protected boolean field_640_aG;
    protected float fallDistance;
    private int field_653_b;
    public double field_638_aI;
    public double field_637_aJ;
    public double field_636_aK;
    public float field_635_aL;
    public float field_634_aM;
    public boolean field_633_aN;
    public float field_632_aO;
    public boolean field_631_aP;
    protected Random field_630_aQ;
    public int field_629_aR;
    public int field_628_aS;
    public int fire;
    protected int field_626_aU;
    protected boolean field_625_aV;
    public int field_624_aW;
    public int air;
    private boolean field_651_c;
    public String field_622_aY;
    private double field_649_d;
    private double field_647_e;
    public boolean field_621_aZ;
    public int field_657_ba;
    public int field_656_bb;
    public int field_654_bc;
    public int field_652_bd;
    public int field_650_be;
    public int field_648_bf;

}
