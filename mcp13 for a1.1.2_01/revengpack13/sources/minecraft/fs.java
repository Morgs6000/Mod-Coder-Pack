// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Comparator;

class fs
    implements java.util.Comparator
{

    final dw a;

    fs(dw dw1)
    {
        super();
        a = dw1;
    }

    public int a(bv bv1, bv bv2)
    {
        if(bv2.a() < bv1.a())
            return -1;
        return bv2.a() <= bv1.a() ? 0 : 1;
    }

    public int compare(java.lang.Object obj, java.lang.Object obj1)
    {
        return a((bv)obj, (bv)obj1);
    }
}
