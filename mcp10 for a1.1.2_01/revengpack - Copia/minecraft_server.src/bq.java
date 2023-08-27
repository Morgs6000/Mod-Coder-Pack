// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class bq
{

    public final java.lang.String a;
    public final float b;
    public final float c;

    public bq(java.lang.String s, float f, float f1)
    {
        a = s;
        b = f;
        c = f1;
    }

    public float a()
    {
        return b;
    }

    public float b()
    {
        return c;
    }

    public java.lang.String c()
    {
        return (new StringBuilder()).append("step.").append(a).toString();
    }
}
