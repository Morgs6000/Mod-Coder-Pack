// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class EntityMinecart extends Entity
    implements IInventory
{

    public EntityMinecart(World world)
    {
        super(world);
        cargoItems = new ItemStack[36];
        field_864_a = 0;
        field_863_b = 0;
        field_862_c = 1;
        field_856_i = false;
        field_618_ad = true;
        func_371_a(0.98F, 0.7F);
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

    public EntityMinecart(World world, double d, double d1, double d2, 
            int i)
    {
        this(world);
        func_347_a(d, d1 + (double)field_645_aB, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        field_614_ah = d;
        field_613_ai = d1;
        field_612_aj = d2;
        minecartType = i;
    }

    public double func_402_h()
    {
        return (double)field_643_aD * 0.0D - 0.30000001192092896D;
    }

    public boolean func_396_a(Entity entity, int i)
    {
        field_862_c = -field_862_c;
        field_863_b = 10;
        field_864_a += i * 10;
        if(field_864_a > 40)
        {
            func_394_a(Item.minecartEmpty.swiftedIndex, 1, 0.0F);
            if(minecartType == 1)
            {
                func_394_a(Block.crate.blockID, 1, 0.0F);
            } else
            if(minecartType == 2)
            {
                func_394_a(Block.stoneOvenIdle.blockID, 1, 0.0F);
            }
            func_395_F();
        }
        return true;
    }

    public boolean func_401_c_()
    {
        return !field_646_aA;
    }

    public void func_395_F()
    {
label0:
        for(int i = 0; i < func_469_c(); i++)
        {
            ItemStack itemstack = func_468_c(i);
            if(itemstack == null)
            {
                continue;
            }
            float f = field_630_aQ.nextFloat() * 0.8F + 0.1F;
            float f1 = field_630_aQ.nextFloat() * 0.8F + 0.1F;
            float f2 = field_630_aQ.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(itemstack.stackSize <= 0)
                {
                    continue label0;
                }
                int j = field_630_aQ.nextInt(21) + 10;
                if(j > itemstack.stackSize)
                {
                    j = itemstack.stackSize;
                }
                itemstack.stackSize -= j;
                EntityItem entityitem = new EntityItem(field_615_ag, posX + (double)f, posY + (double)f1, posZ + (double)f2, new ItemStack(itemstack.itemID, j, itemstack.itemDmg));
                float f3 = 0.05F;
                entityitem.motionX = (float)field_630_aQ.nextGaussian() * f3;
                entityitem.motionY = (float)field_630_aQ.nextGaussian() * f3 + 0.2F;
                entityitem.motionZ = (float)field_630_aQ.nextGaussian() * f3;
                field_615_ag.func_674_a(entityitem);
            } while(true);
        }

        super.func_395_F();
    }

    public void func_370_e_()
    {
        if(field_615_ag.field_1026_y)
        {
            if(field_854_k > 0)
            {
                double d = posX + (field_853_l - posX) / (double)field_854_k;
                double d1 = posY + (field_852_m - posY) / (double)field_854_k;
                double d3 = posZ + (field_851_n - posZ) / (double)field_854_k;
                double d4;
                for(d4 = field_850_o - (double)rotationYaw; d4 < -180D; d4 += 360D) { }
                for(; d4 >= 180D; d4 -= 360D) { }
                rotationYaw += d4 / (double)field_854_k;
                rotationPitch += (field_849_p - (double)rotationPitch) / (double)field_854_k;
                field_854_k--;
                func_347_a(d, d1, d3);
                func_376_c(rotationYaw, rotationPitch);
            } else
            {
                func_347_a(posX, posY, posZ);
                func_376_c(rotationYaw, rotationPitch);
            }
            return;
        }
        if(field_863_b > 0)
        {
            field_863_b--;
        }
        if(field_864_a > 0)
        {
            field_864_a--;
        }
        field_614_ah = posX;
        field_613_ai = posY;
        field_612_aj = posZ;
        motionY -= 0.039999999105930328D;
        int i = MathHelper.func_1108_b(posX);
        int j = MathHelper.func_1108_b(posY);
        int k = MathHelper.func_1108_b(posZ);
        if(field_615_ag.func_600_a(i, j - 1, k) == Block.minecartTrack.blockID)
        {
            j--;
        }
        double d2 = 0.40000000000000002D;
        boolean flag = false;
        double d5 = 0.0078125D;
        if(field_615_ag.func_600_a(i, j, k) == Block.minecartTrack.blockID)
        {
            Vec3D vec3d = func_514_g(posX, posY, posZ);
            int l = field_615_ag.func_602_e(i, j, k);
            posY = j;
            if(l >= 2 && l <= 5)
            {
                posY = j + 1;
            }
            if(l == 2)
            {
                motionX -= d5;
            }
            if(l == 3)
            {
                motionX += d5;
            }
            if(l == 4)
            {
                motionZ += d5;
            }
            if(l == 5)
            {
                motionZ -= d5;
            }
            int ai[][] = field_855_j[l];
            double d8 = ai[1][0] - ai[0][0];
            double d10 = ai[1][2] - ai[0][2];
            double d11 = Math.sqrt(d8 * d8 + d10 * d10);
            double d12 = motionX * d8 + motionZ * d10;
            if(d12 < 0.0D)
            {
                d8 = -d8;
                d10 = -d10;
            }
            double d13 = Math.sqrt(motionX * motionX + motionZ * motionZ);
            motionX = (d13 * d8) / d11;
            motionZ = (d13 * d10) / d11;
            double d16 = 0.0D;
            double d17 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d18 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d19 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d20 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            d8 = d19 - d17;
            d10 = d20 - d18;
            if(d8 == 0.0D)
            {
                posX = (double)i + 0.5D;
                d16 = posZ - (double)k;
            } else
            if(d10 == 0.0D)
            {
                posZ = (double)k + 0.5D;
                d16 = posX - (double)i;
            } else
            {
                double d21 = posX - d17;
                double d23 = posZ - d18;
                double d25 = (d21 * d8 + d23 * d10) * 2D;
                d16 = d25;
            }
            posX = d17 + d8 * d16;
            posZ = d18 + d10 * d16;
            func_347_a(posX, posY + (double)field_645_aB, posZ);
            double d22 = motionX;
            double d24 = motionZ;
            if(field_617_ae != null)
            {
                d22 *= 0.75D;
                d24 *= 0.75D;
            }
            if(d22 < -d2)
            {
                d22 = -d2;
            }
            if(d22 > d2)
            {
                d22 = d2;
            }
            if(d24 < -d2)
            {
                d24 = -d2;
            }
            if(d24 > d2)
            {
                d24 = d2;
            }
            func_349_c(d22, 0.0D, d24);
            if(ai[0][1] != 0 && MathHelper.func_1108_b(posX) - i == ai[0][0] && MathHelper.func_1108_b(posZ) - k == ai[0][2])
            {
                func_347_a(posX, posY + (double)ai[0][1], posZ);
            } else
            if(ai[1][1] != 0 && MathHelper.func_1108_b(posX) - i == ai[1][0] && MathHelper.func_1108_b(posZ) - k == ai[1][2])
            {
                func_347_a(posX, posY + (double)ai[1][1], posZ);
            }
            if(field_617_ae != null)
            {
                motionX *= 0.99699997901916504D;
                motionY *= 0.0D;
                motionZ *= 0.99699997901916504D;
            } else
            {
                if(minecartType == 2)
                {
                    double d26 = MathHelper.func_1109_a(pushX * pushX + pushZ * pushZ);
                    if(d26 > 0.01D)
                    {
                        flag = true;
                        pushX /= d26;
                        pushZ /= d26;
                        double d28 = 0.040000000000000001D;
                        motionX *= 0.80000001192092896D;
                        motionY *= 0.0D;
                        motionZ *= 0.80000001192092896D;
                        motionX += pushX * d28;
                        motionZ += pushZ * d28;
                    } else
                    {
                        motionX *= 0.89999997615814209D;
                        motionY *= 0.0D;
                        motionZ *= 0.89999997615814209D;
                    }
                }
                motionX *= 0.95999997854232788D;
                motionY *= 0.0D;
                motionZ *= 0.95999997854232788D;
            }
            Vec3D vec3d1 = func_514_g(posX, posY, posZ);
            if(vec3d1 != null && vec3d != null)
            {
                double d27 = (vec3d.field_1775_b - vec3d1.field_1775_b) * 0.050000000000000003D;
                double d14 = Math.sqrt(motionX * motionX + motionZ * motionZ);
                if(d14 > 0.0D)
                {
                    motionX = (motionX / d14) * (d14 + d27);
                    motionZ = (motionZ / d14) * (d14 + d27);
                }
                func_347_a(posX, vec3d1.field_1775_b, posZ);
            }
            int j1 = MathHelper.func_1108_b(posX);
            int k1 = MathHelper.func_1108_b(posZ);
            if(j1 != i || k1 != k)
            {
                double d15 = Math.sqrt(motionX * motionX + motionZ * motionZ);
                motionX = d15 * (double)(j1 - i);
                motionZ = d15 * (double)(k1 - k);
            }
            if(minecartType == 2)
            {
                double d29 = MathHelper.func_1109_a(pushX * pushX + pushZ * pushZ);
                if(d29 > 0.01D && motionX * motionX + motionZ * motionZ > 0.001D)
                {
                    pushX /= d29;
                    pushZ /= d29;
                    if(pushX * motionX + pushZ * motionZ < 0.0D)
                    {
                        pushX = 0.0D;
                        pushZ = 0.0D;
                    } else
                    {
                        pushX = motionX;
                        pushZ = motionZ;
                    }
                }
            }
        } else
        {
            if(motionX < -d2)
            {
                motionX = -d2;
            }
            if(motionX > d2)
            {
                motionX = d2;
            }
            if(motionZ < -d2)
            {
                motionZ = -d2;
            }
            if(motionZ > d2)
            {
                motionZ = d2;
            }
            if(onGround)
            {
                motionX *= 0.5D;
                motionY *= 0.5D;
                motionZ *= 0.5D;
            }
            func_349_c(motionX, motionY, motionZ);
            if(!onGround)
            {
                motionX *= 0.94999998807907104D;
                motionY *= 0.94999998807907104D;
                motionZ *= 0.94999998807907104D;
            }
        }
        rotationPitch = 0.0F;
        double d6 = field_614_ah - posX;
        double d7 = field_612_aj - posZ;
        if(d6 * d6 + d7 * d7 > 0.001D)
        {
            rotationYaw = (float)((Math.atan2(d7, d6) * 180D) / 3.1415926535897931D);
            if(field_856_i)
            {
                rotationYaw += 180F;
            }
        }
        double d9;
        for(d9 = rotationYaw - field_603_as; d9 >= 180D; d9 -= 360D) { }
        for(; d9 < -180D; d9 += 360D) { }
        if(d9 < -170D || d9 >= 170D)
        {
            rotationYaw += 180F;
            field_856_i = !field_856_i;
        }
        func_376_c(rotationYaw, rotationPitch);
        List list = field_615_ag.func_659_b(this, boundingBox.func_1177_b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int i1 = 0; i1 < list.size(); i1++)
            {
                Entity entity = (Entity)list.get(i1);
                if(entity != field_617_ae && entity.func_385_d_() && (entity instanceof EntityMinecart))
                {
                    entity.func_380_f(this);
                }
            }

        }
        if(field_617_ae != null && field_617_ae.field_646_aA)
        {
            field_617_ae = null;
        }
        if(flag && field_630_aQ.nextInt(4) == 0)
        {
            fuel--;
            if(fuel < 0)
            {
                pushX = pushZ = 0.0D;
            }
            field_615_ag.func_694_a("largesmoke", posX, posY + 0.80000000000000004D, posZ, 0.0D, 0.0D, 0.0D);
        }
    }

    public Vec3D func_515_a(double d, double d1, double d2, double d3)
    {
        int i = MathHelper.func_1108_b(d);
        int j = MathHelper.func_1108_b(d1);
        int k = MathHelper.func_1108_b(d2);
        if(field_615_ag.func_600_a(i, j - 1, k) == Block.minecartTrack.blockID)
        {
            j--;
        }
        if(field_615_ag.func_600_a(i, j, k) == Block.minecartTrack.blockID)
        {
            int l = field_615_ag.func_602_e(i, j, k);
            d1 = j;
            if(l >= 2 && l <= 5)
            {
                d1 = j + 1;
            }
            int ai[][] = field_855_j[l];
            double d4 = ai[1][0] - ai[0][0];
            double d5 = ai[1][2] - ai[0][2];
            double d6 = Math.sqrt(d4 * d4 + d5 * d5);
            d4 /= d6;
            d5 /= d6;
            d += d4 * d3;
            d2 += d5 * d3;
            if(ai[0][1] != 0 && MathHelper.func_1108_b(d) - i == ai[0][0] && MathHelper.func_1108_b(d2) - k == ai[0][2])
            {
                d1 += ai[0][1];
            } else
            if(ai[1][1] != 0 && MathHelper.func_1108_b(d) - i == ai[1][0] && MathHelper.func_1108_b(d2) - k == ai[1][2])
            {
                d1 += ai[1][1];
            }
            return func_514_g(d, d1, d2);
        } else
        {
            return null;
        }
    }

    public Vec3D func_514_g(double d, double d1, double d2)
    {
        int i = MathHelper.func_1108_b(d);
        int j = MathHelper.func_1108_b(d1);
        int k = MathHelper.func_1108_b(d2);
        if(field_615_ag.func_600_a(i, j - 1, k) == Block.minecartTrack.blockID)
        {
            j--;
        }
        if(field_615_ag.func_600_a(i, j, k) == Block.minecartTrack.blockID)
        {
            int l = field_615_ag.func_602_e(i, j, k);
            d1 = j;
            if(l >= 2 && l <= 5)
            {
                d1 = j + 1;
            }
            int ai[][] = field_855_j[l];
            double d3 = 0.0D;
            double d4 = (double)i + 0.5D + (double)ai[0][0] * 0.5D;
            double d5 = (double)j + 0.5D + (double)ai[0][1] * 0.5D;
            double d6 = (double)k + 0.5D + (double)ai[0][2] * 0.5D;
            double d7 = (double)i + 0.5D + (double)ai[1][0] * 0.5D;
            double d8 = (double)j + 0.5D + (double)ai[1][1] * 0.5D;
            double d9 = (double)k + 0.5D + (double)ai[1][2] * 0.5D;
            double d10 = d7 - d4;
            double d11 = (d8 - d5) * 2D;
            double d12 = d9 - d6;
            if(d10 == 0.0D)
            {
                d = (double)i + 0.5D;
                d3 = d2 - (double)k;
            } else
            if(d12 == 0.0D)
            {
                d2 = (double)k + 0.5D;
                d3 = d - (double)i;
            } else
            {
                double d13 = d - d4;
                double d14 = d2 - d6;
                double d15 = (d13 * d10 + d14 * d12) * 2D;
                d3 = d15;
            }
            d = d4 + d10 * d3;
            d1 = d5 + d11 * d3;
            d2 = d6 + d12 * d3;
            if(d11 < 0.0D)
            {
                d1++;
            }
            if(d11 > 0.0D)
            {
                d1 += 0.5D;
            }
            return Vec3D.func_1248_b(d, d1, d2);
        } else
        {
            return null;
        }
    }

    protected void func_352_a(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_758_a("Type", minecartType);
        if(minecartType == 2)
        {
            nbttagcompound.func_765_a("PushX", pushX);
            nbttagcompound.func_765_a("PushZ", pushZ);
            nbttagcompound.func_749_a("Fuel", (short)fuel);
        } else
        if(minecartType == 1)
        {
            NBTTagList nbttaglist = new NBTTagList();
            for(int i = 0; i < cargoItems.length; i++)
            {
                if(cargoItems[i] != null)
                {
                    NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                    nbttagcompound1.func_761_a("Slot", (byte)i);
                    cargoItems[i].func_1086_a(nbttagcompound1);
                    nbttaglist.func_742_a(nbttagcompound1);
                }
            }

            nbttagcompound.func_762_a("Items", nbttaglist);
        }
    }

    protected void func_357_b(NBTTagCompound nbttagcompound)
    {
        minecartType = nbttagcompound.func_756_e("Type");
        if(minecartType == 2)
        {
            pushX = nbttagcompound.func_757_h("PushX");
            pushZ = nbttagcompound.func_757_h("PushZ");
            fuel = nbttagcompound.func_745_d("Fuel");
        } else
        if(minecartType == 1)
        {
            NBTTagList nbttaglist = nbttagcompound.func_753_l("Items");
            cargoItems = new ItemStack[func_469_c()];
            for(int i = 0; i < nbttaglist.func_740_c(); i++)
            {
                NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.func_741_a(i);
                int j = nbttagcompound1.func_746_c("Slot") & 0xff;
                if(j >= 0 && j < cargoItems.length)
                {
                    cargoItems[j] = new ItemStack(nbttagcompound1);
                }
            }

        }
    }

    public float func_392_h_()
    {
        return 0.0F;
    }

    public void func_380_f(Entity entity)
    {
        if(entity == field_617_ae)
        {
            return;
        }
        if((entity instanceof EntityLiving) && !(entity instanceof EntityPlayer) && minecartType == 0 && motionX * motionX + motionZ * motionZ > 0.01D && field_617_ae == null && entity.field_616_af == null)
        {
            entity.func_386_g(this);
        }
        double d = entity.posX - posX;
        double d1 = entity.posZ - posZ;
        double d2 = d * d + d1 * d1;
        if(d2 >= 9.9999997473787516E-005D)
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
            d *= 0.10000000149011612D;
            d1 *= 0.10000000149011612D;
            d *= 1.0F - field_632_aO;
            d1 *= 1.0F - field_632_aO;
            d *= 0.5D;
            d1 *= 0.5D;
            if(entity instanceof EntityMinecart)
            {
                double d4 = entity.motionX + motionX;
                double d5 = entity.motionZ + motionZ;
                if(((EntityMinecart)entity).minecartType == 2 && minecartType != 2)
                {
                    motionX *= 0.20000000298023224D;
                    motionZ *= 0.20000000298023224D;
                    func_348_f(entity.motionX - d, 0.0D, entity.motionZ - d1);
                    entity.motionX *= 0.69999998807907104D;
                    entity.motionZ *= 0.69999998807907104D;
                } else
                if(((EntityMinecart)entity).minecartType != 2 && minecartType == 2)
                {
                    entity.motionX *= 0.20000000298023224D;
                    entity.motionZ *= 0.20000000298023224D;
                    entity.func_348_f(motionX + d, 0.0D, motionZ + d1);
                    motionX *= 0.69999998807907104D;
                    motionZ *= 0.69999998807907104D;
                } else
                {
                    d4 /= 2D;
                    d5 /= 2D;
                    motionX *= 0.20000000298023224D;
                    motionZ *= 0.20000000298023224D;
                    func_348_f(d4 - d, 0.0D, d5 - d1);
                    entity.motionX *= 0.20000000298023224D;
                    entity.motionZ *= 0.20000000298023224D;
                    entity.func_348_f(d4 + d, 0.0D, d5 + d1);
                }
            } else
            {
                func_348_f(-d, 0.0D, -d1);
                entity.func_348_f(d / 4D, 0.0D, d1 / 4D);
            }
        }
    }

    public int func_469_c()
    {
        return 27;
    }

    public ItemStack func_468_c(int i)
    {
        return cargoItems[i];
    }

    public ItemStack func_473_a(int i, int j)
    {
        if(cargoItems[i] != null)
        {
            if(cargoItems[i].stackSize <= j)
            {
                ItemStack itemstack = cargoItems[i];
                cargoItems[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = cargoItems[i].func_1085_a(j);
            if(cargoItems[i].stackSize == 0)
            {
                cargoItems[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ItemStack itemstack)
    {
        cargoItems[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > func_470_e())
        {
            itemstack.stackSize = func_470_e();
        }
    }

    public String func_471_d()
    {
        return "Minecart";
    }

    public int func_470_e()
    {
        return 64;
    }

    public void func_474_j_()
    {
    }

    public boolean func_353_a(EntityPlayer entityplayer)
    {
        if(minecartType == 0)
        {
            entityplayer.func_386_g(this);
        } else
        if(minecartType == 1)
        {
            entityplayer.func_452_a(this);
        } else
        if(minecartType == 2)
        {
            ItemStack itemstack = entityplayer.field_778_b.func_494_a();
            if(itemstack != null && itemstack.itemID == Item.coal.swiftedIndex)
            {
                if(--itemstack.stackSize == 0)
                {
                    entityplayer.field_778_b.func_472_a(entityplayer.field_778_b.currentItem, null);
                }
                fuel += 1200;
            }
            pushX = posX - entityplayer.posX;
            pushZ = posZ - entityplayer.posZ;
        }
        return true;
    }

    public void func_378_a(double d, double d1, double d2, float f, 
            float f1, int i)
    {
        field_853_l = d;
        field_852_m = d1;
        field_851_n = d2;
        field_850_o = f;
        field_849_p = f1;
        field_854_k = i;
    }

    private ItemStack cargoItems[];
    public int field_864_a;
    public int field_863_b;
    public int field_862_c;
    private boolean field_856_i;
    public int minecartType;
    public int fuel;
    public double pushX;
    public double pushZ;
    private static final int field_855_j[][][] = {
        {
            {
                0, 0, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, -1, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, -1, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                0, -1, 1
            }
        }, {
            {
                0, -1, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                0, 0, 1
            }, {
                1, 0, 0
            }
        }, {
            {
                0, 0, 1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                1, 0, 0
            }
        }
    };
    private int field_854_k;
    private double field_853_l;
    private double field_852_m;
    private double field_851_n;
    private double field_850_o;
    private double field_849_p;

}
