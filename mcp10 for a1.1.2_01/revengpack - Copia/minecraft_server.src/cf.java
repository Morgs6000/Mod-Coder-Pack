// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cf extends hp
{

    public int a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public byte f;

    public cf()
    {
    }

    public cf(dj dj1)
    {
        a = dj1.c;
        b = gj.b(dj1.l * 32D);
        c = gj.b(dj1.m * 32D);
        d = gj.b(dj1.n * 32D);
        e = (byte)(int)((dj1.r * 256F) / 360F);
        f = (byte)(int)((dj1.s * 256F) / 360F);
    }

    public cf(int i, int j, int k, int l, byte byte0, byte byte1)
    {
        a = i;
        b = j;
        c = k;
        d = l;
        e = byte0;
        f = byte1;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.readInt();
        c = datainputstream.readInt();
        d = datainputstream.readInt();
        e = (byte)datainputstream.read();
        f = (byte)datainputstream.read();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeInt(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.write(((int) (e)));
        dataoutputstream.write(((int) (f)));
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 34;
    }
}
