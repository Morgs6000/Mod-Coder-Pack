// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class ic
{

    private static java.util.Map a = new HashMap();
    private static java.util.Map b = new HashMap();
    public cn e;
    public int f;
    public int g;
    public int h;

    public ic()
    {
    }

    private static void a(java.lang.Class class1, java.lang.String s)
    {
        if(b.containsKey(((java.lang.Object) (s))))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate id: ").append(s).toString());
        } else
        {
            a.put(((java.lang.Object) (s)), ((java.lang.Object) (class1)));
            b.put(((java.lang.Object) (class1)), ((java.lang.Object) (s)));
            return;
        }
    }

    public void a(hm hm1)
    {
        f = hm1.e("x");
        g = hm1.e("y");
        h = hm1.e("z");
    }

    public void b(hm hm1)
    {
        java.lang.String s = (java.lang.String)b.get(((java.lang.Object) (((java.lang.Object)this).getClass())));
        if(s == null)
        {
            throw new RuntimeException((new StringBuilder()).append(((java.lang.Object) (((java.lang.Object)this).getClass()))).append(" is missing a mapping! This is a bug!").toString());
        } else
        {
            hm1.a("id", s);
            hm1.a("x", f);
            hm1.a("y", g);
            hm1.a("z", h);
            return;
        }
    }

    public void b()
    {
    }

    public static ic c(hm hm1)
    {
        ic ic1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)a.get(((java.lang.Object) (hm1.i("id"))));
            if(class1 != null)
                ic1 = (ic)class1.newInstance();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        if(ic1 != null)
            ic1.a(hm1);
        else
            java.lang.System.out.println((new StringBuilder()).append("Skipping TileEntity with id ").append(hm1.i("id")).toString());
        return ic1;
    }

    public int f()
    {
        return e.e(f, g, h);
    }

    public void j_()
    {
        e.b(f, g, h, this);
    }

    public double a(double d, double d1, double d2)
    {
        double d3 = ((double)f + 0.5D) - d;
        double d4 = ((double)g + 0.5D) - d1;
        double d5 = ((double)h + 0.5D) - d2;
        return d3 * d3 + d4 * d4 + d5 * d5;
    }

    public ly g()
    {
        return ly.n[e.a(f, g, h)];
    }

    static 
    {
        ic.a(ke.class, "Furnace");
        ic.a(fe.class, "Chest");
        ic.a(ob.class, "Sign");
        ic.a(bd.class, "MobSpawner");
    }
}
