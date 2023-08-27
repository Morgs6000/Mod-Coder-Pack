// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class di extends dj
{

    private int b;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    public int a;
    private is ah;
    private int ai;
    private int aj;

    public di(dy dy1)
    {
        super(dy1);
        b = -1;
        ad = -1;
        ae = -1;
        af = 0;
        ag = false;
        a = 0;
        aj = 0;
        a(0.5F, 0.5F);
    }

    public di(dy dy1, is is1)
    {
        super(dy1);
        b = -1;
        ad = -1;
        ae = -1;
        af = 0;
        ag = false;
        a = 0;
        aj = 0;
        ah = is1;
        a(0.5F, 0.5F);
        c(is1.l, is1.m, is1.n, is1.r, is1.s);
        l -= gj.b((r / 180F) * 3.141593F) * 0.16F;
        m -= 0.10000000149011612D;
        n -= gj.a((r / 180F) * 3.141593F) * 0.16F;
        a(l, m, n);
        C = 0.0F;
        o = -gj.a((r / 180F) * 3.141593F) * gj.b((s / 180F) * 3.141593F);
        q = gj.b((r / 180F) * 3.141593F) * gj.b((s / 180F) * 3.141593F);
        p = -gj.a((s / 180F) * 3.141593F);
        a(o, p, q, 1.5F, 1.0F);
    }

    public void a(double d, double d1, double d2, float f, 
            float f1)
    {
        float f2 = gj.a(d * d + d1 * d1 + d2 * d2);
        d /= f2;
        d1 /= f2;
        d2 /= f2;
        d += R.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d1 += R.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d2 += R.nextGaussian() * 0.0074999998323619366D * (double)f1;
        d *= f;
        d1 *= f;
        d2 *= f;
        o = d;
        p = d1;
        q = d2;
        float f3 = gj.a(d * d + d2 * d2);
        t = r = (float)((java.lang.Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
        u = s = (float)((java.lang.Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);
        ai = 0;
    }

    public void b_()
    {
        super.b_();
        if(a > 0)
            a--;
        if(ag)
        {
            int i = h.a(b, ad, ae);
            if(i != af)
            {
                ag = false;
                o *= R.nextFloat() * 0.2F;
                p *= R.nextFloat() * 0.2F;
                q *= R.nextFloat() * 0.2F;
                ai = 0;
                aj = 0;
            } else
            {
                ai++;
                if(ai == 1200)
                    j();
                return;
            }
        } else
        {
            aj++;
        }
        aw aw1 = aw.b(l, m, n);
        aw aw2 = aw.b(l + o, m + p, n + q);
        fr fr1 = h.a(aw1, aw2);
        aw1 = aw.b(l, m, n);
        aw2 = aw.b(l + o, m + p, n + q);
        if(fr1 != null)
            aw2 = aw.b(fr1.f.a, fr1.f.b, fr1.f.c);
        dj dj1 = null;
        java.util.List list = h.b(((dj) (this)), v.a(o, p, q).b(1.0D, 1.0D, 1.0D));
        double d = 0.0D;
        for(int j = 0; j < list.size(); j++)
        {
            dj dj2 = (dj)list.get(j);
            if(!dj2.c_() || dj2 == ah && aj < 5)
                continue;
            float f3 = 0.3F;
            dg dg1 = dj2.v.b(f3, f3, f3);
            fr fr2 = dg1.a(aw1, aw2);
            if(fr2 == null)
                continue;
            double d1 = aw1.a(fr2.f);
            if(d1 < d || d == 0.0D)
            {
                dj1 = dj2;
                d = d1;
            }
        }

        if(dj1 != null)
            fr1 = new fr(dj1);
        if(fr1 != null)
            if(fr1.g != null)
            {
                if(fr1.g.a(((dj) (ah)), 4))
                {
                    h.a(((dj) (this)), "random.drr", 1.0F, 1.2F / (R.nextFloat() * 0.2F + 0.9F));
                    j();
                } else
                {
                    o *= -0.10000000149011612D;
                    p *= -0.10000000149011612D;
                    q *= -0.10000000149011612D;
                    r += 180F;
                    t += 180F;
                    aj = 0;
                }
            } else
            {
                b = fr1.b;
                ad = fr1.c;
                ae = fr1.d;
                af = h.a(b, ad, ae);
                o = (float)(fr1.f.a - l);
                p = (float)(fr1.f.b - m);
                q = (float)(fr1.f.c - n);
                float f = gj.a(o * o + p * p + q * q);
                l -= (o / (double)f) * 0.05000000074505806D;
                m -= (p / (double)f) * 0.05000000074505806D;
                n -= (q / (double)f) * 0.05000000074505806D;
                h.a(((dj) (this)), "random.drr", 1.0F, 1.2F / (R.nextFloat() * 0.2F + 0.9F));
                ag = true;
                a = 7;
            }
        l += o;
        m += p;
        n += q;
        float f1 = gj.a(o * o + q * q);
        r = (float)((java.lang.Math.atan2(o, q) * 180D) / 3.1415927410125732D);
        for(s = (float)((java.lang.Math.atan2(p, f1) * 180D) / 3.1415927410125732D); s - u < -180F; u -= 360F);
        for(; s - u >= 180F; u += 360F);
        for(; r - t < -180F; t -= 360F);
        for(; r - t >= 180F; t += 360F);
        s = u + (s - u) * 0.2F;
        r = t + (r - t) * 0.2F;
        float f2 = 0.99F;
        float f4 = 0.03F;
        if(o())
        {
            for(int k = 0; k < 4; k++)
            {
                float f5 = 0.25F;
                h.a("bubble", l - o * (double)f5, m - p * (double)f5, n - q * (double)f5, o, p, q);
            }

            f2 = 0.8F;
        }
        o *= f2;
        p *= f2;
        q *= f2;
        p -= f4;
        a(l, m, n);
    }

    public void a(s s1)
    {
        s1.a("xTile", (short)b);
        s1.a("yTile", (short)ad);
        s1.a("zTile", (short)ae);
        s1.a("inTile", (byte)af);
        s1.a("shake", (byte)a);
        s1.a("inGround", (byte)(ag ? 1 : 0));
    }

    public void b(s s1)
    {
        b = ((int) (s1.c("xTile")));
        ad = ((int) (s1.c("yTile")));
        ae = ((int) (s1.c("zTile")));
        af = s1.b("inTile") & 0xff;
        a = s1.b("shake") & 0xff;
        ag = s1.b("inGround") == 1;
    }

    public void a(fc fc1)
    {
        if(ag && ah == fc1 && a <= 0 && fc1.aj.a(new gp(ez.j.aS, 1)))
        {
            h.a(((dj) (this)), "random.pop", 0.2F, ((R.nextFloat() - R.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            fc1.c(((dj) (this)), 1);
            j();
        }
    }
}
