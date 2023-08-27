// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class jn extends di
{

    private int a;

    public jn(int i, int j)
    {
        super(i);
        a = j;
    }

    public boolean a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(l != 1)
            return false;
        int i1 = cn1.a(i, j, k);
        if(i1 == ly.aB.bc)
        {
            cn1.d(i, j + 1, k, a);
            ev1.a--;
            return true;
        } else
        {
            return false;
        }
    }
}
