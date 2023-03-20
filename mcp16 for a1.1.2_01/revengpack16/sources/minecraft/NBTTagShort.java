// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class NBTTagShort extends NBTBase
{

    public NBTTagShort()
    {
    }

    public NBTTagShort(short word0)
    {
        shortValue = word0;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeShort(shortValue);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        shortValue = datainput.readShort();
    }

    public byte func_733_a()
    {
        return 2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(shortValue).toString();
    }

    public short shortValue;
}
