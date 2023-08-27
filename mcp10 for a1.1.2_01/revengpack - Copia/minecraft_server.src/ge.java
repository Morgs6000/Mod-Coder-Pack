// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ge extends ez
{

    public ge(int i)
    {
        super(i);
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
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
        if(dy1.a(i, j, k) != 0)
            return false;
        if(ff.aw.a(dy1, i, j, k))
        {
            gp1.a--;
            dy1.d(i, j, k, ff.aw.bc);
        }
        return true;
    }
}
