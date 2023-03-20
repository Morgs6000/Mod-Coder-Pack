// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
//import net.minecraft.client.Minecraft;

public class EntityPlayerSP extends EntityPlayer
{

    public EntityPlayerSP(Minecraft minecraft, World world, Session session)
    {
        super(world);
        field_788_bg = minecraft;
        if(session != null && session.field_1666_b != null && session.field_1666_b.length() > 0)
        {
            field_622_aY = (new StringBuilder()).append("http://www.minecraft.net/skin/").append(session.field_1666_b).append(".png").toString();
            System.out.println((new StringBuilder()).append("Loading texture ").append(field_622_aY).toString());
        }
        field_771_i = session.field_1666_b;
    }

    public void func_418_b_()
    {
        super.func_418_b_();
        field_700_V = field_787_a.field_1174_a;
        field_699_W = field_787_a.field_1173_b;
        field_697_Y = field_787_a.field_1176_d;
    }

    public void func_425_j()
    {
        field_787_a.func_797_a(this);
        if(field_787_a.field_1175_e && field_635_aL < 0.2F)
        {
            field_635_aL = 0.2F;
        }
        super.func_425_j();
    }

    public void func_458_k()
    {
        field_787_a.func_798_a();
    }

    public void func_460_a(int i, boolean flag)
    {
        field_787_a.func_796_a(i, flag);
    }

    public void func_352_a(NBTTagCompound nbttagcompound)
    {
        super.func_352_a(nbttagcompound);
        nbttagcompound.func_758_a("Score", field_776_d);
    }

    public void func_357_b(NBTTagCompound nbttagcompound)
    {
        super.func_357_b(nbttagcompound);
        field_776_d = nbttagcompound.func_756_e("Score");
    }

    public void func_452_a(IInventory iinventory)
    {
        field_788_bg.func_128_a(new GuiChest(field_778_b, iinventory));
    }

    public void func_455_a(TileEntitySign tileentitysign)
    {
        field_788_bg.func_128_a(new GuiEditSign(tileentitysign));
    }

    public void func_445_l()
    {
        field_788_bg.func_128_a(new GuiCrafting(field_778_b));
    }

    public void func_453_a(TileEntityFurnace tileentityfurnace)
    {
        field_788_bg.func_128_a(new GuiFurnace(field_778_b, tileentityfurnace));
    }

    public void func_463_a(Entity entity)
    {
        int i = field_778_b.func_502_a(entity);
        if(i > 0)
        {
            entity.func_396_a(this, i);
            ItemStack itemstack = func_442_t();
            if(itemstack != null && (entity instanceof EntityLiving))
            {
                itemstack.func_1092_a((EntityLiving)entity);
                if(itemstack.stackSize <= 0)
                {
                    itemstack.func_1097_a(this);
                    func_448_u();
                }
            }
        }
    }

    public void func_443_a_(Entity entity, int i)
    {
        field_788_bg.field_177_h.func_1192_a(new EntityPickupFX(field_788_bg.field_180_e, entity, this, -0.5F));
    }

    public int func_459_m()
    {
        return field_778_b.func_506_f();
    }

    public void func_456_a_(Entity entity)
    {
        if(entity.func_353_a(this))
        {
            return;
        }
        ItemStack itemstack = func_442_t();
        if(itemstack != null && (entity instanceof EntityLiving))
        {
            itemstack.func_1100_b((EntityLiving)entity);
            if(itemstack.stackSize <= 0)
            {
                itemstack.func_1097_a(this);
                func_448_u();
            }
        }
    }

    public void func_461_a(String s)
    {
    }

    public void func_462_n()
    {
    }

    public boolean func_381_o()
    {
        return field_787_a.field_1175_e;
    }

    public MovementInput field_787_a;
    private Minecraft field_788_bg;
}
