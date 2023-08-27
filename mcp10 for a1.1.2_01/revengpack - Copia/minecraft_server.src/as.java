// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class as
{

    private static java.util.Map e = new HashMap();
    private static java.util.Map f = new HashMap();
    public dy a;
    public int b;
    public int c;
    public int d;

    public as()
    {
    }

    private static void a(java.lang.Class class1, java.lang.String s1)
    {
        if(f.containsKey(((java.lang.Object) (s1))))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id: ").append(s1).toString());
        } else
        {
            e.put(((java.lang.Object) (s1)), ((java.lang.Object) (class1)));
            f.put(((java.lang.Object) (class1)), ((java.lang.Object) (s1)));
            return;
        }
    }

    public void a(s s1)
    {
        b = s1.d("x");
        c = s1.d("y");
        d = s1.d("z");
    }

    public void b(s s1)
    {
        java.lang.String s2 = (java.lang.String)f.get(((java.lang.Object) (((java.lang.Object)this).getClass())));
        if(s2 == null)
        {
            throw new RuntimeException((new StringBuilder()).append(((java.lang.Object) (((java.lang.Object)this).getClass()))).append(" is missing a mapping! This is a bug!").toString());
        } else
        {
            s1.a("id", s2);
            s1.a("x", b);
            s1.a("y", c);
            s1.a("z", d);
            return;
        }
    }

    public void b()
    {
    }

    public static as c(s s1)
    {
        as as1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)e.get(((java.lang.Object) (s1.h("id"))));
            if(class1 != null)
                as1 = (as)class1.newInstance();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        if(as1 != null)
            as1.a(s1);
        else
            java.lang.System.out.println((new StringBuilder()).append("Skipping TileEntity with id ").append(s1.h("id")).toString());
        return as1;
    }

    public void c()
    {
        a.b(b, c, d, this);
    }

    static 
    {
        as.a(df.class, "Furnace");
        as.a(hb.class, "Chest");
        as.a(ig.class, "Sign");
        as.a(bs.class, "MobSpawner");
    }
}
