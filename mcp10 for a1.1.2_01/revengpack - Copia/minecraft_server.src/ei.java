// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ei extends gn
{

    protected ei(int i, int j)
    {
        super(i, j);
        float f1 = 0.2F;
        a(0.5F - f1, 0.0F, 0.5F - f1, 0.5F + f1, f1 * 2.0F, 0.5F + f1);
    }

    protected boolean b(int i)
    {
        return ff.p[i];
    }

    public boolean f(dy dy1, int i, int j, int k)
    {
        return dy1.h(i, j, k) <= 13 && b(dy1.a(i, j - 1, k));
    }
}
