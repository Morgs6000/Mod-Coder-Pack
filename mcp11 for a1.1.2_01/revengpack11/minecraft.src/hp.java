// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class hp extends fn
{

    public int a;
    public java.lang.String b;
    public java.lang.String c;

    public hp()
    {
    }

    public hp(java.lang.String s, java.lang.String s1, int i)
    {
        b = s;
        c = s1;
        a = i;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readInt();
        b = datainputstream.readUTF();
        c = datainputstream.readUTF();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(a);
        dataoutputstream.writeUTF(b);
        dataoutputstream.writeUTF(c);
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 4 + b.length() + c.length() + 4;
    }
}
