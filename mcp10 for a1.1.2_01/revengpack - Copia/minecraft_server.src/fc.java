// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class fc extends is
{

    public gm aj;
    public byte ak;
    public int al;
    public float am;
    public float an;
    public boolean ao;
    public int ap;
    public java.lang.String aq;
    private int a;

    public fc(dy dy1)
    {
        super(dy1);
        aj = new gm(this);
        ak = 0;
        al = 0;
        ao = false;
        ap = 0;
        a = 0;
        C = 1.62F;
        c((double)dy1.n + 0.5D, dy1.o + 1, (double)dy1.p + 0.5D, 0.0F, 0.0F);
        aM = 20;
        aF = "humanoid";
        aE = 180F;
        T = 20;
        aC = "/char.png";
    }

    public void v()
    {
        super.v();
        am = an;
        an = 0.0F;
    }

    protected void d_()
    {
        if(ao)
        {
            ap++;
            if(ap == 8)
            {
                ap = 0;
                ao = false;
            }
        } else
        {
            ap = 0;
        }
        aL = (float)ap / 8F;
    }

    public void y()
    {
        if(h.l == 0 && aM < 20 && (S % 20) * 4 == 0)
            a(1);
        aj.c();
        am = an;
        super.y();
        float f1 = gj.a(o * o + q * q);
        float f2 = (float)java.lang.Math.atan(-p * 0.20000000298023224D) * 15F;
        if(f1 > 0.1F)
            f1 = 0.1F;
        if(!w || aM <= 0)
            f1 = 0.0F;
        if(w || aM <= 0)
            f2 = 0.0F;
        an += (f1 - an) * 0.4F;
        aU += (f2 - aU) * 0.8F;
        if(aM > 0)
        {
            java.util.List list = h.b(((dj) (this)), v.b(1.0D, 0.0D, 1.0D));
            if(list != null)
            {
                for(int i = 0; i < list.size(); i++)
                    h((dj)list.get(i));

            }
        }
    }

    private void h(dj dj1)
    {
        dj1.a(this);
    }

    public void f(dj dj1)
    {
        a(0.2F, 0.2F);
        a(l, m, n);
        p = 0.10000000149011612D;
        if(aq.equals("Notch"))
            a(new gp(ez.h, 1), true);
        aj.f();
        if(dj1 != null)
        {
            o = -gj.b(((aQ + r) * 3.141593F) / 180F) * 0.1F;
            q = -gj.a(((aQ + r) * 3.141593F) / 180F) * 0.1F;
        } else
        {
            o = q = 0.0D;
        }
        C = 0.1F;
    }

    public void b(dj dj1, int i)
    {
        al += i;
    }

    public void a(gp gp1)
    {
        a(gp1, false);
    }

    public void a(gp gp1, boolean flag)
    {
        if(gp1 == null)
            return;
        fn fn1 = new fn(h, l, (m - 0.30000001192092896D) + (double)p(), n, gp1);
        fn1.ad = 40;
        float f1 = 0.1F;
        if(flag)
        {
            float f3 = R.nextFloat() * 0.5F;
            float f5 = R.nextFloat() * 3.141593F * 2.0F;
            fn1.o = -gj.a(f5) * f3;
            fn1.q = gj.b(f5) * f3;
            fn1.p = 0.20000000298023224D;
        } else
        {
            float f2 = 0.3F;
            fn1.o = -gj.a((r / 180F) * 3.141593F) * gj.b((s / 180F) * 3.141593F) * f2;
            fn1.q = gj.b((r / 180F) * 3.141593F) * gj.b((s / 180F) * 3.141593F) * f2;
            fn1.p = -gj.a((s / 180F) * 3.141593F) * f2 + 0.1F;
            f2 = 0.02F;
            float f4 = R.nextFloat() * 3.141593F * 2.0F;
            f2 *= R.nextFloat();
            fn1.o += java.lang.Math.cos(f4) * (double)f2;
            fn1.p += (R.nextFloat() - R.nextFloat()) * 0.1F;
            fn1.q += java.lang.Math.sin(f4) * (double)f2;
        }
        a(fn1);
    }

    protected void a(fn fn1)
    {
        h.a(((dj) (fn1)));
    }

    public float a(ff ff)
    {
        float f1 = aj.a(ff);
        if(a(iq.f))
            f1 /= 5F;
        if(!w)
            f1 /= 5F;
        return f1;
    }

    public boolean b(ff ff)
    {
        return aj.b(ff);
    }

    public void b(s s1)
    {
        super.b(s1);
        dm dm1 = s1.k("Inventory");
        aj.b(dm1);
    }

    public void a(s s1)
    {
        super.a(s1);
        s1.a("Inventory", ((gg) (aj.a(new dm()))));
    }

    public void a(iw iw)
    {
    }

    public void A()
    {
    }

    public void c(dj dj1, int i)
    {
    }

    protected float p()
    {
        return 0.12F;
    }

    public boolean a(dj dj1, int i)
    {
        bc = 0;
        if(aM <= 0)
            return false;
        if((float)X > (float)ar / 2.0F)
            return false;
        if((dj1 instanceof fg) || (dj1 instanceof di))
        {
            if(h.l == 0)
                i = 0;
            if(h.l == 1)
                i = i / 3 + 1;
            if(h.l == 3)
                i = (i * 3) / 2;
        }
        int j = 25 - aj.e();
        int k = i * j + a;
        aj.b(i);
        i = k / 25;
        a = k % 25;
        if(i == 0)
            return false;
        else
            return super.a(dj1, i);
    }

    public void a(df df)
    {
    }

    public void a(ig ig)
    {
    }

    public gp B()
    {
        return aj.b();
    }

    public void C()
    {
        aj.a(aj.d, ((gp) (null)));
    }

    public double x()
    {
        return (double)(C - 0.5F);
    }

    public void z()
    {
        ap = -1;
        ao = true;
    }
}
