// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.*;

public class NBTTagCompound extends NBTBase
{

    public NBTTagCompound()
    {
        tagMap = new HashMap();
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        NBTBase nbtbase;
        for(Iterator iterator = tagMap.values().iterator(); iterator.hasNext(); NBTBase.func_738_a(nbtbase, dataoutput))
        {
            nbtbase = (NBTBase)iterator.next();
        }

        dataoutput.writeByte(0);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        tagMap.clear();
        NBTBase nbtbase;
        for(; (nbtbase = NBTBase.func_734_b(datainput)).func_733_a() != 0; tagMap.put(nbtbase.func_737_b(), nbtbase)) { }
    }

    public byte func_733_a()
    {
        return 10;
    }

    public void func_762_a(String s, NBTBase nbtbase)
    {
        tagMap.put(s, nbtbase.func_732_a(s));
    }

    public void func_761_a(String s, byte byte0)
    {
        tagMap.put(s, (new NBTTagByte(byte0)).func_732_a(s));
    }

    public void func_749_a(String s, short word0)
    {
        tagMap.put(s, (new NBTTagShort(word0)).func_732_a(s));
    }

    public void func_758_a(String s, int i)
    {
        tagMap.put(s, (new NBTTagInt(i)).func_732_a(s));
    }

    public void func_750_a(String s, long l)
    {
        tagMap.put(s, (new NBTTagLong(l)).func_732_a(s));
    }

    public void func_744_a(String s, float f)
    {
        tagMap.put(s, (new NBTTagFloat(f)).func_732_a(s));
    }

    public void func_765_a(String s, double d)
    {
        tagMap.put(s, (new NBTTagDouble(d)).func_732_a(s));
    }

    public void func_754_a(String s, String s1)
    {
        tagMap.put(s, (new NBTTagString(s1)).func_732_a(s));
    }

    public void func_747_a(String s, byte abyte0[])
    {
        tagMap.put(s, (new NBTTagByteArray(abyte0)).func_732_a(s));
    }

    public void func_763_a(String s, NBTTagCompound nbttagcompound)
    {
        tagMap.put(s, nbttagcompound.func_732_a(s));
    }

    public void func_748_a(String s, boolean flag)
    {
        func_761_a(s, ((byte)(flag ? 1 : 0)));
    }

    public boolean func_751_b(String s)
    {
        return tagMap.containsKey(s);
    }

    public byte func_746_c(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return 0;
        } else
        {
            return ((NBTTagByte)tagMap.get(s)).byteValue;
        }
    }

    public short func_745_d(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return 0;
        } else
        {
            return ((NBTTagShort)tagMap.get(s)).shortValue;
        }
    }

    public int func_756_e(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return 0;
        } else
        {
            return ((NBTTagInt)tagMap.get(s)).intValue;
        }
    }

    public long func_764_f(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return 0L;
        } else
        {
            return ((NBTTagLong)tagMap.get(s)).longValue;
        }
    }

    public float func_752_g(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return 0.0F;
        } else
        {
            return ((NBTTagFloat)tagMap.get(s)).floatValue;
        }
    }

    public double func_757_h(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return 0.0D;
        } else
        {
            return ((NBTTagDouble)tagMap.get(s)).doubleValue;
        }
    }

    public String func_755_i(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return "";
        } else
        {
            return ((NBTTagString)tagMap.get(s)).stringValue;
        }
    }

    public byte[] func_759_j(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return new byte[0];
        } else
        {
            return ((NBTTagByteArray)tagMap.get(s)).byteArray;
        }
    }

    public NBTTagCompound func_743_k(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return new NBTTagCompound();
        } else
        {
            return (NBTTagCompound)tagMap.get(s);
        }
    }

    public NBTTagList func_753_l(String s)
    {
        if(!tagMap.containsKey(s))
        {
            return new NBTTagList();
        } else
        {
            return (NBTTagList)tagMap.get(s);
        }
    }

    public boolean func_760_m(String s)
    {
        return func_746_c(s) != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(tagMap.size()).append(" entries").toString();
    }

    private Map tagMap;
}
