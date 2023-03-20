// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class hf extends fn
{

    public hf()
    {
    }

    public hf(kh kh1, int i)
    {
        field_522_a = kh1.field_620_ab;
        field_521_b = i;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_522_a = datainputstream.readInt();
        field_521_b = datainputstream.readByte();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_522_a);
        dataoutputstream.writeByte(field_521_b);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_825_a(this);
    }

    public int func_329_a()
    {
        return 5;
    }

    public int field_522_a;
    public int field_521_b;
}
