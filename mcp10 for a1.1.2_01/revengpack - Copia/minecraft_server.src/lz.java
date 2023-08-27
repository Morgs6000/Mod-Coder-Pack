// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lz
    implements aw
{

    private ga a;
    private java.util.Map b;
    private java.util.List c;
    private cn d;

    public lz(cn cn)
    {
        b = ((java.util.Map) (new HashMap()));
        c = ((java.util.List) (new ArrayList()));
        a = new ga(cn, new byte[32768], 0, 0);
        a.q = true;
        a.p = true;
        d = cn;
    }

    public boolean a(int i, int j)
    {
        hc hc1 = new hc(i, j);
        return b.containsKey(((java.lang.Object) (hc1)));
    }

    public void c(int i, int j)
    {
        ga ga1 = b(i, j);
        if(!ga1.q)
            ga1.e();
        b.remove(((java.lang.Object) (new hc(i, j))));
        c.remove(((java.lang.Object) (ga1)));
    }

    public ga d(int i, int j)
    {
        hc hc1 = new hc(i, j);
        byte abyte0[] = new byte[32768];
        ga ga1 = new ga(d, abyte0, i, j);
        java.util.Arrays.fill(ga1.f.a, (byte)-1);
        b.put(((java.lang.Object) (hc1)), ((java.lang.Object) (ga1)));
        ga1.c = true;
        return ga1;
    }

    public ga b(int i, int j)
    {
        hc hc1 = new hc(i, j);
        ga ga1 = (ga)b.get(((java.lang.Object) (hc1)));
        if(ga1 == null)
            return a;
        else
            return ga1;
    }

    public boolean a(boolean flag, nu nu)
    {
        return true;
    }

    public boolean a()
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public void a(aw aw1, int i, int j)
    {
    }
}
