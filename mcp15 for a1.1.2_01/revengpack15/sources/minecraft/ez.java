// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ez extends fn
{

    public ez()
    {
    }

    public ez(ge ge1)
    {
        field_547_a = ge1.field_620_ab;
        field_546_b = (byte)ew.func_1082_a(ge1);
        field_552_c = eo.b(ge1.field_611_ak * 32D);
        field_551_d = eo.b(ge1.field_610_al * 32D);
        field_550_e = eo.b(ge1.field_609_am * 32D);
        field_549_f = (byte)(int)((ge1.field_605_aq * 256F) / 360F);
        field_548_g = (byte)(int)((ge1.field_604_ar * 256F) / 360F);
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

    public void func_323_a(lb lb1)
    {
        lb1.func_828_a(this);
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
