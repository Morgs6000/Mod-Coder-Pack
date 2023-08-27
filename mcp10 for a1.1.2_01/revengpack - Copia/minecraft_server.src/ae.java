// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

class ae
{

    private java.util.List b;
    private int c;
    private int d;
    private iy e;
    private short f[];
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    final hg a;

    public ae(hg hg1, int i1, int j1)
    {
        super();
        a = hg1;
        b = ((java.util.List) (new ArrayList()));
        f = new short[10];
        g = 0;
        c = i1;
        d = j1;
        e = new iy(i1, j1);
        hg.a(hg1).e.y.d(i1, j1);
    }

    public void a(ea ea1)
    {
        if(b.contains(((java.lang.Object) (ea1))))
        {
            throw new IllegalStateException((new StringBuilder()).append("Failed to add player. ").append(((java.lang.Object) (ea1))).append(" already is in chunk ").append(c).append(", ").append(d).toString());
        } else
        {
            ea1.ah.add(((java.lang.Object) (e)));
            ea1.a.b(((hp) (new da(e.a, e.b, true))));
            b.add(((java.lang.Object) (ea1)));
            ea1.ag.add(((java.lang.Object) (e)));
            return;
        }
    }

    public void b(ea ea1)
    {
        if(!b.contains(((java.lang.Object) (ea1))))
        {
            (new IllegalStateException((new StringBuilder()).append("Failed to remove player. ").append(((java.lang.Object) (ea1))).append(" isn't in chunk ").append(c).append(", ").append(d).toString())).printStackTrace();
            return;
        }
        b.remove(((java.lang.Object) (ea1)));
        if(b.size() == 0)
        {
            long l1 = (long)c + 0x7fffffffL | (long)d + 0x7fffffffL << 32;
            hg.b(a).b(l1);
            if(g > 0)
                hg.c(a).remove(((java.lang.Object) (this)));
            hg.a(a).e.y.c(c, d);
        }
        ea1.ag.remove(((java.lang.Object) (e)));
        if(ea1.ah.contains(((java.lang.Object) (e))))
            ea1.a.b(((hp) (new da(c, d, false))));
    }

    public void a(int i1, int j1, int k1)
    {
        if(g == 0)
        {
            hg.c(a).add(((java.lang.Object) (this)));
            h = i = i1;
            j = k = j1;
            l = m = k1;
        }
        if(h > i1)
            h = i1;
        if(i < i1)
            i = i1;
        if(j > j1)
            j = j1;
        if(k < j1)
            k = j1;
        if(l > k1)
            l = k1;
        if(m < k1)
            m = k1;
        if(g < 10)
        {
            short word0 = (short)(i1 << 12 | k1 << 8 | j1);
            for(int l1 = 0; l1 < g; l1++)
                if(f[l1] == word0)
                    return;

            f[g++] = word0;
        }
    }

    public void a(hp hp)
    {
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            ea ea1 = (ea)b.get(i1);
            if(ea1.ah.contains(((java.lang.Object) (e))))
                ea1.a.b(hp);
        }

    }

    public void a()
    {
        if(g == 0)
            return;
        if(g == 1)
        {
            int i1 = c * 16 + h;
            int l1 = j;
            int k2 = d * 16 + l;
            a(((hp) (new et(i1, l1, k2, ((dy) (hg.a(a).e))))));
            if(ff.q[hg.a(a).e.a(i1, l1, k2)])
                a(((hp) (new ib(i1, l1, k2, hg.a(a).e.k(i1, l1, k2)))));
        } else
        if(g == 10)
        {
            j = (j / 2) * 2;
            k = (k / 2 + 1) * 2;
            int j1 = h + c * 16;
            int i2 = j;
            int l2 = l + d * 16;
            int j3 = (i - h) + 1;
            int l3 = (k - j) + 2;
            int i4 = (m - l) + 1;
            a(((hp) (new cz(j1, i2, l2, j3, l3, i4, ((dy) (hg.a(a).e))))));
            java.util.List list = hg.a(a).e.d(j1, i2, l2, j1 + j3, i2 + l3, l2 + i4);
            for(int j4 = 0; j4 < list.size(); j4++)
            {
                as as1 = (as)list.get(j4);
                a(((hp) (new ib(as1.b, as1.c, as1.d, as1))));
            }

        } else
        {
            a(((hp) (new hh(c, d, f, g, ((dy) (hg.a(a).e))))));
            for(int k1 = 0; k1 < g; k1++)
            {
                int j2 = c * 16 + (g >> 12 & 0xf);
                int i3 = g & 0xff;
                int k3 = d * 16 + (g >> 8 & 0xf);
                if(ff.q[hg.a(a).e.a(j2, i3, k3)])
                    a(((hp) (new ib(j2, i3, k3, hg.a(a).e.k(j2, i3, k3)))));
            }

        }
        g = 0;
    }
}
