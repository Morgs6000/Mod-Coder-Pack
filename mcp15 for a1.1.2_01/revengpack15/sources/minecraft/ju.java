// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ju extends fn
{

    public ju()
    {
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_507_a = datainputstream.readInt();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_507_a);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_839_a(this);
    }

    public int func_329_a()
    {
        return 4;
    }

    public int field_507_a;
}
