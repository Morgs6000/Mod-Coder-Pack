// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ck extends ez
{

    public int a;

    public ck(int i, int j)
    {
        super(i);
        aT = 1;
        a = j;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        int i1 = dy1.a(i, j, k);
        if(i1 == ff.aH.bc)
        {
            dy1.a(((dj) (new ih(dy1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, a))));
            gp1.a--;
            return true;
        } else
        {
            return false;
        }
    }
}
