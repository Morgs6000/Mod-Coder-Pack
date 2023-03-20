// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ix extends el
{

    public ix()
    {
    }

    public ix(byte byte0)
    {
        field_1092_a = byte0;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeByte(field_1092_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1092_a = datainput.readByte();
    }

    public byte func_733_a()
    {
        return 1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1092_a).toString();
    }

    public byte field_1092_a;
}
