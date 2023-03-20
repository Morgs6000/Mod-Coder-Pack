// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class kr extends el
{

    public kr()
    {
    }

    public kr(double d)
    {
        field_1089_a = d;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeDouble(field_1089_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1089_a = datainput.readDouble();
    }

    public byte func_733_a()
    {
        return 6;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1089_a).toString();
    }

    public double field_1089_a;
}
