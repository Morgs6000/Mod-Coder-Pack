// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public abstract class at extends gh
    implements ab
{

    public at(dy dy1)
    {
        super(dy1);
    }

    protected float a(int i, int j, int k)
    {
        if(h.a(i, j - 1, k) == ff.v.bc)
            return 10F;
        else
            return h.j(i, j, k) - 0.5F;
    }

    public void a(s s)
    {
        super.a(s);
    }

    public void b(s s)
    {
        super.b(s);
    }

    public boolean a()
    {
        int i = gj.b(l);
        int j = gj.b(v.b);
        int k = gj.b(n);
        return h.a(i, j - 1, k) == ff.v.bc && h.h(i, j, k) > 8 && super.a();
    }

    public int b()
    {
        return 120;
    }
}
