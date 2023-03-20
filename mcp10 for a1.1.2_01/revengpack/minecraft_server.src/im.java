// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class im
{

    public static boolean a;
    public byte b[];
    public boolean c;
    public dy d;
    public gt e;
    public gt f;
    public gt g;
    public byte h[];
    public int i;
    public final int j;
    public final int k;
    public java.util.Map l;
    public java.util.List m[];
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;

    public im(dy dy1, int i1, int j1)
    {
        l = ((java.util.Map) (new HashMap()));
        m = new java.util.List[8];
        n = false;
        o = false;
        q = false;
        r = false;
        s = 0L;
        d = dy1;
        j = i1;
        k = j1;
        h = new byte[256];
        for(int k1 = 0; k1 < m.length; k1++)
            m[k1] = ((java.util.List) (new ArrayList()));

    }

    public im(dy dy1, byte abyte0[], int i1, int j1)
    {
        this(dy1, i1, j1);
        b = abyte0;
        e = new gt(abyte0.length);
        f = new gt(abyte0.length);
        g = new gt(abyte0.length);
    }

    public boolean a(int i1, int j1)
    {
        return i1 == j && j1 == k;
    }

    public int b(int i1, int j1)
    {
        return h[j1 << 4 | i1] & 0xff;
    }

    public void a()
    {
    }

    public void b()
    {
        int i1 = 127;
        for(int j1 = 0; j1 < 16; j1++)
        {
            for(int l1 = 0; l1 < 16; l1++)
            {
                h[l1 << 4 | j1] = -128;
                g(j1, 127, l1);
                if((h[l1 << 4 | j1] & 0xff) < i1)
                    i1 = h[l1 << 4 | j1] & 0xff;
            }

        }

        i = i1;
        for(int k1 = 0; k1 < 16; k1++)
        {
            for(int i2 = 0; i2 < 16; i2++)
                c(k1, i2);

        }

        o = true;
    }

    private void c(int i1, int j1)
    {
        int k1 = b(i1, j1);
        int l1 = j * 16 + i1;
        int i2 = k * 16 + j1;
        f(l1 - 1, i2, k1);
        f(l1 + 1, i2, k1);
        f(l1, i2 - 1, k1);
        f(l1, i2 + 1, k1);
    }

    private void f(int i1, int j1, int k1)
    {
        int l1 = d.c(i1, j1);
        if(l1 > k1)
            d.a(cy.a, i1, k1, j1, i1, l1, j1);
        else
        if(l1 < k1)
            d.a(cy.a, i1, l1, j1, i1, k1, j1);
        o = true;
    }

    private void g(int i1, int j1, int k1)
    {
        int l1 = h[k1 << 4 | i1] & 0xff;
        int i2 = l1;
        if(j1 > l1)
            i2 = j1;
        for(int j2 = i1 << 11 | k1 << 7; i2 > 0 && ff.r[b[(j2 + i2) - 1]] == 0; i2--);
        if(i2 == l1)
            return;
        d.f(i1, k1, i2, l1);
        h[k1 << 4 | i1] = (byte)i2;
        if(i2 < i)
        {
            i = i2;
        } else
        {
            int k2 = 127;
            for(int i3 = 0; i3 < 16; i3++)
            {
                for(int k3 = 0; k3 < 16; k3++)
                    if((h[k3 << 4 | i3] & 0xff) < k2)
                        k2 = h[k3 << 4 | i3] & 0xff;

            }

            i = k2;
        }
        int l2 = j * 16 + i1;
        int j3 = k * 16 + k1;
        if(i2 < l1)
        {
            for(int l3 = i2; l3 < l1; l3++)
                f.a(i1, l3, k1, 15);

        } else
        {
            d.a(cy.a, l2, l1, j3, l2, i2, j3);
            for(int i4 = l1; i4 < i2; i4++)
                f.a(i1, i4, k1, 0);

        }
        int j4 = 15;
        int k4 = i2;
        while(i2 > 0 && j4 > 0) 
        {
            i2--;
            int l4 = ff.r[a(i1, i2, k1)];
            if(l4 == 0)
                l4 = 1;
            j4 -= l4;
            if(j4 < 0)
                j4 = 0;
            f.a(i1, i2, k1, j4);
        }
        for(; i2 > 0 && ff.r[a(i1, i2 - 1, k1)] == 0; i2--);
        if(i2 != k4)
            d.a(cy.a, l2 - 1, i2, j3 - 1, l2 + 1, k4, j3 + 1);
        o = true;
    }

    public int a(int i1, int j1, int k1)
    {
        return ((int) (b[i1 << 11 | k1 << 7 | j1]));
    }

    public boolean a(int i1, int j1, int k1, int l1, int i2)
    {
        byte byte0 = (byte)l1;
        int j2 = h[k1 << 4 | i1] & 0xff;
        int k2 = b[i1 << 11 | k1 << 7 | j1] & 0xff;
        if(k2 == l1 && e.a(i1, j1, k1) == i2)
            return false;
        int l2 = j * 16 + i1;
        int i3 = k * 16 + k1;
        b[i1 << 11 | k1 << 7 | j1] = byte0;
        if(k2 != 0 && !d.x)
            ff.n[k2].b(d, l2, j1, i3);
        e.a(i1, j1, k1, i2);
        if(ff.r[byte0] != 0)
        {
            if(j1 >= j2)
                g(i1, j1 + 1, k1);
        } else
        if(j1 == j2 - 1)
            g(i1, j1, k1);
        d.a(cy.a, l2, j1, i3, l2, j1, i3);
        d.a(cy.b, l2, j1, i3, l2, j1, i3);
        c(i1, k1);
        if(l1 != 0)
            ff.n[l1].e(d, l2, j1, i3);
        o = true;
        return true;
    }

    public boolean a(int i1, int j1, int k1, int l1)
    {
        byte byte0 = (byte)l1;
        int i2 = h[k1 << 4 | i1] & 0xff;
        int j2 = b[i1 << 11 | k1 << 7 | j1] & 0xff;
        if(j2 == l1)
            return false;
        int k2 = j * 16 + i1;
        int l2 = k * 16 + k1;
        b[i1 << 11 | k1 << 7 | j1] = byte0;
        if(j2 != 0)
            ff.n[j2].b(d, k2, j1, l2);
        e.a(i1, j1, k1, 0);
        if(ff.r[byte0] != 0)
        {
            if(j1 >= i2)
                g(i1, j1 + 1, k1);
        } else
        if(j1 == i2 - 1)
            g(i1, j1, k1);
        d.a(cy.a, k2, j1, l2, k2, j1, l2);
        d.a(cy.b, k2, j1, l2, k2, j1, l2);
        c(i1, k1);
        if(l1 != 0 && !d.x)
            ff.n[l1].e(d, k2, j1, l2);
        o = true;
        return true;
    }

    public int b(int i1, int j1, int k1)
    {
        return e.a(i1, j1, k1);
    }

    public void b(int i1, int j1, int k1, int l1)
    {
        o = true;
        e.a(i1, j1, k1, l1);
    }

    public int a(cy cy1, int i1, int j1, int k1)
    {
        if(cy1 == cy.a)
            return f.a(i1, j1, k1);
        if(cy1 == cy.b)
            return g.a(i1, j1, k1);
        else
            return 0;
    }

    public void a(cy cy1, int i1, int j1, int k1, int l1)
    {
        o = true;
        if(cy1 == cy.a)
            f.a(i1, j1, k1, l1);
        else
        if(cy1 == cy.b)
            g.a(i1, j1, k1, l1);
        else
            return;
    }

    public int c(int i1, int j1, int k1, int l1)
    {
        int i2 = f.a(i1, j1, k1);
        if(i2 > 0)
            a = true;
        i2 -= l1;
        int j2 = g.a(i1, j1, k1);
        if(j2 > i2)
            i2 = j2;
        return i2;
    }

    public void a(dj dj1)
    {
        if(q)
            return;
        r = true;
        int i1 = gj.b(dj1.l / 16D);
        int j1 = gj.b(dj1.n / 16D);
        if(i1 != j || j1 != k)
            java.lang.System.out.println((new StringBuilder()).append("Wrong location! ").append(((java.lang.Object) (dj1))).toString());
        int k1 = gj.b(dj1.m / 16D);
        if(k1 < 0)
            k1 = 0;
        if(k1 >= m.length)
            k1 = m.length - 1;
        dj1.Z = true;
        dj1.aa = j;
        dj1.ab = k1;
        dj1.ac = k;
        m[k1].add(((java.lang.Object) (dj1)));
    }

    public void b(dj dj1)
    {
        a(dj1, dj1.ab);
    }

    public void a(dj dj1, int i1)
    {
        if(i1 < 0)
            i1 = 0;
        if(i1 >= m.length)
            i1 = m.length - 1;
        m[i1].remove(((java.lang.Object) (dj1)));
    }

    public boolean c(int i1, int j1, int k1)
    {
        return j1 >= (h[k1 << 4 | i1] & 0xff);
    }

    public as d(int i1, int j1, int k1)
    {
        gs gs1 = new gs(i1, j1, k1);
        as as1 = (as)l.get(((java.lang.Object) (gs1)));
        if(as1 == null)
        {
            int l1 = a(i1, j1, k1);
            if(!ff.q[l1])
                return null;
            cs cs1 = (cs)ff.n[l1];
            cs1.e(d, j * 16 + i1, j1, k * 16 + k1);
            as1 = (as)l.get(((java.lang.Object) (gs1)));
        }
        return as1;
    }

    public void a(as as1)
    {
        int i1 = as1.b - j * 16;
        int j1 = as1.c;
        int k1 = as1.d - k * 16;
        a(i1, j1, k1, as1);
    }

    public void a(int i1, int j1, int k1, as as1)
    {
        gs gs1 = new gs(i1, j1, k1);
        as1.a = d;
        as1.b = j * 16 + i1;
        as1.c = j1;
        as1.d = k * 16 + k1;
        if(a(i1, j1, k1) == 0 || !(ff.n[a(i1, j1, k1)] instanceof cs))
        {
            java.lang.System.out.println("Attempted to place a tile entity where there was no entity tile!");
            return;
        }
        if(c)
        {
            if(l.get(((java.lang.Object) (gs1))) != null)
                d.b.remove(l.get(((java.lang.Object) (gs1))));
            d.b.add(((java.lang.Object) (as1)));
        }
        l.put(((java.lang.Object) (gs1)), ((java.lang.Object) (as1)));
    }

    public void e(int i1, int j1, int k1)
    {
        gs gs1 = new gs(i1, j1, k1);
        if(c)
            d.b.remove(l.remove(((java.lang.Object) (gs1))));
    }

    public void c()
    {
        c = true;
        d.b.addAll(l.values());
        for(int i1 = 0; i1 < m.length; i1++)
            d.a(m[i1]);

    }

    public void d()
    {
        c = false;
        d.b.removeAll(l.values());
        for(int i1 = 0; i1 < m.length; i1++)
            d.b(m[i1]);

    }

    public void e()
    {
        o = true;
    }

    public void a(dj dj1, dg dg1, java.util.List list)
    {
        int i1 = gj.b((dg1.b - 2D) / 16D);
        int j1 = gj.b((dg1.e + 2D) / 16D);
        if(i1 < 0)
            i1 = 0;
        if(j1 >= m.length)
            j1 = m.length - 1;
        for(int k1 = i1; k1 <= j1; k1++)
        {
            java.util.List list1 = m[k1];
            for(int l1 = 0; l1 < list1.size(); l1++)
            {
                dj dj2 = (dj)list1.get(l1);
                if(dj2 != dj1 && dj2.v.a(dg1))
                    list.add(((java.lang.Object) (dj2)));
            }

        }

    }

    public void a(java.lang.Class class1, dg dg1, java.util.List list)
    {
        int i1 = gj.b((dg1.b - 2D) / 16D);
        int j1 = gj.b((dg1.e + 2D) / 16D);
        if(i1 < 0)
            i1 = 0;
        if(j1 >= m.length)
            j1 = m.length - 1;
        for(int k1 = i1; k1 <= j1; k1++)
        {
            java.util.List list1 = m[k1];
            for(int l1 = 0; l1 < list1.size(); l1++)
            {
                dj dj1 = (dj)list1.get(l1);
                if(class1.isAssignableFrom(((java.lang.Object) (dj1)).getClass()) && dj1.v.a(dg1))
                    list.add(((java.lang.Object) (dj1)));
            }

        }

    }

    public boolean a(boolean flag)
    {
        if(p)
            return false;
        if(r && d.c != s)
            return true;
        else
            return o;
    }

    public int a(byte abyte0[], int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2)
    {
        for(int l2 = i1; l2 < l1; l2++)
        {
            for(int l3 = k1; l3 < j2; l3++)
            {
                int l4 = l2 << 11 | l3 << 7 | j1;
                int l5 = i2 - j1;
                java.lang.System.arraycopy(((java.lang.Object) (b)), l4, ((java.lang.Object) (abyte0)), k2, l5);
                k2 += l5;
            }

        }

        for(int i3 = i1; i3 < l1; i3++)
        {
            for(int i4 = k1; i4 < j2; i4++)
            {
                int i5 = (i3 << 11 | i4 << 7 | j1) >> 1;
                int i6 = (i2 - j1) / 2;
                java.lang.System.arraycopy(((java.lang.Object) (e.a)), i5, ((java.lang.Object) (abyte0)), k2, i6);
                k2 += i6;
            }

        }

        for(int j3 = i1; j3 < l1; j3++)
        {
            for(int j4 = k1; j4 < j2; j4++)
            {
                int j5 = (j3 << 11 | j4 << 7 | j1) >> 1;
                int j6 = (i2 - j1) / 2;
                java.lang.System.arraycopy(((java.lang.Object) (g.a)), j5, ((java.lang.Object) (abyte0)), k2, j6);
                k2 += j6;
            }

        }

        for(int k3 = i1; k3 < l1; k3++)
        {
            for(int k4 = k1; k4 < j2; k4++)
            {
                int k5 = (k3 << 11 | k4 << 7 | j1) >> 1;
                int k6 = (i2 - j1) / 2;
                java.lang.System.arraycopy(((java.lang.Object) (f.a)), k5, ((java.lang.Object) (abyte0)), k2, k6);
                k2 += k6;
            }

        }

        return k2;
    }

    public java.util.Random a(long l1)
    {
        return new Random(d.t + (long)(j * j * 0x4c1906) + (long)(j * 0x5ac0db) + (long)(k * k) * 0x4307a7L + (long)(k * 0x5f24f) ^ l1);
    }
}
