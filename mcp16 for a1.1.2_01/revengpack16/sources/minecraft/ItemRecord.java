// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemRecord extends Item
{

    protected ItemRecord(int i, String s)
    {
        super(i);
        field_316_a = s;
        maxStackSize = 1;
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(world.func_600_a(i, j, k) == Block.jukebox.blockID && world.func_602_e(i, j, k) == 0)
        {
            world.func_691_b(i, j, k, (swiftedIndex - Item.record13.swiftedIndex) + 1);
            world.func_670_a(field_316_a, i, j, k);
            itemstack.stackSize--;
            return true;
        } else
        {
            return false;
        }
    }

    private String field_316_a;
}
