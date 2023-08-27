// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;

public class he extends ff
{

    public he(int i, int j)
    {
        super(i, j, iq.c);
    }

    public void a(dy dy1, int i, int j, int k, dg dg1, java.util.ArrayList arraylist)
    {
        arraylist.add(((java.lang.Object) (dg.b(i, j, k, i + 1, (double)j + 1.5D, k + 1))));
    }

    public boolean a(dy dy1, int i, int j, int k)
    {
        if(dy1.a(i, j - 1, k) == bc)
            return false;
        if(!dy1.c(i, j - 1, k).a())
            return false;
        else
            return super.a(dy1, i, j, k);
    }

    public boolean b()
    {
        return false;
    }

    public int a()
    {
        return 11;
    }
}
