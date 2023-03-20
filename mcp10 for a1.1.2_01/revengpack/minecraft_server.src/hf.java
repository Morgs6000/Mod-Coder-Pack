// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class hf
{

    private transient gw a[];
    private transient int b;
    private int c;
    private final float d = 0.75F;
    private volatile transient int e;

    public hf()
    {
        c = 12;
        a = new gw[16];
    }

    private static int g(int i)
    {
        i ^= i >>> 20 ^ i >>> 12;
        return i ^ i >>> 7 ^ i >>> 4;
    }

    private static int a(int i, int j)
    {
        return i & j - 1;
    }

    public java.lang.Object a(int i)
    {
        int j = hf.g(i);
        for(gw gw1 = a[hf.a(j, a.length)]; gw1 != null; gw1 = gw1.c)
            if(gw1.a == i)
                return gw1.b;

        return ((java.lang.Object) (null));
    }

    public boolean b(int i)
    {
        return c(i) != null;
    }

    final gw c(int i)
    {
        int j = hf.g(i);
        for(gw gw1 = a[hf.a(j, a.length)]; gw1 != null; gw1 = gw1.c)
            if(gw1.a == i)
                return gw1;

        return null;
    }

    public void a(int i, java.lang.Object obj)
    {
        int j = hf.g(i);
        int k = hf.a(j, a.length);
        for(gw gw1 = a[k]; gw1 != null; gw1 = gw1.c)
            if(gw1.a == i)
                gw1.b = obj;

        e++;
        a(j, i, obj, k);
    }

    private void h(int i)
    {
        gw agw[] = a;
        int j = agw.length;
        if(j == 0x40000000)
        {
            c = 0x7fffffff;
            return;
        } else
        {
            gw agw1[] = new gw[i];
            a(agw1);
            a = agw1;
            c = (int)((float)i * d);
            return;
        }
    }

    private void a(gw agw[])
    {
        gw agw1[] = a;
        int i = agw.length;
        for(int j = 0; j < agw1.length; j++)
        {
            gw gw1 = agw1[j];
            if(gw1 == null)
                continue;
            agw1[j] = null;
            do
            {
                gw gw2 = gw1.c;
                int k = hf.a(gw1.d, i);
                gw1.c = agw[k];
                agw[k] = gw1;
                gw1 = gw2;
            } while(gw1 != null);
        }

    }

    public java.lang.Object d(int i)
    {
        gw gw1 = e(i);
        return gw1 != null ? gw1.b : null;
    }

    final gw e(int i)
    {
        int j = hf.g(i);
        int k = hf.a(j, a.length);
        gw gw1 = a[k];
        gw gw2;
        gw gw3;
        for(gw2 = gw1; gw2 != null; gw2 = gw3)
        {
            gw3 = gw2.c;
            if(gw2.a == i)
            {
                e++;
                b--;
                if(gw1 == gw2)
                    a[k] = gw3;
                else
                    gw1.c = gw3;
                return gw2;
            }
            gw1 = gw2;
        }

        return gw2;
    }

    public void a()
    {
        e++;
        gw agw[] = a;
        for(int i = 0; i < agw.length; i++)
            agw[i] = null;

        b = 0;
    }

    private void a(int i, int j, java.lang.Object obj, int k)
    {
        gw gw1 = a[k];
        a[k] = new gw(i, j, obj, gw1);
        if(b++ >= c)
            h(2 * a.length);
    }

    static int f(int i)
    {
        return hf.g(i);
    }
}
