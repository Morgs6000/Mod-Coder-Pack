// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public abstract class fn
{

    private static java.util.Map a = new HashMap();
    private static java.util.Map b = new HashMap();
    public boolean j;

    public fn()
    {
        j = false;
    }

    static void a(int i, java.lang.Class class1)
    {
        if(a.containsKey(((java.lang.Object) (java.lang.Integer.valueOf(i)))))
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet id:").append(i).toString());
        if(b.containsKey(((java.lang.Object) (class1))))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate packet class:").append(((java.lang.Object) (class1))).toString());
        } else
        {
            a.put(((java.lang.Object) (java.lang.Integer.valueOf(i))), ((java.lang.Object) (class1)));
            b.put(((java.lang.Object) (class1)), ((java.lang.Object) (java.lang.Integer.valueOf(i))));
            return;
        }
    }

    public static fn a(int i)
    {
        java.lang.Class class1;
        class1 = (java.lang.Class)a.get(((java.lang.Object) (java.lang.Integer.valueOf(i))));
        if(class1 == null)
            return null;
        try
        {
            return (fn)class1.newInstance();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        java.lang.System.out.println((new StringBuilder()).append("Skipping packet with id ").append(i).toString());
        return null;
    }

    public final int b()
    {
        return ((java.lang.Integer)b.get(((java.lang.Object) (((java.lang.Object)this).getClass())))).intValue();
    }

    public static fn b(java.io.DataInputStream datainputstream) throws IOException
    {
        int i = datainputstream.read();
        if(i == -1)
            return null;
        fn fn1 = fn.a(i);
        if(fn1 == null)
        {
            throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
        } else
        {
            fn1.a(datainputstream);
            return fn1;
        }
    }

    public static void a(fn fn1, java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(fn1.b());
        fn1.a(dataoutputstream);
    }

    public abstract void a(java.io.DataInputStream datainputstream) throws IOException;

    public abstract void a(java.io.DataOutputStream dataoutputstream) throws IOException;

    public abstract void a(lb lb);

    public abstract int a();

    static 
    {
        fn.a(0, gi.class);
        fn.a(1, hp.class);
        fn.a(2, gt.class);
        fn.a(3, ij.class);
        fn.a(4, du.class);
        fn.a(5, m.class);
        fn.a(6, ji.class);
        fn.a(10, eh.class);
        fn.a(11, s.class);
        fn.a(12, mh.class);
        fn.a(13, ch.class);
        fn.a(14, fg.class);
        fn.a(15, dofix.class);
        fn.a(16, dz.class);
        fn.a(17, ld.class);
        fn.a(18, hf.class);
        fn.a(20, gp.class);
        fn.a(21, ha.class);
        fn.a(22, bm.class);
        fn.a(23, kj.class);
        fn.a(24, ez.class);
        fn.a(29, ju.class);
        fn.a(30, lq.class);
        fn.a(31, kp.class);
        fn.a(32, jx.class);
        fn.a(33, is.class);
        fn.a(34, jl.class);
        fn.a(50, ka.class);
        fn.a(51, bz.class);
        fn.a(52, na.class);
        fn.a(53, li.class);
        fn.a(59, ny.class);
        fn.a(255, oh.class);
    }
}
