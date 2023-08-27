// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class hb extends as
    implements iw
{

    private gp e[];

    public hb()
    {
        e = new gp[36];
    }

    public int a()
    {
        return 27;
    }

    public gp a(int i)
    {
        return e[i];
    }

    public void a(int i, gp gp1)
    {
        e[i] = gp1;
        if(gp1 != null && gp1.a > d())
            gp1.a = d();
        c();
    }

    public void a(s s1)
    {
        super.a(s1);
        dm dm1 = s1.k("Items");
        e = new gp[a()];
        for(int i = 0; i < dm1.b(); i++)
        {
            s s2 = (s)dm1.a(i);
            int j = s2.b("Slot") & 0xff;
            if(j >= 0 && j < e.length)
                e[j] = new gp(s2);
        }

    }

    public void b(s s1)
    {
        super.b(s1);
        dm dm1 = new dm();
        for(int i = 0; i < e.length; i++)
            if(e[i] != null)
            {
                s s2 = new s();
                s2.a("Slot", (byte)i);
                e[i].a(s2);
                dm1.a(((gg) (s2)));
            }

        s1.a("Items", ((gg) (dm1)));
    }

    public int d()
    {
        return 64;
    }
}
