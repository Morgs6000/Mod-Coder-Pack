// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.*;
import java.net.Socket;
import java.util.*;

public class NetworkManager
{

    public NetworkManager(Socket socket, String s, NetHandler nethandler) throws IOException
    {
        field_1475_d = new Object();
        field_1471_h = true;
        field_1470_i = Collections.synchronizedList(new LinkedList());
        field_1469_j = Collections.synchronizedList(new LinkedList());
        field_1468_k = Collections.synchronizedList(new LinkedList());
        field_1466_m = false;
        field_1463_p = false;
        field_1462_q = "";
        field_1461_r = 0;
        field_1460_s = 0;
        field_1459_t = 0;
        field_1474_e = socket;
        field_1467_l = nethandler;
        socket.setTrafficClass(24);
        field_1473_f = new DataInputStream(socket.getInputStream());
        field_1472_g = new DataOutputStream(socket.getOutputStream());
        field_1464_o = new NetworkReaderThread(this, (new StringBuilder()).append(s).append(" read thread").toString());
        field_1465_n = new NetworkWriterThread(this, (new StringBuilder()).append(s).append(" write thread").toString());
        field_1464_o.start();
        field_1465_n.start();
    }

    public void func_972_a(Packet packet)
    {
        if(field_1466_m)
        {
            return;
        }
        synchronized(field_1475_d)
        {
            field_1460_s += packet.func_329_a() + 1;
            if(packet.field_472_j)
            {
                field_1468_k.add(packet);
            } else
            {
                field_1469_j.add(packet);
            }
        }
    }

    private void func_964_b()
    {
        try
        {
            boolean flag = true;
            if(!field_1469_j.isEmpty())
            {
                flag = false;
                Packet packet;
                synchronized(field_1475_d)
                {
                    packet = (Packet)field_1469_j.remove(0);
                    field_1460_s -= packet.func_329_a() + 1;
                }
                Packet.func_328_a(packet, field_1472_g);
            }
            if((flag || field_1459_t-- <= 0) && !field_1468_k.isEmpty())
            {
                flag = false;
                Packet packet1;
                synchronized(field_1475_d)
                {
                    packet1 = (Packet)field_1468_k.remove(0);
                    field_1460_s -= packet1.func_329_a() + 1;
                }
                Packet.func_328_a(packet1, field_1472_g);
                field_1459_t = 50;
            }
            if(flag)
            {
                Thread.sleep(10L);
            }
        }
        catch(InterruptedException interruptedexception) { }
        catch(Exception exception)
        {
            if(!field_1463_p)
            {
                func_970_a(exception);
            }
        }
    }

    private void func_973_c()
    {
        try
        {
            Packet packet = Packet.func_324_b(field_1473_f);
            if(packet != null)
            {
                field_1470_i.add(packet);
            } else
            {
                func_974_a("End of stream");
            }
        }
        catch(Exception exception)
        {
            if(!field_1463_p)
            {
                func_970_a(exception);
            }
        }
    }

    private void func_970_a(Exception exception)
    {
        exception.printStackTrace();
        func_974_a((new StringBuilder()).append("Internal exception: ").append(exception.toString()).toString());
    }

    public void func_974_a(String s)
    {
        if(!field_1471_h)
        {
            return;
        }
        field_1463_p = true;
        field_1462_q = s;
        (new NetworkMasterThread(this)).start();
        field_1471_h = false;
        try
        {
            field_1473_f.close();
        }
        catch(Throwable throwable) { }
        try
        {
            field_1472_g.close();
        }
        catch(Throwable throwable1) { }
        try
        {
            field_1474_e.close();
        }
        catch(Throwable throwable2) { }
    }

    public void func_967_a()
    {
        if(field_1460_s > 0x100000)
        {
            func_974_a("Send buffer overflow");
        }
        if(field_1470_i.isEmpty())
        {
            if(field_1461_r++ == 1200)
            {
                func_974_a("Timed out");
            }
        } else
        {
            field_1461_r = 0;
        }
        Packet packet;
        for(int i = 100; !field_1470_i.isEmpty() && i-- >= 0; packet.func_323_a(field_1467_l))
        {
            packet = (Packet)field_1470_i.remove(0);
        }

        if(field_1463_p && field_1470_i.isEmpty())
        {
            field_1467_l.func_823_a(field_1462_q);
        }
    }

    static boolean func_971_a(NetworkManager networkmanager)
    {
        return networkmanager.field_1471_h;
    }

    static boolean func_968_b(NetworkManager networkmanager)
    {
        return networkmanager.field_1466_m;
    }

    static void func_966_c(NetworkManager networkmanager)
    {
        networkmanager.func_973_c();
    }

    static void func_965_d(NetworkManager networkmanager)
    {
        networkmanager.func_964_b();
    }

    static Thread func_969_e(NetworkManager networkmanager)
    {
        return networkmanager.field_1464_o;
    }

    static Thread func_963_f(NetworkManager networkmanager)
    {
        return networkmanager.field_1465_n;
    }

    public static final Object field_1478_a = new Object();
    public static int field_1477_b;
    public static int field_1476_c;
    private Object field_1475_d;
    private Socket field_1474_e;
    private DataInputStream field_1473_f;
    private DataOutputStream field_1472_g;
    private boolean field_1471_h;
    private List field_1470_i;
    private List field_1469_j;
    private List field_1468_k;
    private NetHandler field_1467_l;
    private boolean field_1466_m;
    private Thread field_1465_n;
    private Thread field_1464_o;
    private boolean field_1463_p;
    private String field_1462_q;
    private int field_1461_r;
    private int field_1460_s;
    private int field_1459_t;

}
