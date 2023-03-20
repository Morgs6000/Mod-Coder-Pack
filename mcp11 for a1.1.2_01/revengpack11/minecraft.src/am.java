// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class am extends ag
{

    public boolean a;

    public am(cn cn)
    {
        super(cn);
        a = false;
        u = "/mob/cow.png";
        a(0.9F, 1.3F);
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
        return "mob.cow";
    }

    protected java.lang.String d()
    {
        return "mob.cowhurt";
    }

    protected java.lang.String e()
    {
        return "mob.cowhurt";
    }

    protected float f()
    {
        return 0.4F;
    }

    protected int g()
    {
        return di.aD.aS;
    }

    public boolean a(dm dm1)
    {
        ev ev1 = dm1.b.a();
        if(ev1 != null && ev1.c == di.au.aS)
        {
            dm1.b.a(dm1.b.d, new ev(di.aE));
            return true;
        } else
        {
            return false;
        }
    }
}
