// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class na extends fn
{

    public int a;
    public int b;
    public short c[];
    public byte d[];
    public byte e[];
    public int f;

    public na()
    {
        j = true;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.readInt();
        f = datainputstream.readShort() & 0xffff;
        c = new short[f];
        d = new byte[f];
        e = new byte[f];
        for(int i = 0; i < f; i++)
            c[i] = datainputstream.readShort();

        datainputstream.readFully(d);
        datainputstream.readFully(e);
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeInt(b);
        dataoutputstream.writeShort(((int) ((short)f)));
        for(int i = 0; i < f; i++)
            dataoutputstream.writeShort(((int) (c[i])));

        dataoutputstream.write(d);
        dataoutputstream.write(e);
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 10 + f * 4;
    }
}
