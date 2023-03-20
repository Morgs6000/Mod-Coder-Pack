// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet53BlockChange extends Packet
{

    public Packet53BlockChange()
    {
        field_472_j = true;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        X = datainputstream.readInt();
        Y = datainputstream.read();
        Z = datainputstream.readInt();
        ID = datainputstream.read();
        Metadata = datainputstream.read();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(X);
        dataoutputstream.write(Y);
        dataoutputstream.writeInt(Z);
        dataoutputstream.write(ID);
        dataoutputstream.write(Metadata);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_822_a(this);
    }

    public int func_329_a()
    {
        return 11;
    }

    public int X;
    public int Y;
    public int Z;
    public int ID;
    public int Metadata;
}
