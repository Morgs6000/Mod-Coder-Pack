// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ew
{

    public ew()
    {
    }

    private static void func_1080_a(Class class1, String s, int i)
    {
        field_1611_a.put(s, class1);
        field_1610_b.put(class1, s);
        field_1613_c.put(Integer.valueOf(i), class1);
        field_1612_d.put(class1, Integer.valueOf(i));
    }

    public static kh func_1079_a(String s, cn cn1)
    {
        kh kh1 = null;
        try
        {
            Class class1 = (Class)field_1611_a.get(s);
            if(class1 != null)
            {
                kh1 = (kh)class1.getConstructor(new Class[] {
                    cn.class
                }).newInstance(new Object[] {
                    cn1
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return kh1;
    }

    public static kh func_1081_a(hm hm1, cn cn1)
    {
        kh kh1 = null;
        try
        {
            Class class1 = (Class)field_1611_a.get(hm1.func_755_i("id"));
            if(class1 != null)
            {
                kh1 = (kh)class1.getConstructor(new Class[] {
                    cn.class
                }).newInstance(new Object[] {
                    cn1
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(kh1 != null)
        {
            kh1.func_368_e(hm1);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(hm1.func_755_i("id")).toString());
        }
        return kh1;
    }

    public static kh func_1084_a(int i, cn cn1)
    {
        kh kh1 = null;
        try
        {
            Class class1 = (Class)field_1613_c.get(Integer.valueOf(i));
            if(class1 != null)
            {
                kh1 = (kh)class1.getConstructor(new Class[] {
                    cn.class
                }).newInstance(new Object[] {
                    cn1
                });
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(kh1 == null)
        {
            System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(i).toString());
        }
        return kh1;
    }

    public static int func_1082_a(kh kh1)
    {
        return ((Integer)field_1612_d.get(kh1.getClass())).intValue();
    }

    public static String func_1083_b(kh kh1)
    {
        return (String)field_1610_b.get(kh1.getClass());
    }

    private static Map field_1611_a = new HashMap();
    private static Map field_1610_b = new HashMap();
    private static Map field_1613_c = new HashMap();
    private static Map field_1612_d = new HashMap();

    static 
    {
        func_1080_a(kg.class, "Arrow", 10);
        func_1080_a(ao.class, "Snowball", 11);
        func_1080_a(dx.class, "Item", 1);
        func_1080_a(jc.class, "Painting", 9);
        func_1080_a(ge.class, "Mob", 48);
        func_1080_a(dq.class, "Monster", 49);
        func_1080_a(dd.class, "Creeper", 50);
        func_1080_a(cw.class, "Skeleton", 51);
        func_1080_a(ax.class, "Spider", 52);
        func_1080_a(hl.class, "Giant", 53);
        func_1080_a(mb.class, "Zombie", 54);
        func_1080_a(ma.class, "Slime", 55);
        func_1080_a(mv.class, "Pig", 90);
        func_1080_a(bo.class, "Sheep", 91);
        func_1080_a(am.class, "Cow", 91);
        func_1080_a(mz.class, "Chicken", 91);
        func_1080_a(jd.class, "PrimedTnt", 20);
        func_1080_a(ff.class, "FallingSand", 21);
        func_1080_a(oc.class, "Minecart", 40);
        func_1080_a(dc.class, "Boat", 41);
    }
}
