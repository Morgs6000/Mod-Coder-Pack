// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

class k extends az
{

    final ia a;

    k(ia ia1, int i, java.lang.Class class1, java.lang.Class aclass[])
    {
        super(i, class1, aclass);
        a = ia1;
    }

    protected mt a(cn cn1, int i, int j)
    {
        int l = i + cn1.n.nextInt(16);
        int i1 = cn1.n.nextInt(cn1.n.nextInt(120) + 8);
        int j1 = j + cn1.n.nextInt(16);
        return new mt(l, i1, j1);
    }
}
