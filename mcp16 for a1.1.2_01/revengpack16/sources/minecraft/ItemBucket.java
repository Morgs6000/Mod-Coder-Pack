// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemBucket extends Item
{

    public ItemBucket(int i, int j)
    {
        super(i);
        maxStackSize = 1;
        maxDmg = 64;
        field_331_a = j;
    }

    public ItemStack func_193_a(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        float f = 1.0F;
        float f1 = entityplayer.field_602_at + (entityplayer.rotationPitch - entityplayer.field_602_at) * f;
        float f2 = entityplayer.field_603_as + (entityplayer.rotationYaw - entityplayer.field_603_as) * f;
        double d = entityplayer.field_614_ah + (entityplayer.posX - entityplayer.field_614_ah) * (double)f;
        double d1 = entityplayer.field_613_ai + (entityplayer.posY - entityplayer.field_613_ai) * (double)f;
        double d2 = entityplayer.field_612_aj + (entityplayer.posZ - entityplayer.field_612_aj) * (double)f;
        Vec3D vec3d = Vec3D.func_1248_b(d, d1, d2);
        float f3 = MathHelper.func_1114_b(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.func_1106_a(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.func_1114_b(-f1 * 0.01745329F);
        float f6 = MathHelper.func_1106_a(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f8 = f6;
        float f9 = f3 * f5;
        double d3 = 5D;
        Vec3D vec3d1 = vec3d.func_1257_c((double)f7 * d3, (double)f8 * d3, (double)f9 * d3);
        MovingObjectPosition movingobjectposition = world.func_642_a(vec3d, vec3d1, field_331_a == 0);
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.field_1167_a == 0)
        {
            int i = movingobjectposition.field_1166_b;
            int j = movingobjectposition.field_1172_c;
            int k = movingobjectposition.field_1171_d;
            if(field_331_a == 0)
            {
                if(world.func_599_f(i, j, k) == Material.water && world.func_602_e(i, j, k) == 0)
                {
                    world.func_690_d(i, j, k, 0);
                    return new ItemStack(Item.bucketWater);
                }
                if(world.func_599_f(i, j, k) == Material.lava && world.func_602_e(i, j, k) == 0)
                {
                    world.func_690_d(i, j, k, 0);
                    return new ItemStack(Item.bucketLava);
                }
            } else
            {
                if(field_331_a < 0)
                {
                    return new ItemStack(Item.bucketEmpty);
                }
                if(movingobjectposition.field_1170_e == 0)
                {
                    j--;
                }
                if(movingobjectposition.field_1170_e == 1)
                {
                    j++;
                }
                if(movingobjectposition.field_1170_e == 2)
                {
                    k--;
                }
                if(movingobjectposition.field_1170_e == 3)
                {
                    k++;
                }
                if(movingobjectposition.field_1170_e == 4)
                {
                    i--;
                }
                if(movingobjectposition.field_1170_e == 5)
                {
                    i++;
                }
                if(world.func_600_a(i, j, k) == 0 || !world.func_599_f(i, j, k).func_878_a())
                {
                    world.func_688_b(i, j, k, field_331_a, 0);
                    return new ItemStack(Item.bucketEmpty);
                }
            }
        } else
        if(field_331_a == 0 && (movingobjectposition.field_1168_g instanceof EntityCow))
        {
            return new ItemStack(Item.bucketMilk);
        }
        return itemstack;
    }

    private int field_331_a;
}
