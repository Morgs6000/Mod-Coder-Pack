// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public abstract class cs extends ff
{

    protected cs(int i, iq iq)
    {
        super(i, iq);
        q[i] = true;
    }

    protected cs(int i, int j, iq iq)
    {
        super(i, j, iq);
    }

    public void e(dy dy1, int i, int j, int k)
    {
        super.e(dy1, i, j, k);
        dy1.a(i, j, k, a_());
    }

    public void b(dy dy1, int i, int j, int k)
    {
        super.b(dy1, i, j, k);
        dy1.l(i, j, k);
    }

    protected abstract as a_();
}
