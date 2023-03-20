// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class EntityLiving extends Entity
{

    public EntityLiving(World world)
    {
        super(world);
        field_739_j = 20;
        field_735_n = 0.0F;
        field_734_o = 0.0F;
        field_729_t = true;
        field_728_u = "/char.png";
        field_727_v = true;
        field_726_w = 0.0F;
        field_725_x = null;
        field_724_y = 1.0F;
        field_723_z = 0;
        field_721_A = 0.0F;
        field_720_B = false;
        field_713_I = 0.0F;
        deathTime = 0;
        attackTime = 0;
        field_708_N = false;
        field_707_O = -1;
        field_706_P = (float)(Math.random() * 0.89999997615814209D + 0.10000000149011612D);
        field_702_T = 0.0F;
        field_701_U = 0;
        field_697_Y = false;
        field_696_Z = 0.0F;
        field_722_aa = 0.7F;
        field_740_i = 0;
        health = 10;
        field_618_ad = true;
        field_736_m = (float)(Math.random() + 1.0D) * 0.01F;
        func_347_a(posX, posY, posZ);
        field_738_k = (float)Math.random() * 12398F;
        rotationYaw = (float)(Math.random() * 3.1415927410125732D * 2D);
        field_737_l = 1.0F;
        field_634_aM = 0.5F;
    }

    protected boolean func_420_c(Entity entity)
    {
        return field_615_ag.func_645_a(Vec3D.func_1248_b(posX, posY + (double)func_373_s(), posZ), Vec3D.func_1248_b(entity.posX, entity.posY + (double)entity.func_373_s(), entity.posZ)) == null;
    }

    public String func_356_x()
    {
        return field_728_u;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public boolean func_385_d_()
    {
        return !field_646_aA;
    }

    protected float func_373_s()
    {
        return field_643_aD * 0.85F;
    }

    public int func_421_b()
    {
        return 80;
    }

    public void func_391_y()
    {
        field_719_C = field_718_D;
        super.func_391_y();
        if(field_630_aQ.nextInt(1000) < field_748_a++)
        {
            field_748_a = -func_421_b();
            String s = func_423_c();
            if(s != null)
            {
                field_615_ag.func_623_a(this, s, func_413_f(), (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
            }
        }
        if(func_354_B() && func_345_I())
        {
            func_396_a(null, 1);
        }
        if(func_354_B() && func_393_a(Material.water))
        {
            air--;
            if(air == -20)
            {
                air = 0;
                for(int i = 0; i < 8; i++)
                {
                    float f = field_630_aQ.nextFloat() - field_630_aQ.nextFloat();
                    float f1 = field_630_aQ.nextFloat() - field_630_aQ.nextFloat();
                    float f2 = field_630_aQ.nextFloat() - field_630_aQ.nextFloat();
                    field_615_ag.func_694_a("bubble", posX + (double)f, posY + (double)f1, posZ + (double)f2, motionX, motionY, motionZ);
                }

                func_396_a(null, 2);
            }
            fire = 0;
        } else
        {
            air = field_626_aU;
        }
        field_710_L = field_709_M;
        if(attackTime > 0)
        {
            attackTime--;
        }
        if(hurtTime > 0)
        {
            hurtTime--;
        }
        if(field_624_aW > 0)
        {
            field_624_aW--;
        }
        if(health <= 0)
        {
            deathTime++;
            if(deathTime > 20)
            {
                func_436_D();
                func_395_F();
                for(int j = 0; j < 20; j++)
                {
                    double d = field_630_aQ.nextGaussian() * 0.02D;
                    double d1 = field_630_aQ.nextGaussian() * 0.02D;
                    double d2 = field_630_aQ.nextGaussian() * 0.02D;
                    field_615_ag.func_694_a("explode", (posX + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, posY + (double)(field_630_aQ.nextFloat() * field_643_aD), (posZ + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC, d, d1, d2);
                }

            }
        }
        field_730_s = field_731_r;
        field_734_o = field_735_n;
        field_603_as = rotationYaw;
        field_602_at = rotationPitch;
    }

    public void func_415_z()
    {
        for(int i = 0; i < 20; i++)
        {
            double d = field_630_aQ.nextGaussian() * 0.02D;
            double d1 = field_630_aQ.nextGaussian() * 0.02D;
            double d2 = field_630_aQ.nextGaussian() * 0.02D;
            double d3 = 10D;
            field_615_ag.func_694_a("explode", (posX + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC - d * d3, (posY + (double)(field_630_aQ.nextFloat() * field_643_aD)) - d1 * d3, (posZ + (double)(field_630_aQ.nextFloat() * field_644_aC * 2.0F)) - (double)field_644_aC - d2 * d3, d, d1, d2);
        }

    }

    public void func_350_p()
    {
        super.func_350_p();
        field_733_p = field_732_q;
        field_732_q = 0.0F;
    }

    public void func_378_a(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        field_645_aB = 0.0F;
        field_746_c = d;
        field_745_d = d1;
        field_744_e = d2;
        field_743_f = f;
        field_742_g = f1;
        field_747_b = i;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        func_425_j();
        double d = posX - field_614_ah;
        double d1 = posZ - field_612_aj;
        float f = MathHelper.func_1109_a(d * d + d1 * d1);
        float f1 = field_735_n;
        float f2 = 0.0F;
        field_733_p = field_732_q;
        float f3 = 0.0F;
        if(f > 0.05F)
        {
            f3 = 1.0F;
            f2 = f * 3F;
            f1 = ((float)Math.atan2(d1, d) * 180F) / 3.141593F - 90F;
        }
        if(field_718_D > 0.0F)
        {
            f1 = rotationYaw;
        }
        if(!onGround)
        {
            f3 = 0.0F;
        }
        field_732_q = field_732_q + (f3 - field_732_q) * 0.3F;
        float f4;
        for(f4 = f1 - field_735_n; f4 < -180F; f4 += 360F) { }
        for(; f4 >= 180F; f4 -= 360F) { }
        field_735_n += f4 * 0.3F;
        float f5;
        for(f5 = rotationYaw - field_735_n; f5 < -180F; f5 += 360F) { }
        for(; f5 >= 180F; f5 -= 360F) { }
        boolean flag = f5 < -90F || f5 >= 90F;
        if(f5 < -75F)
        {
            f5 = -75F;
        }
        if(f5 >= 75F)
        {
            f5 = 75F;
        }
        field_735_n = rotationYaw - f5;
        if(f5 * f5 > 2500F)
        {
            field_735_n += f5 * 0.2F;
        }
        if(flag)
        {
            f2 *= -1F;
        }
        for(; rotationYaw - field_603_as < -180F; field_603_as -= 360F) { }
        for(; rotationYaw - field_603_as >= 180F; field_603_as += 360F) { }
        for(; field_735_n - field_734_o < -180F; field_734_o -= 360F) { }
        for(; field_735_n - field_734_o >= 180F; field_734_o += 360F) { }
        for(; rotationPitch - field_602_at < -180F; field_602_at -= 360F) { }
        for(; rotationPitch - field_602_at >= 180F; field_602_at += 360F) { }
        field_731_r += f2;
    }

    protected void func_371_a(float f, float f1)
    {
        super.func_371_a(f, f1);
    }

    public void func_432_b(int i)
    {
        if(health <= 0)
        {
            return;
        }
        health += i;
        if(health > 20)
        {
            health = 20;
        }
        field_624_aW = field_739_j / 2;
    }

    public boolean func_396_a(Entity entity, int i)
    {
        if(field_615_ag.field_1026_y)
        {
            i = 0;
        }
        field_701_U = 0;
        if(health <= 0)
        {
            return false;
        }
        field_704_R = 1.5F;
        if((float)field_624_aW > (float)field_739_j / 2.0F)
        {
            if(field_716_F - i >= health)
            {
                return false;
            }
            health = field_716_F - i;
        } else
        {
            field_716_F = health;
            field_624_aW = field_739_j;
            health -= i;
            hurtTime = field_714_H = 10;
        }
        field_713_I = 0.0F;
        if(entity != null)
        {
            double d = entity.posX - posX;
            double d1;
            for(d1 = entity.posZ - posZ; d * d + d1 * d1 < 0.0001D; d1 = (Math.random() - Math.random()) * 0.01D)
            {
                d = (Math.random() - Math.random()) * 0.01D;
            }

            field_713_I = (float)((Math.atan2(d1, d) * 180D) / 3.1415927410125732D) - rotationYaw;
            func_434_a(entity, i, d, d1);
        } else
        {
            field_713_I = (int)(Math.random() * 2D) * 180;
        }
        if(health <= 0)
        {
            field_615_ag.func_623_a(this, func_428_e(), func_413_f(), (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
            func_419_b(entity);
        } else
        {
            field_615_ag.func_623_a(this, func_414_d(), func_413_f(), (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F + 1.0F);
        }
        return true;
    }

    protected float func_413_f()
    {
        return 1.0F;
    }

    protected String func_423_c()
    {
        return null;
    }

    protected String func_414_d()
    {
        return "random.hurt";
    }

    protected String func_428_e()
    {
        return "random.hurt";
    }

    public void func_434_a(Entity entity, int i, double d, double d1)
    {
        float f = MathHelper.func_1109_a(d * d + d1 * d1);
        float f1 = 0.4F;
        motionX /= 2D;
        motionY /= 2D;
        motionZ /= 2D;
        motionX -= (d / (double)f) * (double)f1;
        motionY += 0.40000000596046448D;
        motionZ -= (d1 / (double)f) * (double)f1;
        if(motionY > 0.40000000596046448D)
        {
            motionY = 0.40000000596046448D;
        }
    }

    public void func_419_b(Entity entity)
    {
        if(field_723_z > 0 && entity != null)
        {
            entity.func_364_b(this, field_723_z);
        }
        field_708_N = true;
        int i = func_422_g();
        if(i > 0)
        {
            int j = field_630_aQ.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                func_367_b(i, 1);
            }

        }
    }

    protected int func_422_g()
    {
        return 0;
    }

    protected void func_400_c(float f)
    {
        int i = (int)Math.ceil(f - 3F);
        if(i > 0)
        {
            func_396_a(null, i);
            int j = field_615_ag.func_600_a(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY - 0.20000000298023224D - (double)field_645_aB), MathHelper.func_1108_b(posZ));
            if(j > 0)
            {
                StepSound stepsound = Block.allBlocks[j].stepSound;
                field_615_ag.func_623_a(this, stepsound.func_1145_d(), stepsound.func_1147_b() * 0.5F, stepsound.func_1144_c() * 0.75F);
            }
        }
    }

    public void func_435_b(float f, float f1)
    {
        if(func_397_g_())
        {
            double d = posY;
            func_351_a(f, f1, 0.02F);
            func_349_c(motionX, motionY, motionZ);
            motionX *= 0.80000001192092896D;
            motionY *= 0.80000001192092896D;
            motionZ *= 0.80000001192092896D;
            motionY -= 0.02D;
            if(field_599_aw && func_403_b(motionX, ((motionY + 0.60000002384185791D) - posY) + d, motionZ))
            {
                motionY = 0.30000001192092896D;
            }
        } else
        if(func_359_G())
        {
            double d1 = posY;
            func_351_a(f, f1, 0.02F);
            func_349_c(motionX, motionY, motionZ);
            motionX *= 0.5D;
            motionY *= 0.5D;
            motionZ *= 0.5D;
            motionY -= 0.02D;
            if(field_599_aw && func_403_b(motionX, ((motionY + 0.60000002384185791D) - posY) + d1, motionZ))
            {
                motionY = 0.30000001192092896D;
            }
        } else
        {
            float f2 = 0.91F;
            if(onGround)
            {
                f2 = 0.5460001F;
                int i = field_615_ag.func_600_a(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(boundingBox.field_1697_b) - 1, MathHelper.func_1108_b(posZ));
                if(i > 0)
                {
                    f2 = Block.allBlocks[i].field_355_bo * 0.91F;
                }
            }
            float f3 = 0.1627714F / (f2 * f2 * f2);
            func_351_a(f, f1, onGround ? 0.1F * f3 : 0.02F);
            f2 = 0.91F;
            if(onGround)
            {
                f2 = 0.5460001F;
                int j = field_615_ag.func_600_a(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(boundingBox.field_1697_b) - 1, MathHelper.func_1108_b(posZ));
                if(j > 0)
                {
                    f2 = Block.allBlocks[j].field_355_bo * 0.91F;
                }
            }
            if(func_429_A())
            {
                fallDistance = 0.0F;
                if(motionY < -0.14999999999999999D)
                {
                    motionY = -0.14999999999999999D;
                }
            }
            func_349_c(motionX, motionY, motionZ);
            if(field_599_aw && func_429_A())
            {
                motionY = 0.20000000000000001D;
            }
            motionY -= 0.080000000000000002D;
            motionY *= 0.98000001907348633D;
            motionX *= f2;
            motionZ *= f2;
        }
        field_705_Q = field_704_R;
        double d2 = posX - field_614_ah;
        double d3 = posZ - field_612_aj;
        float f4 = MathHelper.func_1109_a(d2 * d2 + d3 * d3) * 4F;
        if(f4 > 1.0F)
        {
            f4 = 1.0F;
        }
        field_704_R += (f4 - field_704_R) * 0.4F;
        field_703_S += field_704_R;
    }

    public boolean func_429_A()
    {
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1108_b(boundingBox.field_1697_b);
        int k = MathHelper.func_1108_b(posZ);
        return field_615_ag.func_600_a(i, j, k) == Block.ladder.blockID || field_615_ag.func_600_a(i, j + 1, k) == Block.ladder.blockID;
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_749_a("Health", (short)health);
        nbttagcompound.func_749_a("HurtTime", (short)hurtTime);
        nbttagcompound.func_749_a("DeathTime", (short)deathTime);
        nbttagcompound.func_749_a("AttackTime", (short)attackTime);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        health = nbttagcompound.func_745_d("Health");
        if(!nbttagcompound.func_751_b("Health"))
        {
            health = 10;
        }
        hurtTime = nbttagcompound.func_745_d("HurtTime");
        deathTime = nbttagcompound.func_745_d("DeathTime");
        attackTime = nbttagcompound.func_745_d("AttackTime");
    }

    public boolean func_354_B()
    {
        return !field_646_aA && health > 0;
    }

    public void func_425_j()
    {
        if(field_747_b > 0)
        {
            double d = posX + (field_746_c - posX) / (double)field_747_b;
            double d1 = posY + (field_745_d - posY) / (double)field_747_b;
            double d2 = posZ + (field_744_e - posZ) / (double)field_747_b;
            double d3;
            for(d3 = field_743_f - (double)rotationYaw; d3 < -180D; d3 += 360D) { }
            for(; d3 >= 180D; d3 -= 360D) { }
            rotationYaw += d3 / (double)field_747_b;
            rotationPitch += (field_742_g - (double)rotationPitch) / (double)field_747_b;
            field_747_b--;
            func_347_a(d, d1, d2);
            func_376_c(rotationYaw, rotationPitch);
        }
        if(health <= 0)
        {
            field_697_Y = false;
            field_700_V = 0.0F;
            field_699_W = 0.0F;
            field_698_X = 0.0F;
        } else
        if(!field_720_B)
        {
            func_418_b_();
        }
        boolean flag = func_397_g_();
        boolean flag1 = func_359_G();
        if(field_697_Y)
        {
            if(flag)
            {
                motionY += 0.039999999105930328D;
            } else
            if(flag1)
            {
                motionY += 0.039999999105930328D;
            } else
            if(onGround)
            {
                func_424_C();
            }
        }
        field_700_V *= 0.98F;
        field_699_W *= 0.98F;
        field_698_X *= 0.9F;
        func_435_b(field_700_V, field_699_W);
        List list = field_615_ag.func_659_b(this, boundingBox.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                Entity entity = (Entity)list.get(i);
                if(entity.func_385_d_())
                {
                    entity.func_380_f(this);
                }
            }

        }
    }

    protected void func_424_C()
    {
        motionY = 0.41999998688697815D;
    }

    protected void func_418_b_()
    {
        field_701_U++;
        EntityPlayer entityplayer = field_615_ag.func_609_a(this, -1D);
        if(entityplayer != null)
        {
            double d = ((Entity) (entityplayer)).posX - posX;
            double d1 = ((Entity) (entityplayer)).posY - posY;
            double d2 = ((Entity) (entityplayer)).posZ - posZ;
            double d3 = d * d + d1 * d1 + d2 * d2;
            if(d3 > 16384D)
            {
                func_395_F();
            }
            if(field_701_U > 600 && field_630_aQ.nextInt(800) == 0)
            {
                if(d3 < 1024D)
                {
                    field_701_U = 0;
                } else
                {
                    func_395_F();
                }
            }
        }
        field_700_V = 0.0F;
        field_699_W = 0.0F;
        float f = 8F;
        if(field_630_aQ.nextFloat() < 0.02F)
        {
            EntityPlayer entityplayer1 = field_615_ag.func_609_a(this, f);
            if(entityplayer1 != null)
            {
                field_741_h = entityplayer1;
                field_740_i = 10 + field_630_aQ.nextInt(20);
            } else
            {
                field_698_X = (field_630_aQ.nextFloat() - 0.5F) * 20F;
            }
        }
        if(field_741_h != null)
        {
            func_426_b(field_741_h, 10F);
            if(field_740_i-- <= 0 || field_741_h.field_646_aA || field_741_h.func_387_e(this) > (double)(f * f))
            {
                field_741_h = null;
            }
        } else
        {
            if(field_630_aQ.nextFloat() < 0.05F)
            {
                field_698_X = (field_630_aQ.nextFloat() - 0.5F) * 20F;
            }
            rotationYaw += field_698_X;
            rotationPitch = field_696_Z;
        }
        boolean flag = func_397_g_();
        boolean flag1 = func_359_G();
        if(flag || flag1)
        {
            field_697_Y = field_630_aQ.nextFloat() < 0.8F;
        }
    }

    public void func_426_b(Entity entity, float f)
    {
        double d = entity.posX - posX;
        double d2 = entity.posZ - posZ;
        double d1;
        if(entity instanceof EntityLiving)
        {
            EntityLiving entityliving = (EntityLiving)entity;
            d1 = (entityliving.posY + (double)entityliving.func_373_s()) - (posY + (double)func_373_s());
        } else
        {
            d1 = (entity.boundingBox.field_1697_b + entity.boundingBox.field_1702_e) / 2D - (posY + (double)func_373_s());
        }
        double d3 = MathHelper.func_1109_a(d * d + d2 * d2);
        float f1 = (float)((Math.atan2(d2, d) * 180D) / 3.1415927410125732D) - 90F;
        float f2 = (float)((Math.atan2(d1, d3) * 180D) / 3.1415927410125732D);
        rotationPitch = func_417_b(rotationPitch, f2, f);
        rotationYaw = func_417_b(rotationYaw, f1, f);
    }

    private float func_417_b(float f, float f1, float f2)
    {
        float f3;
        for(f3 = f1 - f; f3 < -180F; f3 += 360F) { }
        for(; f3 >= 180F; f3 -= 360F) { }
        if(f3 > f2)
        {
            f3 = f2;
        }
        if(f3 < -f2)
        {
            f3 = -f2;
        }
        return f + f3;
    }

    public void func_436_D()
    {
    }

    public boolean func_433_a()
    {
        return field_615_ag.func_604_a(boundingBox) && field_615_ag.func_697_a(this, boundingBox).size() == 0 && !field_615_ag.func_662_b(boundingBox);
    }

    protected void func_369_E()
    {
        func_396_a(null, 4);
    }

    public float func_431_d(float f)
    {
        float f1 = field_718_D - field_719_C;
        if(f1 < 0.0F)
        {
            f1++;
        }
        return field_719_C + f1 * f;
    }

    public Vec3D func_427_e(float f)
    {
        if(f == 1.0F)
        {
            return Vec3D.func_1248_b(posX, posY, posZ);
        } else
        {
            double d = field_614_ah + (posX - field_614_ah) * (double)f;
            double d1 = field_613_ai + (posY - field_613_ai) * (double)f;
            double d2 = field_612_aj + (posZ - field_612_aj) * (double)f;
            return Vec3D.func_1248_b(d, d1, d2);
        }
    }

    public Vec3D func_430_f(float f)
    {
        if(f == 1.0F)
        {
            float f1 = MathHelper.func_1114_b(-rotationYaw * 0.01745329F - 3.141593F);
            float f3 = MathHelper.func_1106_a(-rotationYaw * 0.01745329F - 3.141593F);
            float f5 = -MathHelper.func_1114_b(-rotationPitch * 0.01745329F);
            float f7 = MathHelper.func_1106_a(-rotationPitch * 0.01745329F);
            return Vec3D.func_1248_b(f3 * f5, f7, f1 * f5);
        } else
        {
            float f2 = field_602_at + (rotationPitch - field_602_at) * f;
            float f4 = field_603_as + (rotationYaw - field_603_as) * f;
            float f6 = MathHelper.func_1114_b(-f4 * 0.01745329F - 3.141593F);
            float f8 = MathHelper.func_1106_a(-f4 * 0.01745329F - 3.141593F);
            float f9 = -MathHelper.func_1114_b(-f2 * 0.01745329F);
            float f10 = MathHelper.func_1106_a(-f2 * 0.01745329F);
            return Vec3D.func_1248_b(f8 * f9, f10, f6 * f9);
        }
    }

    public MovingObjectPosition func_416_a(double d, float f)
    {
        Vec3D vec3d = func_427_e(f);
        Vec3D vec3d1 = func_430_f(f);
        Vec3D vec3d2 = vec3d.func_1257_c(vec3d1.field_1776_a * d, vec3d1.field_1775_b * d, vec3d1.field_1779_c * d);
        return field_615_ag.func_645_a(vec3d, vec3d2);
    }

    public int field_739_j;
    public float field_738_k;
    public float field_737_l;
    public float field_736_m;
    public float field_735_n;
    public float field_734_o;
    protected float field_733_p;
    protected float field_732_q;
    protected float field_731_r;
    protected float field_730_s;
    protected boolean field_729_t;
    protected String field_728_u;
    protected boolean field_727_v;
    protected float field_726_w;
    protected String field_725_x;
    protected float field_724_y;
    protected int field_723_z;
    protected float field_721_A;
    public boolean field_720_B;
    public float field_719_C;
    public float field_718_D;
    public int health;
    public int field_716_F;
    private int field_748_a;
    public int hurtTime;
    public int field_714_H;
    public float field_713_I;
    public int deathTime;
    public int attackTime;
    public float field_710_L;
    public float field_709_M;
    protected boolean field_708_N;
    public int field_707_O;
    public float field_706_P;
    public float field_705_Q;
    public float field_704_R;
    public float field_703_S;
    private int field_747_b;
    private double field_746_c;
    private double field_745_d;
    private double field_744_e;
    private double field_743_f;
    private double field_742_g;
    float field_702_T;
    protected int field_701_U;
    protected float field_700_V;
    protected float field_699_W;
    protected float field_698_X;
    protected boolean field_697_Y;
    protected float field_696_Z;
    protected float field_722_aa;
    private Entity field_741_h;
    private int field_740_i;
}
