// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class dy
    implements hq
{

    private java.util.List y;
    public java.util.List a;
    private java.util.List z;
    private java.util.TreeSet A;
    private java.util.Set B;
    public java.util.List b;
    public long c;
    public boolean d;
    private long C;
    private long D;
    private long E;
    public int e;
    protected int f;
    protected int g;
    public boolean h;
    public static float i[];
    private final long F;
    protected int j;
    public java.util.List k;
    public int l;
    public java.util.Random m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    protected java.util.List r;
    private bj G;
    public java.io.File s;
    public long t;
    private s H;
    public long u;
    public final java.lang.String v;
    public boolean w;
    private java.util.ArrayList I;
    private java.util.Set J;
    private int K;
    private java.util.List L;
    public boolean x;

    public dy(java.io.File file, java.lang.String s1)
    {
        this(file, s1, (new Random()).nextLong());
    }

    public dy(java.lang.String s1)
    {
        y = ((java.util.List) (new ArrayList()));
        a = ((java.util.List) (new ArrayList()));
        z = ((java.util.List) (new ArrayList()));
        A = new TreeSet();
        B = ((java.util.Set) (new HashSet()));
        b = ((java.util.List) (new ArrayList()));
        c = 0L;
        d = false;
        C = 0x88bbffL;
        D = 0xc0d8ffL;
        E = 0xffffffL;
        e = 0;
        f = (new Random()).nextInt();
        g = 0x3c6ef35f;
        h = false;
        F = java.lang.System.currentTimeMillis();
        j = 40;
        k = ((java.util.List) (new ArrayList()));
        m = new Random();
        q = false;
        r = ((java.util.List) (new ArrayList()));
        t = 0L;
        u = 0L;
        I = new ArrayList();
        J = ((java.util.Set) (new HashSet()));
        K = m.nextInt(12000);
        L = ((java.util.List) (new ArrayList()));
        x = false;
        v = s1;
        G = a(s);
        d();
    }

    public dy(java.io.File file, java.lang.String s1, long l1)
    {
        y = ((java.util.List) (new ArrayList()));
        a = ((java.util.List) (new ArrayList()));
        z = ((java.util.List) (new ArrayList()));
        A = new TreeSet();
        B = ((java.util.Set) (new HashSet()));
        b = ((java.util.List) (new ArrayList()));
        c = 0L;
        d = false;
        C = 0x88bbffL;
        D = 0xc0d8ffL;
        E = 0xffffffL;
        e = 0;
        f = (new Random()).nextInt();
        g = 0x3c6ef35f;
        h = false;
        F = java.lang.System.currentTimeMillis();
        j = 40;
        k = ((java.util.List) (new ArrayList()));
        m = new Random();
        q = false;
        r = ((java.util.List) (new ArrayList()));
        t = 0L;
        u = 0L;
        I = new ArrayList();
        J = ((java.util.Set) (new HashSet()));
        K = m.nextInt(12000);
        L = ((java.util.List) (new ArrayList()));
        x = false;
        v = s1;
        file.mkdirs();
        s = new File(file, s1);
        s.mkdirs();
        java.io.DataOutputStream dataoutputstream;
      
        try
        {
        java.io.File file1 = new File(s, "session.lock");
        dataoutputstream = new DataOutputStream(((java.io.OutputStream) (new FileOutputStream(file1))));
	        try
            {
        dataoutputstream.writeLong(F);
	        }
            finally
            {
        dataoutputstream.close();
	        }
        }
        catch (java.io.IOException ioexception)
        {
        throw new RuntimeException("Failed to check session lock, aborting");
        }
        java.io.File file2 = new File(s, "level.dat");
        q = !file2.exists();
        if(file2.exists())
            try
            {
                s s2 = aj.a(((java.io.InputStream) (new FileInputStream(file2))));
                s s3 = s2.j("Data");
                t = s3.e("RandomSeed");
                n = s3.d("SpawnX");
                o = s3.d("SpawnY");
                p = s3.d("SpawnZ");
                c = s3.e("Time");
                u = s3.e("SizeOnDisk");
                d = s3.l("SnowCovered");
                if(s3.a("Player"))
                    H = s3.j("Player");
            }
            catch(java.lang.Exception exception)
            {
                exception.printStackTrace();
            }
        else
            d = m.nextInt(4) == 0;
        boolean flag = false;
        if(t == 0L)
        {
            t = l1;
            flag = true;
        }
        G = a(s);
        if(flag)
        {
            w = true;
            n = 0;
            o = 64;
            for(p = 0; !e(n, p); p += m.nextInt(64) - m.nextInt(64))
                n += m.nextInt(64) - m.nextInt(64);

            w = false;
        }
        d();
        return;
    }

    protected bj a(java.io.File file)
    {
        return ((bj) (new hv(this, ((aq) (new eo(file, true))), ((bj) (new hy(this, t))))));
    }

    private boolean e(int i1, int j1)
    {
        int k1 = f(i1, j1);
        return k1 == ff.F.bc;
    }

    private int f(int i1, int j1)
    {
        int k1;
        for(k1 = 63; a(i1, k1 + 1, j1) != 0; k1++);
        return a(i1, k1, j1);
    }

    public void a(boolean flag, hw hw1)
    {
        if(!G.b())
            return;
        if(hw1 != null)
            hw1.a("Saving level");
        h();
        if(hw1 != null)
            hw1.b("Saving chunks");
        G.a(flag, hw1);
    }

    private void h()
    {
        g();
        s s1 = new s();
        s1.a("RandomSeed", t);
        s1.a("SpawnX", n);
        s1.a("SpawnY", o);
        s1.a("SpawnZ", p);
        s1.a("Time", c);
        s1.a("SizeOnDisk", u);
        s1.a("SnowCovered", d);
        s1.a("LastPlayed", java.lang.System.currentTimeMillis());
        fc fc1 = null;
        if(k.size() > 0)
            fc1 = (fc)k.get(0);
        if(fc1 != null)
        {
            s s2 = new s();
            fc1.d(s2);
            s1.a("Player", s2);
        }
        s s3 = new s();
        s3.a("Data", ((gg) (s1)));
        try
        {
            java.io.File file = new File(s, "level.dat_new");
            java.io.File file1 = new File(s, "level.dat_old");
            java.io.File file2 = new File(s, "level.dat");
            aj.a(s3, ((java.io.OutputStream) (new FileOutputStream(file))));
            if(file1.exists())
                file1.delete();
            file2.renameTo(file1);
            if(file2.exists())
                file2.delete();
            file.renameTo(file2);
            if(file.exists())
                file.delete();
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public int a(int i1, int j1, int k1)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return 0;
        if(j1 < 0)
            return 0;
        if(j1 >= 128)
            return 0;
        else
            return b(i1 >> 4, k1 >> 4).a(i1 & 0xf, j1, k1 & 0xf);
    }

    public boolean e(int i1, int j1, int k1)
    {
        if(j1 < 0 || j1 >= 128)
            return false;
        else
            return g(i1 >> 4, k1 >> 4);
    }

    public boolean a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        if(i2 < 0 || j1 >= 128)
            return false;
        i1 >>= 4;
        j1 >>= 4;
        k1 >>= 4;
        l1 >>= 4;
        i2 >>= 4;
        j2 >>= 4;
        for(int k2 = i1; k2 <= l1; k2++)
        {
            for(int l2 = k1; l2 <= j2; l2++)
                if(!g(k2, l2))
                    return false;

        }

        return true;
    }

    private boolean g(int i1, int j1)
    {
        return G.a(i1, j1);
    }

    public im a(int i1, int j1)
    {
        return b(i1 >> 4, j1 >> 4);
    }

    public im b(int i1, int j1)
    {
        return G.b(i1, j1);
    }

    public boolean a(int i1, int j1, int k1, int l1, int i2)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return false;
        if(j1 < 0)
            return false;
        if(j1 >= 128)
        {
            return false;
        } else
        {
            im im1 = b(i1 >> 4, k1 >> 4);
            return im1.a(i1 & 0xf, j1, k1 & 0xf, l1, i2);
        }
    }

    public boolean a(int i1, int j1, int k1, int l1)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return false;
        if(j1 < 0)
            return false;
        if(j1 >= 128)
        {
            return false;
        } else
        {
            im im1 = b(i1 >> 4, k1 >> 4);
            return im1.a(i1 & 0xf, j1, k1 & 0xf, l1);
        }
    }

    public iq c(int i1, int j1, int k1)
    {
        int l1 = a(i1, j1, k1);
        if(l1 == 0)
            return iq.a;
        else
            return ff.n[l1].bn;
    }

    public int b(int i1, int j1, int k1)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return 0;
        if(j1 < 0)
            return 0;
        if(j1 >= 128)
        {
            return 0;
        } else
        {
            im im1 = b(i1 >> 4, k1 >> 4);
            i1 &= 0xf;
            k1 &= 0xf;
            return im1.b(i1, j1, k1);
        }
    }

    public void b(int i1, int j1, int k1, int l1)
    {
        c(i1, j1, k1, l1);
    }

    public boolean c(int i1, int j1, int k1, int l1)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return false;
        if(j1 < 0)
            return false;
        if(j1 >= 128)
        {
            return false;
        } else
        {
            im im1 = b(i1 >> 4, k1 >> 4);
            i1 &= 0xf;
            k1 &= 0xf;
            im1.b(i1, j1, k1, l1);
            return true;
        }
    }

    public boolean d(int i1, int j1, int k1, int l1)
    {
        if(a(i1, j1, k1, l1))
        {
            e(i1, j1, k1, l1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b(int i1, int j1, int k1, int l1, int i2)
    {
        if(a(i1, j1, k1, l1, i2))
        {
            e(i1, j1, k1, l1);
            return true;
        } else
        {
            return false;
        }
    }

    public void f(int i1, int j1, int k1)
    {
        for(int l1 = 0; l1 < r.size(); l1++)
            ((be)r.get(l1)).a(i1, j1, k1);

    }

    protected void e(int i1, int j1, int k1, int l1)
    {
        f(i1, j1, k1);
        g(i1, j1, k1, l1);
    }

    public void f(int i1, int j1, int k1, int l1)
    {
        if(k1 > l1)
        {
            int i2 = l1;
            l1 = k1;
            k1 = i2;
        }
        b(i1, k1, j1, i1, l1, j1);
    }

    public void b(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        for(int k2 = 0; k2 < r.size(); k2++)
            ((be)r.get(k2)).a(i1, j1, k1, l1, i2, j2);

    }

    public void g(int i1, int j1, int k1, int l1)
    {
        k(i1 - 1, j1, k1, l1);
        k(i1 + 1, j1, k1, l1);
        k(i1, j1 - 1, k1, l1);
        k(i1, j1 + 1, k1, l1);
        k(i1, j1, k1 - 1, l1);
        k(i1, j1, k1 + 1, l1);
    }

    private void k(int i1, int j1, int k1, int l1)
    {
        if(h || x)
            return;
        ff ff1 = ff.n[a(i1, j1, k1)];
        if(ff1 != null)
            ff1.b(this, i1, j1, k1, l1);
    }

    public boolean g(int i1, int j1, int k1)
    {
        return b(i1 >> 4, k1 >> 4).c(i1 & 0xf, j1, k1 & 0xf);
    }

    public int h(int i1, int j1, int k1)
    {
        return a(i1, j1, k1, true);
    }

    public int a(int i1, int j1, int k1, boolean flag)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return 15;
        if(flag)
        {
            int l1 = a(i1, j1, k1);
            if(l1 == ff.al.bc || l1 == ff.aB.bc)
            {
                int j2 = a(i1, j1 + 1, k1, false);
                int k2 = a(i1 + 1, j1, k1, false);
                int l2 = a(i1 - 1, j1, k1, false);
                int i3 = a(i1, j1, k1 + 1, false);
                int j3 = a(i1, j1, k1 - 1, false);
                if(k2 > j2)
                    j2 = k2;
                if(l2 > j2)
                    j2 = l2;
                if(i3 > j2)
                    j2 = i3;
                if(j3 > j2)
                    j2 = j3;
                return j2;
            }
        }
        if(j1 < 0)
            return 0;
        if(j1 >= 128)
        {
            int i2 = 15 - e;
            if(i2 < 0)
                i2 = 0;
            return i2;
        } else
        {
            im im1 = b(i1 >> 4, k1 >> 4);
            i1 &= 0xf;
            k1 &= 0xf;
            return im1.c(i1, j1, k1, e);
        }
    }

    public boolean i(int i1, int j1, int k1)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return false;
        if(j1 < 0)
            return false;
        if(j1 >= 128)
            return true;
        if(!g(i1 >> 4, k1 >> 4))
        {
            return false;
        } else
        {
            im im1 = b(i1 >> 4, k1 >> 4);
            i1 &= 0xf;
            k1 &= 0xf;
            return im1.c(i1, j1, k1);
        }
    }

    public int c(int i1, int j1)
    {
        if(i1 < 0xfe17b800 || j1 < 0xfe17b800 || i1 >= 0x1e84800 || j1 > 0x1e84800)
            return 0;
        if(!g(i1 >> 4, j1 >> 4))
        {
            return 0;
        } else
        {
            im im1 = b(i1 >> 4, j1 >> 4);
            return im1.b(i1 & 0xf, j1 & 0xf);
        }
    }

    public void a(cy cy1, int i1, int j1, int k1, int l1)
    {
        if(!e(i1, j1, k1))
            return;
        if(cy1 == cy.a)
        {
            if(i(i1, j1, k1))
                l1 = 15;
        } else
        if(cy1 == cy.b)
        {
            int i2 = a(i1, j1, k1);
            if(ff.t[i2] > l1)
                l1 = ff.t[i2];
        }
        if(a(cy1, i1, j1, k1) != l1)
            a(cy1, i1, j1, k1, i1, j1, k1);
    }

    public int a(cy cy1, int i1, int j1, int k1)
    {
        if(j1 < 0 || j1 >= 128 || i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return cy1.c;
        int l1 = i1 >> 4;
        int i2 = k1 >> 4;
        if(!g(l1, i2))
        {
            return 0;
        } else
        {
            im im1 = b(l1, i2);
            return im1.a(cy1, i1 & 0xf, j1, k1 & 0xf);
        }
    }

    public void b(cy cy1, int i1, int j1, int k1, int l1)
    {
        if(i1 < 0xfe17b800 || k1 < 0xfe17b800 || i1 >= 0x1e84800 || k1 > 0x1e84800)
            return;
        if(j1 < 0)
            return;
        if(j1 >= 128)
            return;
        if(!g(i1 >> 4, k1 >> 4))
            return;
        im im1 = b(i1 >> 4, k1 >> 4);
        im1.a(cy1, i1 & 0xf, j1, k1 & 0xf, l1);
        for(int i2 = 0; i2 < r.size(); i2++)
            ((be)r.get(i2)).a(i1, j1, k1);

    }

    public float j(int i1, int j1, int k1)
    {
        return i[h(i1, j1, k1)];
    }

    public boolean a()
    {
        return e < 4;
    }

    public fr a(aw aw1, aw aw2)
    {
        return a(aw1, aw2, false);
    }

    public fr a(aw aw1, aw aw2, boolean flag)
    {
        if(java.lang.Double.isNaN(aw1.a) || java.lang.Double.isNaN(aw1.b) || java.lang.Double.isNaN(aw1.c))
            return null;
        if(java.lang.Double.isNaN(aw2.a) || java.lang.Double.isNaN(aw2.b) || java.lang.Double.isNaN(aw2.c))
            return null;
        int i1 = gj.b(aw2.a);
        int j1 = gj.b(aw2.b);
        int k1 = gj.b(aw2.c);
        int l1 = gj.b(aw1.a);
        int i2 = gj.b(aw1.b);
        int j2 = gj.b(aw1.c);
        for(int k2 = 20; k2-- >= 0;)
        {
            if(java.lang.Double.isNaN(aw1.a) || java.lang.Double.isNaN(aw1.b) || java.lang.Double.isNaN(aw1.c))
                return null;
            if(l1 == i1 && i2 == j1 && j2 == k1)
                return null;
            double d1 = 999D;
            double d2 = 999D;
            double d3 = 999D;
            if(i1 > l1)
                d1 = (double)l1 + 1.0D;
            if(i1 < l1)
                d1 = (double)l1 + 0.0D;
            if(j1 > i2)
                d2 = (double)i2 + 1.0D;
            if(j1 < i2)
                d2 = (double)i2 + 0.0D;
            if(k1 > j2)
                d3 = (double)j2 + 1.0D;
            if(k1 < j2)
                d3 = (double)j2 + 0.0D;
            double d4 = 999D;
            double d5 = 999D;
            double d6 = 999D;
            double d7 = aw2.a - aw1.a;
            double d8 = aw2.b - aw1.b;
            double d9 = aw2.c - aw1.c;
            if(d1 != 999D)
                d4 = (d1 - aw1.a) / d7;
            if(d2 != 999D)
                d5 = (d2 - aw1.b) / d8;
            if(d3 != 999D)
                d6 = (d3 - aw1.c) / d9;
            byte byte0 = 0;
            if(d4 < d5 && d4 < d6)
            {
                if(i1 > l1)
                    byte0 = 4;
                else
                    byte0 = 5;
                aw1.a = d1;
                aw1.b += d8 * d4;
                aw1.c += d9 * d4;
            } else
            if(d5 < d6)
            {
                if(j1 > i2)
                    byte0 = 0;
                else
                    byte0 = 1;
                aw1.a += d7 * d5;
                aw1.b = d2;
                aw1.c += d9 * d5;
            } else
            {
                if(k1 > j2)
                    byte0 = 2;
                else
                    byte0 = 3;
                aw1.a += d7 * d6;
                aw1.b += d8 * d6;
                aw1.c = d3;
            }
            aw aw3 = aw.b(aw1.a, aw1.b, aw1.c);
            l1 = (int)(aw3.a = gj.b(aw1.a));
            if(byte0 == 5)
            {
                l1--;
                aw3.a++;
            }
            i2 = (int)(aw3.b = gj.b(aw1.b));
            if(byte0 == 1)
            {
                i2--;
                aw3.b++;
            }
            j2 = (int)(aw3.c = gj.b(aw1.c));
            if(byte0 == 3)
            {
                j2--;
                aw3.c++;
            }
            int l2 = a(l1, i2, j2);
            int i3 = b(l1, i2, j2);
            ff ff1 = ff.n[l2];
            if(l2 > 0 && ff1.a(i3, flag))
            {
                fr fr = ff1.a(this, l1, i2, j2, aw1, aw2);
                if(fr != null)
                    return fr;
            }
        }

        return null;
    }

    public void a(dj dj1, java.lang.String s1, float f1, float f2)
    {
        for(int i1 = 0; i1 < r.size(); i1++)
            ((be)r.get(i1)).a(s1, dj1.l, dj1.m - (double)dj1.C, dj1.n, f1, f2);

    }

    public void a(double d1, double d2, double d3, java.lang.String s1, 
            float f1, float f2)
    {
        for(int i1 = 0; i1 < r.size(); i1++)
            ((be)r.get(i1)).a(s1, d1, d2, d3, f1, f2);

    }

    public void a(java.lang.String s1, int i1, int j1, int k1)
    {
        for(int l1 = 0; l1 < r.size(); l1++)
            ((be)r.get(l1)).a(s1, i1, j1, k1);

    }

    public void a(java.lang.String s1, double d1, double d2, double d3, 
            double d4, double d5, double d6)
    {
        for(int i1 = 0; i1 < r.size(); i1++)
            ((be)r.get(i1)).a(s1, d1, d2, d3, d4, d5, d6);

    }

    public boolean a(dj dj1)
    {
        int i1 = gj.b(dj1.l / 16D);
        int j1 = gj.b(dj1.n / 16D);
        boolean flag = false;
        if(dj1 instanceof fc)
            flag = true;
        if(flag || g(i1, j1))
        {
            if(dj1 instanceof fc)
            {
                k.add(((java.lang.Object) ((fc)dj1)));
                java.lang.System.out.println((new StringBuilder()).append("Player count: ").append(k.size()).toString());
            }
            b(i1, j1).a(dj1);
            a.add(((java.lang.Object) (dj1)));
            b(dj1);
            return true;
        } else
        {
            return false;
        }
    }

    protected void b(dj dj1)
    {
        for(int i1 = 0; i1 < r.size(); i1++)
            ((be)r.get(i1)).a(dj1);

    }

    protected void c(dj dj1)
    {
        for(int i1 = 0; i1 < r.size(); i1++)
            ((be)r.get(i1)).b(dj1);

    }

    public void d(dj dj1)
    {
        dj1.j();
        if(dj1 instanceof fc)
        {
            k.remove(((java.lang.Object) ((fc)dj1)));
            java.lang.System.out.println((new StringBuilder()).append("Player count: ").append(k.size()).toString());
        }
    }

    public void a(be be1)
    {
        r.add(((java.lang.Object) (be1)));
    }

    public java.util.List a(dj dj1, dg dg1)
    {
        I.clear();
        int i1 = gj.b(dg1.a);
        int j1 = gj.b(dg1.d + 1.0D);
        int k1 = gj.b(dg1.b);
        int l1 = gj.b(dg1.e + 1.0D);
        int i2 = gj.b(dg1.c);
        int j2 = gj.b(dg1.f + 1.0D);
        for(int k2 = i1; k2 < j1; k2++)
        {
            for(int l2 = i2; l2 < j2; l2++)
            {
                if(!e(k2, 64, l2))
                    continue;
                for(int i3 = k1 - 1; i3 < l1; i3++)
                {
                    ff ff1 = ff.n[a(k2, i3, l2)];
                    if(ff1 != null)
                        ff1.a(this, k2, i3, l2, dg1, I);
                }

            }

        }

        double d1 = 0.25D;
        java.util.List list = b(dj1, dg1.b(d1, d1, d1));
        for(int j3 = 0; j3 < list.size(); j3++)
        {
            dg dg2 = ((dj)list.get(j3)).n();
            if(dg2 != null && dg2.a(dg1))
                I.add(((java.lang.Object) (dg2)));
            dg2 = dj1.d((dj)list.get(j3));
            if(dg2 != null && dg2.a(dg1))
                I.add(((java.lang.Object) (dg2)));
        }

        return ((java.util.List) (I));
    }

    public int a(float f1)
    {
        float f2 = b(f1);
        float f3 = 1.0F - (gj.b(f2 * 3.141593F * 2.0F) * 2.0F + 0.5F);
        if(f3 < 0.0F)
            f3 = 0.0F;
        if(f3 > 1.0F)
            f3 = 1.0F;
        return (int)(f3 * 11F);
    }

    public float b(float f1)
    {
        int i1 = (int)(c % 24000L);
        float f2 = ((float)i1 + f1) / 24000F - 0.25F;
        if(f2 < 0.0F)
            f2++;
        if(f2 > 1.0F)
            f2--;
        float f3 = f2;
        f2 = 1.0F - (float)((java.lang.Math.cos((double)f2 * 3.1415926535897931D) + 1.0D) / 2D);
        f2 = f3 + (f2 - f3) / 3F;
        return f2;
    }

    public int d(int i1, int j1)
    {
        im im1 = a(i1, j1);
        int k1 = 127;
        i1 &= 0xf;
        j1 &= 0xf;
        while(k1 > 0) 
        {
            int l1 = im1.a(i1, k1, j1);
            if(l1 == 0 || !ff.n[l1].bn.c() && !ff.n[l1].bn.d())
                k1--;
            else
                return k1 + 1;
        }
        return -1;
    }

    public void h(int i1, int j1, int k1, int l1)
    {
        bv bv1 = new bv(i1, j1, k1, l1);
        byte byte0 = 8;
        if(a(i1 - byte0, j1 - byte0, k1 - byte0, i1 + byte0, j1 + byte0, k1 + byte0))
        {
            if(l1 > 0)
                bv1.a((long)ff.n[l1].c() + c);
            if(!B.contains(((java.lang.Object) (bv1))))
            {
                B.add(((java.lang.Object) (bv1)));
                A.add(((java.lang.Object) (bv1)));
            }
        }
    }

    public void b()
    {
        a.removeAll(((java.util.Collection) (z)));
        for(int i1 = 0; i1 < z.size(); i1++)
        {
            dj dj1 = (dj)z.get(i1);
            int i2 = dj1.aa;
            int k2 = dj1.ac;
            if(dj1.Z && g(i2, k2))
                b(i2, k2).b(dj1);
        }

        for(int j1 = 0; j1 < z.size(); j1++)
            c((dj)z.get(j1));

        z.clear();
        for(int k1 = 0; k1 < a.size(); k1++)
        {
            dj dj2 = (dj)a.get(k1);
            if(dj2.g != null)
            {
                if(!dj2.g.B && dj2.g.f == dj2)
                    continue;
                dj2.g.f = null;
                dj2.g = null;
            }
            if(!dj2.B)
                e(dj2);
            if(!dj2.B)
                continue;
            int j2 = dj2.aa;
            int l2 = dj2.ac;
            if(dj2.Z && g(j2, l2))
                b(j2, l2).b(dj2);
            a.remove(k1--);
            c(dj2);
        }

        for(int l1 = 0; l1 < b.size(); l1++)
        {
            as as1 = (as)b.get(l1);
            as1.b();
        }

    }

    protected void e(dj dj1)
    {
        int i1 = gj.b(dj1.l);
        int j1 = gj.b(dj1.n);
        byte byte0 = 16;
        if(!a(i1 - byte0, 0, j1 - byte0, i1 + byte0, 128, j1 + byte0))
            return;
        dj1.J = dj1.l;
        dj1.K = dj1.m;
        dj1.L = dj1.n;
        dj1.t = dj1.r;
        dj1.u = dj1.s;
        if(dj1.g != null)
            dj1.v();
        else
            dj1.b_();
        int k1 = gj.b(dj1.l / 16D);
        int l1 = gj.b(dj1.m / 16D);
        int i2 = gj.b(dj1.n / 16D);
        if(!dj1.Z || dj1.aa != k1 || dj1.ab != l1 || dj1.ac != i2)
        {
            if(dj1.Z && g(dj1.aa, dj1.ac))
                b(dj1.aa, dj1.ac).a(dj1, dj1.ab);
            if(g(k1, i2))
            {
                b(k1, i2).a(dj1);
            } else
            {
                dj1.Z = false;
                java.lang.System.out.println("Removing entity because it's not in a chunk!!");
                dj1.j();
            }
        }
        if(dj1.f != null)
            if(dj1.f.B || dj1.f.g != dj1)
            {
                dj1.f.g = null;
                dj1.f = null;
            } else
            {
                e(dj1.f);
            }
        if(java.lang.Double.isNaN(dj1.l) || java.lang.Double.isInfinite(dj1.l))
            dj1.l = dj1.J;
        if(java.lang.Double.isNaN(dj1.m) || java.lang.Double.isInfinite(dj1.m))
            dj1.m = dj1.K;
        if(java.lang.Double.isNaN(dj1.n) || java.lang.Double.isInfinite(dj1.n))
            dj1.n = dj1.L;
        if(java.lang.Double.isNaN(dj1.s) || java.lang.Double.isInfinite(dj1.s))
            dj1.s = dj1.u;
        if(java.lang.Double.isNaN(dj1.r) || java.lang.Double.isInfinite(dj1.r))
            dj1.r = dj1.t;
    }

    public boolean a(dg dg1)
    {
        java.util.List list = b(((dj) (null)), dg1);
        for(int i1 = 0; i1 < list.size(); i1++)
        {
            dj dj1 = (dj)list.get(i1);
            if(!dj1.B && dj1.e)
                return false;
        }

        return true;
    }

    public boolean b(dg dg1)
    {
        int i1 = gj.b(dg1.a);
        int j1 = gj.b(dg1.d + 1.0D);
        int k1 = gj.b(dg1.b);
        int l1 = gj.b(dg1.e + 1.0D);
        int i2 = gj.b(dg1.c);
        int j2 = gj.b(dg1.f + 1.0D);
        if(dg1.a < 0.0D)
            i1--;
        if(dg1.b < 0.0D)
            k1--;
        if(dg1.c < 0.0D)
            i2--;
        for(int k2 = i1; k2 < j1; k2++)
        {
            for(int l2 = k1; l2 < l1; l2++)
            {
                for(int i3 = i2; i3 < j2; i3++)
                {
                    ff ff1 = ff.n[a(k2, l2, i3)];
                    if(ff1 != null && ff1.bn.d())
                        return true;
                }

            }

        }

        return false;
    }

    public boolean c(dg dg1)
    {
        int i1 = gj.b(dg1.a);
        int j1 = gj.b(dg1.d + 1.0D);
        int k1 = gj.b(dg1.b);
        int l1 = gj.b(dg1.e + 1.0D);
        int i2 = gj.b(dg1.c);
        int j2 = gj.b(dg1.f + 1.0D);
        for(int k2 = i1; k2 < j1; k2++)
        {
            for(int l2 = k1; l2 < l1; l2++)
            {
                for(int i3 = i2; i3 < j2; i3++)
                {
                    int j3 = a(k2, l2, i3);
                    if(j3 == ff.as.bc || j3 == ff.D.bc || j3 == ff.E.bc)
                        return true;
                }

            }

        }

        return false;
    }

    public boolean a(dg dg1, iq iq1, dj dj1)
    {
        int i1 = gj.b(dg1.a);
        int j1 = gj.b(dg1.d + 1.0D);
        int k1 = gj.b(dg1.b);
        int l1 = gj.b(dg1.e + 1.0D);
        int i2 = gj.b(dg1.c);
        int j2 = gj.b(dg1.f + 1.0D);
        boolean flag = false;
        aw aw1 = aw.b(0.0D, 0.0D, 0.0D);
        for(int k2 = i1; k2 < j1; k2++)
        {
            for(int l2 = k1; l2 < l1; l2++)
            {
                for(int i3 = i2; i3 < j2; i3++)
                {
                    ff ff1 = ff.n[a(k2, l2, i3)];
                    if(ff1 == null || ff1.bn != iq1)
                        continue;
                    double d2 = (float)(l2 + 1) - cn.b(b(k2, l2, i3));
                    if((double)l1 >= d2)
                    {
                        flag = true;
                        ff1.a(this, k2, l2, i3, dj1, aw1);
                    }
                }

            }

        }

        if(aw1.c() > 0.0D)
        {
            aw1 = aw1.b();
            double d1 = 0.0040000000000000001D;
            dj1.o += aw1.a * d1;
            dj1.p += aw1.b * d1;
            dj1.q += aw1.c * d1;
        }
        return flag;
    }

    public boolean a(dg dg1, iq iq1)
    {
        int i1 = gj.b(dg1.a);
        int j1 = gj.b(dg1.d + 1.0D);
        int k1 = gj.b(dg1.b);
        int l1 = gj.b(dg1.e + 1.0D);
        int i2 = gj.b(dg1.c);
        int j2 = gj.b(dg1.f + 1.0D);
        for(int k2 = i1; k2 < j1; k2++)
        {
            for(int l2 = k1; l2 < l1; l2++)
            {
                for(int i3 = i2; i3 < j2; i3++)
                {
                    ff ff1 = ff.n[a(k2, l2, i3)];
                    if(ff1 != null && ff1.bn == iq1)
                        return true;
                }

            }

        }

        return false;
    }

    public boolean b(dg dg1, iq iq1)
    {
        int i1 = gj.b(dg1.a);
        int j1 = gj.b(dg1.d + 1.0D);
        int k1 = gj.b(dg1.b);
        int l1 = gj.b(dg1.e + 1.0D);
        int i2 = gj.b(dg1.c);
        int j2 = gj.b(dg1.f + 1.0D);
        for(int k2 = i1; k2 < j1; k2++)
        {
            for(int l2 = k1; l2 < l1; l2++)
            {
                for(int i3 = i2; i3 < j2; i3++)
                {
                    ff ff1 = ff.n[a(k2, l2, i3)];
                    if(ff1 == null || ff1.bn != iq1)
                        continue;
                    int j3 = b(k2, l2, i3);
                    double d1 = l2 + 1;
                    if(j3 < 8)
                        d1 = (double)(l2 + 1) - (double)j3 / 8D;
                    if(d1 >= dg1.b)
                        return true;
                }

            }

        }

        return false;
    }

    public void a(dj dj1, double d1, double d2, double d3, 
            float f1)
    {
        (new bw()).a(this, dj1, d1, d2, d3, f1);
    }

    public float a(aw aw1, dg dg1)
    {
        double d1 = 1.0D / ((dg1.d - dg1.a) * 2D + 1.0D);
        double d2 = 1.0D / ((dg1.e - dg1.b) * 2D + 1.0D);
        double d3 = 1.0D / ((dg1.f - dg1.c) * 2D + 1.0D);
        int i1 = 0;
        int j1 = 0;
        for(float f1 = 0.0F; f1 <= 1.0F; f1 = (float)((double)f1 + d1))
        {
            for(float f2 = 0.0F; f2 <= 1.0F; f2 = (float)((double)f2 + d2))
            {
                for(float f3 = 0.0F; f3 <= 1.0F; f3 = (float)((double)f3 + d3))
                {
                    double d4 = dg1.a + (dg1.d - dg1.a) * (double)f1;
                    double d5 = dg1.b + (dg1.e - dg1.b) * (double)f2;
                    double d6 = dg1.c + (dg1.f - dg1.c) * (double)f3;
                    if(a(aw.b(d4, d5, d6), aw1) == null)
                        i1++;
                    j1++;
                }

            }

        }

        return (float)i1 / (float)j1;
    }

    public as k(int i1, int j1, int k1)
    {
        im im1 = b(i1 >> 4, k1 >> 4);
        if(im1 != null)
            return im1.d(i1 & 0xf, j1, k1 & 0xf);
        else
            return null;
    }

    public void a(int i1, int j1, int k1, as as1)
    {
        im im1 = b(i1 >> 4, k1 >> 4);
        if(im1 != null)
            im1.a(i1 & 0xf, j1, k1 & 0xf, as1);
    }

    public void l(int i1, int j1, int k1)
    {
        im im1 = b(i1 >> 4, k1 >> 4);
        if(im1 != null)
            im1.e(i1 & 0xf, j1, k1 & 0xf);
    }

    public boolean d(int i1, int j1, int k1)
    {
        ff ff1 = ff.n[a(i1, j1, k1)];
        if(ff1 == null)
            return false;
        else
            return ff1.b();
    }

    public boolean c()
    {
        int i1 = 1000;
        for(; y.size() > 0; ((dp)y.remove(y.size() - 1)).a(this))
            if(--i1 <= 0)
                return true;

        return false;
    }

    public void a(cy cy1, int i1, int j1, int k1, int l1, int i2, int j2)
    {
        a(cy1, i1, j1, k1, l1, i2, j2, true);
    }

    public void a(cy cy1, int i1, int j1, int k1, int l1, int i2, int j2, 
            boolean flag)
    {
        int k2 = (l1 + i1) / 2;
        int l2 = (j2 + k1) / 2;
        if(!e(k2, 64, l2))
            return;
        int i3 = y.size();
        if(flag)
        {
            int j3 = 4;
            if(j3 > i3)
                j3 = i3;
            for(int k3 = 0; k3 < j3; k3++)
            {
                dp dp1 = (dp)y.get(y.size() - k3 - 1);
                if(dp1.a == cy1 && dp1.a(i1, j1, k1, l1, i2, j2))
                    return;
            }

        }
        y.add(((java.lang.Object) (new dp(cy1, i1, j1, k1, l1, i2, j2))));
        if(y.size() > 0x186a0)
            for(; y.size() > 50000; c());
    }

    public void d()
    {
        int i1 = a(1.0F);
        if(i1 != e)
            e = i1;
    }

    public void e()
    {
        G.a();
        int i1 = a(1.0F);
        if(i1 != e)
        {
            e = i1;
            for(int j1 = 0; j1 < r.size(); j1++)
                ((be)r.get(j1)).a();

        }
        c++;
        if(c % (long)j == 0L)
            a(false, ((hw) (null)));
        a(false);
        f();
    }

    protected void f()
    {
        J.clear();
        for(int i1 = 0; i1 < k.size(); i1++)
        {
            fc fc1 = (fc)k.get(i1);
            int j1 = gj.b(fc1.l / 16D);
            int l1 = gj.b(fc1.n / 16D);
            byte byte0 = 9;
            for(int j2 = -byte0; j2 <= byte0; j2++)
            {
                for(int j3 = -byte0; j3 <= byte0; j3++)
                    J.add(((java.lang.Object) (new iy(j2 + j1, j3 + l1))));

            }

        }

        if(K > 0)
            K--;
        for(java.util.Iterator iterator = J.iterator(); iterator.hasNext();)
        {
            iy iy1 = (iy)iterator.next();
            int k1 = iy1.a * 16;
            int i2 = iy1.b * 16;
            im im1 = b(iy1.a, iy1.b);
            if(K == 0)
            {
                f = f * 3 + g;
                int k2 = f >> 2;
                int k3 = k2 & 0xf;
                int j4 = k2 >> 8 & 0xf;
                int i5 = k2 >> 16 & 0x7f;
                int l5 = im1.a(k3, i5, j4);
                k3 += k1;
                j4 += i2;
                if(l5 == 0 && h(k3, i5, j4) <= m.nextInt(8) && a(cy.a, k3, i5, j4) <= 0)
                {
                    fc fc2 = a((double)k3 + 0.5D, (double)i5 + 0.5D, (double)j4 + 0.5D, 8D);
                    if(fc2 != null && fc2.d((double)k3 + 0.5D, (double)i5 + 0.5D, (double)j4 + 0.5D) > 4D)
                    {
                        a((double)k3 + 0.5D, (double)i5 + 0.5D, (double)j4 + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + m.nextFloat() * 0.2F);
                        K = m.nextInt(12000) + 6000;
                    }
                }
            }
            if(d && m.nextInt(4) == 0)
            {
                f = f * 3 + g;
                int l2 = f >> 2;
                int l3 = l2 & 0xf;
                int k4 = l2 >> 8 & 0xf;
                int j5 = d(l3 + k1, k4 + i2);
                if(j5 >= 0 && j5 < 128 && im1.a(cy.b, l3, j5, k4) < 10)
                {
                    int i6 = im1.a(l3, j5 - 1, k4);
                    if(im1.a(l3, j5, k4) == 0 && ff.aT.a(this, l3 + k1, j5, k4 + i2))
                        d(l3 + k1, j5, k4 + i2, ff.aT.bc);
                    if(i6 == ff.C.bc && im1.b(l3, j5 - 1, k4) == 0)
                        d(l3 + k1, j5 - 1, k4 + i2, ff.aU.bc);
                }
            }
            int i3 = 0;
            while(i3 < 80) 
            {
                f = f * 3 + g;
                int i4 = f >> 2;
                int l4 = i4 & 0xf;
                int k5 = i4 >> 8 & 0xf;
                int j6 = i4 >> 16 & 0x7f;
                byte byte1 = im1.b[l4 << 11 | k5 << 7 | j6];
                if(ff.o[byte1])
                    ff.n[byte1].a(this, l4 + k1, j6, k5 + i2, m);
                i3++;
            }
        }

    }

    public boolean a(boolean flag)
    {
        int i1 = A.size();
        if(i1 != B.size())
            throw new IllegalStateException("TickNextTick list out of synch");
        if(i1 > 1000)
            i1 = 1000;
        for(int j1 = 0; j1 < i1; j1++)
        {
            bv bv1 = (bv)A.first();
            if(!flag && bv1.e > c)
                break;
            A.remove(((java.lang.Object) (bv1)));
            B.remove(((java.lang.Object) (bv1)));
            byte byte0 = 8;
            if(!a(bv1.a - byte0, bv1.b - byte0, bv1.c - byte0, bv1.a + byte0, bv1.b + byte0, bv1.c + byte0))
                continue;
            int k1 = a(bv1.a, bv1.b, bv1.c);
            if(k1 == bv1.d && k1 > 0)
                ff.n[k1].a(this, bv1.a, bv1.b, bv1.c, m);
        }

        return A.size() != 0;
    }

    public java.util.List b(dj dj1, dg dg1)
    {
        L.clear();
        int i1 = gj.b((dg1.a - 2D) / 16D);
        int j1 = gj.b((dg1.d + 2D) / 16D);
        int k1 = gj.b((dg1.c - 2D) / 16D);
        int l1 = gj.b((dg1.f + 2D) / 16D);
        for(int i2 = i1; i2 <= j1; i2++)
        {
            for(int j2 = k1; j2 <= l1; j2++)
                if(g(i2, j2))
                    b(i2, j2).a(dj1, dg1, L);

        }

        return L;
    }

    public java.util.List a(java.lang.Class class1, dg dg1)
    {
        int i1 = gj.b((dg1.a - 2D) / 16D);
        int j1 = gj.b((dg1.d + 2D) / 16D);
        int k1 = gj.b((dg1.c - 2D) / 16D);
        int l1 = gj.b((dg1.f + 2D) / 16D);
        java.util.ArrayList arraylist = new ArrayList();
        for(int i2 = i1; i2 <= j1; i2++)
        {
            for(int j2 = k1; j2 <= l1; j2++)
                if(g(i2, j2))
                    b(i2, j2).a(class1, dg1, ((java.util.List) (arraylist)));

        }

        return ((java.util.List) (arraylist));
    }

    public void b(int i1, int j1, int k1, as as1)
    {
        if(e(i1, j1, k1))
            a(i1, k1).e();
        for(int l1 = 0; l1 < r.size(); l1++)
            ((be)r.get(l1)).a(i1, j1, k1, as1);

    }

    public int a(java.lang.Class class1)
    {
        int i1 = 0;
        for(int j1 = 0; j1 < a.size(); j1++)
        {
            dj dj1 = (dj)a.get(j1);
            if(class1.isAssignableFrom(((java.lang.Object) (dj1)).getClass()))
                i1++;
        }

        return i1;
    }

    public void a(java.util.List list)
    {
        a.addAll(((java.util.Collection) (list)));
        for(int i1 = 0; i1 < list.size(); i1++)
            b((dj)list.get(i1));

    }

    public void b(java.util.List list)
    {
        z.addAll(((java.util.Collection) (list)));
    }

    public boolean a(int i1, int j1, int k1, int l1, boolean flag)
    {
        int i2 = a(j1, k1, l1);
        ff ff1 = ff.n[i2];
        ff ff2 = ff.n[i1];
        dg dg1 = ff2.d(this, j1, k1, l1);
        if(flag)
            dg1 = null;
        if(dg1 != null && !a(dg1))
            return false;
        if(ff1 == ff.B || ff1 == ff.C || ff1 == ff.D || ff1 == ff.E || ff1 == ff.as || ff1 == ff.aT)
            return true;
        return i1 > 0 && ff1 == null && ff2.a(this, j1, k1, l1);
    }

    public cd a(dj dj1, dj dj2, float f1)
    {
        int i1 = gj.b(dj1.l);
        int j1 = gj.b(dj1.m);
        int k1 = gj.b(dj1.n);
        int l1 = (int)(f1 + 16F);
        int i2 = i1 - l1;
        int j2 = j1 - l1;
        int k2 = k1 - l1;
        int l2 = i1 + l1;
        int i3 = j1 + l1;
        int j3 = k1 + l1;
        ds ds1 = new ds(this, i2, j2, k2, l2, i3, j3);
        return (new ep(((hq) (ds1)))).a(dj1, dj2, f1);
    }

    public cd a(dj dj1, int i1, int j1, int k1, float f1)
    {
        int l1 = gj.b(dj1.l);
        int i2 = gj.b(dj1.m);
        int j2 = gj.b(dj1.n);
        int k2 = (int)(f1 + 8F);
        int l2 = l1 - k2;
        int i3 = i2 - k2;
        int j3 = j2 - k2;
        int k3 = l1 + k2;
        int l3 = i2 + k2;
        int i4 = j2 + k2;
        ds ds1 = new ds(this, l2, i3, j3, k3, l3, i4);
        return (new ep(((hq) (ds1)))).a(dj1, i1, j1, k1, f1);
    }

    public boolean i(int i1, int j1, int k1, int l1)
    {
        int i2 = a(i1, j1, k1);
        if(i2 == 0)
            return false;
        else
            return ff.n[i2].d(this, i1, j1, k1, l1);
    }

    public boolean m(int i1, int j1, int k1)
    {
        if(i(i1, j1 - 1, k1, 0))
            return true;
        if(i(i1, j1 + 1, k1, 1))
            return true;
        if(i(i1, j1, k1 - 1, 2))
            return true;
        if(i(i1, j1, k1 + 1, 3))
            return true;
        if(i(i1 - 1, j1, k1, 4))
            return true;
        return i(i1 + 1, j1, k1, 5);
    }

    public boolean j(int i1, int j1, int k1, int l1)
    {
        if(d(i1, j1, k1))
            return m(i1, j1, k1);
        int i2 = a(i1, j1, k1);
        if(i2 == 0)
            return false;
        else
            return ff.n[i2].b(((hq) (this)), i1, j1, k1, l1);
    }

    public boolean n(int i1, int j1, int k1)
    {
        if(j(i1, j1 - 1, k1, 0))
            return true;
        if(j(i1, j1 + 1, k1, 1))
            return true;
        if(j(i1, j1, k1 - 1, 2))
            return true;
        if(j(i1, j1, k1 + 1, 3))
            return true;
        if(j(i1 - 1, j1, k1, 4))
            return true;
        return j(i1 + 1, j1, k1, 5);
    }

    public fc a(dj dj1, double d1)
    {
        return a(dj1.l, dj1.m, dj1.n, d1);
    }

    public fc a(double d1, double d2, double d3, double d4)
    {
        double d5 = -1D;
        fc fc1 = null;
        for(int i1 = 0; i1 < k.size(); i1++)
        {
            fc fc2 = (fc)k.get(i1);
            double d6 = fc2.d(d1, d2, d3);
            if((d4 < 0.0D || d6 < d4 * d4) && (d5 == -1D || d6 < d5))
            {
                d5 = d6;
                fc1 = fc2;
            }
        }

        return fc1;
    }

    public byte[] c(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        byte abyte0[] = new byte[(l1 * i2 * j2 * 5) / 2];
        int k2 = i1 >> 4;
        int l2 = k1 >> 4;
        int i3 = (i1 + l1) - 1 >> 4;
        int j3 = (k1 + j2) - 1 >> 4;
        int k3 = 0;
        int l3 = j1;
        int i4 = j1 + i2;
        if(l3 < 0)
            l3 = 0;
        if(i4 > 128)
            i4 = 128;
        for(int j4 = k2; j4 <= i3; j4++)
        {
            int k4 = i1 - j4 * 16;
            int l4 = (i1 + l1) - j4 * 16;
            if(k4 < 0)
                k4 = 0;
            if(l4 > 16)
                l4 = 16;
            for(int i5 = l2; i5 <= j3; i5++)
            {
                int j5 = k1 - i5 * 16;
                int k5 = (k1 + j2) - i5 * 16;
                if(j5 < 0)
                    j5 = 0;
                if(k5 > 16)
                    k5 = 16;
                k3 = b(j4, i5).a(abyte0, k4, l3, j5, l4, i4, k5, k3);
            }

        }

        return abyte0;
    }

    public void g()
    {
        try
        {
        java.io.DataInputStream datainputstream;
        java.io.File file = new File(s, "session.lock");
        datainputstream = new DataInputStream(((java.io.InputStream) (new FileInputStream(file))));
            try
            {
        if(datainputstream.readLong() != F)
            throw new fd("The save is being accessed from another location, aborting");
            }
            finally
            {
        datainputstream.close();
            }
        }
        catch (java.io.IOException ioexception)
        {
        throw new fd("Failed to check session lock, aborting");
        }
    }

    static 
    {
        i = new float[16];
        float f1 = 0.05F;
        for(int i1 = 0; i1 <= 15; i1++)
        {
            float f2 = 1.0F - (float)i1 / 15F;
            i[i1] = ((1.0F - f2) / (f2 * 3F + 1.0F)) * (1.0F - f1) + f1;
        }

    }
}
