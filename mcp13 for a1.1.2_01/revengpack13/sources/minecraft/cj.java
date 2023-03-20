// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import net.minecraft.client.Minecraft;

public class cj extends bh
{

    private java.lang.String a;
    private java.lang.String h;

    public cj(java.lang.String s, java.lang.String s1)
    {
        a = s;
        h = s1;
    }

    public void g()
    {
    }

    protected void a(char c, int i)
    {
    }

    public void a()
    {
        e.clear();
        e.add(((java.lang.Object) (new fk(0, c / 2 - 100, d / 4 + 120 + 12, "Back to title screen"))));
    }

    protected void a(fk fk1)
    {
        if(fk1.f == 0)
            b.a(((bh) (new cx())));
    }

    public void a(int i, int j, float f)
    {
        i();
        a(g, a, c / 2, d / 2 - 50, 0xffffff);
        a(g, h, c / 2, d / 2 - 10, 0xffffff);
        super.a(i, j, f);
    }
}
