// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ed
{

    public ed(float f, float f1, float f2, float f3, float f4)
    {
        this(aj.func_1260_a(f, f1, f2), f3, f4);
    }

    public ed func_1115_a(float f, float f1)
    {
        return new ed(this, f, f1);
    }

    public ed(ed ed1, float f, float f1)
    {
        field_1655_a = ed1.field_1655_a;
        field_1654_b = f;
        field_1656_c = f1;
    }

    public ed(aj aj1, float f, float f1)
    {
        field_1655_a = aj1;
        field_1654_b = f;
        field_1656_c = f1;
    }

    public aj field_1655_a;
    public float field_1654_b;
    public float field_1656_c;
}
