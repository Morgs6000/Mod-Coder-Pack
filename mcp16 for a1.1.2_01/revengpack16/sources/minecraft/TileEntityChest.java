// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class TileEntityChest extends TileEntity
    implements IInventory
{

    public TileEntityChest()
    {
        field_827_a = new ItemStack[36];
    }

    public int func_469_c()
    {
        return 27;
    }

    public ItemStack func_468_c(int i)
    {
        return field_827_a[i];
    }

    public ItemStack func_473_a(int i, int j)
    {
        if(field_827_a[i] != null)
        {
            if(field_827_a[i].stackSize <= j)
            {
                ItemStack itemstack = field_827_a[i];
                field_827_a[i] = null;
                func_474_j_();
                return itemstack;
            }
            ItemStack itemstack1 = field_827_a[i].func_1085_a(j);
            if(field_827_a[i].stackSize == 0)
            {
                field_827_a[i] = null;
            }
            func_474_j_();
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ItemStack itemstack)
    {
        field_827_a[i] = itemstack;
        if(itemstack != null && itemstack.stackSize > func_470_e())
        {
            itemstack.stackSize = func_470_e();
        }
        func_474_j_();
    }

    public String func_471_d()
    {
        return "Chest";
    }

    public void func_482_a(NBTTagCompound nbttagcompound)
    {
        super.func_482_a(nbttagcompound);
        NBTTagList nbttaglist = nbttagcompound.func_753_l("Items");
        field_827_a = new ItemStack[func_469_c()];
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            NBTTagCompound nbttagcompound1 = (NBTTagCompound)nbttaglist.func_741_a(i);
            int j = nbttagcompound1.func_746_c("Slot") & 0xff;
            if(j >= 0 && j < field_827_a.length)
            {
                field_827_a[j] = new ItemStack(nbttagcompound1);
            }
        }

    }

    public void func_481_b(NBTTagCompound nbttagcompound)
    {
        super.func_481_b(nbttagcompound);
        NBTTagList nbttaglist = new NBTTagList();
        for(int i = 0; i < field_827_a.length; i++)
        {
            if(field_827_a[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.func_761_a("Slot", (byte)i);
                field_827_a[i].func_1086_a(nbttagcompound1);
                nbttaglist.func_742_a(nbttagcompound1);
            }
        }

        nbttagcompound.func_762_a("Items", nbttaglist);
    }

    public int func_470_e()
    {
        return 64;
    }

    private ItemStack field_827_a[];
}
