// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ha extends fn
{

    public int a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public byte f;
    public byte g;
    public int h;
    public int i;

    public ha()
    {
    }

    public ha(dx dx1)
    {
        a = dx1.ab;
        h = dx1.a.c;
        i = dx1.a.a;
        b = eo.b(dx1.ak * 32D);
        c = eo.b(dx1.al * 32D);
        d = eo.b(dx1.am * 32D);
        e = (byte)(int)(dx1.an * 128D);
        f = (byte)(int)(dx1.ao * 128D);
        g = (byte)(int)(dx1.ap * 128D);
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        h = ((int) (datainputstream.readShort()));
        i = ((int) (datainputstream.readByte()));
        b = datainputstream.readInt();
        c = datainputstream.readInt();
        d = datainputstream.readInt();
        e = datainputstream.readByte();
        f = datainputstream.readByte();
        g = datainputstream.readByte();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeShort(h);
        dataoutputstream.writeByte(i);
        dataoutputstream.writeInt(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.writeByte(((int) (e)));
        dataoutputstream.writeByte(((int) (f)));
        dataoutputstream.writeByte(((int) (g)));
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 22;
    }
}
