// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dy extends el
{

    public byte a[];

    public dy()
    {
    }

    public dy(byte abyte0[])
    {
        a = abyte0;
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeInt(a.length);
        dataoutput.write(a);
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        int i = datainput.readInt();
        a = new byte[i];
        datainput.readFully(a);
    }

    public byte a()
    {
        return 7;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("[").append(a.length).append(" bytes]").toString();
    }
}
