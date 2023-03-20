// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemBoat extends Item
{

    public ItemBoat(int i)
    {
        super(i);
        maxStackSize = 1;
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
        MovingObjectPosition movingobjectposition = world.func_642_a(vec3d, vec3d1, true);
        if(movingobjectposition == null)
        {
            return itemstack;
        }
        if(movingobjectposition.field_1167_a == 0)
        {
            int i = movingobjectposition.field_1166_b;
            int j = movingobjectposition.field_1172_c;
            int k = movingobjectposition.field_1171_d;
            world.func_674_a(new EntityBoat(world, (float)i + 0.5F, (float)j + 1.5F, (float)k + 0.5F));
            itemstack.stackSize--;
        }
        return itemstack;
    }
}
