// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public final class gp
{

    public int a;
    public int b;
    public int c;
    public int d;

    public gp(ff ff1)
    {
        this(ff1, 1);
    }

    public gp(ff ff1, int i)
    {
        this(ff1.bc, i);
    }

    public gp(ez ez1)
    {
        this(ez1, 1);
    }

    public gp(ez ez1, int i)
    {
        this(ez1.aS, i);
    }

    public gp(int i)
    {
        this(i, 1);
    }

    public gp(int i, int j)
    {
        a = 0;
        c = i;
        a = j;
    }

    public gp(int i, int j, int k)
    {
        a = 0;
        c = i;
        a = j;
        d = k;
    }

    public gp(s s1)
    {
        a = 0;
        b(s1);
    }

    public ez a()
    {
        return ez.c[c];
    }

    public boolean a(fc fc, dy dy, int i, int j, int k, int l)
    {
        return a().a(this, fc, dy, i, j, k, l);
    }

    public float a(ff ff1)
    {
        return a().a(this, ff1);
    }

    public s a(s s1)
    {
        s1.a("id", (short)c);
        s1.a("Count", (byte)a);
        s1.a("Damage", (short)d);
        return s1;
    }

    public void b(s s1)
    {
        c = ((int) (s1.c("id")));
        a = ((int) (s1.b("Count")));
        d = ((int) (s1.c("Damage")));
    }

    public int b()
    {
        return a().a();
    }

    public int c()
    {
        return ez.c[c].b();
    }

    public void a(int i)
    {
        d += i;
        if(d > c())
        {
            a--;
            if(a < 0)
                a = 0;
            d = 0;
        }
    }

    public void a(int i, int j, int k, int l)
    {
        ez.c[c].a(this, i, j, k, l);
    }

    public boolean b(ff ff1)
    {
        return ez.c[c].a(ff1);
    }

    public void a(fc fc)
    {
    }

    public gp d()
    {
        return new gp(c, a, d);
    }
}
