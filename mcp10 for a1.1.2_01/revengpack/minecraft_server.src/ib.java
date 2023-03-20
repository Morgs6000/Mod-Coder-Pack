// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ib extends hp
{

    public int a;
    public int b;
    public int c;
    public byte d[];
    public s e;

    public ib()
    {
        j = true;
    }

    public ib(int i, int j, int k, as as1)
    {
        this.j = true;
        a = i;
        b = j;
        c = k;
        e = new s();
        as1.b(e);
        try
        {
            d = aj.a(e);
        }
        catch(java.io.IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = ((int) (datainputstream.readShort()));
        c = datainputstream.readInt();
        int i = datainputstream.readShort() & 0xffff;
        d = new byte[i];
        datainputstream.readFully(d);
        e = aj.a(d);
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeShort(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeShort(((int) ((short)d.length)));
        dataoutputstream.write(d);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return d.length + 2 + 10;
    }
}
