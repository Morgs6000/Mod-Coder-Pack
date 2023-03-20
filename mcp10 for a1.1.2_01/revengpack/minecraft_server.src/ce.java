// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ce extends hp
{

    public int a;
    public int b;

    public ce()
    {
    }

    public ce(int i, int j)
    {
        a = i;
        b = j;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.readInt();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeInt(b);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 8;
    }
}
