// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ne extends el
{

    public java.lang.String a;

    public ne()
    {
    }

    public ne(java.lang.String s)
    {
        a = s;
        if(s == null)
            throw new IllegalArgumentException("Empty string not allowed");
        else
            return;
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeUTF(a);
    }

    void a(java.io.DataInput datainput) throws IOException
    {
        a = datainput.readUTF();
    }

    public byte a()
    {
        return 8;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a).toString();
    }
}
