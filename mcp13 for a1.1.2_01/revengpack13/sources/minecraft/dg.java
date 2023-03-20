// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;

public class dg extends bh
{

    private gy a;
    private int h;

    public dg(gy gy1)
    {
        h = 0;
        a = gy1;
    }

    protected void a(char c, int i)
    {
    }

    public void a()
    {
        e.clear();
    }

    public void g()
    {
        h++;
        if(h % 20 == 0)
            a.a(((fn) (new gi())));
        if(a != null)
            a.a();
    }

    protected void a(fk fk)
    {
    }

    public void a(int i, int j, float f)
    {
        b(0);
        a(g, "Downloading terrain", c / 2, d / 2 - 50, 0xffffff);
        super.a(i, j, f);
    }
}
