// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class eu extends fg
{

    int a;
    int b;
    int ad;
    int ae;

    public eu(dy dy1)
    {
        super(dy1);
        ad = 30;
        ae = -1;
        aC = "/mob/creeper.png";
    }

    public void a(s s)
    {
        super.a(s);
    }

    public void b(s s)
    {
        super.b(s);
    }

    protected void d_()
    {
        b = a;
        if(a > 0 && ae < 0)
            a--;
        if(ae >= 0)
            ae = 2;
        super.d_();
        if(ae != 1)
            ae = -1;
    }

    protected java.lang.String d()
    {
        return "mob.creeper";
    }

    protected java.lang.String e()
    {
        return "mob.creeperdeath";
    }

    public void f(dj dj)
    {
        super.f(dj);
        if(dj instanceof ek)
            a(ez.aQ.aS + R.nextInt(2), 1);
    }

    protected void a(dj dj, float f1)
    {
        if(ae <= 0 && f1 < 3F || ae > 0 && f1 < 7F)
        {
            if(a == 0)
                h.a(((dj) (this)), "random.fuse", 1.0F, 0.5F);
            ae = 1;
            a++;
            if(a == ad)
            {
                h.a(((dj) (this)), l, m, n, 3F);
                j();
            }
            ah = true;
        }
    }

    protected int g()
    {
        return ez.K.aS;
    }
}
