// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class jl extends fn
{

    public int a;
    public int b;
    public int c;
    public int d;
    public byte e;
    public byte f;

    public jl()
    {
    }

    public jl(kh kh1)
    {
        a = kh1.ab;
        b = eo.b(kh1.ak * 32D);
        c = eo.b(kh1.al * 32D);
        d = eo.b(kh1.am * 32D);
        e = (byte)(int)((kh1.aq * 256F) / 360F);
        f = (byte)(int)((kh1.ar * 256F) / 360F);
    }

    public void a(java.io.DataInputStream datainputstream)
    {
        a = datainputstream.readInt();
        b = datainputstream.readInt();
        c = datainputstream.readInt();
        d = datainputstream.readInt();
        e = (byte)datainputstream.read();
        f = (byte)datainputstream.read();
    }

    public void a(java.io.DataOutputStream dataoutputstream)
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeInt(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.write(((int) (e)));
        dataoutputstream.write(((int) (f)));
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 34;
    }
}
