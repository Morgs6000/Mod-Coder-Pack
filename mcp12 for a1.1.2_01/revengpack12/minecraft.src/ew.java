// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ew
{

    private static java.util.Map a = new HashMap();
    private static java.util.Map b = new HashMap();
    private static java.util.Map c = new HashMap();
    private static java.util.Map d = new HashMap();

    public ew()
    {
    }

    private static void a(java.lang.Class class1, java.lang.String s, int i)
    {
        a.put(((java.lang.Object) (s)), ((java.lang.Object) (class1)));
        b.put(((java.lang.Object) (class1)), ((java.lang.Object) (s)));
        c.put(((java.lang.Object) (java.lang.Integer.valueOf(i))), ((java.lang.Object) (class1)));
        d.put(((java.lang.Object) (class1)), ((java.lang.Object) (java.lang.Integer.valueOf(i))));
    }

    public static kh a(java.lang.String s, cn cn1)
    {
        kh kh1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)a.get(((java.lang.Object) (s)));
            if(class1 != null)
                kh1 = (kh)class1.getConstructor(new java.lang.Class[] {
                    cn.class
                }).newInstance(new java.lang.Object[] {
                    cn1
                });
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        return kh1;
    }

    public static kh a(hm hm1, cn cn1)
    {
        kh kh1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)a.get(((java.lang.Object) (hm1.i("id"))));
            if(class1 != null)
                kh1 = (kh)class1.getConstructor(new java.lang.Class[] {
                    cn.class
                }).newInstance(new java.lang.Object[] {
                    cn1
                });
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        if(kh1 != null)
            kh1.e(hm1);
        else
            java.lang.System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(hm1.i("id")).toString());
        return kh1;
    }

    public static kh a(int i, cn cn1)
    {
        kh kh1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)c.get(((java.lang.Object) (java.lang.Integer.valueOf(i))));
            if(class1 != null)
                kh1 = (kh)class1.getConstructor(new java.lang.Class[] {
                    cn.class
                }).newInstance(new java.lang.Object[] {
                    cn1
                });
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        if(kh1 == null)
            java.lang.System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(i).toString());
        return kh1;
    }

    public static int a(kh kh1)
    {
        return ((java.lang.Integer)d.get(((java.lang.Object) (((java.lang.Object) (kh1)).getClass())))).intValue();
    }

    public static java.lang.String b(kh kh1)
    {
        return (java.lang.String)b.get(((java.lang.Object) (((java.lang.Object) (kh1)).getClass())));
    }

    static 
    {
        ew.a(kg.class, "Arrow", 10);
        ew.a(ao.class, "Snowball", 11);
        ew.a(dx.class, "Item", 1);
        ew.a(jc.class, "Painting", 9);
        ew.a(ge.class, "Mob", 48);
        ew.a(dq.class, "Monster", 49);
        ew.a(dd.class, "Creeper", 50);
        ew.a(cw.class, "Skeleton", 51);
        ew.a(ax.class, "Spider", 52);
        ew.a(hl.class, "Giant", 53);
        ew.a(mb.class, "Zombie", 54);
        ew.a(ma.class, "Slime", 55);
        ew.a(mv.class, "Pig", 90);
        ew.a(bo.class, "Sheep", 91);
        ew.a(am.class, "Cow", 91);
        ew.a(mz.class, "Chicken", 91);
        ew.a(jd.class, "PrimedTnt", 20);
        ew.a(ff.class, "FallingSand", 21);
        ew.a(oc.class, "Minecart", 40);
        ew.a(dc.class, "Boat", 41);
    }
}
