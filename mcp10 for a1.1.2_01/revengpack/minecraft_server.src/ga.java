// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ga extends ez
{

    private iq a;

    public ga(int i, iq iq1)
    {
        super(i);
        a = iq1;
        aU = 64;
        aT = 1;
    }

    public boolean a(gp gp1, fc fc1, dy dy1, int i, int j, int k, int l)
    {
        if(l != 1)
            return false;
        j++;
        ff ff1;
        if(a == iq.c)
            ff1 = ff.aF;
        else
            ff1 = ff.aM;
        if(!ff1.a(dy1, i, j, k))
            return false;
        int i1 = gj.b((double)(((fc1.r + 180F) * 4F) / 360F) - 0.5D) & 3;
        byte byte0 = 0;
        byte byte1 = 0;
        if(i1 == 0)
            byte1 = 1;
        if(i1 == 1)
            byte0 = -1;
        if(i1 == 2)
            byte1 = -1;
        if(i1 == 3)
            byte0 = 1;
        int j1 = (dy1.d(i - byte0, j, k - byte1) ? 1 : 0) + (dy1.d(i - byte0, j + 1, k - byte1) ? 1 : 0);
        int k1 = (dy1.d(i + byte0, j, k + byte1) ? 1 : 0) + (dy1.d(i + byte0, j + 1, k + byte1) ? 1 : 0);
        boolean flag = dy1.a(i - byte0, j, k - byte1) == ff1.bc || dy1.a(i - byte0, j + 1, k - byte1) == ff1.bc;
        boolean flag1 = dy1.a(i + byte0, j, k + byte1) == ff1.bc || dy1.a(i + byte0, j + 1, k + byte1) == ff1.bc;
        boolean flag2 = false;
        if(flag && !flag1)
            flag2 = true;
        else
        if(k1 > j1)
            flag2 = true;
        if(flag2)
        {
            i1 = i1 - 1 & 3;
            i1 += 4;
        }
        dy1.d(i, j, k, ff1.bc);
        dy1.b(i, j, k, i1);
        dy1.d(i, j + 1, k, ff1.bc);
        dy1.b(i, j + 1, k, i1 + 8);
        gp1.a--;
        return true;
    }
}
