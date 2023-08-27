// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class ds
    implements hq
{

    private int a;
    private int b;
    private im c[][];
    private dy d;

    public ds(dy dy1, int i, int j, int k, int l, int i1, int j1)
    {
        d = dy1;
        a = i >> 4;
        b = k >> 4;
        int k1 = l >> 4;
        int l1 = j1 >> 4;
        c = new im[(k1 - a) + 1][(l1 - b) + 1];
        for(int i2 = a; i2 <= k1; i2++)
        {
            for(int j2 = b; j2 <= l1; j2++)
                c[i2 - a][j2 - b] = dy1.b(i2, j2);

        }

    }

    public int a(int i, int j, int k)
    {
        if(j < 0)
            return 0;
        if(j >= 128)
        {
            return 0;
        } else
        {
            int l = (i >> 4) - a;
            int i1 = (k >> 4) - b;
            return c[l][i1].a(i & 0xf, j, k & 0xf);
        }
    }

    public int b(int i, int j, int k)
    {
        if(j < 0)
            return 0;
        if(j >= 128)
        {
            return 0;
        } else
        {
            int l = (i >> 4) - a;
            int i1 = (k >> 4) - b;
            return c[l][i1].b(i & 0xf, j, k & 0xf);
        }
    }

    public iq c(int i, int j, int k)
    {
        int l = a(i, j, k);
        if(l == 0)
            return iq.a;
        else
            return ff.n[l].bn;
    }

    public boolean d(int i, int j, int k)
    {
        ff ff1 = ff.n[a(i, j, k)];
        if(ff1 == null)
            return false;
        else
            return ff1.b();
    }
}
