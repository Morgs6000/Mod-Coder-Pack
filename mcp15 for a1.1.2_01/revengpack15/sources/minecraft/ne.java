// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class ne extends el
{

    public ne()
    {
    }

    public ne(String s)
    {
        field_1098_a = s;
        if(s == null)
        {
            throw new IllegalArgumentException("Empty string not allowed");
        } else
        {
            return;
        }
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeUTF(field_1098_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1098_a = datainput.readUTF();
    }

    public byte func_733_a()
    {
        return 8;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1098_a).toString();
    }

    public String field_1098_a;
}
