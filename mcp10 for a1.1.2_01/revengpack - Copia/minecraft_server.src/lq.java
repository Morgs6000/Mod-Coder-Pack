// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class lq extends fn
{

    public int a;
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public boolean g;

    public lq()
    {
        g = false;
    }

    public void a(java.io.DataInputStream datainputstream)
    {
        a = datainputstream.readInt();
    }

    public void a(java.io.DataOutputStream dataoutputstream)
    {
        dataoutputstream.writeInt(a);
    }

    public void a(lb lb1)
    {
        lb1.a(this);
    }

    public int a()
    {
        return 4;
    }
}
