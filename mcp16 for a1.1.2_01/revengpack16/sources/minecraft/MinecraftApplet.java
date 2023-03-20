// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//package net.minecraft.client;

//import MCAppletCanvas;
//import MinecraftAppletImpl;
//import Session;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.io.PrintStream;
import java.net.URL;

// Referenced classes of package net.minecraft.client:
//            Minecraft

public class MinecraftApplet extends Applet
{

    public MinecraftApplet()
    {
        field_133_c = null;
    }

    public void init()
    {
        field_132_a = new MCAppletCanvas(this);
        boolean flag = false;
        if(getParameter("fullscreen") != null)
        {
            flag = getParameter("fullscreen").equalsIgnoreCase("true");
        }
        field_131_b = new MinecraftAppletImpl(this, this, field_132_a, this, getWidth(), getHeight(), flag);
        field_131_b.field_175_j = getDocumentBase().getHost();
        if(getDocumentBase().getPort() > 0)
        {
        	field_131_b.field_175_j += ":" + getDocumentBase().getPort();  
        }
        if(getParameter("username") != null && getParameter("sessionid") != null)
        {
            field_131_b.field_176_i = new Session(getParameter("username"), getParameter("sessionid"));
            System.out.println((new StringBuilder()).append("Setting user: ").append(field_131_b.field_176_i.field_1666_b).append(", ").append(field_131_b.field_176_i.field_1669_c).toString());
            if(getParameter("mppass") != null)
            {
                field_131_b.field_176_i.field_1668_d = getParameter("mppass");
            }
        } else
        {
            field_131_b.field_176_i = new Session("Player", "");
        }
        if(getParameter("loadmap_user") != null && getParameter("loadmap_id") != null)
        {
            field_131_b.field_166_s = getParameter("loadmap_user");
            field_131_b.field_165_t = Integer.parseInt(getParameter("loadmap_id"));
        } else
        if(getParameter("server") != null && getParameter("port") != null)
        {
            field_131_b.func_121_a(getParameter("server"), Integer.parseInt(getParameter("port")));
        }
        field_131_b.field_173_l = true;
        setLayout(new BorderLayout());
        add(field_132_a, "Center");
        field_132_a.setFocusable(true);
        validate();
    }

    public void func_103_a()
    {
        if(field_133_c != null)
        {
            return;
        } else
        {
            field_133_c = new Thread(field_131_b, "Minecraft main thread");
            field_133_c.start();
            return;
        }
    }

    public void start()
    {
        if(field_131_b != null)
        {
            field_131_b.field_172_m = false;
        }
    }

    public void stop()
    {
        if(field_131_b != null)
        {
            field_131_b.field_172_m = true;
        }
    }

    public void destroy()
    {
        func_102_b();
    }

    public void func_102_b()
    {
        if(field_133_c == null)
        {
            return;
        }
        field_131_b.func_109_d();
        try
        {
            field_133_c.join(10000L);
        }
        catch(InterruptedException interruptedexception)
        {
            try
            {
                field_131_b.func_130_c();
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
            }
        }
        field_133_c = null;
    }

    public void func_101_c()
    {
        field_132_a = null;
        field_131_b = null;
        field_133_c = null;
        try
        {
            removeAll();
            validate();
        }
        catch(Exception exception) { }
    }

    private Canvas field_132_a;
    private Minecraft field_131_b;
    private Thread field_133_c;
}
