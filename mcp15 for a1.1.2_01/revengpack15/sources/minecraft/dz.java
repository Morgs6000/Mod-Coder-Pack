// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class dz extends fn
{

    public dz()
    {
    }

    public dz(int i, int j)
    {
        field_563_a = i;
        field_562_b = j;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_563_a = datainputstream.readInt();
        field_562_b = datainputstream.readShort();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_563_a);
        dataoutputstream.writeShort(field_562_b);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_841_a(this);
    }

    public int func_329_a()
    {
        return 6;
    }

    public int field_563_a;
    public int field_562_b;
}
