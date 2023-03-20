// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class InventoryPlayer
    implements IInventory
{

    public InventoryPlayer(EntityPlayer entityplayer)
    {
        mainInventory = new ItemStack[37];
        armorInventory = new ItemStack[4];
        craftingInventory = new ItemStack[4];
        currentItem = 0;
        field_845_f = false;
        player = entityplayer;
    }

    public ItemStack func_494_a()
    {
        return mainInventory[currentItem];
    }

    private int func_505_f(int i)
    {
        for(int j = 0; j < mainInventory.length; j++)
        {
            if(mainInventory[j] != null && mainInventory[j].itemID == i)
            {
                return j;
            }
        }

        return -1;
    }

    private int func_497_g(int i)
    {
        for(int j = 0; j < mainInventory.length; j++)
        {
            if(mainInventory[j] != null && mainInventory[j].itemID == i && mainInventory[j].stackSize < mainInventory[j].func_1089_c() && mainInventory[j].stackSize < func_470_e())
            {
                return j;
            }
        }

        return -1;
    }

    private int func_499_j()
    {
        for(int i = 0; i < mainInventory.length; i++)
        {
            if(mainInventory[i] == null)
            {
                return i;
            }
        }

        return -1;
    }

    public void func_496_a(int i, boolean flag)
    {
        int j = func_505_f(i);
        if(j >= 0 && j < 9)
        {
            currentItem = j;
            return;
        } else
        {
            return;
        }
    }

    public void func_498_a(int i)
    {
        if(i > 0)
        {
            i = 1;
        }
        if(i < 0)
        {
            i = -1;
        }
        for(currentItem -= i; currentItem < 0; currentItem += 9) { }
        for(; currentItem >= 9; currentItem -= 9) { }
    }

    private int func_495_b(int i, int j)
    {
        int k = func_497_g(i);
        if(k < 0)
        {
            k = func_499_j();
        }
        if(k < 0)
        {
            return j;
        }
        if(mainInventory[k] == null)
        {
            mainInventory[k] = new ItemStack(i, 0);
        }
        int l = j;
        if(l > mainInventory[k].func_1089_c() - mainInventory[k].stackSize)
        {
            l = mainInventory[k].func_1089_c() - mainInventory[k].stackSize;
        }
        if(l > func_470_e() - mainInventory[k].stackSize)
        {
            l = func_470_e() - mainInventory[k].stackSize;
        }
        if(l == 0)
        {
            return j;
        } else
        {
            j -= l;
            mainInventory[k].stackSize += l;
            mainInventory[k].animationsToGo = 5;
            return j;
        }
    }

    public void func_511_b()
    {
        for(int i = 0; i < mainInventory.length; i++)
        {
            if(mainInventory[i] != null && mainInventory[i].animationsToGo > 0)
            {
                mainInventory[i].animationsToGo--;
            }
        }

    }

    public boolean func_510_b(int i)
    {
        int j = func_505_f(i);
        if(j < 0)
        {
            return false;
        }
        if(--mainInventory[j].stackSize <= 0)
        {
            mainInventory[j] = null;
        }
        return true;
    }

    public boolean func_504_a(ItemStack itemstack)
    {
        if(itemstack.itemDmg == 0)
        {
            itemstack.stackSize = func_495_b(itemstack.itemID, itemstack.stackSize);
            if(itemstack.stackSize == 0)
            {
                return true;
            }
        }
        int i = func_499_j();
        if(i >= 0)
        {
            mainInventory[i] = itemstack;
            mainInventory[i].animationsToGo = 5;
            return true;
        } else
        {
            return false;
        }
    }

    public ItemStack func_473_a(int i, int j)
    {
        ItemStack aitemstack[] = mainInventory;
        if(i >= mainInventory.length)
        {
            aitemstack = armorInventory;
            i -= mainInventory.length;
        }
        if(aitemstack[i] != null)
        {
            if(aitemstack[i].stackSize <= j)
            {
                ItemStack itemstack = aitemstack[i];
                aitemstack[i] = null;
                return itemstack;
            }
            ItemStack itemstack1 = aitemstack[i].func_1085_a(j);
            if(aitemstack[i].stackSize == 0)
            {
                aitemstack[i] = null;
            }
            return itemstack1;
        } else
        {
            return null;
        }
    }

    public void func_472_a(int i, ItemStack itemstack)
    {
        ItemStack aitemstack[] = mainInventory;
        if(i >= aitemstack.length)
        {
            i -= aitemstack.length;
            aitemstack = armorInventory;
        }
        if(i >= aitemstack.length)
        {
            i -= aitemstack.length;
            aitemstack = craftingInventory;
        }
        aitemstack[i] = itemstack;
    }

    public float func_508_a(Block block)
    {
        float f = 1.0F;
        if(mainInventory[currentItem] != null)
        {
            f *= mainInventory[currentItem].func_1098_a(block);
        }
        return f;
    }

    public NBTTagList func_493_a(NBTTagList nbttaglist)
    {
        for(int i = 0; i < mainInventory.length; i++)
        {
            if(mainInventory[i] != null)
            {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.func_761_a("Slot", (byte)i);
                mainInventory[i].func_1086_a(nbttagcompound);
                nbttaglist.func_742_a(nbttagcompound);
            }
        }

        for(int j = 0; j < armorInventory.length; j++)
        {
            if(armorInventory[j] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.func_761_a("Slot", (byte)(j + 100));
                armorInventory[j].func_1086_a(nbttagcompound1);
                nbttaglist.func_742_a(nbttagcompound1);
            }
        }

        for(int k = 0; k < craftingInventory.length; k++)
        {
            if(craftingInventory[k] != null)
            {
                NBTTagCompound nbttagcompound2 = new NBTTagCompound();
                nbttagcompound2.func_761_a("Slot", (byte)(k + 80));
                craftingInventory[k].func_1086_a(nbttagcompound2);
                nbttaglist.func_742_a(nbttagcompound2);
            }
        }

        return nbttaglist;
    }

    public void func_513_b(NBTTagList nbttaglist)
    {
        mainInventory = new ItemStack[36];
        armorInventory = new ItemStack[4];
        craftingInventory = new ItemStack[4];
        for(int i = 0; i < nbttaglist.func_740_c(); i++)
        {
            NBTTagCompound nbttagcompound = (NBTTagCompound)nbttaglist.func_741_a(i);
            int j = nbttagcompound.func_746_c("Slot") & 0xff;
            if(j >= 0 && j < mainInventory.length)
            {
                mainInventory[j] = new ItemStack(nbttagcompound);
            }
            if(j >= 80 && j < craftingInventory.length + 80)
            {
                craftingInventory[j - 80] = new ItemStack(nbttagcompound);
            }
            if(j >= 100 && j < armorInventory.length + 100)
            {
                armorInventory[j - 100] = new ItemStack(nbttagcompound);
            }
        }

    }

    public int func_469_c()
    {
        return mainInventory.length + 4;
    }

    public ItemStack func_468_c(int i)
    {
        ItemStack aitemstack[] = mainInventory;
        if(i >= aitemstack.length)
        {
            i -= aitemstack.length;
            aitemstack = armorInventory;
        }
        if(i >= aitemstack.length)
        {
            i -= aitemstack.length;
            aitemstack = craftingInventory;
        }
        return aitemstack[i];
    }

    public String func_471_d()
    {
        return "Inventory";
    }

    public int func_470_e()
    {
        return 64;
    }

    public int func_502_a(Entity entity)
    {
        ItemStack itemstack = func_468_c(currentItem);
        if(itemstack != null)
        {
            return itemstack.func_1095_a(entity);
        } else
        {
            return 1;
        }
    }

    public boolean func_509_b(Block block)
    {
        if(block.material != Material.rock && block.material != Material.iron && block.material != Material.builtSnow && block.material != Material.snow)
        {
            return true;
        }
        ItemStack itemstack = func_468_c(currentItem);
        if(itemstack != null)
        {
            return itemstack.func_1099_b(block);
        } else
        {
            return false;
        }
    }

    public ItemStack func_492_d(int i)
    {
        return armorInventory[i];
    }

    public int func_506_f()
    {
        int i = 0;
        int j = 0;
        int k = 0;
        for(int l = 0; l < armorInventory.length; l++)
        {
            if(armorInventory[l] != null && (armorInventory[l].func_1091_a() instanceof ItemArmor))
            {
                int i1 = armorInventory[l].func_1094_d();
                int j1 = armorInventory[l].itemDmg;
                int k1 = i1 - j1;
                j += k1;
                k += i1;
                int l1 = ((ItemArmor)armorInventory[l].func_1091_a()).field_312_aY;
                i += l1;
            }
        }

        if(k == 0)
        {
            return 0;
        } else
        {
            return ((i - 1) * j) / k + 1;
        }
    }

    public void func_507_e(int i)
    {
        for(int j = 0; j < armorInventory.length; j++)
        {
            if(armorInventory[j] == null || !(armorInventory[j].func_1091_a() instanceof ItemArmor))
            {
                continue;
            }
            armorInventory[j].func_1101_b(i);
            if(armorInventory[j].stackSize == 0)
            {
                armorInventory[j].func_1097_a(player);
                armorInventory[j] = null;
            }
        }

    }

    public void func_503_g()
    {
        for(int i = 0; i < mainInventory.length; i++)
        {
            if(mainInventory[i] != null)
            {
                player.func_444_a(mainInventory[i], true);
                mainInventory[i] = null;
            }
        }

        for(int j = 0; j < armorInventory.length; j++)
        {
            if(armorInventory[j] != null)
            {
                player.func_444_a(armorInventory[j], true);
                armorInventory[j] = null;
            }
        }

    }

    public void func_474_j_()
    {
        field_845_f = true;
    }

    public boolean func_500_a(InventoryPlayer inventoryplayer)
    {
        for(int i = 0; i < mainInventory.length; i++)
        {
            if(!func_501_a(inventoryplayer.mainInventory[i], mainInventory[i]))
            {
                return false;
            }
        }

        for(int j = 0; j < armorInventory.length; j++)
        {
            if(!func_501_a(inventoryplayer.armorInventory[j], armorInventory[j]))
            {
                return false;
            }
        }

        for(int k = 0; k < craftingInventory.length; k++)
        {
            if(!func_501_a(inventoryplayer.craftingInventory[k], craftingInventory[k]))
            {
                return false;
            }
        }

        return true;
    }

    private boolean func_501_a(ItemStack itemstack, ItemStack itemstack1)
    {
        if(itemstack == null && itemstack1 == null)
        {
            return true;
        }
        if(itemstack == null || itemstack1 == null)
        {
            return false;
        } else
        {
            return itemstack.itemID == itemstack1.itemID && itemstack.stackSize == itemstack1.stackSize && itemstack.itemDmg == itemstack1.itemDmg;
        }
    }

    public InventoryPlayer func_512_i()
    {
        InventoryPlayer inventoryplayer = new InventoryPlayer(null);
        for(int i = 0; i < mainInventory.length; i++)
        {
            inventoryplayer.mainInventory[i] = mainInventory[i] == null ? null : mainInventory[i].func_1102_e();
        }

        for(int j = 0; j < armorInventory.length; j++)
        {
            inventoryplayer.armorInventory[j] = armorInventory[j] == null ? null : armorInventory[j].func_1102_e();
        }

        for(int k = 0; k < craftingInventory.length; k++)
        {
            inventoryplayer.craftingInventory[k] = craftingInventory[k] == null ? null : craftingInventory[k].func_1102_e();
        }

        return inventoryplayer;
    }

    public ItemStack mainInventory[];
    public ItemStack armorInventory[];
    public ItemStack craftingInventory[];
    public int currentItem;
    private EntityPlayer player;
    public ItemStack field_846_e;
    public boolean field_845_f;
}
