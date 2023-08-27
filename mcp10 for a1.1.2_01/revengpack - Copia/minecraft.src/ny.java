// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ny extends fn
{

    public int a;
    public int b;
    public int c;
    public byte d[];
    public hm e;

    public ny()
    {
        j = true;
    }

    public ny(int i, int j, int k, ic ic1)
    {
        this.j = true;
        a = i;
        b = j;
        c = k;
        e = new hm();
        ic1.b(e);
        try
        {
            d = x.a(e);
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
        e = x.a(d);
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeShort(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeShort(((int) ((short)d.length)));
        dataoutputstream.write(d);
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return d.length + 2 + 10;
    }
}
