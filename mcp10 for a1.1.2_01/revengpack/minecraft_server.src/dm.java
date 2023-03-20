// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class dm extends gg
{

    private java.util.List a;
    private byte b;

    public dm()
    {
        a = ((java.util.List) (new ArrayList()));
    }

    void a(java.io.DataOutput dataoutput) throws IOException
    {
        if(a.size() > 0)
            b = ((gg)a.get(0)).a();
        else
            b = 1;
        dataoutput.writeByte(((int) (b)));
        dataoutput.writeInt(a.size());
        for(int i = 0; i < a.size(); i++)
            ((gg)a.get(i)).a(dataoutput);

    }

    void a(java.io.DataInput datainput) throws IOException
    {
        b = datainput.readByte();
        int i = datainput.readInt();
        a = ((java.util.List) (new ArrayList()));
        for(int j = 0; j < i; j++)
        {
            gg gg1 = gg.a(b);
            gg1.a(datainput);
            a.add(((java.lang.Object) (gg1)));
        }

    }

    public byte a()
    {
        return 9;
    }

    public java.lang.String toString()
    {
        return (new StringBuilder()).append("").append(a.size()).append(" entries of type ").append(gg.b(b)).toString();
    }

    public void a(gg gg1)
    {
        b = gg1.a();
        a.add(((java.lang.Object) (gg1)));
    }

    public gg a(int i)
    {
        return (gg)a.get(i);
    }

    public int b()
    {
        return a.size();
    }
}
