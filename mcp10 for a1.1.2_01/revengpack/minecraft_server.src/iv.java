// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class iv extends ez
{

    private int a;

    public iv(int i, ff ff1)
    {
        super(i);
        a = ff1.bc;
    }

    public boolean a(gp gp1, fc fc, dy dy1, int i, int j, int k, int l)
    {
        if(dy1.a(i, j, k) == ff.aT.bc)
        {
            l = 0;
        } else
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
        }
        if(gp1.a == 0)
            return false;
        if(dy1.a(a, i, j, k, false))
        {
            ff ff1 = ff.n[a];
            if(dy1.d(i, j, k, a))
            {
                ff.n[a].c(dy1, i, j, k, l);
                dy1.a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, ff1.bl.c(), (ff1.bl.a() + 1.0F) / 2.0F, ff1.bl.b() * 0.8F);
                gp1.a--;
            }
        }
        return true;
    }
}
