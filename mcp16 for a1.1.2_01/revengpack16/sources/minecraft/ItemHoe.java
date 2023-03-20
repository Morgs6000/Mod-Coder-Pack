// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class ItemHoe extends Item
{

    public ItemHoe(int i, int j)
    {
        super(i);
        maxStackSize = 1;
        maxDmg = 32 << j;
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        int i1 = world.func_600_a(i, j, k);
        Material material = world.func_599_f(i, j + 1, k);
        if(!material.func_878_a() && i1 == Block.grass.blockID || i1 == Block.dirt.blockID)
        {
            Block block = Block.tilledField;
            world.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, block.stepSound.func_1145_d(), (block.stepSound.func_1147_b() + 1.0F) / 2.0F, block.stepSound.func_1144_c() * 0.8F);
            world.func_690_d(i, j, k, block.blockID);
            itemstack.func_1101_b(1);
            if(world.field_1037_n.nextInt(8) == 0 && i1 == Block.grass.blockID)
            {
                int j1 = 1;
                for(int k1 = 0; k1 < j1; k1++)
                {
                    float f = 0.7F;
                    float f1 = world.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                    float f2 = 1.2F;
                    float f3 = world.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                    EntityItem entityitem = new EntityItem(world, (float)i + f1, (float)j + f2, (float)k + f3, new ItemStack(Item.seeds));
                    entityitem.field_805_c = 10;
                    world.func_674_a(entityitem);
                }

            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_194_a()
    {
        return true;
    }
}
