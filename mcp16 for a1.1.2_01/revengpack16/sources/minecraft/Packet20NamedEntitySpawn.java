// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet20NamedEntitySpawn extends Packet
{

    public Packet20NamedEntitySpawn()
    {
    }

    public Packet20NamedEntitySpawn(EntityPlayer entityplayer)
    {
        field_534_a = entityplayer.field_620_ab;
        field_533_b = entityplayer.field_771_i;
        field_540_c = MathHelper.func_1108_b(entityplayer.posX * 32D);
        field_539_d = MathHelper.func_1108_b(entityplayer.posY * 32D);
        field_538_e = MathHelper.func_1108_b(entityplayer.posZ * 32D);
        field_537_f = (byte)(int)((entityplayer.rotationYaw * 256F) / 360F);
        field_536_g = (byte)(int)((entityplayer.rotationPitch * 256F) / 360F);
        ItemStack itemstack = entityplayer.field_778_b.func_494_a();
        field_535_h = itemstack != null ? itemstack.itemID : 0;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_534_a = datainputstream.readInt();
        field_533_b = datainputstream.readUTF();
        field_540_c = datainputstream.readInt();
        field_539_d = datainputstream.readInt();
        field_538_e = datainputstream.readInt();
        field_537_f = datainputstream.readByte();
        field_536_g = datainputstream.readByte();
        field_535_h = datainputstream.readShort();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_534_a);
        dataoutputstream.writeUTF(field_533_b);
        dataoutputstream.writeInt(field_540_c);
        dataoutputstream.writeInt(field_539_d);
        dataoutputstream.writeInt(field_538_e);
        dataoutputstream.writeByte(field_537_f);
        dataoutputstream.writeByte(field_536_g);
        dataoutputstream.writeShort(field_535_h);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_820_a(this);
    }

    public int func_329_a()
    {
        return 28;
    }

    public int field_534_a;
    public String field_533_b;
    public int field_540_c;
    public int field_539_d;
    public int field_538_e;
    public byte field_537_f;
    public byte field_536_g;
    public int field_535_h;
}
