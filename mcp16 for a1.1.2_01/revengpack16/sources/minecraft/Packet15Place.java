// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet15Place extends Packet
{

    public Packet15Place()
    {
    }

    public Packet15Place(int i, int j, int k, int l, int i1)
    {
        ID = i;
        X = j;
        Y = k;
        Z = l;
        Direction = i1;
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        ID = datainputstream.readShort();
        X = datainputstream.readInt();
        Y = datainputstream.read();
        Z = datainputstream.readInt();
        Direction = datainputstream.read();
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeShort(ID);
        dataoutputstream.writeInt(X);
        dataoutputstream.write(Y);
        dataoutputstream.writeInt(Z);
        dataoutputstream.write(Direction);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_819_a(this);
    }

    public int func_329_a()
    {
        return 12;
    }

    public int ID;
    public int X;
    public int Y;
    public int Z;
    public int Direction;
}
