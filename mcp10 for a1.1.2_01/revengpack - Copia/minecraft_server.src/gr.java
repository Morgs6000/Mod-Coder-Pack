// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class gr
{

    private static java.util.Map a = new HashMap();
    private static java.util.Map b = new HashMap();
    private static java.util.Map c = new HashMap();
    private static java.util.Map d = new HashMap();

    public gr()
    {
    }

    private static void a(java.lang.Class class1, java.lang.String s1, int i)
    {
        a.put(((java.lang.Object) (s1)), ((java.lang.Object) (class1)));
        b.put(((java.lang.Object) (class1)), ((java.lang.Object) (s1)));
        c.put(((java.lang.Object) (java.lang.Integer.valueOf(i))), ((java.lang.Object) (class1)));
        d.put(((java.lang.Object) (class1)), ((java.lang.Object) (java.lang.Integer.valueOf(i))));
    }

    public static dj a(java.lang.String s1, dy dy1)
    {
        dj dj1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)a.get(((java.lang.Object) (s1)));
            if(class1 != null)
                dj1 = (dj)class1.getConstructor(new java.lang.Class[] {
                    dy.class
                }).newInstance(new java.lang.Object[] {
                    dy1
                });
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        return dj1;
    }

    public static dj a(s s1, dy dy1)
    {
        dj dj1 = null;
        try
        {
            java.lang.Class class1 = (java.lang.Class)a.get(((java.lang.Object) (s1.h("id"))));
            if(class1 != null)
                dj1 = (dj)class1.getConstructor(new java.lang.Class[] {
                    dy.class
                }).newInstance(new java.lang.Object[] {
                    dy1
                });
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        if(dj1 != null)
            dj1.e(s1);
        else
            java.lang.System.out.println((new StringBuilder()).append("Skipping Entity with id ").append(s1.h("id")).toString());
        return dj1;
    }

    public static int a(dj dj1)
    {
        return ((java.lang.Integer)d.get(((java.lang.Object) (((java.lang.Object) (dj1)).getClass())))).intValue();
    }

    public static java.lang.String b(dj dj1)
    {
        return (java.lang.String)b.get(((java.lang.Object) (((java.lang.Object) (dj1)).getClass())));
    }

    static 
    {
        gr.a(di.class, "Arrow", 10);
        gr.a(az.class, "Snowball", 11);
        gr.a(fn.class, "Item", 1);
        gr.a(bu.class, "Painting", 9);
        gr.a(is.class, "Mob", 48);
        gr.a(fg.class, "Monster", 49);
        gr.a(eu.class, "Creeper", 50);
        gr.a(ek.class, "Skeleton", 51);
        gr.a(bk.class, "Spider", 52);
        gr.a(q.class, "Giant", 53);
        gr.a(fm.class, "Zombie", 54);
        gr.a(fh.class, "Slime", 55);
        gr.a(gu.class, "Pig", 90);
        gr.a(cj.class, "Sheep", 91);
        gr.a(ay.class, "Cow", 91);
        gr.a(hi.class, "Chicken", 91);
        gr.a(bx.class, "PrimedTnt", 20);
        gr.a(hc.class, "FallingSand", 21);
        gr.a(ih.class, "Minecart", 40);
        gr.a(es.class, "Boat", 41);
    }
}
