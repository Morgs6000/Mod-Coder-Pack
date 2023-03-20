// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gf extends hp
{

    public double a;
    public double b;
    public double c;
    public double d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;

    public gf()
    {
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        g = datainputstream.read() != 0;
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(g ? 1 : 0);
    }

    public int a()
    {
        return 1;
    }
}
