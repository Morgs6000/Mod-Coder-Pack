// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ki extends el
{

    private java.util.List a;
    private byte b;

    public ki()
    {
        a = ((java.util.List) (new ArrayList()));
    }

    void a(java.io.DataOutput dataoutput)
    {
        if(a.size() > 0)
            b = ((el)a.get(0)).a();
        else
            b = 1;
        dataoutput.writeByte(((int) (b)));
        dataoutput.writeInt(a.size());
        for(int i = 0; i < a.size(); i++)
            ((el)a.get(i)).a(dataoutput);

    }

    void a(java.io.DataInput datainput)
    {
        b = datainput.readByte();
        int i = datainput.readInt();
        a = ((java.util.List) (new ArrayList()));
        for(int j = 0; j < i; j++)
        {
            el el1 = el.a(b);
            el1.a(datainput);
            a.add(((java.lang.Object) (el1)));
        }

    }

    public byte a()
    {
        return 9;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a.size()).append(" entries of type ").append(el.b(b)).toString();
    }

    public void a(el el1)
    {
        b = el1.a();
        a.add(((java.lang.Object) (el1)));
    }

    public el a(int i)
    {
        return (el)a.get(i);
    }

    public int c()
    {
        return a.size();
    }
}
