// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fe extends hp
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public fe()
    {
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

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 12;
    }
}
