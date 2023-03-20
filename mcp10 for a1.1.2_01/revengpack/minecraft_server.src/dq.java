// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class dq extends gf
{

    public dq()
    {
        i = true;
        h = true;
    }

    public dq(double d, double d1, double d2, double d3, float f, float f1, boolean flag)
    {
        a = d;
        b = d1;
        this.d = d2;
        c = d3;
        e = f;
        this.f = f1;
        g = flag;
        i = true;
        h = true;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readDouble();
        b = datainputstream.readDouble();
        d = datainputstream.readDouble();
        c = datainputstream.readDouble();
        e = datainputstream.readFloat();
        f = datainputstream.readFloat();
        super.a(datainputstream);
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeDouble(a);
        dataoutputstream.writeDouble(b);
        dataoutputstream.writeDouble(d);
        dataoutputstream.writeDouble(c);
        dataoutputstream.writeFloat(e);
        dataoutputstream.writeFloat(f);
        super.a(dataoutputstream);
    }

    public int a()
    {
        return 41;
    }
}
