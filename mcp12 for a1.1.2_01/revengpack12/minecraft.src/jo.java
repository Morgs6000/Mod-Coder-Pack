// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class jo extends di
{

    public int a;

    public jo(int i, int j)
    {
        super(i);
        aT = 1;
        a = j;
    }

    public boolean a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.a(i, j, k);
        if(i1 == ly.aH.bc)
        {
            cn1.a(((kh) (new oc(cn1, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, a))));
            ev1.a--;
            return true;
        } else
        {
            return false;
        }
    }
}
