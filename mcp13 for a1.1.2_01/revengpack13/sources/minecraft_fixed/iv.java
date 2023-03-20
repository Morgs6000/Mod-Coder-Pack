// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
//import Minecraft;

public class iv extends bh
{

    private int a;

    public iv()
    {
        a = 0;
    }

    public void g()
    {
        a++;
    }

    public void a()
    {
        e.clear();
        e.add(((java.lang.Object) (new fk(0, c / 2 - 100, d / 4 + 120 + 12, "Back to title screen"))));
    }

    protected void a(fk fk1)
    {
        if(!fk1.g)
            return;
        if(fk1.f == 0)
            b.a(((bh) (new cx())));
    }

    public void a(int i, int j, float f)
    {
        i();
        a(g, "Level save conflict", c / 2, (d / 4 - 60) + 20, 0xffffff);
        b(g, "Minecraft detected a conflict in the level save data.", c / 2 - 140, (d / 4 - 60) + 60 + 0, 0xa0a0a0);
        b(g, "This could be caused by two copies of the game", c / 2 - 140, (d / 4 - 60) + 60 + 18, 0xa0a0a0);
        b(g, "accessing the same level.", c / 2 - 140, (d / 4 - 60) + 60 + 27, 0xa0a0a0);
        b(g, "To prevent level corruption, the current game has quit.", c / 2 - 140, (d / 4 - 60) + 60 + 45, 0xa0a0a0);
        super.a(i, j, f);
    }
}
