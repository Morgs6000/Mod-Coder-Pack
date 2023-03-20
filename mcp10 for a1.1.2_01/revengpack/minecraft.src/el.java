// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class el
{

    private java.lang.String a;

    public el()
    {
        a = null;
    }

    abstract void a(java.io.DataOutput dataoutput) throws IOException;

    abstract void a(java.io.DataInput datainput) throws IOException;

    public abstract byte a();

    public java.lang.String b()
    {
        if(a == null)
            return "";
        else
            return a;
    }

    public el a(java.lang.String s)
    {
        a = s;
        return this;
    }

    public static el b(java.io.DataInput datainput) throws IOException
    {
        byte byte0 = datainput.readByte();
        if(byte0 == 0)
        {
            return ((el) (new fy()));
        } else
        {
            el el1 = el.a(byte0);
            el1.a = datainput.readUTF();
            el1.a(datainput);
            return el1;
        }
    }

    public static void a(el el1, java.io.DataOutput dataoutput) throws IOException
    {
        dataoutput.writeByte(((int) (el1.a())));
        if(el1.a() == 0)
        {
            return;
        } else
        {
            dataoutput.writeUTF(el1.b());
            el1.a(dataoutput);
            return;
        }
    }

    public static el a(byte byte0)
    {
        switch(byte0)
        {
        case 0: // '\0'
            return ((el) (new fy()));

        case 1: // '\001'
            return ((el) (new ix()));

        case 2: // '\002'
            return ((el) (new ls()));

        case 3: // '\003'
            return ((el) (new io()));

        case 4: // '\004'
            return ((el) (new gn()));

        case 5: // '\005'
            return ((el) (new f()));

        case 6: // '\006'
            return ((el) (new kr()));

        case 7: // '\007'
            return ((el) (new dy()));

        case 8: // '\b'
            return ((el) (new ne()));

        case 9: // '\t'
            return ((el) (new ki()));

        case 10: // '\n'
            return ((el) (new hm()));
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
