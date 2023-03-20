// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

class k extends az
{

    k(ia ia1, int i, Class class1, Class aclass[])
    {
        super(i, class1, aclass);
        field_1686_a = ia1;
    }

    protected mt func_1151_a(cn cn1, int i, int j)
    {
        int l = i + cn1.field_1037_n.nextInt(16);
        int i1 = cn1.field_1037_n.nextInt(cn1.field_1037_n.nextInt(120) + 8);
        int j1 = j + cn1.field_1037_n.nextInt(16);
        return new mt(l, i1, j1);
    }

    final ia field_1686_a; /* synthetic field */
}
