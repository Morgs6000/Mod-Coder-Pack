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

public abstract class hp
{

    private static java.util.Map a = new HashMap();
    private static java.util.Map b = new HashMap();
    public boolean j;

    public hp()
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

    public static hp a(int i)
    {
        java.lang.Class class1;
        class1 = (java.lang.Class)a.get(((java.lang.Object) (java.lang.Integer.valueOf(i))));
        if(class1 == null)
            return null;
        try
        {
            return (hp)class1.newInstance();
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

    public static hp b(java.io.DataInputStream datainputstream) throws IOException
    {
        int i = datainputstream.read();
        if(i == -1)
            return null;
        hp hp1 = hp.a(i);
        if(hp1 == null)
        {
            throw new IOException((new StringBuilder()).append("Bad packet id ").append(i).toString());
        } else
        {
            hp1.a(datainputstream);
            return hp1;
        }
    }

    public static void a(hp hp1, java.io.DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.write(hp1.b());
        hp1.a(dataoutputstream);
    }

    public abstract void a(java.io.DataInputStream datainputstream) throws IOException;

    public abstract void a(java.io.DataOutputStream dataoutputstream) throws IOException;

    public abstract void a(ej ej);

    public abstract int a();

    static 
    {
        hp.a(0, iz.class);
        hp.a(1, z.class);
        hp.a(2, e.class);
        hp.a(3, ba.class);
        hp.a(4, fl.class);
        hp.a(5, r.class);
        hp.a(6, cb.class);
        hp.a(10, gf.class);
        hp.a(11, aa.class);
        hp.a(12, fx.class);
        hp.a(13, dq.class);
        hp.a(14, hd.class);
        hp.a(15, fe.class);
        hp.a(16, fv.class);
        hp.a(17, en.class);
        hp.a(18, o.class);
        hp.a(20, c.class);
        hp.a(21, k.class);
        hp.a(22, ce.class);
        hp.a(23, dl.class);
        hp.a(24, gv.class);
        hp.a(29, ct.class);
        hp.a(30, ex.class);
        hp.a(31, dr.class);
        hp.a(32, cx.class);
        hp.a(33, bg.class);
        hp.a(34, cf.class);
        hp.a(50, da.class);
        hp.a(51, cz.class);
        hp.a(52, hh.class);
        hp.a(53, et.class);
        hp.a(59, ib.class);
        hp.a(255, io.class);
    }
}
