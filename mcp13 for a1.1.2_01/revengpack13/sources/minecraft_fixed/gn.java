// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class gn extends el
{

    public long a;

    public gn()
    {
    }

    public gn(long l)
    {
        a = l;
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeLong(a);
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        a = datainput.readLong();
    }

    public byte a()
    {
        return 4;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a).toString();
    }
}
