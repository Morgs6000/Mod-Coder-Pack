// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class kr extends el
{

    public double a;

    public kr()
    {
    }

    public kr(double d)
    {
        a = d;
    }

    void a(java.io.DataOutput dataoutput)
    {
        dataoutput.writeDouble(a);
    }

    void a(java.io.DataInput datainput)
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
