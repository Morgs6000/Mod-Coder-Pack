// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class ic
{

    public ic()
    {
    }

    private static void func_476_a(Class class1, String s)
    {
        if(field_819_b.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id: ").append(s).toString());
        } else
        {
            field_820_a.put(s, class1);
            field_819_b.put(class1, s);
            return;
        }
    }

    public void func_482_a(hm hm1)
    {
        field_823_f = hm1.func_756_e("x");
        field_822_g = hm1.func_756_e("y");
        field_821_h = hm1.func_756_e("z");
    }

    public void func_481_b(hm hm1)
    {
        String s = (String)field_819_b.get(getClass());
        if(s == null)
        {
            throw new RuntimeException((new StringBuilder()).append(getClass()).append(" is missing a mapping! This is a bug!").toString());
        } else
        {
            hm1.func_754_a("id", s);
            hm1.func_758_a("x", field_823_f);
            hm1.func_758_a("y", field_822_g);
            hm1.func_758_a("z", field_821_h);
            return;
        }
    }

    public void func_475_b()
    {
    }

    public static ic func_477_c(hm hm1)
    {
        ic ic1 = null;
        try
        {
            Class class1 = (Class)field_820_a.get(hm1.func_755_i("id"));
            if(class1 != null)
            {
                ic1 = (ic)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        if(ic1 != null)
        {
            ic1.func_482_a(hm1);
        } else
        {
            System.out.println((new StringBuilder()).append("Skipping TileEntity with id ").append(hm1.func_755_i("id")).toString());
        }
        return ic1;
    }

    public int func_479_f()
    {
        return field_824_e.func_602_e(field_823_f, field_822_g, field_821_h);
    }

    public void func_474_j_()
    {
        field_824_e.func_698_b(field_823_f, field_822_g, field_821_h, this);
    }

    public double func_480_a(double d, double d1, double d2)
    {
        double d3 = ((double)field_823_f + 0.5D) - d;
        double d4 = ((double)field_822_g + 0.5D) - d1;
        double d5 = ((double)field_821_h + 0.5D) - d2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public ly func_478_g()
    {
        return ly.field_345_n[field_824_e.func_600_a(field_823_f, field_822_g, field_821_h)];
    }

    static Class _mthclass$(String s)
    {
        try
        {
            return Class.forName(s);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    private static Map field_820_a = new HashMap();
    private static Map field_819_b = new HashMap();
    public cn field_824_e;
    public int field_823_f;
    public int field_822_g;
    public int field_821_h;

    static 
    {
        func_476_a(ke.class, "Furnace");
        func_476_a(fe.class, "Chest");
        func_476_a(ob.class, "Sign");
        func_476_a(bd.class, "MobSpawner");
    }
}
