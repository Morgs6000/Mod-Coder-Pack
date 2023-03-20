// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public abstract class NBTBase
{

    public NBTBase()
    {
        key = null;
    }

    abstract void func_735_a(DataOutput dataoutput) throws IOException;

    abstract void func_736_a(DataInput datainput) throws IOException;

    public abstract byte func_733_a();

    public String func_737_b()
    {
        if(key == null)
        {
            return "";
        } else
        {
            return key;
        }
    }

    public NBTBase func_732_a(String s)
    {
        key = s;
        return this;
    }

    public static NBTBase func_734_b(DataInput datainput) throws IOException
    {
        byte byte0 = datainput.readByte();
        if(byte0 == 0)
        {
            return new NBTTagEnd();
        } else
        {
            NBTBase nbtbase = func_739_a(byte0);
            nbtbase.key = datainput.readUTF();
            nbtbase.func_736_a(datainput);
            return nbtbase;
        }
    }

    public static void func_738_a(NBTBase nbtbase, DataOutput dataoutput) throws IOException
    {
        dataoutput.writeByte(nbtbase.func_733_a());
        if(nbtbase.func_733_a() == 0)
        {
            return;
        } else
        {
            dataoutput.writeUTF(nbtbase.func_737_b());
            nbtbase.func_735_a(dataoutput);
            return;
        }
    }

    public static NBTBase func_739_a(byte byte0)
    {
        switch(byte0)
        {
        case 0: // '\0'
            return new NBTTagEnd();

        case 1: // '\001'
            return new NBTTagByte();

        case 2: // '\002'
            return new NBTTagShort();

        case 3: // '\003'
            return new NBTTagInt();

        case 4: // '\004'
            return new NBTTagLong();

        case 5: // '\005'
            return new NBTTagFloat();

        case 6: // '\006'
            return new NBTTagDouble();

        case 7: // '\007'
            return new NBTTagByteArray();

        case 8: // '\b'
            return new NBTTagString();

        case 9: // '\t'
            return new NBTTagList();

        case 10: // '\n'
            return new NBTTagCompound();
        }
        return null;
    }

    public static String func_731_b(byte byte0)
    {
        switch(byte0)
        {
        case 0: // '\0'
            return "TAG_End";

        case 1: // '\001'
            return "TAG_Byte";

        case 2: // '\002'
            return "TAG_Short";

        case 3: // '\003'
            return "TAG_Int";

        case 4: // '\004'
            return "TAG_Long";

        case 5: // '\005'
            return "TAG_Float";

        case 6: // '\006'
            return "TAG_Double";

        case 7: // '\007'
            return "TAG_Byte_Array";

        case 8: // '\b'
            return "TAG_String";

        case 9: // '\t'
            return "TAG_List";

        case 10: // '\n'
            return "TAG_Compound";
        }
        return "UNKNOWN";
    }

    private String key;
}
