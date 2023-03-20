// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
//import Minecraft;

public class jq extends bh
{

    protected bh a;
    protected java.lang.String h;
    private boolean i;

    public jq(bh bh1)
    {
        h = "Select world";
        i = false;
        a = bh1;
    }

    public void a()
    {
        java.io.File file = Minecraft.b();
        for(int k = 0; k < 5; k++)
        {
            hm hm1 = cn.a(file, (new StringBuilder()).append("World").append(k + 1).toString());
            if(hm1 == null)
            {
                e.add(((java.lang.Object) (new fk(k, c / 2 - 100, d / 6 + 24 * k, "- empty -"))));
            } else
            {
                java.lang.String s = (new StringBuilder()).append("World ").append(k + 1).toString();
                long l = hm1.f("SizeOnDisk");
                s = (new StringBuilder()).append(s).append(" (").append((float)(((l / 1024L) * 100L) / 1024L) / 100F).append(" MB)").toString();
                e.add(((java.lang.Object) (new fk(k, c / 2 - 100, d / 6 + 24 * k, s))));
            }
        }

        j();
    }

    protected java.lang.String d(int k)
    {
        java.io.File file = Minecraft.b();
        return cn.a(file, (new StringBuilder()).append("World").append(k).toString()) == null ? null : (new StringBuilder()).append("World").append(k).toString();
    }

    public void j()
    {
        e.add(((java.lang.Object) (new fk(5, c / 2 - 100, d / 6 + 120 + 12, "Delete world..."))));
        e.add(((java.lang.Object) (new fk(6, c / 2 - 100, d / 6 + 168, "Cancel"))));
    }

    protected void a(fk fk1)
    {
        if(!fk1.g)
            return;
        if(fk1.f < 5)
            c(fk1.f + 1);
        else
        if(fk1.f == 5)
            b.a(((bh) (new ib(((bh) (this))))));
        else
        if(fk1.f == 6)
            b.a(a);
    }

    public void c(int k)
    {
        b.a(((bh) (null)));
        if(i)
        {
            return;
        } else
        {
            i = true;
            b.b = ((hq) (new ia(b)));
            b.b((new StringBuilder()).append("World").append(k).toString());
            b.a(((bh) (null)));
            return;
        }
    }

    public void a(int k, int l, float f)
    {
        i();
        a(g, h, c / 2, 20, 0xffffff);
        super.a(k, l, f);
    }
}
