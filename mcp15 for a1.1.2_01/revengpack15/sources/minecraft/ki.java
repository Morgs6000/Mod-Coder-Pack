// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ki extends el
{

    public ki()
    {
        field_1091_a = new ArrayList();
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        if(field_1091_a.size() > 0)
        {
            field_1090_b = ((el)field_1091_a.get(0)).func_733_a();
        } else
        {
            field_1090_b = 1;
        }
        dataoutput.writeByte(field_1090_b);
        dataoutput.writeInt(field_1091_a.size());
        for(int i = 0; i < field_1091_a.size(); i++)
        {
            ((el)field_1091_a.get(i)).func_735_a(dataoutput);
        }

    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1090_b = datainput.readByte();
        int i = datainput.readInt();
        field_1091_a = new ArrayList();
        for(int j = 0; j < i; j++)
        {
            el el1 = el.func_739_a(field_1090_b);
            el1.func_736_a(datainput);
            field_1091_a.add(el1);
        }

    }

    public byte func_733_a()
    {
        return 9;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1091_a.size()).append(" entries of type ").append(el.func_731_b(field_1090_b)).toString();
    }

    public void func_742_a(el el1)
    {
        field_1090_b = el1.func_733_a();
        field_1091_a.add(el1);
    }

    public el func_741_a(int i)
    {
        return (el)field_1091_a.get(i);
    }

    public int func_740_c()
    {
        return field_1091_a.size();
    }

    private List field_1091_a;
    private byte field_1090_b;
}
