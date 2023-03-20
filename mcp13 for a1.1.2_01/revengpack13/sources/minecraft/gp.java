// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gp extends fn
{

    public int a;
    public java.lang.String b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public byte g;
    public int h;

    public gp()
    {
    }

    public gp(dm dm1)
    {
        a = dm1.ab;
        b = dm1.i;
        c = eo.b(dm1.ak * 32D);
        d = eo.b(dm1.al * 32D);
        e = eo.b(dm1.am * 32D);
        f = (byte)(int)((dm1.aq * 256F) / 360F);
        g = (byte)(int)((dm1.ar * 256F) / 360F);
        ev ev1 = dm1.b.a();
        h = ev1 != null ? ev1.c : 0;
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

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 28;
    }
}
