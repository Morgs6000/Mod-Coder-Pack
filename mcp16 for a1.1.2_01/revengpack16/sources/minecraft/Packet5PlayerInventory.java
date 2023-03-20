// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public class Packet5PlayerInventory extends Packet
{

    public Packet5PlayerInventory()
    {
    }

    public Packet5PlayerInventory(int i, ItemStack aitemstack[])
    {
        field_571_a = i;
        field_570_b = new ItemStack[aitemstack.length];
        for(int j = 0; j < field_570_b.length; j++)
        {
            field_570_b[j] = aitemstack[j] != null ? aitemstack[j].func_1102_e() : null;
        }

    }

    public void func_327_a(DataInputStream datainputstream) throws IOException
    {
        field_571_a = datainputstream.readInt();
        short word0 = datainputstream.readShort();
        field_570_b = new ItemStack[word0];
        for(int i = 0; i < word0; i++)
        {
            short word1 = datainputstream.readShort();
            if(word1 >= 0)
            {
                byte byte0 = datainputstream.readByte();
                short word2 = datainputstream.readShort();
                field_570_b[i] = new ItemStack(word1, byte0, word2);
            }
        }

    }

    public void func_322_a(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(field_571_a);
        dataoutputstream.writeShort(field_570_b.length);
        for(int i = 0; i < field_570_b.length; i++)
        {
            if(field_570_b[i] == null)
            {
                dataoutputstream.writeShort(-1);
            } else
            {
                dataoutputstream.writeShort((short)field_570_b[i].itemID);
                dataoutputstream.writeByte((byte)field_570_b[i].stackSize);
                dataoutputstream.writeShort((short)field_570_b[i].itemDmg);
            }
        }

    }

    public void func_323_a(NetHandler nethandler)
    {
        nethandler.func_843_a(this);
    }

    public int func_329_a()
    {
        return 6 + field_570_b.length * 5;
    }

    public int field_571_a;
    public ItemStack field_570_b[];
}
