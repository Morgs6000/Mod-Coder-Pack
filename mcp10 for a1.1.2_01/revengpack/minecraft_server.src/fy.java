// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class fy
{

    public dj a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    private double l;
    private double m;
    private double n;
    private boolean o;
    public boolean j;
    public java.util.Set k;

    public fy(dj dj1, int i1, int j1)
    {
        i = 0;
        o = false;
        j = false;
        k = ((java.util.Set) (new HashSet()));
        a = dj1;
        b = i1;
        c = j1;
        d = gj.b(dj1.l * 32D);
        e = gj.b(dj1.m * 32D);
        f = gj.b(dj1.n * 32D);
        g = gj.d((dj1.r * 256F) / 360F);
        h = gj.d((dj1.s * 256F) / 360F);
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof fy)
            return ((fy)obj).a.c == a.c;
        else
            return false;
    }

    public int hashCode()
    {
        return a.c;
    }

    public void a(java.util.List list)
    {
        j = false;
        if(!o || a.d(l, m, n) > 16D)
        {
            b(list);
            l = a.l;
            m = a.m;
            n = a.n;
            o = true;
            j = true;
        }
        if(i++ % c == 0)
        {
            int i1 = gj.b(a.l * 32D);
            int j1 = gj.b(a.m * 32D);
            int k1 = gj.b(a.n * 32D);
            int l1 = gj.d((a.r * 256F) / 360F);
            int i2 = gj.d((a.s * 256F) / 360F);
            boolean flag = i1 != d || j1 != e || k1 != f;
            boolean flag1 = l1 != g || i2 != h;
            int j2 = i1 - d;
            int k2 = j1 - e;
            int l2 = k1 - f;
            java.lang.Object obj = null;
            if(j2 < -128 || j2 >= 128 || k2 < -128 || k2 >= 128 || l2 < -128 || l2 >= 128)
                obj = ((java.lang.Object) (new cf(a.c, i1, j1, k1, (byte)l1, (byte)i2)));
            else
            if(flag && flag1)
                obj = ((java.lang.Object) (new bg(a.c, (byte)j2, (byte)k2, (byte)l2, (byte)l1, (byte)i2)));
            else
            if(flag)
                obj = ((java.lang.Object) (new dr(a.c, (byte)j2, (byte)k2, (byte)l2)));
            else
            if(flag1)
                obj = ((java.lang.Object) (new cx(a.c, (byte)l1, (byte)i2)));
            else
                obj = ((java.lang.Object) (new ex(a.c)));
            if(obj != null)
                a(((hp) (obj)));
            d = i1;
            e = j1;
            f = k1;
            g = l1;
            h = i2;
        }
    }

    public void a(hp hp)
    {
        ea ea1;
        for(java.util.Iterator iterator = k.iterator(); iterator.hasNext(); ea1.a.b(hp))
            ea1 = (ea)iterator.next();

    }

    public void a()
    {
        a(((hp) (new ct(a.c))));
    }

    public void a(ea ea1)
    {
        if(ea1 == a)
            return;
        double d1 = ea1.l - (double)(d / 32);
        double d2 = ea1.n - (double)(f / 32);
        if(d1 >= (double)(-b) && d1 <= (double)b && d2 >= (double)(-b) && d2 <= (double)b)
        {
            if(!k.contains(((java.lang.Object) (ea1))))
            {
                k.add(((java.lang.Object) (ea1)));
                ea1.a.b(b());
            }
        } else
        if(k.contains(((java.lang.Object) (ea1))))
        {
            k.remove(((java.lang.Object) (ea1)));
            ea1.a.b(((hp) (new ct(a.c))));
        }
    }

    public void b(java.util.List list)
    {
        for(int i1 = 0; i1 < list.size(); i1++)
            a((ea)list.get(i1));

    }

    private hp b()
    {
        if(a instanceof fn)
        {
            fn fn1 = (fn)a;
            k k1 = new k(fn1);
            fn1.l = (double)k1.b / 32D;
            fn1.m = (double)k1.c / 32D;
            fn1.n = (double)k1.d / 32D;
            fn1.o = (double)k1.e / 128D;
            fn1.p = (double)k1.f / 128D;
            fn1.q = (double)k1.g / 128D;
            return ((hp) (k1));
        }
        if(a instanceof ea)
            return ((hp) (new c((fc)a)));
        if(a instanceof ih)
        {
            ih ih1 = (ih)a;
            if(ih1.ae == 0)
                return ((hp) (new dl(a, 10)));
            if(ih1.ae == 1)
                return ((hp) (new dl(a, 11)));
            if(ih1.ae == 2)
                return ((hp) (new dl(a, 12)));
        }
        if(a instanceof es)
            return ((hp) (new dl(a, 1)));
        if(a instanceof ab)
            return ((hp) (new gv((is)a)));
        else
            throw new IllegalArgumentException((new StringBuilder()).append("Don't know how to add ").append(((java.lang.Object) (((java.lang.Object) (a)).getClass()))).append("!").toString());
    }
}
