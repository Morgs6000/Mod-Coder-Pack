// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class er extends ez
{

    private java.lang.String a;

    protected er(int i, java.lang.String s)
    {
        super(i);
        a = s;
        aT = 1;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        if(dy1.a(i, j, k) == ff.aZ.bc && dy1.b(i, j, k) == 0)
        {
            dy1.b(i, j, k, (aS - ez.aQ.aS) + 1);
            dy1.a(a, i, j, k);
            gp1.a--;
            return true;
        } else
        {
            return false;
        }
    }
}
