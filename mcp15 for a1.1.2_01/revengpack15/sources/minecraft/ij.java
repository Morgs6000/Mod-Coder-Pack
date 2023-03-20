// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ij extends fn
{

    public ij()
    {
    }

    public ij(String s)
    {
        field_517_a = s;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_517_a = datainputstream.readUTF();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeUTF(field_517_a);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_831_a(this);
    }

    public int func_329_a()
    {
        return field_517_a.length();
    }

    public String field_517_a;
}
