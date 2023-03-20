// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class gu
    implements gh
{

    private ev a[];
    private int b;
    private ar c;

    public gu(ar ar1, int i, int j)
    {
        b = i * j;
        a = new ev[b];
        c = ar1;
    }

    public gu(ar ar1, ev aev[])
    {
        b = aev.length;
        a = aev;
        c = ar1;
    }

    public int c()
    {
        return b;
    }

    public ev c(int i)
    {
        return a[i];
    }

    public java.lang.String d()
    {
        return "Crafting";
    }

    public ev a(int i, int j)
    {
        if(a[i] != null)
        {
            if(a[i].a <= j)
            {
                ev ev1 = a[i];
                a[i] = null;
                c.a(((gh) (this)));
                return ev1;
            }
            ev ev2 = a[i].a(j);
            if(a[i].a == 0)
                a[i] = null;
            c.a(((gh) (this)));
            return ev2;
        } else
        {
            return null;
        }
    }

    public void a(int i, ev ev1)
    {
        a[i] = ev1;
        c.a(((gh) (this)));
    }

    public int e()
    {
        return 64;
    }

    public void j_()
    {
    }
}
