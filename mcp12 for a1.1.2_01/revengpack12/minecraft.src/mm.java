// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class mm extends dk
{

    private final ee c;
    public final int e;
    public final int f;

    public mm(ee ee1, gh gh, int i, int j, int k)
    {
        super(gh, i);
        c = ee1;
        e = j;
        f = k;
    }

    public boolean a(int i, int j)
    {
        int k = (c.c - c.a) / 2;
        int l = (c.d - c.h) / 2;
        i -= k;
        j -= l;
        return i >= e - 1 && i < e + 16 + 1 && j >= f - 1 && j < f + 16 + 1;
    }
}
