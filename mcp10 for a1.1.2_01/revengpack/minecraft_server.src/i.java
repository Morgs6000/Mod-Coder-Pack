// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class i extends ff
{

    public i(int j, int k)
    {
        super(j, iq.e);
        bb = k;
    }

    public int a(int j)
    {
        if(j == 1)
            return bb - 16;
        if(j == 0)
            return bb + 16;
        else
            return bb;
    }
}
