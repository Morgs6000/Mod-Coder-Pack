// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ha extends fn
{

    public ha()
    {
    }

    public ha(dx dx1)
    {
        field_531_a = dx1.field_620_ab;
        field_524_h = dx1.field_801_a.field_1617_c;
        field_523_i = dx1.field_801_a.field_1615_a;
        field_530_b = eo.b(dx1.field_611_ak * 32D);
        field_529_c = eo.b(dx1.field_610_al * 32D);
        field_528_d = eo.b(dx1.field_609_am * 32D);
        field_527_e = (byte)(int)(dx1.field_608_an * 128D);
        field_526_f = (byte)(int)(dx1.field_607_ao * 128D);
        field_525_g = (byte)(int)(dx1.field_606_ap * 128D);
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

    public void func_323_a(lb lb1)
    {
        lb1.func_832_a(this);
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
