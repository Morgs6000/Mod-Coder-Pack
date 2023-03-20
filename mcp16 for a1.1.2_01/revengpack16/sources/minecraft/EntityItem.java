// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class EntityItem extends Entity
{

    public EntityItem(World world, double d, double d1, double d2, 
            ItemStack itemstack)
    {
        super(world);
        age = 0;
        health = 5;
        field_804_d = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_371_a(0.25F, 0.25F);
        field_645_aB = field_643_aD / 2.0F;
        func_347_a(d, d1, d2);
        item = itemstack;
        rotationYaw = (float)(Math.random() * 360D);
        motionX = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        motionY = 0.20000000298023224D;
        motionZ = (float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        field_640_aG = false;
    }

    public EntityItem(World world)
    {
        super(world);
        age = 0;
        health = 5;
        field_804_d = (float)(Math.random() * 3.1415926535897931D * 2D);
        func_371_a(0.25F, 0.25F);
        field_645_aB = field_643_aD / 2.0F;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        if(field_805_c > 0)
        {
            field_805_c--;
        }
        field_614_ah = posX;
        field_613_ai = posY;
        field_612_aj = posZ;
        motionY -= 0.039999999105930328D;
        if(field_615_ag.func_599_f(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(posY), MathHelper.func_1108_b(posZ)) == Material.lava)
        {
            motionY = 0.20000000298023224D;
            motionX = (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F;
            motionZ = (field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.2F;
            field_615_ag.func_623_a(this, "random.fizz", 0.4F, 2.0F + field_630_aQ.nextFloat() * 0.4F);
        }
        func_466_g(posX, posY, posZ);
        func_397_g_();
        func_349_c(motionX, motionY, motionZ);
        float f = 0.98F;
        if(onGround)
        {
            f = 0.5880001F;
            int i = field_615_ag.func_600_a(MathHelper.func_1108_b(posX), MathHelper.func_1108_b(boundingBox.field_1697_b) - 1, MathHelper.func_1108_b(posZ));
            if(i > 0)
            {
                f = Block.allBlocks[i].field_355_bo * 0.98F;
            }
        }
        motionX *= f;
        motionY *= 0.98000001907348633D;
        motionZ *= f;
        if(onGround)
        {
            motionY *= -0.5D;
        }
        field_803_e++;
        age++;
        if(age >= 6000)
        {
            func_395_F();
        }
    }

    public boolean func_397_g_()
    {
        return field_615_ag.func_682_a(boundingBox, Material.water, this);
    }

    private boolean func_466_g(double d, double d1, double d2)
    {
        int i = MathHelper.func_1108_b(d);
        int j = MathHelper.func_1108_b(d1);
        int k = MathHelper.func_1108_b(d2);
        double d3 = d - (double)i;
        double d4 = d1 - (double)j;
        double d5 = d2 - (double)k;
        if(Block.field_343_p[field_615_ag.func_600_a(i, j, k)])
        {
            boolean flag = !Block.field_343_p[field_615_ag.func_600_a(i - 1, j, k)];
            boolean flag1 = !Block.field_343_p[field_615_ag.func_600_a(i + 1, j, k)];
            boolean flag2 = !Block.field_343_p[field_615_ag.func_600_a(i, j - 1, k)];
            boolean flag3 = !Block.field_343_p[field_615_ag.func_600_a(i, j + 1, k)];
            boolean flag4 = !Block.field_343_p[field_615_ag.func_600_a(i, j, k - 1)];
            boolean flag5 = !Block.field_343_p[field_615_ag.func_600_a(i, j, k + 1)];
            byte byte0 = -1;
            double d6 = 9999D;
            if(flag && d3 < d6)
            {
                d6 = d3;
                byte0 = 0;
            }
            if(flag1 && 1.0D - d3 < d6)
            {
                d6 = 1.0D - d3;
                byte0 = 1;
            }
            if(flag2 && d4 < d6)
            {
                d6 = d4;
                byte0 = 2;
            }
            if(flag3 && 1.0D - d4 < d6)
            {
                d6 = 1.0D - d4;
                byte0 = 3;
            }
            if(flag4 && d5 < d6)
            {
                d6 = d5;
                byte0 = 4;
            }
            if(flag5 && 1.0D - d5 < d6)
            {
                double d7 = 1.0D - d5;
                byte0 = 5;
            }
            float f = field_630_aQ.nextFloat() * 0.2F + 0.1F;
            if(byte0 == 0)
            {
                motionX = -f;
            }
            if(byte0 == 1)
            {
                motionX = f;
            }
            if(byte0 == 2)
            {
                motionY = -f;
            }
            if(byte0 == 3)
            {
                motionY = f;
            }
            if(byte0 == 4)
            {
                motionZ = -f;
            }
            if(byte0 == 5)
            {
                motionZ = f;
            }
        }
        return false;
    }

    protected void func_355_a(int i)
    {
        func_396_a(null, i);
    }

    public boolean func_396_a(Entity entity, int i)
    {
        health -= i;
        if(health <= 0)
        {
            func_395_F();
        }
        return false;
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_749_a("Health", (byte)health);
        nbttagcompound.func_749_a("Age", (short)age);
        nbttagcompound.func_763_a("Item", item.func_1086_a(new NBTTagCompound()));
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        health = nbttagcompound.func_745_d("Health") & 0xff;
        age = nbttagcompound.func_745_d("Age");
        NBTTagCompound nbttagcompound1 = nbttagcompound.func_743_k("Item");
        item = new ItemStack(nbttagcompound1);
    }

    public void func_362_b(EntityPlayer entityplayer)
    {
        if(field_615_ag.field_1026_y)
        {
            return;
        }
        int i = item.stackSize;
        if(field_805_c == 0 && entityplayer.field_778_b.func_504_a(item))
        {
            field_615_ag.func_623_a(this, "random.pop", 0.2F, ((field_630_aQ.nextFloat() - field_630_aQ.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            entityplayer.func_443_a_(this, i);
            func_395_F();
        }
    }

    public ItemStack item;
    private int field_803_e;
    public int age;
    public int field_805_c;
    private int health;
    public float field_804_d;
}
