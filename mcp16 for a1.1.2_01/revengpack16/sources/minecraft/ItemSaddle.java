// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemSaddle extends Item
{

    public ItemSaddle(int i)
    {
        super(i);
        maxStackSize = 1;
        maxDmg = 64;
    }

    public void func_201_b(ItemStack itemstack, EntityLiving entityliving)
    {
        if(entityliving instanceof EntityPig)
        {
            EntityPig entitypig = (EntityPig)entityliving;
            if(!entitypig.field_759_a)
            {
                entitypig.field_759_a = true;
                itemstack.stackSize--;
            }
        }
    }

    public void func_202_a(ItemStack itemstack, EntityLiving entityliving)
    {
        func_201_b(itemstack, entityliving);
    }
}
