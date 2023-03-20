// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet24MobSpawn extends Packet
{

    public Packet24MobSpawn()
    {
    }

    public Packet24MobSpawn(EntityLiving entityliving)
    {
        field_547_a = entityliving.field_620_ab;
        field_546_b = (byte)EntityList.func_1082_a(entityliving);
        field_552_c = MathHelper.func_1108_b(entityliving.posX * 32D);
        field_551_d = MathHelper.func_1108_b(entityliving.posY * 32D);
        field_550_e = MathHelper.func_1108_b(entityliving.posZ * 32D);
        field_549_f = (byte)(int)((entityliving.rotationYaw * 256F) / 360F);
        field_548_g = (byte)(int)((entityliving.rotationPitch * 256F) / 360F);
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_547_a = datainputstream.readInt();
        field_546_b = datainputstream.readByte();
        field_552_c = datainputstream.readInt();
        field_551_d = datainputstream.readInt();
        field_550_e = datainputstream.readInt();
        field_549_f = datainputstream.readByte();
        field_548_g = datainputstream.readByte();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_547_a);
        dataoutputstream.writeByte(field_546_b);
        dataoutputstream.writeInt(field_552_c);
        dataoutputstream.writeInt(field_551_d);
        dataoutputstream.writeInt(field_550_e);
        dataoutputstream.writeByte(field_549_f);
        dataoutputstream.writeByte(field_548_g);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_828_a(this);
    }

    public int func_329_a()
    {
        return 19;
    }

    public int field_547_a;
    public byte field_546_b;
    public int field_552_c;
    public int field_551_d;
    public int field_550_e;
    public byte field_549_f;
    public byte field_548_g;
}
