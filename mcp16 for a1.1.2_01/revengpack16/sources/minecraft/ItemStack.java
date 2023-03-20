// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public final class ItemStack
{

    public ItemStack(Block block)
    {
        this(block, 1);
    }

    public ItemStack(Block block, int i)
    {
        this(block.blockID, i);
    }

    public ItemStack(Item item)
    {
        this(item, 1);
    }

    public ItemStack(Item item, int i)
    {
        this(item.swiftedIndex, i);
    }

    public ItemStack(int i)
    {
        this(i, 1);
    }

    public ItemStack(int i, int j)
    {
        stackSize = 0;
        itemID = i;
        stackSize = j;
    }

    public ItemStack(int i, int j, int k)
    {
        stackSize = 0;
        itemID = i;
        stackSize = j;
        itemDmg = k;
    }

    public ItemStack(NBTTagCompound nbttagcompound)
    {
        stackSize = 0;
        func_1096_b(nbttagcompound);
    }

    public ItemStack func_1085_a(int i)
    {
        stackSize -= i;
        return new ItemStack(itemID, i, itemDmg);
    }

    public Item func_1091_a()
    {
        return Item.itemsList[itemID];
    }

    public int func_1088_b()
    {
        return func_1091_a().func_196_a(this);
    }

    public boolean func_1090_a(EntityPlayer entityplayer, World world, int i, int j, int k, int l)
    {
        return func_1091_a().func_192_a(this, entityplayer, world, i, j, k, l);
    }

    public float func_1098_a(Block block)
    {
        return func_1091_a().func_204_a(this, block);
    }

    public ItemStack func_1093_a(World world, EntityPlayer entityplayer)
    {
        return func_1091_a().func_193_a(this, world, entityplayer);
    }

    public NBTTagCompound func_1086_a(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.func_749_a("id", (short)itemID);
        nbttagcompound.func_761_a("Count", (byte)stackSize);
        nbttagcompound.func_749_a("Damage", (short)itemDmg);
        return nbttagcompound;
    }

    public void func_1096_b(NBTTagCompound nbttagcompound)
    {
        itemID = nbttagcompound.func_745_d("id");
        stackSize = nbttagcompound.func_746_c("Count");
        itemDmg = nbttagcompound.func_745_d("Damage");
    }

    public int func_1089_c()
    {
        return func_1091_a().func_200_b();
    }

    public int func_1094_d()
    {
        return Item.itemsList[itemID].func_197_c();
    }

    public void func_1101_b(int i)
    {
        itemDmg += i;
        if(itemDmg > func_1094_d())
        {
            stackSize--;
            if(stackSize < 0)
            {
                stackSize = 0;
            }
            itemDmg = 0;
        }
    }

    public void func_1092_a(EntityLiving entityliving)
    {
        Item.itemsList[itemID].func_202_a(this, entityliving);
    }

    public void func_1087_a(int i, int j, int k, int l)
    {
        Item.itemsList[itemID].func_203_a(this, i, j, k, l);
    }

    public int func_1095_a(Entity entity)
    {
        return Item.itemsList[itemID].func_198_a(entity);
    }

    public boolean func_1099_b(Block block)
    {
        return Item.itemsList[itemID].func_195_a(block);
    }

    public void func_1097_a(EntityPlayer entityplayer)
    {
    }

    public void func_1100_b(EntityLiving entityliving)
    {
        Item.itemsList[itemID].func_201_b(this, entityliving);
    }

    public ItemStack func_1102_e()
    {
        return new ItemStack(itemID, stackSize, itemDmg);
    }

    public int stackSize;
    public int animationsToGo;
    public int itemID;
    public int itemDmg;
}
