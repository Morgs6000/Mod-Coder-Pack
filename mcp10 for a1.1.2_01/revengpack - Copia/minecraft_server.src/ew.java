// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class ew extends ej
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    private static java.util.Random d = new Random();
    public bb b;
    public boolean c;
    private net.minecraft.server.MinecraftServer e;
    private int f;
    private java.lang.String g;
    private z h;
    private java.lang.String i;

    public ew(net.minecraft.server.MinecraftServer minecraftserver, java.net.Socket socket, java.lang.String s) throws IOException
    {
        c = false;
        f = 0;
        g = null;
        h = null;
        i = "";
        e = minecraftserver;
        b = new bb(socket, s, ((ej) (this)));
    }

    public void a()
    {
        if(h != null)
        {
            b(h);
            h = null;
        }
        if(f++ == 100)
            b("Took too long to log in");
        else
            b.a();
    }

    public void b(java.lang.String s)
    {
        a.info((new StringBuilder()).append("Disconnecting ").append(b()).append(": ").append(s).toString());
        b.a(((hp) (new io(s))));
        b.c();
        c = true;
    }

    public void a(e e1)
    {
        if(e.l)
        {
            i = java.lang.Long.toHexString(d.nextLong());
            b.a(((hp) (new e(i))));
        } else
        {
            b.a(((hp) (new e("-"))));
        }
    }

    public void a(z z1)
    {
        g = z1.b;
        if(z1.a != 2)
        {
            b("Outdated client!");
            return;
        }
        if(!e.l)
            b(z1);
        else
            (new dd(this, z1)).start();
    }

    public void b(z z1)
    {
        ea ea1 = e.f.a(this, z1.b, z1.c);
        if(ea1 != null)
        {
            a.info((new StringBuilder()).append(b()).append(" logged in").toString());
            id id1 = new id(e, b, ea1);
            id1.b(((hp) (new z("", "", 0))));
            id1.b(((hp) (new cb(e.e.n, e.e.o, e.e.p))));
            e.f.a(ea1);
            id1.a(ea1.l, ea1.m, ea1.n, ea1.r, ea1.s);
            id1.d();
            e.c.a(id1);
            id1.b(((hp) (new fl(e.e.c))));
        }
        c = true;
    }

    public void a(java.lang.String s)
    {
        a.info((new StringBuilder()).append(b()).append(" lost connection").toString());
        c = true;
    }

    public void a(hp hp)
    {
        b("Protocol error");
    }

    public java.lang.String b()
    {
        if(g != null)
            return (new StringBuilder()).append(g).append(" [").append(((java.lang.Object) (b.b())).toString()).append("]").toString();
        else
            return ((java.lang.Object) (b.b())).toString();
    }

    static java.lang.String a(ew ew1)
    {
        return ew1.i;
    }

    static z a(ew ew1, z z1)
    {
        return ew1.h = z1;
    }

}
