// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class bg extends ex
{

    public bg()
    {
        g = true;
    }

    public bg(int i, byte byte0, byte byte1, byte byte2, byte byte3, byte byte4)
    {
        super(i);
        b = byte0;
        c = byte1;
        d = byte2;
        e = byte3;
        f = byte4;
        g = true;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        super.a(datainputstream);
        b = datainputstream.readByte();
        c = datainputstream.readByte();
        d = datainputstream.readByte();
        e = datainputstream.readByte();
        f = datainputstream.readByte();
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        super.a(dataoutputstream);
        dataoutputstream.writeByte(((int) (b)));
        dataoutputstream.writeByte(((int) (c)));
        dataoutputstream.writeByte(((int) (d)));
        dataoutputstream.writeByte(((int) (e)));
        dataoutputstream.writeByte(((int) (f)));
    }

    public int a()
    {
        return 9;
    }
}
