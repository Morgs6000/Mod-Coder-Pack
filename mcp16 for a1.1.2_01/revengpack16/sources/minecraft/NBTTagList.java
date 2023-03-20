// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NBTTagList extends NBTBase
{

    public NBTTagList()
    {
        tagList = new ArrayList();
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        if(tagList.size() > 0)
        {
            tagType = ((NBTBase)tagList.get(0)).func_733_a();
        } else
        {
            tagType = 1;
        }
        dataoutput.writeByte(tagType);
        dataoutput.writeInt(tagList.size());
        for(int i = 0; i < tagList.size(); i++)
        {
            ((NBTBase)tagList.get(i)).func_735_a(dataoutput);
        }

    }

    void func_736_a(DataInput datainput) throws IOException
    {
        tagType = datainput.readByte();
        int i = datainput.readInt();
        tagList = new ArrayList();
        for(int j = 0; j < i; j++)
        {
            NBTBase nbtbase = NBTBase.func_739_a(tagType);
            nbtbase.func_736_a(datainput);
            tagList.add(nbtbase);
        }

    }

    public byte func_733_a()
    {
        return 9;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(tagList.size()).append(" entries of type ").append(NBTBase.func_731_b(tagType)).toString();
    }

    public void func_742_a(NBTBase nbtbase)
    {
        tagType = nbtbase.func_733_a();
        tagList.add(nbtbase);
    }

    public NBTBase func_741_a(int i)
    {
        return (NBTBase)tagList.get(i);
    }

    public int func_740_c()
    {
        return tagList.size();
    }

    private List tagList;
    private byte tagType;
}
