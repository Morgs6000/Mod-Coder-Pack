// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class fq extends ez
{

    public fq(int i)
    {
        super(i);
        aU = 64;
        aT = 1;
    }

    public boolean a(gp gp1, fc fc1, dy dy1, int i, int j, int k, int l)
    {
        if(l == 0)
            return false;
        if(!dy1.c(i, j, k).a())
            return false;
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
        if(!ff.aE.a(dy1, i, j, k))
            return false;
        if(l == 1)
            dy1.b(i, j, k, ff.aE.bc, gj.b((double)(((fc1.r + 180F) * 16F) / 360F) + 0.5D) & 0xf);
        else
            dy1.b(i, j, k, ff.aJ.bc, l);
        gp1.a--;
        fc1.a((ig)dy1.k(i, j, k));
        return true;
    }
}
