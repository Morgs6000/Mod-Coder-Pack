// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class nc extends java.lang.Thread
{

    final net.minecraft.client.Minecraft a;
    final java.lang.String b;
    final int c;
    final mn d;

    nc(mn mn1, net.minecraft.client.Minecraft minecraft, java.lang.String s, int i)
    {
        super();
        d = mn1;
        a = minecraft;
        b = s;
        c = i;
    }

    public void run()
    {
        try
        {
        mn.a(d, new gy(a, b, c));
        if(mn.a(d))
            return;
            mn.b(d).a(((fn) (new gt(a.i.b))));
        }
        catch(java.net.UnknownHostException unknownhostexception)
        {
            if(mn.a(d))
                return;
            a.a(((bh) (new cj("Failed to connect to the server", (new StringBuilder()).append("Unknown host '").append(b).append("'").toString()))));
        }
        catch(java.net.ConnectException connectexception)
        {
            if(mn.a(d))
                return;
            a.a(((bh) (new cj("Failed to connect to the server", connectexception.getMessage()))));
        }
        catch(java.lang.Exception exception)
        {
            if(mn.a(d))
                return;
            exception.printStackTrace();
            a.a(((bh) (new cj("Failed to connect to the server", exception.toString()))));
        }
    }
}
