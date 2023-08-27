// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.minecraft.server.MinecraftServer;

public class dc
{

    public static java.util.logging.Logger a = java.util.logging.Logger.getLogger("Minecraft");
    private java.net.ServerSocket d;
    private java.lang.Thread e;
    public volatile boolean b;
    private int f;
    private java.util.ArrayList g;
    private java.util.ArrayList h;
    public MinecraftServer c;

    public dc(MinecraftServer minecraftserver, java.net.InetAddress inetaddress, int i) throws IOException
    {
        b = false;
        f = 0;
        g = new ArrayList();
        h = new ArrayList();
        c = minecraftserver;
        d = new ServerSocket(i, 0, inetaddress);
        d.setPerformancePreferences(0, 2, 1);
        b = true;
        e = ((java.lang.Thread) (new cu(this, "Listen thread", minecraftserver)));
        e.start();
    }

    public void a(id id1)
    {
        h.add(((java.lang.Object) (id1)));
    }

    private void a(ew ew1)
    {
        if(ew1 == null)
        {
            throw new IllegalArgumentException("Got null pendingconnection!");
        } else
        {
            g.add(((java.lang.Object) (ew1)));
            return;
        }
    }

    public void a()
    {
        for(int i = 0; i < g.size(); i++)
        {
            ew ew1 = (ew)g.get(i);
            try
            {
                ew1.a();
            }
            catch(java.lang.Exception exception)
            {
                ew1.b("Internal server error");
                a.log(java.util.logging.Level.WARNING, (new StringBuilder()).append("Failed to handle packet: ").append(((java.lang.Object) (exception))).toString(), ((java.lang.Throwable) (exception)));
            }
            if(ew1.c)
                g.remove(i--);
        }

        for(int j = 0; j < h.size(); j++)
        {
            id id1 = (id)h.get(j);
            try
            {
                id1.a();
            }
            catch(java.lang.Exception exception1)
            {
                id1.c("Internal server error");
                a.log(java.util.logging.Level.WARNING, (new StringBuilder()).append("Failed to handle packet: ").append(((java.lang.Object) (exception1))).toString(), ((java.lang.Throwable) (exception1)));
            }
            if(id1.c)
                h.remove(j--);
        }

    }

    static java.net.ServerSocket a(dc dc1)
    {
        return dc1.d;
    }

    static int b(dc dc1)
    {
        return dc1.f++;
    }

    static void a(dc dc1, ew ew1)
    {
        dc1.a(ew1);
    }

}
