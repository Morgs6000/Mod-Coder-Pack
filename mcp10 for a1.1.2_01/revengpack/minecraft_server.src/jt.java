// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public abstract class jt extends ly
{

    protected jt(int i, gb gb)
    {
        super(i, gb);
        q[i] = true;
    }

    protected jt(int i, int j, gb gb)
    {
        super(i, j, gb);
    }

    public void e(cn cn1, int i, int j, int k)
    {
        super.e(cn1, i, j, k);
        cn1.a(i, j, k, a_());
    }

    public void b(cn cn1, int i, int j, int k)
    {
        super.b(cn1, i, j, k);
        cn1.l(i, j, k);
    }

    protected abstract ic a_();
}
