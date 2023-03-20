// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

//package net.minecraft.client;

//import dl;
//import g;
//import h;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.io.PrintStream;
import java.net.URL;

// Referenced classes of package net.minecraft.client:
//            Minecraft

public class MinecraftApplet extends java.applet.Applet
{

    private java.awt.Canvas a;
    private Minecraft b;
    private java.lang.Thread c;

    public MinecraftApplet()
    {
        c = null;
    }

    public void init()
    {
        a = ((java.awt.Canvas) (new h(this)));
        boolean flag = false;
        if(getParameter("fullscreen") != null)
            flag = getParameter("fullscreen").equalsIgnoreCase("true");

        b = ((Minecraft) (new g(this, ((java.awt.Component) (this)), a, this, getWidth(), getHeight(), flag)));
        b.j = getDocumentBase().getHost();
        if (getDocumentBase().getPort() > 0)
        {
          b.j = (b.j + ":" + getDocumentBase().getPort());
        }
        if(getParameter("username") != null && getParameter("sessionid") != null)
        {
            b.i = new dl(getParameter("username"), getParameter("sessionid"));
            java.lang.System.out.println((new StringBuilder()).append("Setting user: ").append(b.i.b).append(", ").append(b.i.c).toString());
            if(getParameter("mppass") != null)
                b.i.d = getParameter("mppass");
        } else
        {
            b.i = new dl("Player", "");
        }
        if(getParameter("loadmap_user") != null && getParameter("loadmap_id") != null)
        {
            b.s = getParameter("loadmap_user");
            b.t = java.lang.Integer.parseInt(getParameter("loadmap_id"));
        } else
        if(getParameter("server") != null && getParameter("port") != null)
            b.a(getParameter("server"), java.lang.Integer.parseInt(getParameter("port")));
        b.l = true;
        setLayout(((java.awt.LayoutManager) (new BorderLayout())));
        add(((java.awt.Component) (a)), "Center");
        a.setFocusable(true);
        validate();
    }

    public void a()
    {
        if(c != null)
        {
            return;
        } else
        {
            c = new Thread(((java.lang.Runnable) (b)), "Minecraft main thread");
            c.start();
            return;
        }
    }

    public void start()
    {
        if(b != null)
            b.m = false;
    }

    public void stop()
    {
        if(b != null)
            b.m = true;
    }

    public void destroy()
    {
        b();
    }

    public void b()
    {
        if(c == null)
            return;
        b.d();
        try
        {
            c.join(10000L);
        }
        catch(java.lang.InterruptedException interruptedexception)
        {
            try
            {
                b.c();
            }
            catch(java.lang.Exception exception)
            {
                exception.printStackTrace();
            }
        }
        c = null;
    }

    public void c()
    {
        a = null;
        b = null;
        c = null;
        try
        {
            removeAll();
            validate();
        }
        catch(java.lang.Exception exception) { }
    }
}
