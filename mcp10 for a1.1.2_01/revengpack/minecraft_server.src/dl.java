// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class dl extends hp
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public dl()
    {
    }

    public dl(dj dj1, int i)
    {
        a = dj1.c;
        b = gj.b(dj1.l * 32D);
        c = gj.b(dj1.m * 32D);
        d = gj.b(dj1.n * 32D);
        e = i;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        e = ((int) (datainputstream.readByte()));
        b = datainputstream.readInt();
        c = datainputstream.readInt();
        d = datainputstream.readInt();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeByte(e);
        dataoutputstream.writeInt(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 17;
    }
}
