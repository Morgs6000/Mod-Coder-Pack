// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class k extends hp
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

    public k()
    {
    }

    public k(fn fn1)
    {
        a = fn1.c;
        h = fn1.a.c;
        i = fn1.a.a;
        b = gj.b(fn1.l * 32D);
        c = gj.b(fn1.m * 32D);
        d = gj.b(fn1.n * 32D);
        e = (byte)(int)(fn1.o * 128D);
        f = (byte)(int)(fn1.p * 128D);
        g = (byte)(int)(fn1.q * 128D);
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

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 22;
    }
}
