// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ls extends el
{

    public ls()
    {
    }

    public ls(short word0)
    {
        field_1088_a = word0;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeShort(field_1088_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1088_a = datainput.readShort();
    }

    public byte func_733_a()
    {
        return 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1088_a).toString();
    }

    public short field_1088_a;
}
