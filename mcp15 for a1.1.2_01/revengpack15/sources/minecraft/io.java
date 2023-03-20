// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class io extends el
{

    public io()
    {
    }

    public io(int i)
    {
        field_1093_a = i;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeInt(field_1093_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1093_a = datainput.readInt();
    }

    public byte func_733_a()
    {
        return 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1093_a).toString();
    }

    public int field_1093_a;
}
