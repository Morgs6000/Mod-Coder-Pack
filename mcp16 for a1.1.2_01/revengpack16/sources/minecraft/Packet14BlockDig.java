// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet14BlockDig extends Packet
{

    public Packet14BlockDig()
    {
    }

    public Packet14BlockDig(int i, int j, int k, int l, int i1)
    {
        Status = i;
        X = j;
        Y = k;
        Z = l;
        Face = i1;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        Status = datainputstream.read();
        X = datainputstream.readInt();
        Y = datainputstream.read();
        Z = datainputstream.readInt();
        Face = datainputstream.read();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(Status);
        dataoutputstream.writeInt(X);
        dataoutputstream.write(Y);
        dataoutputstream.writeInt(Z);
        dataoutputstream.write(Face);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_821_a(this);
    }

    public int func_329_a()
    {
        return 11;
    }

    public int X;
    public int Y;
    public int Z;
    public int Face;
    public int Status;
}
