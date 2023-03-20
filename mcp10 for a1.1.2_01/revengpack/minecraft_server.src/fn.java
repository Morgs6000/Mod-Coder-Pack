// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fn extends dj
{

    public gp a;
    private int af;
    public int b;
    public int ad;
    private int ag;
    public float ae;

    public fn(dy dy1, double d, double d1, double d2, 
            gp gp1)
    {
        super(dy1);
        b = 0;
        ag = 5;
        ae = (float)(java.lang.Math.random() * 3.1415926535897931D * 2D);
        a(0.25F, 0.25F);
        C = E / 2.0F;
        a(d, d1, d2);
        a = gp1;
        r = (float)(java.lang.Math.random() * 360D);
        o = (float)(java.lang.Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        p = 0.20000000298023224D;
        q = (float)(java.lang.Math.random() * 0.20000000298023224D - 0.10000000149011612D);
        H = false;
    }

    public fn(dy dy1)
    {
        super(dy1);
        b = 0;
        ag = 5;
        ae = (float)(java.lang.Math.random() * 3.1415926535897931D * 2D);
        a(0.25F, 0.25F);
        C = E / 2.0F;
    }

    public void b_()
    {
        super.b_();
        if(ad > 0)
            ad--;
        this.i = l;
        j = m;
        k = n;
        p -= 0.039999999105930328D;
        if(h.c(gj.b(l), gj.b(m), gj.b(n)) == iq.g)
        {
            p = 0.20000000298023224D;
            o = (R.nextFloat() - R.nextFloat()) * 0.2F;
            q = (R.nextFloat() - R.nextFloat()) * 0.2F;
            h.a(((dj) (this)), "random.fizz", 0.4F, 2.0F + R.nextFloat() * 0.4F);
        }
        g(l, m, n);
        o();
        c(o, p, q);
        float f = 0.98F;
        if(w)
        {
            f = 0.5880001F;
            int i = h.a(gj.b(l), gj.b(v.b) - 1, gj.b(n));
            if(i > 0)
                f = ff.n[i].bo * 0.98F;
        }
        o *= f;
        p *= 0.98000001907348633D;
        q *= f;
        if(w)
            p *= -0.5D;
        af++;
        b++;
        if(b >= 6000)
            j();
    }

    public boolean o()
    {
        return h.a(v, iq.f, ((dj) (this)));
    }

    private boolean g(double d, double d1, double d2)
    {
        int i = gj.b(d);
        int j = gj.b(d1);
        int k = gj.b(d2);
        double d3 = d - (double)i;
        double d4 = d1 - (double)j;
        double d5 = d2 - (double)k;
        if(ff.p[h.a(i, j, k)])
        {
            boolean flag = !ff.p[h.a(i - 1, j, k)];
            boolean flag1 = !ff.p[h.a(i + 1, j, k)];
            boolean flag2 = !ff.p[h.a(i, j - 1, k)];
            boolean flag3 = !ff.p[h.a(i, j + 1, k)];
            boolean flag4 = !ff.p[h.a(i, j, k - 1)];
            boolean flag5 = !ff.p[h.a(i, j, k + 1)];
            byte byte0 = -1;
            double d6 = 9999D;
            if(flag && d3 < d6)
            {
                d6 = d3;
                byte0 = 0;
            }
            if(flag1 && 1.0D - d3 < d6)
            {
                d6 = 1.0D - d3;
                byte0 = 1;
            }
            if(flag2 && d4 < d6)
            {
                d6 = d4;
                byte0 = 2;
            }
            if(flag3 && 1.0D - d4 < d6)
            {
                d6 = 1.0D - d4;
                byte0 = 3;
            }
            if(flag4 && d5 < d6)
            {
                d6 = d5;
                byte0 = 4;
            }
            if(flag5 && 1.0D - d5 < d6)
            {
                double d7 = 1.0D - d5;
                byte0 = 5;
            }
            float f = R.nextFloat() * 0.2F + 0.1F;
            if(byte0 == 0)
                o = -f;
            if(byte0 == 1)
                o = f;
            if(byte0 == 2)
                p = -f;
            if(byte0 == 3)
                p = f;
            if(byte0 == 4)
                q = -f;
            if(byte0 == 5)
                q = f;
        }
        return false;
    }

    protected void b(int i)
    {
        a(((dj) (null)), i);
    }

    public boolean a(dj dj1, int i)
    {
        ag -= i;
        if(ag <= 0)
            j();
        return false;
    }

    public void a(s s1)
    {
        s1.a("Health", (byte)ag);
        s1.a("Age", (short)b);
        s1.a("Item", a.a(new s()));
    }

    public void b(s s1)
    {
        ag = s1.c("Health") & 0xff;
        b = ((int) (s1.c("Age")));
        s s2 = s1.j("Item");
        a = new gp(s2);
    }

    public void a(fc fc1)
    {
        if(h.x)
            return;
        int i = a.a;
        if(ad == 0 && fc1.aj.a(a))
        {
            h.a(((dj) (this)), "random.pop", 0.2F, ((R.nextFloat() - R.nextFloat()) * 0.7F + 1.0F) * 2.0F);
            fc1.c(((dj) (this)), i);
            j();
        }
    }
}
