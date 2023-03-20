// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet59ComplexEntity extends Packet
{

    public Packet59ComplexEntity()
    {
        field_472_j = true;
    }

    public Packet59ComplexEntity(int i, int j, int k, TileEntity tileentity)
    {
        field_472_j = true;
        field_474_a = i;
        field_473_b = j;
        field_477_c = k;
        field_475_e = new NBTTagCompound();
        tileentity.func_481_b(field_475_e);
        try
        {
            field_476_d = CompressedStreamTools.func_1142_a(field_475_e);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_474_a = datainputstream.readInt();
        field_473_b = datainputstream.readShort();
        field_477_c = datainputstream.readInt();
        int i = datainputstream.readShort() & 0xffff;
        field_476_d = new byte[i];
        datainputstream.readFully(field_476_d);
        field_475_e = CompressedStreamTools.func_1140_a(field_476_d);
    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_474_a);
        dataoutputstream.writeShort(field_473_b);
        dataoutputstream.writeInt(field_477_c);
        dataoutputstream.writeShort((short)field_476_d.length);
        dataoutputstream.write(field_476_d);
    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_842_a(this);
    }

    public int func_329_a()
    {
        return field_476_d.length + 2 + 10;
    }

    public int field_474_a;
    public int field_473_b;
    public int field_477_c;
    public byte field_476_d[];
    public NBTTagCompound field_475_e;
}
