// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ci extends ez
{

    private int a;

    public ci(int i, int j)
    {
        super(i);
        a = j;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        if(l != 1)
            return false;
        int i1 = dy1.a(i, j, k);
        if(i1 == ff.aB.bc)
        {
            dy1.d(i, j + 1, k, a);
            gp1.a--;
            return true;
        } else
        {
            return false;
        }
    }
}
