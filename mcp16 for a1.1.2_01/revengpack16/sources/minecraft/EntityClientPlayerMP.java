// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
//import net.minecraft.client.Minecraft;

public class EntityClientPlayerMP extends EntityPlayerSP
{

    public EntityClientPlayerMP(Minecraft minecraft, World world, Session session, NetClientHandler netclienthandler)
    {
        super(minecraft, world, session);
        field_796_bh = 0;
        field_789_bo = new InventoryPlayer(null);
        field_797_bg = netclienthandler;
    }

    public void func_370_e_()
    {
        super.func_370_e_();
        func_464_J();
    }

    public void func_462_n()
    {
        func_464_J();
    }

    public void func_464_J()
    {
        if(field_796_bh++ == 20)
        {
            if(!field_778_b.func_500_a(field_789_bo))
            {
                field_797_bg.func_847_a(new Packet5PlayerInventory(-1, field_778_b.mainInventory));
                field_797_bg.func_847_a(new Packet5PlayerInventory(-2, field_778_b.craftingInventory));
                field_797_bg.func_847_a(new Packet5PlayerInventory(-3, field_778_b.armorInventory));
                field_789_bo = field_778_b.func_512_i();
            }
            field_796_bh = 0;
        }
        double d = posX - field_795_bi;
        double d1 = boundingBox.field_1697_b - field_794_bj;
        double d2 = posY - field_793_bk;
        double d3 = posZ - field_792_bl;
        double d4 = rotationYaw - field_791_bm;
        double d5 = rotationPitch - field_790_bn;
        boolean flag = d1 != 0.0D || d2 != 0.0D || d != 0.0D || d3 != 0.0D;
        boolean flag1 = d4 != 0.0D || d5 != 0.0D;
        if(flag && flag1)
        {
            field_797_bg.func_847_a(new Packet13PlayerLookMove(posX, boundingBox.field_1697_b, posY, posZ, rotationYaw, rotationPitch, onGround));
        } else
        if(flag)
        {
            field_797_bg.func_847_a(new Packet11PlayerPosition(posX, boundingBox.field_1697_b, posY, posZ, onGround));
        } else
        if(flag1)
        {
            field_797_bg.func_847_a(new Packet12PlayerLook(rotationYaw, rotationPitch, onGround));
        } else
        {
            field_797_bg.func_847_a(new Packet10Flying(onGround));
        }
        if(flag)
        {
            field_795_bi = posX;
            field_794_bj = boundingBox.field_1697_b;
            field_793_bk = posY;
            field_792_bl = posZ;
        }
        if(flag1)
        {
            field_791_bm = rotationYaw;
            field_790_bn = rotationPitch;
        }
    }

    protected void func_446_a(EntityItem entityitem)
    {
        System.out.println("Dropping?");
        Packet21PickupSpawn packet21pickupspawn = new Packet21PickupSpawn(entityitem);
        field_797_bg.func_847_a(packet21pickupspawn);
        entityitem.posX = (double)packet21pickupspawn.field_530_b / 32D;
        entityitem.posY = (double)packet21pickupspawn.field_529_c / 32D;
        entityitem.posZ = (double)packet21pickupspawn.field_528_d / 32D;
        entityitem.motionX = (double)packet21pickupspawn.field_527_e / 128D;
        entityitem.motionY = (double)packet21pickupspawn.field_526_f / 128D;
        entityitem.motionZ = (double)packet21pickupspawn.field_525_g / 128D;
    }

    public void func_461_a(String s)
    {
        field_797_bg.func_847_a(new Packet3Chat(s));
    }

    public void func_457_w()
    {
        super.func_457_w();
        field_797_bg.func_847_a(new Packet18ArmAnimation(this, 1));
    }

    private NetClientHandler field_797_bg;
    private int field_796_bh;
    private double field_795_bi;
    private double field_794_bj;
    private double field_793_bk;
    private double field_792_bl;
    private float field_791_bm;
    private float field_790_bn;
    private InventoryPlayer field_789_bo;
}
