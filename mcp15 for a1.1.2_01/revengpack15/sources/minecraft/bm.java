// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class bm extends fn
{

    public bm()
    {
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_581_a = datainputstream.readInt();
        field_580_b = datainputstream.readInt();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_581_a);
        dataoutputstream.writeInt(field_580_b);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_834_a(this);
    }

    public int func_329_a()
    {
        return 8;
    }

    public int field_581_a;
    public int field_580_b;
}
