// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class bk extends fg
{

    public bk(dy dy1)
    {
        super(dy1);
        aC = "/mob/spider.png";
        a(1.4F, 0.9F);
        bi = 0.8F;
    }

    public double h()
    {
        return (double)E * 0.75D - 0.5D;
    }

    protected dj i()
    {
        float f = b(1.0F);
        if(f < 0.5F)
        {
            double d1 = 16D;
            return ((dj) (h.a(((dj) (this)), d1)));
        } else
        {
            return null;
        }
    }

    protected java.lang.String c()
    {
        return "mob.spider";
    }

    protected java.lang.String d()
    {
        return "mob.spider";
    }

    protected java.lang.String e()
    {
        return "mob.spiderdeath";
    }

    protected void a(dj dj1, float f)
    {
        float f1 = b(1.0F);
        if(f1 > 0.5F && R.nextInt(100) == 0)
        {
            ag = null;
            return;
        }
        if(f > 2.0F && f < 6F && R.nextInt(10) == 0)
        {
            if(w)
            {
                double d1 = dj1.l - l;
                double d2 = dj1.n - n;
                float f2 = gj.a(d1 * d1 + d2 * d2);
                o = (d1 / (double)f2) * 0.5D * 0.80000001192092896D + o * 0.20000000298023224D;
                q = (d2 / (double)f2) * 0.5D * 0.80000001192092896D + q * 0.20000000298023224D;
                p = 0.40000000596046448D;
            }
        } else
        {
            super.a(dj1, f);
        }
    }

    public void a(s s)
    {
        super.a(s);
    }

    public void b(s s)
    {
        super.b(s);
    }

    protected int g()
    {
        return ez.I.aS;
    }
}
