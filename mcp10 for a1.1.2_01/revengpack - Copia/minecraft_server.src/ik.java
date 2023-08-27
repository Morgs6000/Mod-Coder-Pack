// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ik extends ez
{

    public ik(int i)
    {
        super(i);
        aU = 64;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        if(l == 0)
            return false;
        if(l == 1)
            return false;
        byte byte0 = 0;
        if(l == 4)
            byte0 = 1;
        if(l == 3)
            byte0 = 2;
        if(l == 5)
            byte0 = 3;
        bu bu1 = new bu(dy1, i, j, k, ((int) (byte0)));
        if(bu1.b())
        {
            dy1.a(((dj) (bu1)));
            gp1.a--;
        }
        return true;
    }
}
