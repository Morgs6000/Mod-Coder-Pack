// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fg extends fn
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public fg()
    {
    }

    public fg(int i, int j, int k, int l, int i1)
    {
        e = i;
        a = j;
        b = k;
        c = l;
        d = i1;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        e = datainputstream.read();
        a = datainputstream.readInt();
        b = datainputstream.read();
        c = datainputstream.readInt();
        d = datainputstream.read();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(e);
        dataoutputstream.writeInt(a);
        dataoutputstream.write(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.write(d);
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 11;
    }
}
