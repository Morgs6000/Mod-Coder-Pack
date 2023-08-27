// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class gg
{

    private java.lang.String a;

    public gg()
    {
        a = null;
    }

    abstract void a(java.io.DataOutput dataoutput) throws IOException;

    abstract void a(java.io.DataInput datainput) throws IOException;

    public abstract byte a();

    public java.lang.String c()
    {
        if(a == null)
            return "";
        else
            return a;
    }

    public gg m(java.lang.String s1)
    {
        a = s1;
        return this;
    }

    public static gg b(java.io.DataInput datainput) throws IOException
    {
        byte byte0 = datainput.readByte();
        if(byte0 == 0)
        {
            return ((gg) (new ii()));
        } else
        {
            gg gg1 = gg.a(byte0);
            gg1.a = datainput.readUTF();
            gg1.a(datainput);
            return gg1;
        }
    }

    public static void a(gg gg1, java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeByte(((int) (gg1.a())));
        if(gg1.a() == 0)
        {
            return;
        } else
        {
            dataoutput.writeUTF(gg1.c());
            gg1.a(dataoutput);
            return;
        }
    }

    public static gg a(byte byte0)
    {
        switch(byte0)
        {
        case 0: // '\0'
            return ((gg) (new ii()));

        case 1: // '\001'
            return ((gg) (new bo()));

        case 2: // '\002'
            return ((gg) (new fb()));

        case 3: // '\003'
            return ((gg) (new bf()));

        case 4: // '\004'
            return ((gg) (new d()));

        case 5: // '\005'
            return ((gg) (new l()));

        case 6: // '\006'
            return ((gg) (new dt()));

        case 7: // '\007'
            return ((gg) (new fp()));

        case 8: // '\b'
            return ((gg) (new hj()));

        case 9: // '\t'
            return ((gg) (new dm()));

        case 10: // '\n'
            return ((gg) (new s()));
        }
        return null;
    }

    public static java.lang.String b(byte byte0)
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
}
