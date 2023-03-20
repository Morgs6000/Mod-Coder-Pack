// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class gt extends fn
{

    public gt()
    {
    }

    public gt(String s)
    {
        field_532_a = s;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_532_a = datainputstream.readUTF();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeUTF(field_532_a);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_838_a(this);
    }

    public int func_329_a()
    {
        return 4 + field_532_a.length() + 4;
    }

    public String field_532_a;
}
