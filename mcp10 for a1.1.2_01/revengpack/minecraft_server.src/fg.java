// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fg extends gh
    implements dz
{

    protected int af;

    public fg(dy dy1)
    {
        super(dy1);
        af = 2;
        aM = 20;
    }

    public void y()
    {
        float f = b(1.0F);
        if(f > 0.5F)
            bc += 2;
        super.y();
    }

    public void b_()
    {
        super.b_();
        if(h.l == 0)
            j();
    }

    protected dj i()
    {
        fc fc = h.a(((dj) (this)), 16D);
        if(fc != null && g(((dj) (fc))))
            return ((dj) (fc));
        else
            return null;
    }

    public boolean a(dj dj1, int j)
    {
        if(super.a(dj1, j))
        {
            if(f == dj1 || g == dj1)
                return true;
            if(dj1 != this)
                ag = dj1;
            return true;
        } else
        {
            return false;
        }
    }

    protected void a(dj dj1, float f)
    {
        if((double)f < 2.5D && dj1.v.e > v.b && dj1.v.b < v.e)
        {
            aS = 20;
            dj1.a(((dj) (this)), af);
        }
    }

    protected float a(int j, int k, int l)
    {
        return 0.5F - h.j(j, k, l);
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
        int j = gj.b(this.l);
        int k = gj.b(v.b);
        int l = gj.b(n);
        if(h.a(cy.a, j, k, l) > R.nextInt(32))
        {
            return false;
        } else
        {
            int i1 = h.h(j, k, l);
            return i1 <= R.nextInt(8) && super.a();
        }
    }
}
