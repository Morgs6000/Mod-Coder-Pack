// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ix extends el
{

    public byte a;

    public ix()
    {
    }

    public ix(byte byte0)
    {
        a = byte0;
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeByte(((int) (a)));
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        a = datainput.readByte();
    }

    public byte a()
    {
        return 1;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(((int) (a))).toString();
    }
}
