// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class mb extends dq
{

    public mb(cn cn1)
    {
        super(cn1);
        u = "/mob/zombie.png";
        aa = 0.5F;
        e = 5;
    }

    public void j()
    {
        if(ag.b())
        {
            float f = a(1.0F);
            if(f > 0.5F && ag.i(eo.b(ak), eo.b(al), eo.b(am)) && aQ.nextFloat() * 30F < (f - 0.4F) * 2.0F)
                aT = 300;
        }
        super.j();
    }

    protected java.lang.String c()
    {
        return "mob.zombie";
    }

    protected java.lang.String d()
    {
        return "mob.zombiehurt";
    }

    protected java.lang.String e()
    {
        return "mob.zombiedeath";
    }

    protected int g()
    {
        return di.J.aS;
    }
}
