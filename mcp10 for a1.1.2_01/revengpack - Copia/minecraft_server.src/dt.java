// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class dt extends gg
{

    public double a;

    public dt()
    {
    }

    public dt(double d)
    {
        a = d;
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeDouble(a);
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        a = datainput.readDouble();
    }

    public byte a()
    {
        return 6;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a).toString();
    }
}
