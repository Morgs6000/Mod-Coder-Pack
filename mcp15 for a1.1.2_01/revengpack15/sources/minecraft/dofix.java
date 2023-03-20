// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class dofix extends fn
{

    public dofix()
    {
    }

    public dofix(int i, int j, int k, int l, int i1)
    {
        field_566_a = i;
        field_565_b = j;
        field_569_c = k;
        field_568_d = l;
        field_567_e = i1;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_566_a = datainputstream.readShort();
        field_565_b = datainputstream.readInt();
        field_569_c = datainputstream.read();
        field_568_d = datainputstream.readInt();
        field_567_e = datainputstream.read();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeShort(field_566_a);
        dataoutputstream.writeInt(field_565_b);
        dataoutputstream.write(field_569_c);
        dataoutputstream.writeInt(field_568_d);
        dataoutputstream.write(field_567_e);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_819_a(this);
    }

    public int func_329_a()
    {
        return 12;
    }

    public int field_566_a;
    public int field_565_b;
    public int field_569_c;
    public int field_568_d;
    public int field_567_e;
}
