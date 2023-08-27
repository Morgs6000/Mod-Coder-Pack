// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class gu extends at
{

    public boolean a;

    public gu(dy dy)
    {
        super(dy);
        a = false;
        aC = "/mob/pig.png";
        a(0.9F, 0.9F);
        a = false;
    }

    public void a(s s1)
    {
        super.a(s1);
        s1.a("Saddle", a);
    }

    public void b(s s1)
    {
        super.b(s1);
        a = s1.l("Saddle");
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

    protected int g()
    {
        return ez.ao.aS;
    }
}
