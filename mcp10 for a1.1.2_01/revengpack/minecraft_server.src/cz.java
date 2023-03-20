// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class cz extends hp
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public byte g[];
    private int h;

    public cz()
    {
        j = true;
    }

    public cz(int i, int j, int k, int l, int i1, int j1, dy dy1)
    {
        byte abyte0[];
        java.util.zip.Deflater deflater;
        this.j = true;
        a = i;
        b = j;
        c = k;
        d = l;
        e = i1;
        f = j1;
        abyte0 = dy1.c(i, j, k, l, i1, j1);
        deflater = new Deflater(1);
        try
        {
        deflater.setInput(abyte0);
        deflater.finish();
        g = new byte[(l * i1 * j1 * 5) / 2];
        h = deflater.deflate(g);
        }
        finally
        {
        deflater.end();
        }
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        java.util.zip.Inflater inflater;
        a = datainputstream.readInt();
        b = ((int) (datainputstream.readShort()));
        c = datainputstream.readInt();
        d = datainputstream.read() + 1;
        e = datainputstream.read() + 1;
        f = datainputstream.read() + 1;
        int i = datainputstream.readInt();
        byte abyte0[] = new byte[i];
        datainputstream.readFully(abyte0);
        g = new byte[(d * e * f * 5) / 2];
        inflater = new Inflater();
        inflater.setInput(abyte0);
        try
        {
            inflater.inflate(g);
        }
        catch (DataFormatException localDataFormatException)
        {
            throw new IOException("Bad compressed data format");
        }
        finally
        {
        inflater.end();

        }
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeShort(b);
        dataoutputstream.writeInt(c);
        dataoutputstream.write(d - 1);
        dataoutputstream.write(e - 1);
        dataoutputstream.write(f - 1);
        dataoutputstream.writeInt(h);
        dataoutputstream.write(g, 0, h);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 17 + h;
    }
}
