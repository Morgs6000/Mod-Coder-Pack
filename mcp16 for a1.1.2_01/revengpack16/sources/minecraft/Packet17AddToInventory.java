// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet17AddToInventory extends Packet
{

    public Packet17AddToInventory()
    {
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_497_a = datainputstream.readShort();
        field_496_b = datainputstream.readByte();
        field_498_c = datainputstream.readShort();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeShort(field_497_a);
        dataoutputstream.writeByte(field_496_b);
        dataoutputstream.writeShort(field_498_c);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_830_a(this);
    }

    public int func_329_a()
    {
        return 5;
    }

    public int field_497_a;
    public int field_496_b;
    public int field_498_c;
}
