// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class mz extends ag
{

    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float h;
    public int i;

    public mz(cn cn1)
    {
        super(cn1);
        a = false;
        b = 0.0F;
        c = 0.0F;
        h = 1.0F;
        u = "/mob/chicken.png";
        a(0.3F, 0.4F);
        E = 4;
        i = aQ.nextInt(6000) + 6000;
    }

    public void j()
    {
        super.j();
        e = b;
        d = c;
        c += ((float) ((double)(av ? -1 : 4) * 0.29999999999999999D));
        if(c < 0.0F)
            c = 0.0F;
        if(c > 1.0F)
            c = 1.0F;
        if(!av && h < 1.0F)
            h = 1.0F;
        h *= 0.90000000000000002D;
        if(!av && ao < 0.0D)
            ao *= 0.59999999999999998D;
        b += h * 2.0F;
        if(!ag.y && --i <= 0)
        {
            ag.a(((kh) (this)), "mob.chickenplop", 1.0F, (aQ.nextFloat() - aQ.nextFloat()) * 0.2F + 1.0F);
            b(di.aN.aS, 1);
            i = aQ.nextInt(6000) + 6000;
        }
    }

    protected void c(float f)
    {
    }

    public void a(hm hm)
    {
        super.a(hm);
    }

    public void b(hm hm)
    {
        super.b(hm);
    }

    protected java.lang.String c()
    {
        return "mob.chicken";
    }

    protected java.lang.String d()
    {
        return "mob.chickenhurt";
    }

    protected java.lang.String e()
    {
        return "mob.chickenhurt";
    }

    protected int g()
    {
        return di.J.aS;
    }
}
