// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet4UpdateTime extends Packet
{

    public Packet4UpdateTime()
    {
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_564_a = datainputstream.readLong();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeLong(field_564_a);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_846_a(this);
    }

    public int func_329_a()
    {
        return 8;
    }

    public long field_564_a;
}
