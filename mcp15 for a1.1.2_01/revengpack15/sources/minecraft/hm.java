// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.*;

public class hm extends el
{

    public hm()
    {
        field_1094_a = new HashMap();
    }

    void func_735_a(DataOutput dataoutput) throws IOException
    {
        el el1;
        for(Iterator iterator = field_1094_a.values().iterator(); iterator.hasNext(); el.func_738_a(el1, dataoutput))
        {
            el1 = (el)iterator.next();
        }

        dataoutput.writeByte(0);
    }

    void func_736_a(DataInput datainput) throws IOException
    {
        field_1094_a.clear();
        el el1;
        for(; (el1 = el.func_734_b(datainput)).func_733_a() != 0; field_1094_a.put(el1.func_737_b(), el1)) { }
    }

    public byte func_733_a()
    {
        return 10;
    }

    public void func_762_a(String s, el el1)
    {
        field_1094_a.put(s, el1.func_732_a(s));
    }

    public void func_761_a(String s, byte byte0)
    {
        field_1094_a.put(s, (new ix(byte0)).func_732_a(s));
    }

    public void func_749_a(String s, short word0)
    {
        field_1094_a.put(s, (new ls(word0)).func_732_a(s));
    }

    public void func_758_a(String s, int i)
    {
        field_1094_a.put(s, (new io(i)).func_732_a(s));
    }

    public void func_750_a(String s, long l)
    {
        field_1094_a.put(s, (new gn(l)).func_732_a(s));
    }

    public void func_744_a(String s, float f1)
    {
        field_1094_a.put(s, (new f(f1)).func_732_a(s));
    }

    public void func_765_a(String s, double d)
    {
        field_1094_a.put(s, (new kr(d)).func_732_a(s));
    }

    public void func_754_a(String s, String s1)
    {
        field_1094_a.put(s, (new ne(s1)).func_732_a(s));
    }

    public void func_747_a(String s, byte abyte0[])
    {
        field_1094_a.put(s, (new dy(abyte0)).func_732_a(s));
    }

    public void func_763_a(String s, hm hm1)
    {
        field_1094_a.put(s, hm1.func_732_a(s));
    }

    public void func_748_a(String s, boolean flag)
    {
        func_761_a(s, ((byte)(flag ? 1 : 0)));
    }

    public boolean func_751_b(String s)
    {
        return field_1094_a.containsKey(s);
    }

    public byte func_746_c(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return 0;
        } else
        {
            return ((ix)field_1094_a.get(s)).field_1092_a;
        }
    }

    public short func_745_d(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return 0;
        } else
        {
            return ((ls)field_1094_a.get(s)).field_1088_a;
        }
    }

    public int func_756_e(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return 0;
        } else
        {
            return ((io)field_1094_a.get(s)).field_1093_a;
        }
    }

    public long func_764_f(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return 0L;
        } else
        {
            return ((gn)field_1094_a.get(s)).field_1095_a;
        }
    }

    public float func_752_g(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return 0.0F;
        } else
        {
            return ((f)field_1094_a.get(s)).field_1097_a;
        }
    }

    public double func_757_h(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return 0.0D;
        } else
        {
            return ((kr)field_1094_a.get(s)).field_1089_a;
        }
    }

    public String func_755_i(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return "";
        } else
        {
            return ((ne)field_1094_a.get(s)).field_1098_a;
        }
    }

    public byte[] func_759_j(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return new byte[0];
        } else
        {
            return ((dy)field_1094_a.get(s)).field_1096_a;
        }
    }

    public hm func_743_k(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return new hm();
        } else
        {
            return (hm)field_1094_a.get(s);
        }
    }

    public ki func_753_l(String s)
    {
        if(!field_1094_a.containsKey(s))
        {
            return new ki();
        } else
        {
            return (ki)field_1094_a.get(s);
        }
    }

    public boolean func_760_m(String s)
    {
        return func_746_c(s) != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("").append(field_1094_a.size()).append(" entries").toString();
    }

    private Map field_1094_a;
}
