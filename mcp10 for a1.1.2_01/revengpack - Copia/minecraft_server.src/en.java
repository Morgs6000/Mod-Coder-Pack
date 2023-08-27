// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class en extends hp
{

    public int a;
    public int b;
    public int c;

    public en()
    {
    }

    public en(gp gp1, int i)
    {
        a = gp1.c;
        b = i;
        c = gp1.d;
        if(i == 0)
            i = 1;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = ((int) (datainputstream.readShort()));
        b = ((int) (datainputstream.readByte()));
        c = ((int) (datainputstream.readShort()));
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeShort(a);
        dataoutputstream.writeByte(b);
        dataoutputstream.writeShort(c);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return 5;
    }
}
