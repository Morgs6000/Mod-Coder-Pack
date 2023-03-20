// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public abstract class fn
{

    public fn()
    {
        field_472_j = false;
    }

    static void func_321_a(int i, Class class1)
    {
        if(field_471_a.containsKey(Integer.valueOf(i)))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet id:").append(i).toString());
        }
        if(field_470_b.containsKey(class1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet class:").append(class1).toString());
        } else
        {
            field_471_a.put(Integer.valueOf(i), class1);
            field_470_b.put(class1, Integer.valueOf(i));
            return;
        }
    }

    public static fn func_325_a(int i)
    {
        try
        {
            Class class1 = (Class)field_471_a.get(Integer.valueOf(i));
            if(class1 == null)
            {
                return null;
            } else
            {
                return (fn)class1.newInstance();
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        System.out.println((new StringBuilder()).append("Skipping packet with id ").append(i).toString());
        return null;
    }

    public final int func_326_b()
    {
        return ((Integer)field_470_b.get(getClass())).intValue();
    }

    public static fn func_324_b(DataInputStream datainputstream) throws IOException
    {
        int i = datainputstream.read();
        if(i == -1)
        {
            return null;
        }
        fn fn1 = func_325_a(i);
        if(fn1 == null)
        {
            throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
        } else
        {
            fn1.func_327_a(datainputstream);
            return fn1;
        }
    }

    public static void func_328_a(fn fn1, DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(fn1.func_326_b());
        fn1.func_322_a(dataoutputstream);
    }

    public abstract void func_327_a(DataInputStream datainputstream) throws IOException;

    public abstract void func_322_a(DataOutputStream dataoutputstream) throws IOException;

    public abstract void func_323_a(lb lb);

    public abstract int func_329_a();

    static Class _mthclass$(String s1)
    {
        try
        {
            return Class.forName(s1);
        }
        catch(ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    private static Map field_471_a = new HashMap();
    private static Map field_470_b = new HashMap();
    public boolean field_472_j;

    static 
    {
        func_321_a(0, gi.class);
        func_321_a(1, hp.class);
        func_321_a(2, gt.class);
        func_321_a(3, ij.class);
        func_321_a(4, du.class);
        func_321_a(5, m.class);
        func_321_a(6, ji.class);
        func_321_a(10, eh.class);
        func_321_a(11, s.class);
        func_321_a(12, mh.class);
        func_321_a(13, ch.class);
        func_321_a(14, fg.class);
        func_321_a(15, dofix.class);
        func_321_a(16, dz.class);
        func_321_a(17, ld.class);
        func_321_a(18, hf.class);
        func_321_a(20, gp.class);
        func_321_a(21, ha.class);
        func_321_a(22, bm.class);
        func_321_a(23, kj.class);
        func_321_a(24, ez.class);
        func_321_a(29, ju.class);
        func_321_a(30, lq.class);
        func_321_a(31, kp.class);
        func_321_a(32, jx.class);
        func_321_a(33, is.class);
        func_321_a(34, jl.class);
        func_321_a(50, ka.class);
        func_321_a(51, bz.class);
        func_321_a(52, na.class);
        func_321_a(53, li.class);
        func_321_a(59, ny.class);
        func_321_a(255, oh.class);
    }
}
