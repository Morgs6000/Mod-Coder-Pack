// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class hh extends hp
{

    public int a;
    public int b;
    public short c[];
    public byte d[];
    public byte e[];
    public int f;

    public hh()
    {
        j = true;
    }

    public hh(int i, int j, short aword0[], int k, dy dy1)
    {
        this.j = true;
        a = i;
        b = j;
        f = k;
        c = new short[k];
        d = new byte[k];
        e = new byte[k];
        im im1 = dy1.b(i, j);
        for(int l = 0; l < k; l++)
        {
            int i1 = aword0[l] >> 12 & 0xf;
            int j1 = aword0[l] >> 8 & 0xf;
            int k1 = aword0[l] & 0xff;
            c[l] = aword0[l];
            d[l] = (byte)im1.a(i1, k1, j1);
            e[l] = (byte)im1.b(i1, k1, j1);
        }

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

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 10 + f * 4;
    }
}
