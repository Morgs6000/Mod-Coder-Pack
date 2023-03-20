// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.ArrayList;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class hg
{

    private java.util.List a;
    private el b;
    private java.util.List c;
    private net.minecraft.server.MinecraftServer d;

    public hg(net.minecraft.server.MinecraftServer minecraftserver)
    {
        a = ((java.util.List) (new ArrayList()));
        b = new el();
        c = ((java.util.List) (new ArrayList()));
        d = minecraftserver;
    }

    public void a()
    {
        for(int i = 0; i < c.size(); i++)
            ((ae)c.get(i)).a();

        c.clear();
    }

    private ae a(int i, int j, boolean flag)
    {
        long l = (long)i + 0x7fffffffL | (long)j + 0x7fffffffL << 32;
        ae ae1 = (ae)b.a(l);
        if(ae1 == null && flag)
        {
            ae1 = new ae(this, i, j);
            b.a(l, ((java.lang.Object) (ae1)));
        }
        return ae1;
    }

    public void a(hp hp, int i, int j, int k)
    {
        int l = i >> 4;
        int i1 = k >> 4;
        ae ae1 = a(l, i1, false);
        if(ae1 != null)
            ae1.a(hp);
    }

    public void a(int i, int j, int k)
    {
        int l = i >> 4;
        int i1 = k >> 4;
        ae ae1 = a(l, i1, false);
        if(ae1 != null)
            ae1.a(i & 0xf, j, k & 0xf);
    }

    public void a(ea ea1)
    {
        d.f.a(((hp) (new ba((new StringBuilder()).append("\247e").append(ea1.aq).append(" joined the game.").toString()))));
        int i = (int)ea1.l >> 4;
        int j = (int)ea1.n >> 4;
        ea1.ae = ea1.l;
        ea1.af = ea1.n;
        for(int k = i - 10; k <= i + 10; k++)
        {
            for(int l = j - 10; l <= j + 10; l++)
                a(k, l, true).a(ea1);

        }

        a.add(((java.lang.Object) (ea1)));
    }

    public void b(ea ea1)
    {
        d.f.a(((hp) (new ba((new StringBuilder()).append("\247e").append(ea1.aq).append(" left the game.").toString()))));
        int i = (int)ea1.l >> 4;
        int j = (int)ea1.n >> 4;
        for(int k = i - 10; k <= i + 10; k++)
        {
            for(int l = j - 10; l <= j + 10; l++)
            {
                ae ae1 = a(k, l, false);
                if(ae1 != null)
                    ae1.b(ea1);
            }

        }

        a.remove(((java.lang.Object) (ea1)));
    }

    private boolean a(int i, int j, int k, int l)
    {
        int i1 = i - k;
        int j1 = j - l;
        if(i1 < -10 || i1 > 10)
            return false;
        return j1 >= -10 && j1 <= 10;
    }

    public void c(ea ea1)
    {
        int i = (int)ea1.l >> 4;
        int j = (int)ea1.n >> 4;
        double d1 = ea1.ae - ea1.l;
        double d2 = ea1.af - ea1.n;
        double d3 = d1 * d1 + d2 * d2;
        if(d3 < 64D)
            return;
        int k = (int)ea1.ae >> 4;
        int l = (int)ea1.af >> 4;
        int i1 = i - k;
        int j1 = j - l;
        if(i1 == 0 && j1 == 0)
            return;
        for(int k1 = i - 10; k1 <= i + 10; k1++)
        {
            for(int l1 = j - 10; l1 <= j + 10; l1++)
            {
                if(!a(k1, l1, k, l))
                    a(k1, l1, true).a(ea1);
                if(a(k1 - i1, l1 - j1, i, j))
                    continue;
                ae ae1 = a(k1 - i1, l1 - j1, false);
                if(ae1 != null)
                    ae1.b(ea1);
            }

        }

        ea1.ae = ea1.l;
        ea1.af = ea1.n;
    }

    public int b()
    {
        return 144;
    }

    static net.minecraft.server.MinecraftServer a(hg hg1)
    {
        return hg1.d;
    }

    static el b(hg hg1)
    {
        return hg1.b;
    }

    static java.util.List c(hg hg1)
    {
        return hg1.c;
    }
}
