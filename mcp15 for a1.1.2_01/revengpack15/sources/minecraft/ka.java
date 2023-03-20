// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ka extends fn
{

    public ka()
    {
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_505_a = datainputstream.readInt();
        field_504_b = datainputstream.readInt();
        field_506_c = datainputstream.read() != 0;
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_505_a);
        dataoutputstream.writeInt(field_504_b);
        dataoutputstream.write(field_506_c ? 1 : 0);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_826_a(this);
    }

    public int func_329_a()
    {
        return 9;
    }

    public int field_505_a;
    public int field_504_b;
    public boolean field_506_c;
}
