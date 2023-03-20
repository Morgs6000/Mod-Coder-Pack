// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fm extends fg
{

    public fm(dy dy1)
    {
        super(dy1);
        aC = "/mob/zombie.png";
        bi = 0.5F;
        af = 5;
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
        return ez.J.aS;
    }
}
