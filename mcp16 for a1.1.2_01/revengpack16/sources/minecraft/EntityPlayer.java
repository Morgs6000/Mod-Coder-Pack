// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class EntityPlayer extends EntityLiving
{

    public EntityPlayer(World world)
    {
        super(world);
        field_778_b = new InventoryPlayer(this);
        field_777_c = 0;
        field_776_d = 0;
        field_773_g = false;
        field_772_h = 0;
        field_779_a = 0;
        field_645_aB = 1.62F;
        func_365_c((double)world.spawnX + 0.5D, world.spawnY + 1, (double)world.spawnZ + 0.5D, 0.0F, 0.0F);
        health = 20;
        field_725_x = "humanoid";
        field_726_w = 180F;
        field_628_aS = 20;
        field_728_u = "/char.png";
    }

    public void func_350_p()
    {
        super.func_350_p();
        field_775_e = field_774_f;
        field_774_f = 0.0F;
    }

    public void func_374_q()
    {
        field_645_aB = 1.62F;
        func_371_a(0.6F, 1.8F);
        super.func_374_q();
        health = 20;
        deathTime = 0;
    }

    protected void func_418_b_()
    {
        if(field_773_g)
        {
            field_772_h++;
            if(field_772_h == 8)
            {
                field_772_h = 0;
                field_773_g = false;
            }
        } else
        {
            field_772_h = 0;
        }
        field_718_D = (float)field_772_h / 8F;
    }

    public void func_425_j()
    {
        if(field_615_ag.field_1039_l == 0 && health < 20 && (field_629_aR % 20) * 4 == 0)
        {
            func_432_b(1);
        }
        field_778_b.func_511_b();
        field_775_e = field_774_f;
        super.func_425_j();
        float f = MathHelper.func_1109_a(motionX * motionX + motionZ * motionZ);
        float f1 = (float)Math.atan(-motionY * 0.20000000298023224D) * 15F;
        if(f > 0.1F)
        {
            f = 0.1F;
        }
        if(!onGround || health <= 0)
        {
            f = 0.0F;
        }
        if(onGround || health <= 0)
        {
            f1 = 0.0F;
        }
        field_774_f += (f - field_774_f) * 0.4F;
        field_709_M += (f1 - field_709_M) * 0.8F;
        if(health > 0)
        {
            List list = field_615_ag.func_659_b(this, boundingBox.func_1177_b(1.0D, 0.0D, 1.0D));
            if(list != null)
            {
                for(int i = 0; i < list.size(); i++)
                {
                    func_451_h((Entity)list.get(i));
                }

            }
        }
    }

    private void func_451_h(Entity entity)
    {
        entity.func_362_b(this);
    }

    public int func_447_r()
    {
        return field_776_d;
    }

    public void func_419_b(Entity entity)
    {
        func_371_a(0.2F, 0.2F);
        func_347_a(posX, posY, posZ);
        motionY = 0.10000000149011612D;
        if(field_771_i.equals("Notch"))
        {
            func_444_a(new ItemStack(Item.appleRed, 1), true);
        }
        field_778_b.func_503_g();
        if(entity != null)
        {
            motionX = -MathHelper.func_1114_b(((field_713_I + rotationYaw) * 3.141593F) / 180F) * 0.1F;
            motionZ = -MathHelper.func_1106_a(((field_713_I + rotationYaw) * 3.141593F) / 180F) * 0.1F;
        } else
        {
            motionX = motionZ = 0.0D;
        }
        field_645_aB = 0.1F;
    }

    public void func_364_b(Entity entity, int i)
    {
        field_776_d += i;
    }

    public void func_449_a(ItemStack itemstack)
    {
        func_444_a(itemstack, false);
    }

    public void func_444_a(ItemStack itemstack, boolean flag)
    {
        if(itemstack == null)
        {
            return;
        }
        EntityItem entityitem = new EntityItem(field_615_ag, posX, (posY - 0.30000001192092896D) + (double)func_373_s(), posZ, itemstack);
        entityitem.field_805_c = 40;
        float f = 0.1F;
        if(flag)
        {
            float f2 = field_630_aQ.nextFloat() * 0.5F;
            float f4 = field_630_aQ.nextFloat() * 3.141593F * 2.0F;
            entityitem.motionX = -MathHelper.func_1106_a(f4) * f2;
            entityitem.motionZ = MathHelper.func_1114_b(f4) * f2;
            entityitem.motionY = 0.20000000298023224D;
        } else
        {
            float f1 = 0.3F;
            entityitem.motionX = -MathHelper.func_1106_a((rotationYaw / 180F) * 3.141593F) * MathHelper.func_1114_b((rotationPitch / 180F) * 3.141593F) * f1;
            entityitem.motionZ = MathHelper.func_1114_b((rotationYaw / 180F) * 3.141593F) * MathHelper.func_1114_b((rotationPitch / 180F) * 3.141593F) * f1;
            entityitem.motionY = -MathHelper.func_1106_a((rotationPitch / 180F) * 3.141593F) * f1 + 0.1F;
            f1 = 0.02F;
            float f3 = field_630_aQ.nextFloat() * 3.141593F * 2.0F;
            f1 *= field_630_aQ.nextFloat();
            entityitem.motionX += Math.cos(f3) * (double)f1;
            entityitem.motionY += (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.1F;
            entityitem.motionZ += Math.sin(f3) * (double)f1;
        }
        func_446_a(entityitem);
    }

    protected void func_446_a(EntityItem entityitem)
    {
        field_615_ag.func_674_a(entityitem);
    }

    public float func_450_a(Block block)
    {
        float f = field_778_b.func_508_a(block);
        if(func_393_a(Material.water))
        {
            f /= 5F;
        }
        if(!onGround)
        {
            f /= 5F;
        }
        return f;
    }

    public boolean func_454_b(Block block)
    {
        return field_778_b.func_509_b(block);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.func_753_l("Inventory");
        field_778_b.func_513_b(nbttaglist);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
        nbttagcompound.func_762_a("Inventory", field_778_b.func_493_a(new NBTTagList()));
    }

    public void func_452_a(IInventory iinventory)
    {
    }

    public void func_445_l()
    {
    }

    public void func_443_a_(Entity entity, int i)
    {
    }

    protected float func_373_s()
    {
        return 0.12F;
    }

    public boolean func_396_a(Entity entity, int i)
    {
        field_701_U = 0;
        if(health <= 0)
        {
            return false;
        }
        if((float)field_624_aW > (float)field_739_j / 2.0F)
        {
            return false;
        }
        if((entity instanceof EntityMobs) || (entity instanceof EntityArrow))
        {
            if(field_615_ag.field_1039_l == 0)
            {
                i = 0;
            }
            if(field_615_ag.field_1039_l == 1)
            {
                i = i / 3 + 1;
            }
            if(field_615_ag.field_1039_l == 3)
            {
                i = (i * 3) / 2;
            }
        }
        int j = 25 - field_778_b.func_506_f();
        int k = i * j + field_779_a;
        field_778_b.func_507_e(i);
        i = k / 25;
        field_779_a = k % 25;
        if(i == 0)
        {
            return false;
        } else
        {
            return super.func_396_a(entity, i);
        }
    }

    public void func_453_a(TileEntityFurnace tileentityfurnace)
    {
    }

    public void func_455_a(TileEntitySign tileentitysign)
    {
    }

    public void func_456_a_(Entity entity)
    {
    }

    public ItemStack func_442_t()
    {
        return field_778_b.func_494_a();
    }

    public void func_448_u()
    {
        field_778_b.func_472_a(field_778_b.currentItem, null);
    }

    public double func_388_v()
    {
        return (double)(field_645_aB - 0.5F);
    }

    public void func_457_w()
    {
        field_772_h = -1;
        field_773_g = true;
    }

    public InventoryPlayer field_778_b;
    public byte field_777_c;
    public int field_776_d;
    public float field_775_e;
    public float field_774_f;
    public boolean field_773_g;
    public int field_772_h;
    public String field_771_i;
    private int field_779_a;
}
