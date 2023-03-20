// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet1Login extends Packet
{

    public Packet1Login()
    {
    }

    public Packet1Login(String s, String s1, int i)
    {
        field_518_b = s;
        field_520_c = s1;
        field_519_a = i;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_519_a = datainputstream.readInt();
        field_518_b = datainputstream.readUTF();
        field_520_c = datainputstream.readUTF();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_519_a);
        dataoutputstream.writeUTF(field_518_b);
        dataoutputstream.writeUTF(field_520_c);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_840_a(this);
    }

    public int func_329_a()
    {
        return 4 + field_518_b.length() + field_520_c.length() + 4;
    }

    public int field_519_a;
    public String field_518_b;
    public String field_520_c;
}
