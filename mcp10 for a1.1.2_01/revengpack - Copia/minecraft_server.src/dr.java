// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class dr extends ex
{

    public dr()
    {
    }

    public dr(int i, byte byte0, byte byte1, byte byte2)
    {
        super(i);
        b = byte0;
        c = byte1;
        d = byte2;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        super.a(datainputstream);
        b = datainputstream.readByte();
        c = datainputstream.readByte();
        d = datainputstream.readByte();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        super.a(dataoutputstream);
        dataoutputstream.writeByte(((int) (b)));
        dataoutputstream.writeByte(((int) (c)));
        dataoutputstream.writeByte(((int) (d)));
    }

    public int a()
    {
        return 7;
    }
}
