// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Comparator;

public class fb
    implements java.util.Comparator
{

    private kh a;

    public fb(kh kh)
    {
        a = kh;
    }

    public int a(bn bn1, bn bn2)
    {
        return bn1.a(a) >= bn2.a(a) ? 1 : -1;
    }

    public int compare(java.lang.Object obj, java.lang.Object obj1)
    {
        return a((bn)obj, (bn)obj1);
    }
}
