// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ItemBow extends Item
{

    public ItemBow(int i)
    {
        super(i);
        maxStackSize = 1;
    }

    public ItemStack func_193_a(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        if(entityplayer.field_778_b.func_510_b(Item.arrow.swiftedIndex))
        {
            world.func_623_a(entityplayer, "random.bow", 1.0F, 1.0F / (rand.nextFloat() * 0.4F + 0.8F));
            world.func_674_a(new EntityArrow(world, entityplayer));
        }
        return itemstack;
    }
}
