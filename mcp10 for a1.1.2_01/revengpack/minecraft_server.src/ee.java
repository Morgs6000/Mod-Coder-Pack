// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ee extends dy
{

    public ij y;
    public boolean z;
    public boolean A;
    private boolean B;
    private bl C;
    private bl D;

    public ee(java.io.File file, java.lang.String s, boolean flag)
    {
        super(file, s);
        z = false;
        C = ((bl) (new hu(this, 200, dz.class, new java.lang.Class[] {
            fm.class, ek.class, eu.class, bk.class, fh.class
        })));
        D = new bl(15, at.class, new java.lang.Class[] {
            cj.class, gu.class, ay.class, hi.class
        });
        B = flag;
    }

    public void e()
    {
        super.e();
        if(B)
            C.a(((dy) (this)));
        D.a(((dy) (this)));
    }

    protected bj a(java.io.File file)
    {
        y = new ij(this, ((aq) (new eo(file, true))), ((bj) (new hy(((dy) (this)), t))));
        return ((bj) (y));
    }

    public java.util.List d(int i, int j, int k, int l, int i1, int j1)
    {
        java.util.ArrayList arraylist = new ArrayList();
        for(int k1 = 0; k1 < b.size(); k1++)
        {
            as as1 = (as)b.get(k1);
            if(as1.b >= i && as1.c >= j && as1.d >= k && as1.b < l && as1.c < i1 && as1.d < j1)
                ((java.util.List) (arraylist)).add(((java.lang.Object) (as1)));
        }

        return ((java.util.List) (arraylist));
    }
}
