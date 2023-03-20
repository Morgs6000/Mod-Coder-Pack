// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class is extends dj
{

    public int ar;
    public float as;
    public float at;
    public float au;
    public float av;
    public float aw;
    protected float ax;
    protected float ay;
    protected float az;
    protected float aA;
    protected boolean aB;
    protected java.lang.String aC;
    protected boolean aD;
    protected float aE;
    protected java.lang.String aF;
    protected float aG;
    protected int aH;
    protected float aI;
    public boolean aJ;
    public float aK;
    public float aL;
    public int aM;
    public int aN;
    private int a;
    public int aO;
    public int aP;
    public float aQ;
    public int aR;
    public int aS;
    public float aT;
    public float aU;
    protected boolean aV;
    public int aW;
    public float aX;
    public float aY;
    public float aZ;
    public float ba;
    private int b;
    private double ad;
    private double ae;
    private double af;
    private double ag;
    private double ah;
    float bb;
    protected int bc;
    protected float bd;
    protected float be;
    protected float bf;
    protected boolean bg;
    protected float bh;
    protected float bi;
    private dj ai;
    private int aj;

    public is(dy dy1)
    {
        super(dy1);
        ar = 20;
        av = 0.0F;
        aw = 0.0F;
        aB = true;
        aC = "/char.png";
        aD = true;
        aE = 0.0F;
        aF = null;
        aG = 1.0F;
        aH = 0;
        aI = 0.0F;
        aJ = false;
        aQ = 0.0F;
        aR = 0;
        aS = 0;
        aV = false;
        aW = -1;
        aX = (float)(java.lang.Math.random() * 0.89999997615814209D + 0.10000000149011612D);
        bb = 0.0F;
        bc = 0;
        bg = false;
        bh = 0.0F;
        bi = 0.7F;
        aj = 0;
        aM = 10;
        e = true;
        au = (float)(java.lang.Math.random() + 1.0D) * 0.01F;
        a(l, m, n);
        as = (float)java.lang.Math.random() * 12398F;
        r = (float)(java.lang.Math.random() * 3.1415927410125732D * 2D);
        at = 1.0F;
        N = 0.5F;
    }

    protected boolean g(dj dj1)
    {
        return h.a(((aw)null).b(l, m + (double)p(), n), ((aw)null).b(dj1.l, dj1.m + (double)dj1.p(), dj1.n)) == null;
    }

    public boolean c_()
    {
        return !B;
    }

    public boolean r()
    {
        return !B;
    }

    protected float p()
    {
        return E * 0.85F;
    }

    public int b()
    {
        return 80;
    }

    public void k()
    {
        aK = aL;
        super.k();
        if(R.nextInt(1000) < a++)
        {
            a = -b();
            java.lang.String s1 = c();
            if(s1 != null)
                h.a(((dj) (this)), s1, f(), (R.nextFloat() - R.nextFloat()) * 0.2F + 1.0F);
        }
        if(t() && u())
            a(((dj) (null)), 1);
        if(t() && a(iq.f))
        {
            Y--;
            if(Y == -20)
            {
                Y = 0;
                for(int i = 0; i < 8; i++)
                {
                    float f1 = R.nextFloat() - R.nextFloat();
                    float f2 = R.nextFloat() - R.nextFloat();
                    float f3 = R.nextFloat() - R.nextFloat();
                    h.a("bubble", l + (double)f1, m + (double)f2, n + (double)f3, o, p, q);
                }

                a(((dj) (null)), 2);
            }
            U = 0;
        } else
        {
            Y = V;
        }
        aT = aU;
        if(aS > 0)
            aS--;
        if(aO > 0)
            aO--;
        if(X > 0)
            X--;
        if(aM <= 0)
        {
            aR++;
            if(aR > 20)
            {
                G();
                j();
                for(int j = 0; j < 20; j++)
                {
                    double d1 = R.nextGaussian() * 0.02D;
                    double d2 = R.nextGaussian() * 0.02D;
                    double d3 = R.nextGaussian() * 0.02D;
                    h.a("explode", (l + (double)(R.nextFloat() * D * 2.0F)) - (double)D, m + (double)(R.nextFloat() * E), (n + (double)(R.nextFloat() * D * 2.0F)) - (double)D, d1, d2, d3);
                }

            }
        }
        aA = az;
        aw = av;
        t = r;
        u = s;
    }

    public void D()
    {
        for(int i = 0; i < 20; i++)
        {
            double d1 = R.nextGaussian() * 0.02D;
            double d2 = R.nextGaussian() * 0.02D;
            double d3 = R.nextGaussian() * 0.02D;
            double d4 = 10D;
            h.a("explode", (l + (double)(R.nextFloat() * D * 2.0F)) - (double)D - d1 * d4, (m + (double)(R.nextFloat() * E)) - d2 * d4, (n + (double)(R.nextFloat() * D * 2.0F)) - (double)D - d3 * d4, d1, d2, d3);
        }

    }

    public void v()
    {
        super.v();
        ax = ay;
        ay = 0.0F;
    }

    public void b_()
    {
        super.b_();
        y();
        double d1 = l - i;
        double d2 = n - k;
        float f1 = gj.a(d1 * d1 + d2 * d2);
        float f2 = av;
        float f3 = 0.0F;
        ax = ay;
        float f4 = 0.0F;
        if(f1 > 0.05F)
        {
            f4 = 1.0F;
            f3 = f1 * 3F;
            f2 = ((float)java.lang.Math.atan2(d2, d1) * 180F) / 3.141593F - 90F;
        }
        if(aL > 0.0F)
            f2 = r;
        if(!w)
            f4 = 0.0F;
        ay = ay + (f4 - ay) * 0.3F;
        float f5;
        for(f5 = f2 - av; f5 < -180F; f5 += 360F);
        for(; f5 >= 180F; f5 -= 360F);
        av += f5 * 0.3F;
        float f6;
        for(f6 = r - av; f6 < -180F; f6 += 360F);
        for(; f6 >= 180F; f6 -= 360F);
        boolean flag = f6 < -90F || f6 >= 90F;
        if(f6 < -75F)
            f6 = -75F;
        if(f6 >= 75F)
            f6 = 75F;
        av = r - f6;
        if(f6 * f6 > 2500F)
            av += f6 * 0.2F;
        if(flag)
            f3 *= -1F;
        for(; r - t < -180F; t -= 360F);
        for(; r - t >= 180F; t += 360F);
        for(; av - aw < -180F; aw -= 360F);
        for(; av - aw >= 180F; aw += 360F);
        for(; s - u < -180F; u -= 360F);
        for(; s - u >= 180F; u += 360F);
        az += f3;
    }

    protected void a(float f1, float f2)
    {
        super.a(f1, f2);
    }

    public void a(int i)
    {
        if(aM <= 0)
            return;
        aM += i;
        if(aM > 20)
            aM = 20;
        X = ar / 2;
    }

    public boolean a(dj dj1, int i)
    {
        if(h.x)
            i = 0;
        bc = 0;
        if(aM <= 0)
            return false;
        aZ = 1.5F;
        if((float)X > (float)ar / 2.0F)
        {
            if(aN - i >= aM)
                return false;
            aM = aN - i;
        } else
        {
            aN = aM;
            X = ar;
            aM -= i;
            aO = aP = 10;
        }
        aQ = 0.0F;
        if(dj1 != null)
        {
            double d1 = dj1.l - l;
            double d2;
            for(d2 = dj1.n - n; d1 * d1 + d2 * d2 < 0.0001D; d2 = (java.lang.Math.random() - java.lang.Math.random()) * 0.01D)
                d1 = (java.lang.Math.random() - java.lang.Math.random()) * 0.01D;

            aQ = (float)((java.lang.Math.atan2(d2, d1) * 180D) / 3.1415927410125732D) - r;
            a(dj1, i, d1, d2);
        } else
        {
            aQ = (int)(java.lang.Math.random() * 2D) * 180;
        }
        if(aM <= 0)
        {
            h.a(((dj) (this)), e(), f(), (R.nextFloat() - R.nextFloat()) * 0.2F + 1.0F);
            f(dj1);
        } else
        {
            h.a(((dj) (this)), d(), f(), (R.nextFloat() - R.nextFloat()) * 0.2F + 1.0F);
        }
        return true;
    }

    protected float f()
    {
        return 1.0F;
    }

    protected java.lang.String c()
    {
        return null;
    }

    protected java.lang.String d()
    {
        return "random.hurt";
    }

    protected java.lang.String e()
    {
        return "random.hurt";
    }

    public void a(dj dj1, int i, double d1, double d2)
    {
        float f1 = gj.a(d1 * d1 + d2 * d2);
        float f2 = 0.4F;
        o /= 2D;
        p /= 2D;
        q /= 2D;
        o -= (d1 / (double)f1) * (double)f2;
        p += 0.40000000596046448D;
        q -= (d2 / (double)f1) * (double)f2;
        if(p > 0.40000000596046448D)
            p = 0.40000000596046448D;
    }

    public void f(dj dj1)
    {
        if(aH > 0 && dj1 != null)
            dj1.b(((dj) (this)), aH);
        aV = true;
        int i = g();
        if(i > 0)
        {
            int j = R.nextInt(3);
            for(int i1 = 0; i1 < j; i1++)
                a(i, 1);

        }
    }

    protected int g()
    {
        return 0;
    }

    protected void a(float f1)
    {
        int i = (int)java.lang.Math.ceil(f1 - 3F);
        if(i > 0)
        {
            a(((dj) (null)), i);
            int j = h.a(gj.b(l), gj.b(m - 0.20000000298023224D - (double)C), gj.b(n));
            if(j > 0)
            {
                bq bq1 = ff.n[j].bl;
                h.a(((dj) (this)), bq1.c(), bq1.a() * 0.5F, bq1.b() * 0.75F);
            }
        }
    }

    public void c(float f1, float f2)
    {
        if(o())
        {
            double d1 = m;
            a(f1, f2, 0.02F);
            c(o, p, q);
            o *= 0.80000001192092896D;
            p *= 0.80000001192092896D;
            q *= 0.80000001192092896D;
            p -= 0.02D;
            if(x && b(o, ((p + 0.60000002384185791D) - m) + d1, q))
                p = 0.30000001192092896D;
        } else
        if(q())
        {
            double d2 = m;
            a(f1, f2, 0.02F);
            c(o, p, q);
            o *= 0.5D;
            p *= 0.5D;
            q *= 0.5D;
            p -= 0.02D;
            if(x && b(o, ((p + 0.60000002384185791D) - m) + d2, q))
                p = 0.30000001192092896D;
        } else
        {
            float f3 = 0.91F;
            if(w)
            {
                f3 = 0.5460001F;
                int i = h.a(gj.b(l), gj.b(v.b) - 1, gj.b(n));
                if(i > 0)
                    f3 = ff.n[i].bo * 0.91F;
            }
            float f4 = 0.1627714F / (f3 * f3 * f3);
            a(f1, f2, w ? 0.1F * f4 : 0.02F);
            f3 = 0.91F;
            if(w)
            {
                f3 = 0.5460001F;
                int j = h.a(gj.b(l), gj.b(v.b) - 1, gj.b(n));
                if(j > 0)
                    f3 = ff.n[j].bo * 0.91F;
            }
            if(E())
            {
                I = 0.0F;
                if(p < -0.14999999999999999D)
                    p = -0.14999999999999999D;
            }
            c(o, p, q);
            if(x && E())
                p = 0.20000000000000001D;
            p -= 0.080000000000000002D;
            p *= 0.98000001907348633D;
            o *= f3;
            q *= f3;
        }
        aY = aZ;
        double d3 = l - this.i;
        double d4 = n - k;
        float f5 = gj.a(d3 * d3 + d4 * d4) * 4F;
        if(f5 > 1.0F)
            f5 = 1.0F;
        aZ += (f5 - aZ) * 0.4F;
        ba += aZ;
    }

    public boolean E()
    {
        int i = gj.b(l);
        int j = gj.b(v.b);
        int i1 = gj.b(n);
        return h.a(i, j, i1) == ff.aG.bc || h.a(i, j + 1, i1) == ff.aG.bc;
    }

    public void a(s s1)
    {
        s1.a("Health", (short)aM);
        s1.a("HurtTime", (short)aO);
        s1.a("DeathTime", (short)aR);
        s1.a("AttackTime", (short)aS);
    }

    public void b(s s1)
    {
        aM = ((int) (s1.c("Health")));
        if(!s1.a("Health"))
            aM = 10;
        aO = ((int) (s1.c("HurtTime")));
        aR = ((int) (s1.c("DeathTime")));
        aS = ((int) (s1.c("AttackTime")));
    }

    public boolean t()
    {
        return !B && aM > 0;
    }

    public void y()
    {
        if(b > 0)
        {
            double d1 = l + (ad - l) / (double)b;
            double d2 = m + (ae - m) / (double)b;
            double d3 = n + (af - n) / (double)b;
            double d4;
            for(d4 = ag - (double)r; d4 < -180D; d4 += 360D);
            for(; d4 >= 180D; d4 -= 360D);
            r += ((float) (d4 / (double)b));
            s += ((float) ((ah - (double)s) / (double)b));
            b--;
            a(d1, d2, d3);
            b(r, s);
        }
        if(aM <= 0)
        {
            bg = false;
            bd = 0.0F;
            be = 0.0F;
            bf = 0.0F;
        } else
        if(!aJ)
            d_();
        boolean flag = o();
        boolean flag1 = q();
        if(bg)
            if(flag)
                p += 0.039999999105930328D;
            else
            if(flag1)
                p += 0.039999999105930328D;
            else
            if(w)
                F();
        bd *= 0.98F;
        be *= 0.98F;
        bf *= 0.9F;
        c(bd, be);
        java.util.List list = h.b(((dj) (this)), v.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                dj dj1 = (dj)list.get(i);
                if(dj1.r())
                    dj1.c(((dj) (this)));
            }

        }
    }

    protected void F()
    {
        p = 0.41999998688697815D;
    }

    protected void d_()
    {
        bc++;
        fc fc = h.a(((dj) (this)), -1D);
        if(fc != null)
        {
            double d1 = ((dj) (fc)).l - l;
            double d2 = ((dj) (fc)).m - m;
            double d3 = ((dj) (fc)).n - n;
            double d4 = d1 * d1 + d2 * d2 + d3 * d3;
            if(d4 > 16384D)
                j();
            if(bc > 600 && R.nextInt(800) == 0)
                if(d4 < 1024D)
                    bc = 0;
                else
                    j();
        }
        bd = 0.0F;
        be = 0.0F;
        float f1 = 8F;
        if(R.nextFloat() < 0.02F)
        {
            fc fc1 = h.a(((dj) (this)), f1);
            if(fc1 != null)
            {
                ai = ((dj) (fc1));
                aj = 10 + R.nextInt(20);
            } else
            {
                bf = (R.nextFloat() - 0.5F) * 20F;
            }
        }
        if(ai != null)
        {
            b(ai, 10F);
            if(aj-- <= 0 || ai.B || ai.b(((dj) (this))) > (double)(f1 * f1))
                ai = null;
        } else
        {
            if(R.nextFloat() < 0.05F)
                bf = (R.nextFloat() - 0.5F) * 20F;
            r += bf;
            s = bh;
        }
        boolean flag = o();
        boolean flag1 = q();
        if(flag || flag1)
            bg = R.nextFloat() < 0.8F;
    }

    public void b(dj dj1, float f1)
    {
        double d1 = dj1.l - l;
        double d3 = dj1.n - n;
        double d2;
        if(dj1 instanceof is)
        {
            is is1 = (is)dj1;
            d2 = (is1.m + (double)is1.p()) - (m + (double)p());
        } else
        {
            d2 = (dj1.v.b + dj1.v.e) / 2D - (m + (double)p());
        }
        double d4 = gj.a(d1 * d1 + d3 * d3);
        float f2 = (float)((java.lang.Math.atan2(d3, d1) * 180D) / 3.1415927410125732D) - 90F;
        float f3 = (float)((java.lang.Math.atan2(d2, d4) * 180D) / 3.1415927410125732D);
        s = b(s, f3, f1);
        r = b(r, f2, f1);
    }

    private float b(float f1, float f2, float f3)
    {
        float f4;
        for(f4 = f2 - f1; f4 < -180F; f4 += 360F);
        for(; f4 >= 180F; f4 -= 360F);
        if(f4 > f3)
            f4 = f3;
        if(f4 < -f3)
            f4 = -f3;
        return f1 + f4;
    }

    public void G()
    {
    }

    public boolean a()
    {
        return h.a(v) && h.a(((dj) (this)), v).size() == 0 && !h.b(v);
    }

    protected void l()
    {
        a(((dj) (null)), 4);
    }

    public aw c(float f1)
    {
        if(f1 == 1.0F)
        {
            return ((aw)null).b(l, m, n);
        } else
        {
            double d1 = i + (l - i) * (double)f1;
            double d2 = j + (m - j) * (double)f1;
            double d3 = k + (n - k) * (double)f1;
            return ((aw)null).b(d1, d2, d3);
        }
    }

    public aw d(float f1)
    {
        if(f1 == 1.0F)
        {
            float f2 = gj.b(-r * 0.01745329F - 3.141593F);
            float f4 = gj.a(-r * 0.01745329F - 3.141593F);
            float f6 = -gj.b(-s * 0.01745329F);
            float f8 = gj.a(-s * 0.01745329F);
            return ((aw)null).b(f4 * f6, f8, f2 * f6);
        } else
        {
            float f3 = u + (s - u) * f1;
            float f5 = t + (r - t) * f1;
            float f7 = gj.b(-f5 * 0.01745329F - 3.141593F);
            float f9 = gj.a(-f5 * 0.01745329F - 3.141593F);
            float f10 = -gj.b(-f3 * 0.01745329F);
            float f11 = gj.a(-f3 * 0.01745329F);
            return ((aw)null).b(f9 * f10, f11, f7 * f10);
        }
    }

    public fr a(double d1, float f1)
    {
        aw aw1 = c(f1);
        aw aw2 = d(f1);
        aw aw3 = aw1.c(aw2.a * d1, aw2.b * d1, aw2.c * d1);
        return h.a(aw1, aw3);
    }
}
