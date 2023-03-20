// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames definits deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class dofix extends fn
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public dofix()
    {
    }

    public dofix(int i, int j, int k, int l, int i1)
    {
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = ((int) (datainputstream.readShort()));
        b = datainputstream.readInt();
        c = datainputstream.read();
        d = datainputstream.readInt();
        e = datainputstream.read();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeShort(a);
        dataoutputstream.writeInt(b);
        dataoutputstream.write(c);
        dataoutputstream.writeInt(d);
        dataoutputstream.write(e);
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 12;
    }
}
