// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class cx extends ex
{

    public cx()
    {
        g = true;
    }

    public cx(int i, byte byte0, byte byte1)
    {
        super(i);
        e = byte0;
        f = byte1;
        g = true;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        super.a(datainputstream);
        e = datainputstream.readByte();
        f = datainputstream.readByte();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        super.a(dataoutputstream);
        dataoutputstream.writeByte(((int) (e)));
        dataoutputstream.writeByte(((int) (f)));
    }

    public int a()
    {
        return 6;
    }
}
