// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class lq extends fn
{

    public lq()
    {
        field_486_g = false;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_485_a = datainputstream.readInt();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_485_a);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_827_a(this);
    }

    public int func_329_a()
    {
        return 4;
    }

    public int field_485_a;
    public byte field_484_b;
    public byte field_490_c;
    public byte field_489_d;
    public byte field_488_e;
    public byte field_487_f;
    public boolean field_486_g;
}
