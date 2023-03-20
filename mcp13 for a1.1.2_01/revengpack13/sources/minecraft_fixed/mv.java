// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class mv extends ag
{

    public boolean a;

    public mv(cn cn)
    {
        super(cn);
        a = false;
        u = "/mob/pig.png";
        a(0.9F, 0.9F);
        a = false;
    }

    public void a(hm hm1)
    {
        super.a(hm1);
        hm1.a("Saddle", a);
    }

    public void b(hm hm1)
    {
        super.b(hm1);
        a = hm1.m("Saddle");
    }

    protected java.lang.String c()
    {
        return "mob.pig";
    }

    protected java.lang.String d()
    {
        return "mob.pig";
    }

    protected java.lang.String e()
    {
        return "mob.pigdeath";
    }

    public boolean a(dm dm1)
    {
        if(a)
        {
            dm1.g(((kh) (this)));
            return true;
        } else
        {
            return false;
        }
    }

    protected int g()
    {
        return di.ao.aS;
    }
}
