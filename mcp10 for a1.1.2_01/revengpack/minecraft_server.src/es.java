// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class es extends dj
{

    public int a;
    public int b;
    public int ad;

    public es(dy dy1)
    {
        super(dy1);
        a = 0;
        b = 0;
        ad = 1;
        e = true;
        a(1.5F, 0.6F);
        C = E / 2.0F;
        H = false;
    }

    public dg d(dj dj1)
    {
        return dj1.v;
    }

    public dg n()
    {
        return v;
    }

    public boolean r()
    {
        return true;
    }

    public double h()
    {
        return (double)E * 0.0D - 0.30000001192092896D;
    }

    public boolean a(dj dj1, int i)
    {
        ad = -ad;
        b = 10;
        a += i * 10;
        if(a > 40)
        {
            for(int j = 0; j < 3; j++)
                a(ff.y.bc, 1, 0.0F);

            for(int k = 0; k < 2; k++)
                a(ez.B.aS, 1, 0.0F);

            j();
        }
        return true;
    }

    public boolean c_()
    {
        return !B;
    }

    public void b_()
    {
        super.b_();
        if(b > 0)
            b--;
        if(a > 0)
            a--;
        this.i = this.l;
        this.j = m;
        this.k = n;
        int i = 5;
        double d1 = 0.0D;
        for(int j = 0; j < i; j++)
        {
            double d3 = (v.b + ((v.e - v.b) * (double)(j + 0)) / (double)i) - 0.125D;
            double d5 = (v.b + ((v.e - v.b) * (double)(j + 1)) / (double)i) - 0.125D;
            dg dg1 = dg.b(v.a, d3, v.c, v.d, d5, v.f);
            if(h.b(dg1, iq.f))
                d1 += 1.0D / (double)i;
        }

        double d2 = d1 * 2D - 1.0D;
        p += 0.039999999105930328D * d2;
        if(f != null)
        {
            o += f.o * 0.20000000000000001D;
            q += f.q * 0.20000000000000001D;
        }
        double d4 = 0.40000000000000002D;
        if(o < -d4)
            o = -d4;
        if(o > d4)
            o = d4;
        if(q < -d4)
            q = -d4;
        if(q > d4)
            q = d4;
        if(w)
        {
            o *= 0.5D;
            p *= 0.5D;
            q *= 0.5D;
        }
        c(o, p, q);
        double d6 = java.lang.Math.sqrt(o * o + q * q);
        if(d6 > 0.14999999999999999D)
        {
            double d7 = java.lang.Math.cos(((double)r * 3.1415926535897931D) / 180D);
            double d9 = java.lang.Math.sin(((double)r * 3.1415926535897931D) / 180D);
            for(int i1 = 0; (double)i1 < 1.0D + d6 * 60D; i1++)
            {
                double d12 = R.nextFloat() * 2.0F - 1.0F;
                double d14 = (double)(R.nextInt(2) * 2 - 1) * 0.69999999999999996D;
                if(R.nextBoolean())
                {
                    double d15 = (this.l - d7 * d12 * 0.80000000000000004D) + d9 * d14;
                    double d17 = n - d9 * d12 * 0.80000000000000004D - d7 * d14;
                    h.a("splash", d15, m - 0.125D, d17, o, p, q);
                } else
                {
                    double d16 = this.l + d7 + d9 * d12 * 0.69999999999999996D;
                    double d18 = (n + d9) - d7 * d12 * 0.69999999999999996D;
                    h.a("splash", d16, m - 0.125D, d18, o, p, q);
                }
            }

        }
        if(x && d6 > 0.14999999999999999D)
        {
            j();
            for(int k = 0; k < 3; k++)
                a(ff.y.bc, 1, 0.0F);

            for(int l = 0; l < 2; l++)
                a(ez.B.aS, 1, 0.0F);

        } else
        {
            o *= 0.99000000953674316D;
            p *= 0.94999998807907104D;
            q *= 0.99000000953674316D;
        }
        s = 0.0F;
        double d8 = r;
        double d10 = this.i - this.l;
        double d11 = this.k - n;
        if(d10 * d10 + d11 * d11 > 0.001D)
            d8 = (float)((java.lang.Math.atan2(d11, d10) * 180D) / 3.1415926535897931D);
        double d13;
        for(d13 = d8 - (double)r; d13 >= 180D; d13 -= 360D);
        for(; d13 < -180D; d13 += 360D);
        if(d13 > 20D)
            d13 = 20D;
        if(d13 < -20D)
            d13 = -20D;
        r += ((float) (d13));
        b(r, s);
        java.util.List list = h.b(((dj) (this)), v.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                dj dj1 = (dj)list.get(j1);
                if(dj1 != f && dj1.r() && (dj1 instanceof es))
                    dj1.c(((dj) (this)));
            }

        }
        if(f != null && f.B)
            f = null;
    }

    protected void w()
    {
        double d1 = java.lang.Math.cos(((double)r * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
        double d2 = java.lang.Math.sin(((double)r * 3.1415926535897931D) / 180D) * 0.40000000000000002D;
        f.a(l + d1, m + h() + f.x(), n + d2);
    }

    protected void a(s s)
    {
    }

    protected void b(s s)
    {
    }
}
