// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ed
{

    public aj a;
    public float b;
    public float c;

    public ed(float f, float f1, float f2, float f3, float f4)
    {
        this(aj.a(f, f1, f2), f3, f4);
    }

    public ed a(float f, float f1)
    {
        return new ed(this, f, f1);
    }

    public ed(ed ed1, float f, float f1)
    {
        a = ed1.a;
        b = f;
        c = f1;
    }

    public ed(aj aj1, float f, float f1)
    {
        a = aj1;
        b = f;
        c = f1;
    }
}
