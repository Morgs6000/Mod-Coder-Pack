// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class gn extends el
{

    public gn()
    {
    }

    public gn(long l)
    {
        field_1095_a = l;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeLong(field_1095_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1095_a = datainput.readLong();
    }

    public byte func_733_a()
    {
        return 4;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1095_a).toString();
    }

    public long field_1095_a;
}
