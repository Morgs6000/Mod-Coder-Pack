// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gv extends hp
{

    public int a;
    public byte b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public byte g;

    public gv()
    {
    }

    public gv(is is1)
    {
        a = is1.c;
        b = (byte)gr.a(((dj) (is1)));
        c = gj.b(is1.l * 32D);
        d = gj.b(is1.m * 32D);
        e = gj.b(is1.n * 32D);
        f = (byte)(int)((is1.r * 256F) / 360F);
        g = (byte)(int)((is1.s * 256F) / 360F);
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.readByte();
        c = datainputstream.readInt();
        d = datainputstream.readInt();
        e = datainputstream.readInt();
        f = datainputstream.readByte();
        g = datainputstream.readByte();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeByte(((int) (b)));
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.writeInt(e);
        dataoutputstream.writeByte(((int) (f)));
        dataoutputstream.writeByte(((int) (g)));
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 19;
    }
}
