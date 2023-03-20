// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
//import Minecraft;

public class ib extends jq
{

    public ib(bh bh)
    {
        super(bh);
        h = "Delete world";
    }

    public void j()
    {
        e.add(((java.lang.Object) (new fk(6, c / 2 - 100, d / 6 + 168, "Cancel"))));
    }

    public void c(int i)
    {
        java.lang.String s = d(i);
        if(s != null)
            b.a(((bh) (new ja(((bh) (this)), "Are you sure you want to delete this world?", (new StringBuilder()).append("'").append(s).append("' will be lost forever!").toString(), i))));
    }

    public void a(boolean flag, int i)
    {
        if(flag)
        {
            java.io.File file = Minecraft.b();
            cn.b(file, d(i));
        }
        b.a(a);
    }
}
