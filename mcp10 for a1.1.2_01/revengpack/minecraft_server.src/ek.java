// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class ek extends fg
{

    public ek(dy dy1)
    {
        super(dy1);
        aC = "/mob/skeleton.png";
    }

    protected java.lang.String c()
    {
        return "mob.skeleton";
    }

    protected java.lang.String d()
    {
        return "mob.skeletonhurt";
    }

    protected java.lang.String e()
    {
        return "mob.skeletonhurt";
    }

    public void y()
    {
        if(h.a())
        {
            float f = b(1.0F);
            if(f > 0.5F && h.g(gj.b(l), gj.b(m), gj.b(n)) && R.nextFloat() * 30F < (f - 0.4F) * 2.0F)
                U = 300;
        }
        super.y();
    }

    protected void a(dj dj1, float f)
    {
        if(f < 10F)
        {
            double d1 = dj1.l - l;
            double d2 = dj1.n - n;
            if(aS == 0)
            {
                di di1 = new di(h, ((is) (this)));
                di1.m += 1.3999999761581421D;
                double d3 = dj1.m - 0.20000000298023224D - di1.m;
                float f1 = gj.a(d1 * d1 + d2 * d2) * 0.2F;
                h.a(((dj) (this)), "random.bow", 1.0F, 1.0F / (R.nextFloat() * 0.4F + 0.8F));
                h.a(((dj) (di1)));
                di1.a(d1, d3 + (double)f1, d2, 0.6F, 12F);
                aS = 30;
            }
            r = (float)((java.lang.Math.atan2(d2, d1) * 180D) / 3.1415927410125732D) - 90F;
            ah = true;
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
        return ez.j.aS;
    }
}
