// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class PlayerController
{

    public PlayerController(Minecraft minecraft)
    {
        field_1064_b = false;
        field_1065_a = minecraft;
    }

    public void func_717_a(World world)
    {
    }

    public void func_719_a(int i, int j, int k, int l)
    {
        func_729_b(i, j, k, l);
    }

    public boolean func_729_b(int i, int j, int k, int l)
    {
        field_1065_a.field_177_h.func_1186_a(i, j, k);
        World world = field_1065_a.field_180_e;
        Block block = Block.allBlocks[world.func_600_a(i, j, k)];
        int i1 = world.func_602_e(i, j, k);
        boolean flag = world.func_690_d(i, j, k, 0);
        if(block != null && flag)
        {
            field_1065_a.field_158_A.func_336_b(block.stepSound.func_1146_a(), (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, (block.stepSound.func_1147_b() + 1.0F) / 2.0F, block.stepSound.func_1144_c() * 0.8F);
            block.func_252_b(world, i, j, k, i1);
        }
        return flag;
    }

    public void func_726_c(int i, int j, int k, int l)
    {
    }

    public void func_724_a()
    {
    }

    public void func_723_a(float f)
    {
    }

    public float func_727_b()
    {
        return 5F;
    }

    public void func_720_a(EntityPlayer entityplayer)
    {
    }

    public void func_728_c()
    {
    }

    public boolean func_725_d()
    {
        return true;
    }

    public void func_718_b(EntityPlayer entityplayer)
    {
    }

    public boolean func_722_a(EntityPlayer entityplayer, World world, ItemStack itemstack, int i, int j, int k, int l)
    {
        int i1 = world.func_600_a(i, j, k);
        if(i1 > 0 && Block.allBlocks[i1].func_250_a(world, i, j, k, entityplayer))
        {
            return true;
        }
        if(itemstack == null)
        {
            return false;
        } else
        {
            return itemstack.func_1090_a(entityplayer, world, i, j, k, l);
        }
    }

    public EntityPlayer func_721_b(World world)
    {
        return new EntityPlayerSP(field_1065_a, world, field_1065_a.field_176_i);
    }

    protected final Minecraft field_1065_a;
    public boolean field_1064_b;
}
