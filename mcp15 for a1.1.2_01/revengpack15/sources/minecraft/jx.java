// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class jx extends lq
{

    public jx()
    {
        field_486_g = true;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        super.func_327_a(datainputstream);
        field_488_e = datainputstream.readByte();
        field_487_f = datainputstream.readByte();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        super.func_322_a(dataoutputstream);
        dataoutputstream.writeByte(field_488_e);
        dataoutputstream.writeByte(field_487_f);
    }

    public int func_329_a()
    {
        return 6;
    }
}
