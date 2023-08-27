// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class c extends hp
{

    public int a;
    public java.lang.String b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public byte g;
    public int h;

    public c()
    {
    }

    public c(fc fc1)
    {
        a = fc1.c;
        b = fc1.aq;
        c = gj.b(fc1.l * 32D);
        d = gj.b(fc1.m * 32D);
        e = gj.b(fc1.n * 32D);
        f = (byte)(int)((fc1.r * 256F) / 360F);
        g = (byte)(int)((fc1.s * 256F) / 360F);
        gp gp1 = fc1.aj.b();
        h = gp1 != null ? gp1.c : 0;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.readUTF();
        c = datainputstream.readInt();
        d = datainputstream.readInt();
        e = datainputstream.readInt();
        f = datainputstream.readByte();
        g = datainputstream.readByte();
        h = ((int) (datainputstream.readShort()));
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeUTF(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.writeInt(e);
        dataoutputstream.writeByte(((int) (f)));
        dataoutputstream.writeByte(((int) (g)));
        dataoutputstream.writeShort(h);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 28;
    }
}
