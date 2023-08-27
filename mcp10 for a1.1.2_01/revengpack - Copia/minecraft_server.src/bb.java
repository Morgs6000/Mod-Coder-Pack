// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class bb
{

    public static final java.lang.Object a = new Object();
    public static int b;
    public static int c;
    private java.lang.Object d;
    private java.net.Socket e;
    private java.io.DataInputStream f;
    private java.io.DataOutputStream g;
    private boolean h;
    private java.util.List i;
    private java.util.List j;
    private java.util.List k;
    private ej l;
    private boolean m;
    private java.lang.Thread n;
    private java.lang.Thread o;
    private boolean p;
    private java.lang.String q;
    private int r;
    private int s;
    private int t;

    public bb(java.net.Socket socket, java.lang.String s1, ej ej1) throws IOException
    {
        d = new Object();
        h = true;
        i = java.util.Collections.synchronizedList(((java.util.List) (new LinkedList())));
        j = java.util.Collections.synchronizedList(((java.util.List) (new LinkedList())));
        k = java.util.Collections.synchronizedList(((java.util.List) (new LinkedList())));
        m = false;
        p = false;
        q = "";
        r = 0;
        s = 0;
        t = 0;
        e = socket;
        l = ej1;
        socket.setTrafficClass(24);
        f = new DataInputStream(socket.getInputStream());
        g = new DataOutputStream(socket.getOutputStream());
        o = ((java.lang.Thread) (new hn(this, (new StringBuilder()).append(s1).append(" read thread").toString())));
        n = ((java.lang.Thread) (new ho(this, (new StringBuilder()).append(s1).append(" write thread").toString())));
        o.start();
        n.start();
    }

    public void a(ej ej1)
    {
        l = ej1;
    }

    public void a(hp hp1)
    {
        if(m)
            return;
        synchronized(d)
        {
            s += hp1.a() + 1;
            if(hp1.j)
                k.add(((java.lang.Object) (hp1)));
            else
                j.add(((java.lang.Object) (hp1)));
        }
    }

    private void e()
    {
        try
        {
            boolean flag = true;
            if(!j.isEmpty())
            {
                flag = false;
                hp hp1;
                synchronized(d)
                {
                    hp1 = (hp)j.remove(0);
                    s -= hp1.a() + 1;
                }
                hp.a(hp1, g);
            }
            if((flag || t-- <= 0) && !k.isEmpty())
            {
                flag = false;
                hp hp2;
                synchronized(d)
                {
                    hp2 = (hp)k.remove(0);
                    s -= hp2.a() + 1;
                }
                hp.a(hp2, g);
                t = 50;
            }
            if(flag)
                java.lang.Thread.sleep(10L);
        }
        catch(java.lang.InterruptedException interruptedexception) { }
        catch(java.lang.Exception exception)
        {
            if(!p)
                a(exception);
        }
    }

    private void f()
    {
        try
        {
            hp hp1 = hp.b(f);
            if(hp1 != null)
                i.add(((java.lang.Object) (hp1)));
            else
                a("End of stream");
        }
        catch(java.lang.Exception exception)
        {
            if(!p)
                a(exception);
        }
    }

    private void a(java.lang.Exception exception)
    {
        exception.printStackTrace();
        a((new StringBuilder()).append("Internal exception: ").append(exception.toString()).toString());
    }

    public void a(java.lang.String s1)
    {
        if(!h)
            return;
        p = true;
        q = s1;
        (new hl(this)).start();
        h = false;
        try
        {
            f.close();
        }
        catch(java.lang.Throwable throwable) { }
        try
        {
            g.close();
        }
        catch(java.lang.Throwable throwable1) { }
        try
        {
            e.close();
        }
        catch(java.lang.Throwable throwable2) { }
    }

    public void a()
    {
        if(s > 0x100000)
            a("Send buffer overflow");
        if(i.isEmpty())
        {
            if(r++ == 1200)
                a("Timed out");
        } else
        {
            r = 0;
        }
        hp hp1;
        for(int i1 = 100; !i.isEmpty() && i1-- >= 0; hp1.a(l))
            hp1 = (hp)i.remove(0);

        if(p && i.isEmpty())
            l.a(q);
    }

    public java.net.SocketAddress b()
    {
        return e.getRemoteSocketAddress();
    }

    public void c()
    {
        m = true;
        o.interrupt();
        (new hm(this)).start();
    }

    public int d()
    {
        return k.size();
    }

    static boolean a(bb bb1)
    {
        return bb1.h;
    }

    static boolean b(bb bb1)
    {
        return bb1.m;
    }

    static void c(bb bb1)
    {
        bb1.f();
    }

    static void d(bb bb1)
    {
        bb1.e();
    }

    static java.lang.Thread e(bb bb1)
    {
        return bb1.o;
    }

    static java.lang.Thread f(bb bb1)
    {
        return bb1.n;
    }

}
