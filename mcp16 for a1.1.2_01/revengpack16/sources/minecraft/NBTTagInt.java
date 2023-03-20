// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class NBTTagInt extends NBTBase
{

    public NBTTagInt()
    {
    }

    public NBTTagInt(int i)
    {
        intValue = i;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeInt(intValue);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        intValue = datainput.readInt();
    }

    public byte func_733_a()
    {
        return 3;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(intValue).toString();
    }

    public int intValue;
}
