// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
//import Minecraft;

public class lw extends bh
{

    private bh h;
    protected java.lang.String a;
    private fr i;
    private int j;

    public lw(bh bh1, fr fr1)
    {
        a = "Controls";
        j = -1;
        h = bh1;
        i = fr1;
    }

    public void a()
    {
        for(int k = 0; k < i.t.length; k++)
            e.add(((java.lang.Object) (new o(k, (c / 2 - 155) + (k % 2) * 160, d / 6 + 24 * (k >> 1), i.a(k)))));

        e.add(((java.lang.Object) (new fk(200, c / 2 - 100, d / 6 + 168, "Done"))));
    }

    protected void a(fk fk1)
    {
        for(int k = 0; k < i.t.length; k++)
            ((fk)e.get(k)).e = i.a(k);

        if(fk1.f == 200)
        {
            b.a(h);
        } else
        {
            j = fk1.f;
            fk1.e = (new StringBuilder()).append("> ").append(i.a(fk1.f)).append(" <").toString();
        }
    }

    protected void a(char c, int k)
    {
        if(j >= 0)
        {
            i.a(j, k);
            ((fk)e.get(j)).e = i.a(j);
            j = -1;
        } else
        {
            super.a(c, k);
        }
    }

    public void a(int k, int l, float f)
    {
        i();
        a(g, a, c / 2, 20, 0xffffff);
        super.a(k, l, f);
    }
}
