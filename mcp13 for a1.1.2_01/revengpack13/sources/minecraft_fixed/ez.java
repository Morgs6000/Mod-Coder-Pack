// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ez extends fn
{

    public int a;
    public byte b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public byte g;

    public ez()
    {
    }

    public ez(ge ge1)
    {
        a = ge1.ab;
        b = (byte)ew.a(((kh) (ge1)));
        c = eo.b(ge1.ak * 32D);
        d = eo.b(ge1.al * 32D);
        e = eo.b(ge1.am * 32D);
        f = (byte)(int)((ge1.aq * 256F) / 360F);
        g = (byte)(int)((ge1.ar * 256F) / 360F);
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

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 19;
    }
}
