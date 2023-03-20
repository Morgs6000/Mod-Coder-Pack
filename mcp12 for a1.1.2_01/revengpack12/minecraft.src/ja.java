// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;

public class ja extends bh
{

    private bh a;
    private java.lang.String h;
    private java.lang.String i;
    private int j;

    public ja(bh bh1, java.lang.String s, java.lang.String s1, int k)
    {
        a = bh1;
        h = s;
        i = s1;
        j = k;
    }

    public void a()
    {
        e.add(((java.lang.Object) (new o(0, (c / 2 - 155) + 0, d / 6 + 96, "Yes"))));
        e.add(((java.lang.Object) (new o(1, (c / 2 - 155) + 160, d / 6 + 96, "No"))));
    }

    protected void a(fk fk1)
    {
        a.a(fk1.f == 0, j);
    }

    public void a(int k, int l, float f)
    {
        i();
        a(g, h, c / 2, 70, 0xffffff);
        a(g, i, c / 2, 90, 0xffffff);
        super.a(k, l, f);
    }
}
