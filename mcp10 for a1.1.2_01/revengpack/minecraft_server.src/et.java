// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class et extends hp
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public et()
    {
        j = true;
    }

    public et(int i, int j, int k, dy dy1)
    {
        this.j = true;
        a = i;
        b = j;
        c = k;
        d = dy1.a(i, j, k);
        e = dy1.b(i, j, k);
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.read();
        c = datainputstream.readInt();
        d = datainputstream.read();
        e = datainputstream.read();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.write(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.write(d);
        dataoutputstream.write(e);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 11;
    }
}
