// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet34EntityTeleport extends Packet
{

    public Packet34EntityTeleport()
    {
    }

    public Packet34EntityTeleport(Entity entity)
    {
        field_509_a = entity.field_620_ab;
        field_508_b = MathHelper.func_1108_b(entity.posX * 32D);
        field_513_c = MathHelper.func_1108_b(entity.posY * 32D);
        field_512_d = MathHelper.func_1108_b(entity.posZ * 32D);
        field_511_e = (byte)(int)((entity.rotationYaw * 256F) / 360F);
        field_510_f = (byte)(int)((entity.rotationPitch * 256F) / 360F);
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_509_a = datainputstream.readInt();
        field_508_b = datainputstream.readInt();
        field_513_c = datainputstream.readInt();
        field_512_d = datainputstream.readInt();
        field_511_e = (byte)datainputstream.read();
        field_510_f = (byte)datainputstream.read();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_509_a);
        dataoutputstream.writeInt(field_508_b);
        dataoutputstream.writeInt(field_513_c);
        dataoutputstream.writeInt(field_512_d);
        dataoutputstream.write(field_511_e);
        dataoutputstream.write(field_510_f);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_829_a(this);
    }

    public int func_329_a()
    {
        return 34;
    }

    public int field_509_a;
    public int field_508_b;
    public int field_513_c;
    public int field_512_d;
    public byte field_511_e;
    public byte field_510_f;
}
