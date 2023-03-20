// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class fx extends gf
{

    public fx()
    {
        i = true;
    }

    public void a(java.io.DataInputStream datainputstream) throws IOException
    {
        e = datainputstream.readFloat();
        f = datainputstream.readFloat();
        super.a(datainputstream);
    }

    public void a(java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeFloat(e);
        dataoutputstream.writeFloat(f);
        super.a(dataoutputstream);
    }

    public int a()
    {
        return 9;
    }
}
