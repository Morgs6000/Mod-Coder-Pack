// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class GuiContainer extends GuiScreen
{

    public GuiContainer()
    {
        xSize_ee = 176;
        ySize_ee = 166;
        field_973_i = new ArrayList();
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        int k = (width - xSize_ee) / 2;
        int l = (height - ySize_ee) / 2;
        func_589_a(f);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
        RenderHelper.func_1158_b();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(k, l, 0.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(32826);
        for(int i1 = 0; i1 < field_973_i.size(); i1++)
        {
            SlotInventory slotinventory = (SlotInventory)field_973_i.get(i1);
            func_590_a(slotinventory);
            if(slotinventory.func_781_a(i, j))
            {
                GL11.glDisable(2896);
                GL11.glDisable(2929);
                int j1 = slotinventory.xPos;
                int k1 = slotinventory.yPos;
                func_549_a(j1, k1, j1 + 16, k1 + 16, 0x80ffffff, 0x80ffffff);
                GL11.glEnable(2896);
                GL11.glEnable(2929);
            }
        }

        InventoryPlayer inventoryplayer = mc.field_178_g.field_778_b;
        if(inventoryplayer.field_846_e != null)
        {
            GL11.glTranslatef(0.0F, 0.0F, 32F);
            itemRenderer.func_161_a(field_947_g, mc.field_171_n, inventoryplayer.field_846_e, i - k - 8, j - l - 8);
            itemRenderer.func_164_b(field_947_g, mc.field_171_n, inventoryplayer.field_846_e, i - k - 8, j - l - 8);
        }
        GL11.glDisable(32826);
        RenderHelper.func_1159_a();
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        func_587_j();
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }

    protected void func_587_j()
    {
    }

    protected abstract void func_589_a(float f);

    private void func_590_a(SlotInventory slotinventory)
    {
        IInventory iinventory = slotinventory.inventory;
        int i = slotinventory.slotIndex;
        int j = slotinventory.xPos;
        int k = slotinventory.yPos;
        ItemStack itemstack = iinventory.func_468_c(i);
        if(itemstack == null)
        {
            int l = slotinventory.func_775_c();
            if(l >= 0)
            {
                GL11.glDisable(2896);
                mc.field_171_n.func_1076_b(mc.field_171_n.func_1070_a("/gui/items.png"));
                func_550_b(j, k, (l % 16) * 16, (l / 16) * 16, 16, 16);
                GL11.glEnable(2896);
                return;
            }
        }
        itemRenderer.func_161_a(field_947_g, mc.field_171_n, itemstack, j, k);
        itemRenderer.func_164_b(field_947_g, mc.field_171_n, itemstack, j, k);
    }

    private Slot func_588_a(int i, int j)
    {
        for(int k = 0; k < field_973_i.size(); k++)
        {
            SlotInventory slotinventory = (SlotInventory)field_973_i.get(k);
            if(slotinventory.func_781_a(i, j))
            {
                return slotinventory;
            }
        }

        return null;
    }

    protected void func_565_a(int i, int j, int k)
    {
        if(k == 0 || k == 1)
        {
            Slot slot = func_588_a(i, j);
            InventoryPlayer inventoryplayer = mc.field_178_g.field_778_b;
            if(slot != null)
            {
                ItemStack itemstack = slot.func_777_b();
                if(itemstack != null || inventoryplayer.field_846_e != null)
                {
                    if(itemstack != null && inventoryplayer.field_846_e == null)
                    {
                        int i1 = k != 0 ? (itemstack.stackSize + 1) / 2 : itemstack.stackSize;
                        inventoryplayer.field_846_e = slot.inventory.func_473_a(slot.slotIndex, i1);
                        if(itemstack.stackSize == 0)
                        {
                            slot.func_776_b(null);
                        }
                        slot.func_778_a();
                    } else
                    if(itemstack == null && inventoryplayer.field_846_e != null && slot.func_780_a(inventoryplayer.field_846_e))
                    {
                        int j1 = k != 0 ? 1 : inventoryplayer.field_846_e.stackSize;
                        if(j1 > slot.inventory.func_470_e())
                        {
                            j1 = slot.inventory.func_470_e();
                        }
                        slot.func_776_b(inventoryplayer.field_846_e.func_1085_a(j1));
                        if(inventoryplayer.field_846_e.stackSize == 0)
                        {
                            inventoryplayer.field_846_e = null;
                        }
                    } else
                    if(itemstack != null && inventoryplayer.field_846_e != null)
                    {
                        if(slot.func_780_a(inventoryplayer.field_846_e))
                        {
                            if(itemstack.itemID != inventoryplayer.field_846_e.itemID)
                            {
                                if(inventoryplayer.field_846_e.stackSize <= slot.inventory.func_470_e())
                                {
                                    ItemStack itemstack1 = itemstack;
                                    slot.func_776_b(inventoryplayer.field_846_e);
                                    inventoryplayer.field_846_e = itemstack1;
                                }
                            } else
                            if(itemstack.itemID == inventoryplayer.field_846_e.itemID)
                            {
                                if(k == 0)
                                {
                                    int k1 = inventoryplayer.field_846_e.stackSize;
                                    if(k1 > slot.inventory.func_470_e() - itemstack.stackSize)
                                    {
                                        k1 = slot.inventory.func_470_e() - itemstack.stackSize;
                                    }
                                    if(k1 > inventoryplayer.field_846_e.func_1089_c() - itemstack.stackSize)
                                    {
                                        k1 = inventoryplayer.field_846_e.func_1089_c() - itemstack.stackSize;
                                    }
                                    inventoryplayer.field_846_e.func_1085_a(k1);
                                    if(inventoryplayer.field_846_e.stackSize == 0)
                                    {
                                        inventoryplayer.field_846_e = null;
                                    }
                                    itemstack.stackSize += k1;
                                } else
                                if(k == 1)
                                {
                                    int l1 = 1;
                                    if(l1 > slot.inventory.func_470_e() - itemstack.stackSize)
                                    {
                                        l1 = slot.inventory.func_470_e() - itemstack.stackSize;
                                    }
                                    if(l1 > inventoryplayer.field_846_e.func_1089_c() - itemstack.stackSize)
                                    {
                                        l1 = inventoryplayer.field_846_e.func_1089_c() - itemstack.stackSize;
                                    }
                                    inventoryplayer.field_846_e.func_1085_a(l1);
                                    if(inventoryplayer.field_846_e.stackSize == 0)
                                    {
                                        inventoryplayer.field_846_e = null;
                                    }
                                    itemstack.stackSize += l1;
                                }
                            }
                        } else
                        if(itemstack.itemID == inventoryplayer.field_846_e.itemID && inventoryplayer.field_846_e.func_1089_c() > 1)
                        {
                            int i2 = itemstack.stackSize;
                            if(i2 > 0 && i2 + inventoryplayer.field_846_e.stackSize <= inventoryplayer.field_846_e.func_1089_c())
                            {
                                inventoryplayer.field_846_e.stackSize += i2;
                                itemstack.func_1085_a(i2);
                                if(itemstack.stackSize == 0)
                                {
                                    slot.func_776_b(null);
                                }
                                slot.func_778_a();
                            }
                        }
                    }
                }
                slot.func_779_d();
            } else
            if(inventoryplayer.field_846_e != null)
            {
                int l = (width - xSize_ee) / 2;
                int j2 = (height - ySize_ee) / 2;
                if(i < l || j < j2 || i >= l + xSize_ee || j >= j2 + xSize_ee)
                {
                    EntityPlayerSP entityplayersp = mc.field_178_g;
                    if(k == 0)
                    {
                        entityplayersp.func_449_a(inventoryplayer.field_846_e);
                        inventoryplayer.field_846_e = null;
                    }
                    if(k == 1)
                    {
                        entityplayersp.func_449_a(inventoryplayer.field_846_e.func_1085_a(1));
                        if(inventoryplayer.field_846_e.stackSize == 0)
                        {
                            inventoryplayer.field_846_e = null;
                        }
                    }
                }
            }
        }
    }

    protected void func_573_b(int i, int j, int k)
    {
        if(k != 0);
    }

    protected void func_580_a(char c, int i)
    {
        if(i == 1 || i == mc.options.keyBindInventory.keyCode)
        {
            mc.func_128_a(null);
        }
    }

    public void func_576_h()
    {
        InventoryPlayer inventoryplayer = mc.field_178_g.field_778_b;
        if(inventoryplayer.field_846_e != null)
        {
            mc.field_178_g.func_449_a(inventoryplayer.field_846_e);
            inventoryplayer.field_846_e = null;
        }
    }

    public boolean func_577_b()
    {
        return false;
    }

    private static RenderItem itemRenderer = new RenderItem();
    protected int xSize_ee;
    protected int ySize_ee;
    protected List field_973_i;

}
