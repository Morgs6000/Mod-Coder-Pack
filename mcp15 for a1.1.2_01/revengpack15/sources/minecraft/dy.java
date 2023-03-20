// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class dy extends el
{

    public dy()
    {
    }

    public dy(byte abyte0[])
    {
        field_1096_a = abyte0;
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        dataoutput.writeInt(field_1096_a.length);
        dataoutput.write(field_1096_a);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        int i = datainput.readInt();
        field_1096_a = new byte[i];
        datainput.readFully(field_1096_a);
    }

    public byte func_733_a()
    {
        return 7;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[").append(field_1096_a.length).append(" bytes]").toString();
    }

    public byte field_1096_a[];
}
