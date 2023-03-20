// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class ft
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    public java.util.List b;
    private net.minecraft.server.MinecraftServer c;
    private hg d;
    private int e;
    private java.util.Set f;
    private java.util.Set g;
    private java.util.Set h;
    private java.io.File i;
    private java.io.File j;
    private java.io.File k;
    private cl l;

    public ft(net.minecraft.server.MinecraftServer minecraftserver)
    {
        b = ((java.util.List) (new ArrayList()));
        f = ((java.util.Set) (new HashSet()));
        g = ((java.util.Set) (new HashSet()));
        h = ((java.util.Set) (new HashSet()));
        c = minecraftserver;
        i = minecraftserver.a("banned-players.txt");
        j = minecraftserver.a("banned-ips.txt");
        k = minecraftserver.a("ops.txt");
        d = new hg(minecraftserver);
        e = minecraftserver.d.a("max-players", 20);
        e();
        g();
        i();
        f();
        h();
        j();
    }

    public void a(ee ee1)
    {
        l = new cl(new File(ee1.s, "players"));
    }

    public int a()
    {
        return d.b();
    }

    public void a(ea ea1)
    {
        b.add(((java.lang.Object) (ea1)));
        l.b(ea1);
        c.e.y.d((int)ea1.l >> 4, (int)ea1.n >> 4);
        for(; c.e.a(((dj) (ea1)), ea1.v).size() != 0; ea1.a(ea1.l, ea1.m + 1.0D, ea1.n));
        c.e.a(((dj) (ea1)));
        d.a(ea1);
    }

    public void b(ea ea1)
    {
        d.c(ea1);
    }

    public void c(ea ea1)
    {
        d.b(ea1);
        l.a(ea1);
        c.e.d(((dj) (ea1)));
        b.remove(((java.lang.Object) (ea1)));
    }

    public ea a(ew ew1, java.lang.String s, java.lang.String s1)
    {
        if(f.contains(((java.lang.Object) (s.trim().toLowerCase()))))
        {
            ew1.b("You are banned from this server!");
            return null;
        }
        java.lang.String s2 = ((java.lang.Object) (ew1.b.b())).toString();
        s2 = s2.substring(s2.indexOf("/") + 1);
        s2 = s2.substring(0, s2.indexOf(":"));
        if(g.contains(((java.lang.Object) (s2))))
        {
            ew1.b("Your IP address is banned from this server!");
            return null;
        }
        if(b.size() >= e)
        {
            ew1.b("The server is full!");
            return null;
        }
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            ea ea1 = (ea)b.get(i1);
            if(ea1.aq.equalsIgnoreCase(s))
                ea1.a.c("You logged in from another location");
        }

        return new ea(c, ((dy) (c.e)), s, new in(((dy) (c.e))));
    }

    public void b()
    {
        d.a();
    }

    public void a(int i1, int j1, int k1)
    {
        d.a(i1, j1, k1);
    }

    public void a(hp hp)
    {
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            ea ea1 = (ea)b.get(i1);
            ea1.a.b(hp);
        }

    }

    public java.lang.String c()
    {
        java.lang.String s = "";
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            if(i1 > 0)
                s = (new StringBuilder()).append(s).append(", ").toString();
            s = (new StringBuilder()).append(s).append(((ea)b.get(i1)).aq).toString();
        }

        return s;
    }

    public void a(java.lang.String s)
    {
        f.add(((java.lang.Object) (s.toLowerCase())));
        f();
    }

    public void b(java.lang.String s)
    {
        f.remove(((java.lang.Object) (s.toLowerCase())));
        f();
    }

    private void e()
    {
        try
        {
            f.clear();
            java.io.BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (new FileReader(i))));
            for(java.lang.String s = ""; (s = bufferedreader.readLine()) != null;)
                f.add(((java.lang.Object) (s.trim().toLowerCase())));

            bufferedreader.close();
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to load ban list: ").append(((java.lang.Object) (exception))).toString());
        }
    }

    private void f()
    {
        try
        {
            java.io.PrintWriter printwriter = new PrintWriter(((java.io.Writer) (new FileWriter(i, false))));
            java.lang.String s;
            for(java.util.Iterator iterator = f.iterator(); iterator.hasNext(); printwriter.println(s))
                s = (java.lang.String)iterator.next();

            printwriter.close();
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to save ban list: ").append(((java.lang.Object) (exception))).toString());
        }
    }

    public void c(java.lang.String s)
    {
        g.add(((java.lang.Object) (s.toLowerCase())));
        h();
    }

    public void d(java.lang.String s)
    {
        g.remove(((java.lang.Object) (s.toLowerCase())));
        h();
    }

    private void g()
    {
        try
        {
            g.clear();
            java.io.BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (new FileReader(j))));
            for(java.lang.String s = ""; (s = bufferedreader.readLine()) != null;)
                g.add(((java.lang.Object) (s.trim().toLowerCase())));

            bufferedreader.close();
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to load ip ban list: ").append(((java.lang.Object) (exception))).toString());
        }
    }

    private void h()
    {
        try
        {
            java.io.PrintWriter printwriter = new PrintWriter(((java.io.Writer) (new FileWriter(j, false))));
            java.lang.String s;
            for(java.util.Iterator iterator = g.iterator(); iterator.hasNext(); printwriter.println(s))
                s = (java.lang.String)iterator.next();

            printwriter.close();
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to save ip ban list: ").append(((java.lang.Object) (exception))).toString());
        }
    }

    public void e(java.lang.String s)
    {
        h.add(((java.lang.Object) (s.toLowerCase())));
        j();
    }

    public void f(java.lang.String s)
    {
        h.remove(((java.lang.Object) (s.toLowerCase())));
        j();
    }

    private void i()
    {
        try
        {
            h.clear();
            java.io.BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (new FileReader(k))));
            for(java.lang.String s = ""; (s = bufferedreader.readLine()) != null;)
                h.add(((java.lang.Object) (s.trim().toLowerCase())));

            bufferedreader.close();
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to load ip ban list: ").append(((java.lang.Object) (exception))).toString());
        }
    }

    private void j()
    {
        try
        {
            java.io.PrintWriter printwriter = new PrintWriter(((java.io.Writer) (new FileWriter(k, false))));
            java.lang.String s;
            for(java.util.Iterator iterator = h.iterator(); iterator.hasNext(); printwriter.println(s))
                s = (java.lang.String)iterator.next();

            printwriter.close();
        }
        catch(java.lang.Exception exception)
        {
            a.warning((new StringBuilder()).append("Failed to save ip ban list: ").append(((java.lang.Object) (exception))).toString());
        }
    }

    public boolean g(java.lang.String s)
    {
        return h.contains(((java.lang.Object) (s.trim().toLowerCase())));
    }

    public ea h(java.lang.String s)
    {
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            ea ea1 = (ea)b.get(i1);
            if(ea1.aq.equalsIgnoreCase(s))
                return ea1;
        }

        return null;
    }

    public void a(java.lang.String s, java.lang.String s1)
    {
        ea ea1 = h(s);
        if(ea1 != null)
            ea1.a.b(((hp) (new ba(s1))));
    }

    public void i(java.lang.String s)
    {
        ba ba1 = new ba(s);
        for(int i1 = 0; i1 < b.size(); i1++)
        {
            ea ea1 = (ea)b.get(i1);
            if(g(ea1.aq))
                ea1.a.b(((hp) (ba1)));
        }

    }

    public boolean a(java.lang.String s, hp hp)
    {
        ea ea1 = h(s);
        if(ea1 != null)
        {
            ea1.a.b(hp);
            return true;
        } else
        {
            return false;
        }
    }

    public void a(int i1, int j1, int k1, as as)
    {
        d.a(((hp) (new ib(i1, j1, k1, as))), i1, j1, k1);
    }

    public void d()
    {
        for(int i1 = 0; i1 < b.size(); i1++)
            l.a((ea)b.get(i1));

    }

}
