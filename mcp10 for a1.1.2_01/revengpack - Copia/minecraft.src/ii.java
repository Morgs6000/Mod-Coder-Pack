// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ii
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
    private lb l;
    private boolean m;
    private java.lang.Thread n;
    private java.lang.Thread o;
    private boolean p;
    private java.lang.String q;
    private int r;
    private int s;
    private int t;

    public ii(java.net.Socket socket, java.lang.String s1, lb lb1) throws IOException
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
        l = lb1;
        socket.setTrafficClass(24);
        f = new DataInputStream(socket.getInputStream());
        g = new DataOutputStream(socket.getOutputStream());
        o = ((java.lang.Thread) (new ni(this, (new StringBuilder()).append(s1).append(" read thread").toString())));
        n = ((java.lang.Thread) (new nk(this, (new StringBuilder()).append(s1).append(" write thread").toString())));
        o.start();
        n.start();
    }

    public void a(fn fn1)
    {
        if(m)
            return;
        synchronized(d)
        {
            s += fn1.a() + 1;
            if(fn1.j)
                k.add(((java.lang.Object) (fn1)));
            else
                j.add(((java.lang.Object) (fn1)));
        }
    }

    private void b()
    {
        try
        {
            boolean flag = true;
            if(!j.isEmpty())
            {
                flag = false;
                fn fn1;
                synchronized(d)
                {
                    fn1 = (fn)j.remove(0);
                    s -= fn1.a() + 1;
                }
                fn.a(fn1, g);
            }
            if((flag || t-- <= 0) && !k.isEmpty())
            {
                flag = false;
                fn fn2;
                synchronized(d)
                {
                    fn2 = (fn)k.remove(0);
                    s -= fn2.a() + 1;
                }
                fn.a(fn2, g);
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

    private void c()
    {
        try
        {
            fn fn1 = fn.b(f);
            if(fn1 != null)
                i.add(((java.lang.Object) (fn1)));
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
        (new nh(this)).start();
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
        fn fn1;
        for(int i1 = 100; !i.isEmpty() && i1-- >= 0; fn1.a(l))
            fn1 = (fn)i.remove(0);

        if(p && i.isEmpty())
            l.a(q);
    }

    static boolean a(ii ii1)
    {
        return ii1.h;
    }

    static boolean b(ii ii1)
    {
        return ii1.m;
    }

    static void c(ii ii1)
    {
        ii1.c();
    }

    static void d(ii ii1)
    {
        ii1.b();
    }

    static java.lang.Thread e(ii ii1)
    {
        return ii1.o;
    }

    static java.lang.Thread f(ii ii1)
    {
        return ii1.n;
    }

}
