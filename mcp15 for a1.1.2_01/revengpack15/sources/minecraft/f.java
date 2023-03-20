// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class f extends el
{

    public f()
    {
    }

    public f(float f1)
    {
        field_1097_a = f1;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeFloat(field_1097_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1097_a = datainput.readFloat();
    }

    public byte func_733_a()
    {
        return 5;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1097_a).toString();
    }

    public float field_1097_a;
}
