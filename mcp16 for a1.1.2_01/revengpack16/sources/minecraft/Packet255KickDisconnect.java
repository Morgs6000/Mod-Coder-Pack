// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet255KickDisconnect extends Packet
{

    public Packet255KickDisconnect()
    {
    }

    public Packet255KickDisconnect(String s)
    {
        field_582_a = s;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_582_a = datainputstream.readUTF();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeUTF(field_582_a);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_844_a(this);
    }

    public int func_329_a()
    {
        return field_582_a.length();
    }

    public String field_582_a;
}
