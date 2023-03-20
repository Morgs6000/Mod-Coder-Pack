// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemMinecart extends Item
{

    public ItemMinecart(int i, int j)
    {
        super(i);
        maxStackSize = 1;
        field_317_a = j;
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        int i1 = world.func_600_a(i, j, k);
        if(i1 == Block.minecartTrack.blockID)
        {
            world.func_674_a(new EntityMinecart(world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, field_317_a));
            itemstack.stackSize--;
            return true;
        } else
        {
            return false;
        }
    }

    public int field_317_a;
}
