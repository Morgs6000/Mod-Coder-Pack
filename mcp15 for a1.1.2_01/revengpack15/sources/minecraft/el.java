// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;

public abstract class el
{

    public el()
    {
        field_1087_a = null;
    }

    abstract void func_735_a(DataOutput dataoutput) throws IOException;

    abstract void func_736_a(DataInput datainput) throws IOException;

    public abstract byte func_733_a();

    public String func_737_b()
    {
        if(field_1087_a == null)
        {
            return "";
        } else
        {
            return field_1087_a;
        }
    }

    public el func_732_a(String s)
    {
        field_1087_a = s;
        return this;
    }

    public static el func_734_b(DataInput datainput) throws IOException
    {
        byte byte0 = datainput.readByte();
        if(byte0 == 0)
        {
            return new fy();
        } else
        {
            el el1 = func_739_a(byte0);
            el1.field_1087_a = datainput.readUTF();
            el1.func_736_a(datainput);
            return el1;
        }
    }

    public static void func_738_a(el el1, DataOutput dataoutput) throws IOException
    {
        dataoutput.writeByte(el1.func_733_a());
        if(el1.func_733_a() == 0)
        {
            return;
        } else
        {
            dataoutput.writeUTF(el1.func_737_b());
            el1.func_735_a(dataoutput);
            return;
        }
    }

    public static el func_739_a(byte byte0)
    {
        switch(byte0)
        {
        case 0: // '\0'
            return new fy();

        case 1: // '\001'
            return new ix();

        case 2: // '\002'
            return new ls();

        case 3: // '\003'
            return new io();

        case 4: // '\004'
            return new gn();

        case 5: // '\005'
            return new f();

        case 6: // '\006'
            return new kr();

        case 7: // '\007'
            return new dy();

        case 8: // '\b'
            return new ne();

        case 9: // '\t'
            return new ki();

        case 10: // '\n'
            return new hm();
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

    private String field_1087_a;
}
