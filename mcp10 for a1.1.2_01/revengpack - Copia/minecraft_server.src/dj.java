// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public abstract class dj
{

    private static int a = 0;
    public int c;
    public double d;
    public boolean e;
    public dj f;
    public dj g;
    protected dy h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;
    public float r;
    public float s;
    public float t;
    public float u;
    public final dg v = dg.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    protected boolean H;
    protected float I;
    private int b;
    public double J;
    public double K;
    public double L;
    public float M;
    public float N;
    public boolean O;
    public float P;
    public boolean Q;
    protected java.util.Random R;
    public int S;
    public int T;
    public int U;
    protected int V;
    protected boolean W;
    public int X;
    public int Y;
    private boolean ad;
    private double ae;
    private double af;
    public boolean Z;
    public int aa;
    public int ab;
    public int ac;

    public dj(dy dy1)
    {
        c = a++;
        d = 1.0D;
        e = false;
        w = false;
        z = false;
        A = true;
        B = false;
        C = 0.0F;
        D = 0.6F;
        E = 1.8F;
        F = 0.0F;
        G = 0.0F;
        H = true;
        I = 0.0F;
        b = 1;
        M = 0.0F;
        N = 0.0F;
        O = false;
        P = 0.0F;
        Q = false;
        R = new Random();
        S = 0;
        T = 1;
        U = 0;
        V = 300;
        W = false;
        X = 0;
        Y = 300;
        ad = true;
        Z = false;
        h = dy1;
        a(0.0D, 0.0D, 0.0D);
    }

    public boolean equals(java.lang.Object obj)
    {
        if(obj instanceof dj)
            return ((dj)obj).c == c;
        else
            return false;
    }

    public int hashCode()
    {
        return c;
    }

    public void j()
    {
        B = true;
    }

    protected void a(float f1, float f2)
    {
        D = f1;
        E = f2;
    }

    protected void b(float f1, float f2)
    {
        r = f1;
        s = f2;
    }

    public void a(double d1, double d2, double d3)
    {
        l = d1;
        m = d2;
        n = d3;
        float f1 = D / 2.0F;
        float f2 = E;
        v.c(d1 - (double)f1, (d2 - (double)C) + (double)M, d3 - (double)f1, d1 + (double)f1, (d2 - (double)C) + (double)M + (double)f2, d3 + (double)f1);
    }

    public void b_()
    {
        k();
    }

    public void k()
    {
        if(g != null && g.B)
            g = null;
        S++;
        F = G;
        i = l;
        j = m;
        k = n;
        u = s;
        t = r;
        if(o())
        {
            if(!W && !ad)
            {
                float f1 = gj.a(o * o * 0.20000000298023224D + p * p + q * q * 0.20000000298023224D) * 0.2F;
                if(f1 > 1.0F)
                    f1 = 1.0F;
                h.a(this, "random.splash", f1, 1.0F + (R.nextFloat() - R.nextFloat()) * 0.4F);
                float f2 = gj.b(v.b);
                for(int i1 = 0; (float)i1 < 1.0F + D * 20F; i1++)
                {
                    float f3 = (R.nextFloat() * 2.0F - 1.0F) * D;
                    float f5 = (R.nextFloat() * 2.0F - 1.0F) * D;
                    h.a("bubble", l + (double)f3, f2 + 1.0F, n + (double)f5, o, p - (double)(R.nextFloat() * 0.2F), q);
                }

                for(int j1 = 0; (float)j1 < 1.0F + D * 20F; j1++)
                {
                    float f4 = (R.nextFloat() * 2.0F - 1.0F) * D;
                    float f6 = (R.nextFloat() * 2.0F - 1.0F) * D;
                    h.a("splash", l + (double)f4, f2 + 1.0F, n + (double)f6, o, p, q);
                }

            }
            I = 0.0F;
            W = true;
            U = 0;
        } else
        {
            W = false;
        }
        if(U > 0)
        {
            if(U % 20 == 0)
                a(((dj) (null)), 1);
            U--;
        }
        if(q())
        {
            a(((dj) (null)), 10);
            U = 600;
        }
        if(m < -64D)
            l();
        ad = false;
    }

    protected void l()
    {
        j();
    }

    public boolean b(double d1, double d2, double d3)
    {
        dg dg1 = v.c(d1, d2, d3);
        java.util.List list = h.a(this, dg1);
        if(list.size() > 0)
            return false;
        return !h.b(dg1);
    }

    public void c(double d1, double d2, double d3)
    {
        if(O)
        {
            v.d(d1, d2, d3);
            l = (v.a + v.d) / 2D;
            m = (v.b + (double)C) - (double)M;
            n = (v.c + v.f) / 2D;
            return;
        }
        double d4 = l;
        double d5 = n;
        double d6 = d1;
        double d7 = d2;
        double d8 = d3;
        dg dg1 = v.b();
        boolean flag = w && m();
        if(flag)
        {
            double d9 = 0.050000000000000003D;
            for(; d1 != 0.0D && h.a(this, v.c(d1, -1D, 0.0D)).size() == 0; d6 = d1)
            {
                if(d1 < d9 && d1 >= -d9)
                {
                    d1 = 0.0D;
                    continue;
                }
                if(d1 > 0.0D)
                    d1 -= d9;
                else
                    d1 += d9;
            }

            for(; d3 != 0.0D && h.a(this, v.c(0.0D, -1D, d3)).size() == 0; d8 = d3)
            {
                if(d3 < d9 && d3 >= -d9)
                {
                    d3 = 0.0D;
                    continue;
                }
                if(d3 > 0.0D)
                    d3 -= d9;
                else
                    d3 += d9;
            }

        }
        java.util.List list = h.a(this, v.a(d1, d2, d3));
        for(int i1 = 0; i1 < list.size(); i1++)
            d2 = ((dg)list.get(i1)).b(v, d2);

        v.d(0.0D, d2, 0.0D);
        if(!A && d7 != d2)
            d1 = d2 = d3 = 0.0D;
        boolean flag1 = w || d7 != d2 && d7 < 0.0D;
        for(int j1 = 0; j1 < list.size(); j1++)
            d1 = ((dg)list.get(j1)).a(v, d1);

        v.d(d1, 0.0D, 0.0D);
        if(!A && d6 != d1)
            d1 = d2 = d3 = 0.0D;
        for(int k1 = 0; k1 < list.size(); k1++)
            d3 = ((dg)list.get(k1)).c(v, d3);

        v.d(0.0D, 0.0D, d3);
        if(!A && d8 != d3)
            d1 = d2 = d3 = 0.0D;
        if(N > 0.0F && flag1 && M < 0.05F && (d6 != d1 || d8 != d3))
        {
            double d10 = d1;
            double d12 = d2;
            double d14 = d3;
            d1 = d6;
            d2 = N;
            d3 = d8;
            dg dg2 = v.b();
            v.b(dg1);
            java.util.List list1 = h.a(this, v.a(d1, d2, d3));
            for(int j3 = 0; j3 < list1.size(); j3++)
                d2 = ((dg)list1.get(j3)).b(v, d2);

            v.d(0.0D, d2, 0.0D);
            if(!A && d7 != d2)
                d1 = d2 = d3 = 0.0D;
            for(int k3 = 0; k3 < list1.size(); k3++)
                d1 = ((dg)list1.get(k3)).a(v, d1);

            v.d(d1, 0.0D, 0.0D);
            if(!A && d6 != d1)
                d1 = d2 = d3 = 0.0D;
            for(int l3 = 0; l3 < list1.size(); l3++)
                d3 = ((dg)list1.get(l3)).c(v, d3);

            v.d(0.0D, 0.0D, d3);
            if(!A && d8 != d3)
                d1 = d2 = d3 = 0.0D;
            if(d10 * d10 + d14 * d14 >= d1 * d1 + d3 * d3)
            {
                d1 = d10;
                d2 = d12;
                d3 = d14;
                v.b(dg2);
            } else
            {
                M += 0.5D;
            }
        }
        l = (v.a + v.d) / 2D;
        m = (v.b + (double)C) - (double)M;
        n = (v.c + v.f) / 2D;
        x = d6 != d1 || d8 != d3;
        y = d7 != d2;
        w = d7 != d2 && d7 < 0.0D;
        z = x || y;
        if(w)
        {
            if(I > 0.0F)
            {
                a(I);
                I = 0.0F;
            }
        } else
        if(d2 < 0.0D)
            I -= ((float) (d2));
        if(d6 != d1)
            o = 0.0D;
        if(d7 != d2)
            p = 0.0D;
        if(d8 != d3)
            q = 0.0D;
        double d11 = l - d4;
        double d13 = n - d5;
        G += ((float) ((double)gj.a(d11 * d11 + d13 * d13) * 0.59999999999999998D));
        if(H && !flag)
        {
            int l1 = gj.b(l);
            int j2 = gj.b(m - 0.20000000298023224D - (double)C);
            int l2 = gj.b(n);
            int i4 = h.a(l1, j2, l2);
            if(G > (float)b && i4 > 0)
            {
                b++;
                bq bq1 = ff.n[i4].bl;
                if(h.a(l1, j2 + 1, l2) == ff.aT.bc)
                {
                    bq1 = ff.aT.bl;
                    h.a(this, bq1.c(), bq1.a() * 0.15F, bq1.b());
                } else
                if(!ff.n[i4].bn.d())
                    h.a(this, bq1.c(), bq1.a() * 0.15F, bq1.b());
                ff.n[i4].b(h, l1, j2, l2, this);
            }
        }
        int i2 = gj.b(v.a);
        int k2 = gj.b(v.b);
        int i3 = gj.b(v.c);
        int j4 = gj.b(v.d);
        int k4 = gj.b(v.e);
        int l4 = gj.b(v.f);
        for(int i5 = i2; i5 <= j4; i5++)
        {
            for(int j5 = k2; j5 <= k4; j5++)
            {
                for(int k5 = i3; k5 <= l4; k5++)
                {
                    int l5 = h.a(i5, j5, k5);
                    if(l5 > 0)
                        ff.n[l5].a(h, i5, j5, k5, this);
                }

            }

        }

        M *= 0.4F;
        boolean flag2 = o();
        if(h.c(v))
        {
            b(1);
            if(!flag2)
            {
                U++;
                if(U == 0)
                    U = 300;
            }
        } else
        if(U <= 0)
            U = -T;
        if(flag2 && U > 0)
        {
            h.a(this, "random.fizz", 0.7F, 1.6F + (R.nextFloat() - R.nextFloat()) * 0.4F);
            U = -T;
        }
    }

    public boolean m()
    {
        return false;
    }

    public dg n()
    {
        return null;
    }

    protected void b(int i1)
    {
        a(((dj) (null)), i1);
    }

    protected void a(float f1)
    {
    }

    public boolean o()
    {
        return h.a(v.b(0.0D, -0.40000000596046448D, 0.0D), iq.f, this);
    }

    public boolean a(iq iq1)
    {
        double d1 = m + (double)p();
        int i1 = gj.b(l);
        int j1 = gj.d(gj.b(d1));
        int k1 = gj.b(n);
        int l1 = h.a(i1, j1, k1);
        if(l1 != 0 && ff.n[l1].bn == iq1)
        {
            float f1 = cn.b(h.b(i1, j1, k1)) - 0.1111111F;
            float f2 = (float)(j1 + 1) - f1;
            return d1 < (double)f2;
        } else
        {
            return false;
        }
    }

    protected float p()
    {
        return 0.0F;
    }

    public boolean q()
    {
        return h.a(v.b(0.0D, -0.40000000596046448D, 0.0D), iq.g);
    }

    public void a(float f1, float f2, float f3)
    {
        float f4 = gj.c(f1 * f1 + f2 * f2);
        if(f4 < 0.01F)
            return;
        if(f4 < 1.0F)
            f4 = 1.0F;
        f4 = f3 / f4;
        f1 *= f4;
        f2 *= f4;
        float f5 = gj.a((r * 3.141593F) / 180F);
        float f6 = gj.b((r * 3.141593F) / 180F);
        o += f1 * f6 - f2 * f5;
        q += f2 * f6 + f1 * f5;
    }

    public float b(float f1)
    {
        int i1 = gj.b(l);
        double d1 = (v.e - v.b) * 0.66000000000000003D;
        int j1 = gj.b((m - (double)C) + d1);
        int k1 = gj.b(n);
        return h.j(i1, j1, k1);
    }

    public void b(double d1, double d2, double d3, float f1, 
            float f2)
    {
        i = l = d1;
        j = m = d2;
        k = n = d3;
        r = f1;
        s = f2;
        M = 0.0F;
        double d4 = t - f1;
        if(d4 < -180D)
            t += 360F;
        if(d4 >= 180D)
            t -= 360F;
        a(l, m, n);
    }

    public void c(double d1, double d2, double d3, float f1, 
            float f2)
    {
        i = l = d1;
        j = m = d2 + (double)C;
        k = n = d3;
        r = f1;
        s = f2;
        a(l, m, n);
    }

    public float a(dj dj1)
    {
        float f1 = (float)(l - dj1.l);
        float f2 = (float)(m - dj1.m);
        float f3 = (float)(n - dj1.n);
        return gj.c(f1 * f1 + f2 * f2 + f3 * f3);
    }

    public double d(double d1, double d2, double d3)
    {
        double d4 = l - d1;
        double d5 = m - d2;
        double d6 = n - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double e(double d1, double d2, double d3)
    {
        double d4 = l - d1;
        double d5 = m - d2;
        double d6 = n - d3;
        return (double)gj.a(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public double b(dj dj1)
    {
        double d1 = l - dj1.l;
        double d2 = m - dj1.m;
        double d3 = n - dj1.n;
        return d1 * d1 + d2 * d2 + d3 * d3;
    }

    public void a(fc fc)
    {
    }

    public void c(dj dj1)
    {
        if(dj1.f == this || dj1.g == this)
            return;
        double d1 = dj1.l - l;
        double d2 = dj1.n - n;
        double d3 = gj.a(d1, d2);
        if(d3 >= 0.0099999997764825821D)
        {
            d3 = gj.a(d3);
            d1 /= d3;
            d2 /= d3;
            double d4 = 1.0D / d3;
            if(d4 > 1.0D)
                d4 = 1.0D;
            d1 *= d4;
            d2 *= d4;
            d1 *= 0.05000000074505806D;
            d2 *= 0.05000000074505806D;
            d1 *= 1.0F - P;
            d2 *= 1.0F - P;
            f(-d1, 0.0D, -d2);
            dj1.f(d1, 0.0D, d2);
        }
    }

    public void f(double d1, double d2, double d3)
    {
        o += d1;
        p += d2;
        q += d3;
    }

    public boolean a(dj dj1, int i1)
    {
        return false;
    }

    public boolean c_()
    {
        return false;
    }

    public boolean r()
    {
        return false;
    }

    public void b(dj dj1, int i1)
    {
    }

    public boolean c(s s1)
    {
        java.lang.String s2 = s();
        if(B || s2 == null)
        {
            return false;
        } else
        {
            s1.a("id", s2);
            d(s1);
            return true;
        }
    }

    public void d(s s1)
    {
        s1.a("Pos", ((gg) (a(new double[] {
            l, m, n
        }))));
        s1.a("Motion", ((gg) (a(new double[] {
            o, p, q
        }))));
        s1.a("Rotation", ((gg) (a(new float[] {
            r, s
        }))));
        s1.a("FallDistance", I);
        s1.a("Fire", (short)U);
        s1.a("Air", (short)Y);
        s1.a("OnGround", w);
        a(s1);
    }

    public void e(s s1)
    {
        dm dm1 = s1.k("Pos");
        dm dm2 = s1.k("Motion");
        dm dm3 = s1.k("Rotation");
        a(0.0D, 0.0D, 0.0D);
        o = ((dt)dm2.a(0)).a;
        p = ((dt)dm2.a(1)).a;
        q = ((dt)dm2.a(2)).a;
        i = J = l = ((dt)dm1.a(0)).a;
        j = K = m = ((dt)dm1.a(1)).a;
        k = L = n = ((dt)dm1.a(2)).a;
        t = r = ((l)dm3.a(0)).a;
        u = s = ((l)dm3.a(1)).a;
        I = s1.f("FallDistance");
        U = ((int) (s1.c("Fire")));
        Y = ((int) (s1.c("Air")));
        w = s1.l("OnGround");
        a(l, m, n);
        b(s1);
    }

    protected final java.lang.String s()
    {
        return gr.b(this);
    }

    protected abstract void b(s s1);

    protected abstract void a(s s1);

    protected dm a(double ad1[])
    {
        dm dm1 = new dm();
        double ad2[] = ad1;
        int i1 = ad2.length;
        for(int j1 = 0; j1 < i1; j1++)
        {
            double d1 = ad2[j1];
            dm1.a(((gg) (new dt(d1))));
        }

        return dm1;
    }

    protected dm a(float af1[])
    {
        dm dm1 = new dm();
        float af2[] = af1;
        int i1 = af2.length;
        for(int j1 = 0; j1 < i1; j1++)
        {
            float f1 = af2[j1];
            dm1.a(((gg) (new l(f1))));
        }

        return dm1;
    }

    public fn a(int i1, int j1)
    {
        return a(i1, j1, 0.0F);
    }

    public fn a(int i1, int j1, float f1)
    {
        fn fn1 = new fn(h, l, m + (double)f1, n, new gp(i1, j1));
        fn1.ad = 10;
        h.a(((dj) (fn1)));
        return fn1;
    }

    public boolean t()
    {
        return !B;
    }

    public boolean u()
    {
        int i1 = gj.b(l);
        int j1 = gj.b(m + (double)p());
        int k1 = gj.b(n);
        return h.d(i1, j1, k1);
    }

    public dg d(dj dj1)
    {
        return null;
    }

    public void v()
    {
        if(g.B)
        {
            g = null;
            return;
        }
        o = 0.0D;
        p = 0.0D;
        q = 0.0D;
        b_();
        g.w();
        af += g.r - g.t;
        ae += g.s - g.u;
        for(; af >= 180D; af -= 360D);
        for(; af < -180D; af += 360D);
        for(; ae >= 180D; ae -= 360D);
        for(; ae < -180D; ae += 360D);
        double d1 = af * 0.5D;
        double d2 = ae * 0.5D;
        float f1 = 10F;
        if(d1 > (double)f1)
            d1 = f1;
        if(d1 < (double)(-f1))
            d1 = -f1;
        if(d2 > (double)f1)
            d2 = f1;
        if(d2 < (double)(-f1))
            d2 = -f1;
        af -= d1;
        ae -= d2;
        r += ((float) (d1));
        s += ((float) (d2));
    }

    protected void w()
    {
        f.a(l, m + h() + f.x(), n);
    }

    public double x()
    {
        return (double)C;
    }

    public double h()
    {
        return (double)E * 0.75D;
    }

    public void e(dj dj1)
    {
        ae = 0.0D;
        af = 0.0D;
        if(g == dj1)
        {
            g.f = null;
            g = null;
            c(dj1.l, dj1.v.b + (double)dj1.E, dj1.n, r, s);
            return;
        }
        if(g != null)
            g.f = null;
        if(dj1.f != null)
            dj1.f.g = null;
        g = dj1;
        dj1.f = this;
    }

}
