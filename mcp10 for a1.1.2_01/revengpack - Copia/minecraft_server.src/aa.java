// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class aa extends gf
{

    public aa()
    {
        h = true;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        a = datainputstream.readDouble();
        b = datainputstream.readDouble();
        d = datainputstream.readDouble();
        c = datainputstream.readDouble();
        super.a(datainputstream);
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeDouble(a);
        dataoutputstream.writeDouble(b);
        dataoutputstream.writeDouble(d);
        dataoutputstream.writeDouble(c);
        super.a(dataoutputstream);
    }

    public int a()
    {
        return 33;
    }
}
