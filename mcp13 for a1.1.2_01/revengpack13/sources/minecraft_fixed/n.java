// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class n extends ar
{

    public gu a;
    public gh b;

    public n(ev aev[])
    {
        b = ((gh) (new mw()));
        a = new gu(((ar) (this)), aev);
        a(((gh) (a)));
    }

    public void a(gh gh1)
    {
        int ai[] = new int[9];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int k = -1;
                if(i < 2 && j < 2)
                {
                    ev ev1 = a.c(i + j * 2);
                    if(ev1 != null)
                        k = ev1.c;
                }
                ai[i + j * 3] = k;
            }

        }

        b.a(0, dw.a().a(ai));
    }

    public void a(dm dm1)
    {
        super.a(dm1);
        for(int i = 0; i < 9; i++)
        {
            ev ev1 = a.c(i);
            if(ev1 != null)
                dm1.a(ev1);
        }

    }
}
