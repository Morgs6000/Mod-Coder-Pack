// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemBlock extends Item
{

    public ItemBlock(int i)
    {
        super(i);
        field_330_a = i + 256;
        func_205_a(Block.allBlocks[i + 256].func_218_a(2));
    }

    public boolean func_192_a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        if(world.func_600_a(i, j, k) == Block.snow.blockID)
        {
            l = 0;
        } else
        {
            if(l == 0)
            {
                j--;
            }
            if(l == 1)
            {
                j++;
            }
            if(l == 2)
            {
                k--;
            }
            if(l == 3)
            {
                k++;
            }
            if(l == 4)
            {
                i--;
            }
            if(l == 5)
            {
                i++;
            }
        }
        if(itemstack.stackSize == 0)
        {
            return false;
        }
        if(world.func_695_a(field_330_a, i, j, k, false))
        {
            Block block = Block.allBlocks[field_330_a];
            if(world.func_690_d(i, j, k, field_330_a))
            {
                Block.allBlocks[field_330_a].func_258_d(world, i, j, k, l);
                world.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, block.stepSound.func_1145_d(), (block.stepSound.func_1147_b() + 1.0F) / 2.0F, block.stepSound.func_1144_c() * 0.8F);
                itemstack.stackSize--;
            }
        }
        return true;
    }

    private int field_330_a;
}
