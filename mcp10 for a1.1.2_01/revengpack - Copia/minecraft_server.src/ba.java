// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class ba extends hp
{

    public java.lang.String a;

    public ba()
    {
    }

    public ba(java.lang.String s)
    {
        a = s;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readUTF();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeUTF(a);
    }

    public void a(ej ej1)
    {
        ej1.a(this);
    }

    public int a()
    {
        return a.length();
    }
}
