// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class jl extends fn
{

    public jl()
    {
    }

    public jl(kh kh1)
    {
        field_509_a = kh1.field_620_ab;
        field_508_b = eo.b(kh1.field_611_ak * 32D);
        field_513_c = eo.b(kh1.field_610_al * 32D);
        field_512_d = eo.b(kh1.field_609_am * 32D);
        field_511_e = (byte)(int)((kh1.field_605_aq * 256F) / 360F);
        field_510_f = (byte)(int)((kh1.field_604_ar * 256F) / 360F);
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_509_a = datainputstream.readInt();
        field_508_b = datainputstream.readInt();
        field_513_c = datainputstream.readInt();
        field_512_d = datainputstream.readInt();
        field_511_e = (byte)datainputstream.read();
        field_510_f = (byte)datainputstream.read();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_509_a);
        dataoutputstream.writeInt(field_508_b);
        dataoutputstream.writeInt(field_513_c);
        dataoutputstream.writeInt(field_512_d);
        dataoutputstream.write(field_511_e);
        dataoutputstream.write(field_510_f);
    }

    public void func_323_a(lb lb1)
    {
        lb1.func_829_a(this);
    }

    public int func_329_a()
    {
        return 34;
    }

    public int field_509_a;
    public int field_508_b;
    public int field_513_c;
    public int field_512_d;
    public byte field_511_e;
    public byte field_510_f;
}
