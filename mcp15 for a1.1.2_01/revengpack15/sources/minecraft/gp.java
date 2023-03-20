// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class gp extends fn
{

    public gp()
    {
    }

    public gp(dm dm1)
    {
        field_534_a = dm1.field_620_ab;
        field_533_b = dm1.field_771_i;
        field_540_c = eo.b(dm1.field_611_ak * 32D);
        field_539_d = eo.b(dm1.field_610_al * 32D);
        field_538_e = eo.b(dm1.field_609_am * 32D);
        field_537_f = (byte)(int)((dm1.field_605_aq * 256F) / 360F);
        field_536_g = (byte)(int)((dm1.field_604_ar * 256F) / 360F);
        ev ev1 = dm1.field_778_b.func_494_a();
        field_535_h = ev1 != null ? ev1.field_1617_c : 0;
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

    public void func_323_a(lb lb1)
    {
        lb1.func_820_a(this);
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
