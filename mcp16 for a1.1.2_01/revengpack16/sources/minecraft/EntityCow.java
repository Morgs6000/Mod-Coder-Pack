// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class EntityCow extends EntityAnimals
{

    public EntityCow(World world)
    {
        super(world);
        field_761_a = false;
        field_728_u = "/mob/cow.png";
        func_371_a(0.9F, 1.3F);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
    }

    protected String func_423_c()
    {
        return "mob.cow";
    }

    protected String func_414_d()
    {
        return "mob.cowhurt";
    }

    protected String func_428_e()
    {
        return "mob.cowhurt";
    }

    protected float func_413_f()
    {
        return 0.4F;
    }

    protected int func_422_g()
    {
        return Item.leather.swiftedIndex;
    }

    public boolean func_353_a(EntityPlayer entityplayer)
    {
        ItemStack itemstack = entityplayer.field_778_b.func_494_a();
        if(itemstack != null && itemstack.itemID == Item.bucketEmpty.swiftedIndex)
        {
            entityplayer.field_778_b.func_472_a(entityplayer.field_778_b.currentItem, new ItemStack(Item.bucketMilk));
            return true;
        } else
        {
            return false;
        }
    }

    public boolean field_761_a;
}
