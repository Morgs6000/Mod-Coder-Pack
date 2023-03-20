// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class NBTTagLong extends NBTBase
{

    public NBTTagLong()
    {
    }

    public NBTTagLong(long l)
    {
        longValue = l;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeLong(longValue);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        longValue = datainput.readLong();
    }

    public byte func_733_a()
    {
        return 4;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(longValue).toString();
    }

    public long longValue;
}
