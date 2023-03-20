// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class kj extends fn
{

    public kj()
    {
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_500_a = datainputstream.readInt();
        field_501_e = datainputstream.readByte();
        field_499_b = datainputstream.readInt();
        field_503_c = datainputstream.readInt();
        field_502_d = datainputstream.readInt();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_500_a);
        dataoutputstream.writeByte(field_501_e);
        dataoutputstream.writeInt(field_499_b);
        dataoutputstream.writeInt(field_503_c);
        dataoutputstream.writeInt(field_502_d);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_835_a(this);
    }

    public int func_329_a()
    {
        return 17;
    }

    public int field_500_a;
    public int field_499_b;
    public int field_503_c;
    public int field_502_d;
    public int field_501_e;
}
