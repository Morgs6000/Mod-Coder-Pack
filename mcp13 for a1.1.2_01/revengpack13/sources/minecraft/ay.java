// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import net.minecraft.client.Minecraft;

public class ay extends bh
{

    private bh h;
    protected java.lang.String a;
    private fr i;

    public ay(bh bh1, fr fr1)
    {
        a = "Options";
        h = bh1;
        i = fr1;
    }

    public void a()
    {
        for(int j = 0; j < i.v; j++)
        {
            int k = i.b(j);
            if(k == 0)
                e.add(((java.lang.Object) (new o(j, (c / 2 - 155) + (j % 2) * 160, d / 6 + 24 * (j >> 1), i.d(j)))));
            else
                e.add(((java.lang.Object) (new mo(j, (c / 2 - 155) + (j % 2) * 160, d / 6 + 24 * (j >> 1), j, i.d(j), i.c(j)))));
        }

        e.add(((java.lang.Object) (new fk(100, c / 2 - 100, d / 6 + 120 + 12, "Controls..."))));
        e.add(((java.lang.Object) (new fk(200, c / 2 - 100, d / 6 + 168, "Done"))));
    }

    protected void a(fk fk1)
    {
        if(!fk1.g)
            return;
        if(fk1.f < 100)
        {
            i.b(fk1.f, 1);
            fk1.e = i.d(fk1.f);
        }
        if(fk1.f == 100)
            b.a(((bh) (new lw(((bh) (this)), i))));
        if(fk1.f == 200)
            b.a(h);
    }

    public void a(int j, int k, float f)
    {
        i();
        a(g, a, c / 2, 20, 0xffffff);
        super.a(j, k, f);
    }
}
