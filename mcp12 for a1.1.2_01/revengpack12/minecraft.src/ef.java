// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ef extends di
{

    public ef(int i)
    {
        super(i);
    }

    public boolean a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(l == 0)
            j--;
        if(l == 1)
            j++;
        if(l == 2)
            k--;
        if(l == 3)
            k++;
        if(l == 4)
            i--;
        if(l == 5)
            i++;
        if(cn1.a(i, j, k) != 0)
            return false;
        if(ly.aw.a(cn1, i, j, k))
        {
            ev1.a--;
            cn1.d(i, j, k, ly.aw.bc);
        }
        return true;
    }
}
