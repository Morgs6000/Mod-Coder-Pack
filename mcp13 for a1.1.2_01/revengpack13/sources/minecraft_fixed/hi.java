// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class hi extends ly
{

    protected boolean a;

    protected hi(int i, int j, gb gb, boolean flag)
    {
        super(i, j, gb);
        a = flag;
    }

    public boolean b()
    {
        return false;
    }

    public boolean c(nm nm1, int i, int j, int k, int l)
    {
        int i1 = nm1.a(i, j, k);
        if(!a && i1 == bc)
            return false;
        else
            return super.c(nm1, i, j, k, l);
    }
}
