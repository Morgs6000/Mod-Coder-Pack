// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class cj extends at
{

    public boolean a;

    public cj(dy dy)
    {
        super(dy);
        a = false;
        aC = "/mob/sheep.png";
        a(0.9F, 1.3F);
    }

    public boolean a(dj dj, int i)
    {
        if(!a && (dj instanceof is))
        {
            a = true;
            int j = 1 + R.nextInt(3);
            for(int k = 0; k < j; k++)
            {
                fn fn1 = a(ff.ac.bc, 1, 1.0F);
                fn1.p += R.nextFloat() * 0.05F;
                fn1.o += (R.nextFloat() - R.nextFloat()) * 0.1F;
                fn1.q += (R.nextFloat() - R.nextFloat()) * 0.1F;
            }

        }
        return super.a(dj, i);
    }

    public void a(s s1)
    {
        super.a(s1);
        s1.a("Sheared", a);
    }

    public void b(s s1)
    {
        super.b(s1);
        a = s1.l("Sheared");
    }

    protected java.lang.String c()
    {
        return "mob.sheep";
    }

    protected java.lang.String d()
    {
        return "mob.sheep";
    }

    protected java.lang.String e()
    {
        return "mob.sheep";
    }
}
