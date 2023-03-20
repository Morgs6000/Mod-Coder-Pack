// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class ih extends dj
    implements iw
{

    private gp ai[];
    public int a;
    public int b;
    public int ad;
    private boolean aj;
    public int ae;
    public int af;
    public double ag;
    public double ah;
    private static final int ak[][][] = {
        {
            {
                0, 0, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, -1, 0
            }, {
                1, 0, 0
            }
        }, {
            {
                -1, 0, 0
            }, {
                1, -1, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                0, -1, 1
            }
        }, {
            {
                0, -1, -1
            }, {
                0, 0, 1
            }
        }, {
            {
                0, 0, 1
            }, {
                1, 0, 0
            }
        }, {
            {
                0, 0, 1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                -1, 0, 0
            }
        }, {
            {
                0, 0, -1
            }, {
                1, 0, 0
            }
        }
    };
    private int al;
    private double am;
    private double an;
    private double ao;
    private double ap;
    private double aq;

    public ih(dy dy1)
    {
        super(dy1);
        ai = new gp[36];
        a = 0;
        b = 0;
        ad = 1;
        aj = false;
        e = true;
        a(0.98F, 0.7F);
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

    public ih(dy dy1, double d1, double d2, double d3, 
            int i)
    {
        this(dy1);
        a(d1, d2 + (double)C, d3);
        o = 0.0D;
        p = 0.0D;
        q = 0.0D;
        this.i = d1;
        j = d2;
        k = d3;
        ae = i;
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
            a(ez.ax.aS, 1, 0.0F);
            if(ae == 1)
                a(ff.av.bc, 1, 0.0F);
            else
            if(ae == 2)
                a(ff.aC.bc, 1, 0.0F);
            j();
        }
        return true;
    }

    public boolean c_()
    {
        return !B;
    }

    public void j()
    {
label0:
        for(int i = 0; i < a(); i++)
        {
            gp gp1 = a(i);
            if(gp1 == null)
                continue;
            float f = R.nextFloat() * 0.8F + 0.1F;
            float f1 = R.nextFloat() * 0.8F + 0.1F;
            float f2 = R.nextFloat() * 0.8F + 0.1F;
            do
            {
                if(gp1.a <= 0)
                    continue label0;
                int k = R.nextInt(21) + 10;
                if(k > gp1.a)
                    k = gp1.a;
                gp1.a -= k;
                fn fn1 = new fn(h, l + (double)f, m + (double)f1, n + (double)f2, new gp(gp1.c, k, gp1.d));
                float f3 = 0.05F;
                fn1.o = (float)R.nextGaussian() * f3;
                fn1.p = (float)R.nextGaussian() * f3 + 0.2F;
                fn1.q = (float)R.nextGaussian() * f3;
                h.a(((dj) (fn1)));
            } while(true);
        }

        super.j();
    }

    public void b_()
    {
        if(h.x)
        {
            if(al > 0)
            {
                double d1 = this.l + (am - this.l) / (double)al;
                double d2 = m + (an - m) / (double)al;
                double d4 = n + (ao - n) / (double)al;
                double d5;
                for(d5 = ap - (double)r; d5 < -180D; d5 += 360D);
                for(; d5 >= 180D; d5 -= 360D);
                r += ((float) (d5 / (double)al));
                s += ((float) ((aq - (double)s) / (double)al));
                al--;
                a(d1, d2, d4);
                b(r, s);
            } else
            {
                a(this.l, m, n);
                b(r, s);
            }
            return;
        }
        if(b > 0)
            b--;
        if(a > 0)
            a--;
        this.i = this.l;
        j = m;
        this.k = n;
        p -= 0.039999999105930328D;
        int i = gj.b(this.l);
        int k = gj.b(m);
        int l = gj.b(n);
        if(h.a(i, k - 1, l) == ff.aH.bc)
            k--;
        double d3 = 0.40000000000000002D;
        boolean flag = false;
        double d6 = 0.0078125D;
        if(h.a(i, k, l) == ff.aH.bc)
        {
            aw aw1 = g(this.l, m, n);
            int i1 = h.b(i, k, l);
            m = k;
            if(i1 >= 2 && i1 <= 5)
                m = k + 1;
            if(i1 == 2)
                o -= d6;
            if(i1 == 3)
                o += d6;
            if(i1 == 4)
                q += d6;
            if(i1 == 5)
                q -= d6;
            int ai1[][] = ak[i1];
            double d9 = ai1[1][0] - ai1[0][0];
            double d11 = ai1[1][2] - ai1[0][2];
            double d12 = java.lang.Math.sqrt(d9 * d9 + d11 * d11);
            double d13 = o * d9 + q * d11;
            if(d13 < 0.0D)
            {
                d9 = -d9;
                d11 = -d11;
            }
            double d14 = java.lang.Math.sqrt(o * o + q * q);
            o = (d14 * d9) / d12;
            q = (d14 * d11) / d12;
            double d17 = 0.0D;
            double d18 = (double)i + 0.5D + (double)ai1[0][0] * 0.5D;
            double d19 = (double)l + 0.5D + (double)ai1[0][2] * 0.5D;
            double d20 = (double)i + 0.5D + (double)ai1[1][0] * 0.5D;
            double d21 = (double)l + 0.5D + (double)ai1[1][2] * 0.5D;
            d9 = d20 - d18;
            d11 = d21 - d19;
            if(d9 == 0.0D)
            {
                this.l = (double)i + 0.5D;
                d17 = n - (double)l;
            } else
            if(d11 == 0.0D)
            {
                n = (double)l + 0.5D;
                d17 = this.l - (double)i;
            } else
            {
                double d22 = this.l - d18;
                double d24 = n - d19;
                double d26 = (d22 * d9 + d24 * d11) * 2D;
                d17 = d26;
            }
            this.l = d18 + d9 * d17;
            n = d19 + d11 * d17;
            a(this.l, m + (double)C, n);
            double d23 = o;
            double d25 = q;
            if(f != null)
            {
                d23 *= 0.75D;
                d25 *= 0.75D;
            }
            if(d23 < -d3)
                d23 = -d3;
            if(d23 > d3)
                d23 = d3;
            if(d25 < -d3)
                d25 = -d3;
            if(d25 > d3)
                d25 = d3;
            c(d23, 0.0D, d25);
            if(ai1[0][1] != 0 && gj.b(this.l) - i == ai1[0][0] && gj.b(n) - l == ai1[0][2])
                a(this.l, m + (double)ai1[0][1], n);
            else
            if(ai1[1][1] != 0 && gj.b(this.l) - i == ai1[1][0] && gj.b(n) - l == ai1[1][2])
                a(this.l, m + (double)ai1[1][1], n);
            if(f != null)
            {
                o *= 0.99699997901916504D;
                p *= 0.0D;
                q *= 0.99699997901916504D;
            } else
            {
                if(ae == 2)
                {
                    double d27 = gj.a(ag * ag + ah * ah);
                    if(d27 > 0.01D)
                    {
                        flag = true;
                        ag /= d27;
                        ah /= d27;
                        double d29 = 0.040000000000000001D;
                        o *= 0.80000001192092896D;
                        p *= 0.0D;
                        q *= 0.80000001192092896D;
                        o += ag * d29;
                        q += ah * d29;
                    } else
                    {
                        o *= 0.89999997615814209D;
                        p *= 0.0D;
                        q *= 0.89999997615814209D;
                    }
                }
                o *= 0.95999997854232788D;
                p *= 0.0D;
                q *= 0.95999997854232788D;
            }
            aw aw2 = g(this.l, m, n);
            if(aw2 != null && aw1 != null)
            {
                double d28 = (aw1.b - aw2.b) * 0.050000000000000003D;
                double d15 = java.lang.Math.sqrt(o * o + q * q);
                if(d15 > 0.0D)
                {
                    o = (o / d15) * (d15 + d28);
                    q = (q / d15) * (d15 + d28);
                }
                a(this.l, aw2.b, n);
            }
            int k1 = gj.b(this.l);
            int l1 = gj.b(n);
            if(k1 != i || l1 != l)
            {
                double d16 = java.lang.Math.sqrt(o * o + q * q);
                o = d16 * (double)(k1 - i);
                q = d16 * (double)(l1 - l);
            }
            if(ae == 2)
            {
                double d30 = gj.a(ag * ag + ah * ah);
                if(d30 > 0.01D && o * o + q * q > 0.001D)
                {
                    ag /= d30;
                    ah /= d30;
                    if(ag * o + ah * q < 0.0D)
                    {
                        ag = 0.0D;
                        ah = 0.0D;
                    } else
                    {
                        ag = o;
                        ah = q;
                    }
                }
            }
        } else
        {
            if(o < -d3)
                o = -d3;
            if(o > d3)
                o = d3;
            if(q < -d3)
                q = -d3;
            if(q > d3)
                q = d3;
            if(w)
            {
                o *= 0.5D;
                p *= 0.5D;
                q *= 0.5D;
            }
            c(o, p, q);
            if(!w)
            {
                o *= 0.94999998807907104D;
                p *= 0.94999998807907104D;
                q *= 0.94999998807907104D;
            }
        }
        s = 0.0F;
        double d7 = this.i - this.l;
        double d8 = this.k - n;
        if(d7 * d7 + d8 * d8 > 0.001D)
        {
            r = (float)((java.lang.Math.atan2(d8, d7) * 180D) / 3.1415926535897931D);
            if(aj)
                r += 180F;
        }
        double d10;
        for(d10 = r - t; d10 >= 180D; d10 -= 360D);
        for(; d10 < -180D; d10 += 360D);
        if(d10 < -170D || d10 >= 170D)
        {
            r += 180F;
            aj = !aj;
        }
        b(r, s);
        java.util.List list = h.b(((dj) (this)), v.b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
        if(list != null && list.size() > 0)
        {
            for(int j1 = 0; j1 < list.size(); j1++)
            {
                dj dj1 = (dj)list.get(j1);
                if(dj1 != f && dj1.r() && (dj1 instanceof ih))
                    dj1.c(((dj) (this)));
            }

        }
        if(f != null && f.B)
            f = null;
        if(flag && R.nextInt(4) == 0)
        {
            af--;
            if(af < 0)
                ag = ah = 0.0D;
            h.a("largesmoke", this.l, m + 0.80000000000000004D, n, 0.0D, 0.0D, 0.0D);
        }
    }

    public aw g(double d1, double d2, double d3)
    {
        int i = gj.b(d1);
        int k = gj.b(d2);
        int l = gj.b(d3);
        if(h.a(i, k - 1, l) == ff.aH.bc)
            k--;
        if(h.a(i, k, l) == ff.aH.bc)
        {
            int i1 = h.b(i, k, l);
            d2 = k;
            if(i1 >= 2 && i1 <= 5)
                d2 = k + 1;
            int ai1[][] = ak[i1];
            double d4 = 0.0D;
            double d5 = (double)i + 0.5D + (double)ai1[0][0] * 0.5D;
            double d6 = (double)k + 0.5D + (double)ai1[0][1] * 0.5D;
            double d7 = (double)l + 0.5D + (double)ai1[0][2] * 0.5D;
            double d8 = (double)i + 0.5D + (double)ai1[1][0] * 0.5D;
            double d9 = (double)k + 0.5D + (double)ai1[1][1] * 0.5D;
            double d10 = (double)l + 0.5D + (double)ai1[1][2] * 0.5D;
            double d11 = d8 - d5;
            double d12 = (d9 - d6) * 2D;
            double d13 = d10 - d7;
            if(d11 == 0.0D)
            {
                d1 = (double)i + 0.5D;
                d4 = d3 - (double)l;
            } else
            if(d13 == 0.0D)
            {
                d3 = (double)l + 0.5D;
                d4 = d1 - (double)i;
            } else
            {
                double d14 = d1 - d5;
                double d15 = d3 - d7;
                double d16 = (d14 * d11 + d15 * d13) * 2D;
                d4 = d16;
            }
            d1 = d5 + d11 * d4;
            d2 = d6 + d12 * d4;
            d3 = d7 + d13 * d4;
            if(d12 < 0.0D)
                d2++;
            if(d12 > 0.0D)
                d2 += 0.5D;
            return aw.b(d1, d2, d3);
        } else
        {
            return null;
        }
    }

    protected void a(s s1)
    {
        s1.a("Type", ae);
        if(ae == 2)
        {
            s1.a("PushX", ag);
            s1.a("PushZ", ah);
            s1.a("Fuel", (short)af);
        } else
        if(ae == 1)
        {
            dm dm1 = new dm();
            for(int i = 0; i < ai.length; i++)
                if(ai[i] != null)
                {
                    s s2 = new s();
                    s2.a("Slot", (byte)i);
                    ai[i].a(s2);
                    dm1.a(((gg) (s2)));
                }

            s1.a("Items", ((gg) (dm1)));
        }
    }

    protected void b(s s1)
    {
        ae = s1.d("Type");
        if(ae == 2)
        {
            ag = s1.g("PushX");
            ah = s1.g("PushZ");
            af = ((int) (s1.c("Fuel")));
        } else
        if(ae == 1)
        {
            dm dm1 = s1.k("Items");
            ai = new gp[a()];
            for(int i = 0; i < dm1.b(); i++)
            {
                s s2 = (s)dm1.a(i);
                int k = s2.b("Slot") & 0xff;
                if(k >= 0 && k < ai.length)
                    ai[k] = new gp(s2);
            }

        }
    }

    public void c(dj dj1)
    {
        if(dj1 == f)
            return;
        if((dj1 instanceof is) && !(dj1 instanceof fc) && ae == 0 && o * o + q * q > 0.01D && f == null && dj1.g == null)
            dj1.e(((dj) (this)));
        double d1 = dj1.l - l;
        double d2 = dj1.n - n;
        double d3 = d1 * d1 + d2 * d2;
        if(d3 >= 9.9999997473787516E-005D)
        {
            d3 = gj.a(d3);
            d1 /= d3;
            d2 /= d3;
            double d4 = 1.0D / d3;
            if(d4 > 1.0D)
                d4 = 1.0D;
            d1 *= d4;
            d2 *= d4;
            d1 *= 0.10000000149011612D;
            d2 *= 0.10000000149011612D;
            d1 *= 1.0F - P;
            d2 *= 1.0F - P;
            d1 *= 0.5D;
            d2 *= 0.5D;
            if(dj1 instanceof ih)
            {
                double d5 = dj1.o + o;
                double d6 = dj1.q + q;
                if(((ih)dj1).ae == 2 && ae != 2)
                {
                    o *= 0.20000000298023224D;
                    q *= 0.20000000298023224D;
                    f(dj1.o - d1, 0.0D, dj1.q - d2);
                    dj1.o *= 0.69999998807907104D;
                    dj1.q *= 0.69999998807907104D;
                } else
                if(((ih)dj1).ae != 2 && ae == 2)
                {
                    dj1.o *= 0.20000000298023224D;
                    dj1.q *= 0.20000000298023224D;
                    dj1.f(o + d1, 0.0D, q + d2);
                    o *= 0.69999998807907104D;
                    q *= 0.69999998807907104D;
                } else
                {
                    d5 /= 2D;
                    d6 /= 2D;
                    o *= 0.20000000298023224D;
                    q *= 0.20000000298023224D;
                    f(d5 - d1, 0.0D, d6 - d2);
                    dj1.o *= 0.20000000298023224D;
                    dj1.q *= 0.20000000298023224D;
                    dj1.f(d5 + d1, 0.0D, d6 + d2);
                }
            } else
            {
                f(-d1, 0.0D, -d2);
                dj1.f(d1 / 4D, 0.0D, d2 / 4D);
            }
        }
    }

    public int a()
    {
        return 27;
    }

    public gp a(int i)
    {
        return ai[i];
    }

}
