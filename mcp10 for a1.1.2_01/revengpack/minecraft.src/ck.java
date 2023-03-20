// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;

public class ck
    implements aw
{

    private ga b[];
    private cn c;
    private af d;
    byte a[];

    public ck(cn cn, af af1)
    {
        b = new ga[256];
        a = new byte[32768];
        c = cn;
        d = af1;
    }

    public boolean a(int i, int j)
    {
        int k = i & 0xf | (j & 0xf) * 16;
        return b[k] != null && b[k].a(i, j);
    }

    public ga b(int i, int j)
    {
        int k = i & 0xf | (j & 0xf) * 16;
        try
        {
            if(!a(i, j))
            {
                ga ga1 = c(i, j);
                if(ga1 == null)
                {
                    ga1 = new ga(c, a, i, j);
                    ga1.q = true;
                    ga1.p = true;
                }
                b[k] = ga1;
            }
            return b[k];
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private synchronized ga c(int i, int j)
    {
        try
        {
            return d.a(c, i, j);
        }
        catch(java.io.IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return null;
    }

    public void a(aw aw1, int i, int j)
    {
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
}
