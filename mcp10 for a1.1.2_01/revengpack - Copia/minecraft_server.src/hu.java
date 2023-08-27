// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

class hu extends bl
{

    final ee a;

    hu(ee ee1, int i, java.lang.Class class1, java.lang.Class aclass[])
    {
        super(i, class1, aclass);
        a = ee1;
    }

    protected gs a(dy dy1, int i, int j)
    {
        int k = i + dy1.m.nextInt(16);
        int l = dy1.m.nextInt(dy1.m.nextInt(120) + 8);
        int i1 = j + dy1.m.nextInt(16);
        return new gs(k, l, i1);
    }
}
