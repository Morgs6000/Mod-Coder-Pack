// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class iw extends nq
{

    public iw(cn cn, double d, double d1, double d2, 
            double d3, double d4, double d5, ly ly1)
    {
        super(cn, d, d1, d2, d3, d4, d5);
        b = ly1.bb;
        h = ly1.bm;
        i = j = k = 0.6F;
        g /= 2.0F;
    }

    public int c()
    {
        return 1;
    }

    public void a(ho ho1, float f, float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = ((float)(b % 16) + c / 4F) / 16F;
        float f7 = f6 + 0.01560938F;
        float f8 = ((float)(b / 16) + d / 4F) / 16F;
        float f9 = f8 + 0.01560938F;
        float f10 = 0.1F * g;
        float f11 = (float)((ah + (ak - ah) * (double)f) - l);
        float f12 = (float)((ai + (al - ai) * (double)f) - m);
        float f13 = (float)((aj + (am - aj) * (double)f) - n);
        float f14 = a(f);
        ho1.a(f14 * i, f14 * j, f14 * k);
        ho1.a(f11 - f1 * f10 - f4 * f10, f12 - f2 * f10, f13 - f3 * f10 - f5 * f10, f6, f9);
        ho1.a((f11 - f1 * f10) + f4 * f10, f12 + f2 * f10, (f13 - f3 * f10) + f5 * f10, f6, f8);
        ho1.a(f11 + f1 * f10 + f4 * f10, f12 + f2 * f10, f13 + f3 * f10 + f5 * f10, f7, f8);
        ho1.a((f11 + f1 * f10) - f4 * f10, f12 - f2 * f10, (f13 + f3 * f10) - f5 * f10, f7, f9);
    }
}
