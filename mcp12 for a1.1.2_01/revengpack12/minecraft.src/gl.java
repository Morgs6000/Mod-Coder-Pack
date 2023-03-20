// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Comparator;

public class gl
    implements java.util.Comparator
{

    private dm a;

    public gl(dm dm)
    {
        a = dm;
    }

    public int a(bn bn1, bn bn2)
    {
        boolean flag = bn1.o;
        boolean flag1 = bn2.o;
        if(flag && !flag1)
            return 1;
        if(flag1 && !flag)
            return -1;
        else
            return bn1.a(((kh) (a))) >= bn2.a(((kh) (a))) ? -1 : 1;
    }

    public int compare(java.lang.Object obj, java.lang.Object obj1)
    {
        return a((bn)obj, (bn)obj1);
    }
}
