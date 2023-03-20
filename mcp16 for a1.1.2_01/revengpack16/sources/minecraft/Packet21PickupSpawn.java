// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet21PickupSpawn extends Packet
{

    public Packet21PickupSpawn()
    {
    }

    public Packet21PickupSpawn(EntityItem entityitem)
    {
        field_531_a = entityitem.field_620_ab;
        field_524_h = entityitem.item.itemID;
        field_523_i = entityitem.item.stackSize;
        field_530_b = MathHelper.func_1108_b(entityitem.posX * 32D);
        field_529_c = MathHelper.func_1108_b(entityitem.posY * 32D);
        field_528_d = MathHelper.func_1108_b(entityitem.posZ * 32D);
        field_527_e = (byte)(int)(entityitem.motionX * 128D);
        field_526_f = (byte)(int)(entityitem.motionY * 128D);
        field_525_g = (byte)(int)(entityitem.motionZ * 128D);
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_531_a = datainputstream.readInt();
        field_524_h = datainputstream.readShort();
        field_523_i = datainputstream.readByte();
        field_530_b = datainputstream.readInt();
        field_529_c = datainputstream.readInt();
        field_528_d = datainputstream.readInt();
        field_527_e = datainputstream.readByte();
        field_526_f = datainputstream.readByte();
        field_525_g = datainputstream.readByte();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_531_a);
        dataoutputstream.writeShort(field_524_h);
        dataoutputstream.writeByte(field_523_i);
        dataoutputstream.writeInt(field_530_b);
        dataoutputstream.writeInt(field_529_c);
        dataoutputstream.writeInt(field_528_d);
        dataoutputstream.writeByte(field_527_e);
        dataoutputstream.writeByte(field_526_f);
        dataoutputstream.writeByte(field_525_g);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_832_a(this);
    }

    public int func_329_a()
    {
        return 22;
    }

    public int field_531_a;
    public int field_530_b;
    public int field_529_c;
    public int field_528_d;
    public byte field_527_e;
    public byte field_526_f;
    public byte field_525_g;
    public int field_524_h;
    public int field_523_i;
}
