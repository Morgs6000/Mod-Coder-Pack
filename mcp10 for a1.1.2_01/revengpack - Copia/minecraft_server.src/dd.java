// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;

class dd extends java.lang.Thread
{

    final z a;
    final ew b;

    dd(ew ew1, z z1)
    {
        super();
        b = ew1;
        a = z1;
    }

    public void run()
    {
        try
        {
            java.lang.String s = ew.a(b);
            java.net.URL url = new URL((new StringBuilder()).append("http://www.minecraft.net/game/checkserver.jsp?user=").append(a.b).append("&serverId=").append(s).toString());
            java.io.BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(url.openStream()))));
            java.lang.String s1 = bufferedreader.readLine();
            bufferedreader.close();
            java.lang.System.out.println((new StringBuilder()).append("THE REPLY IS ").append(s1).toString());
            if(s1.equals("YES"))
                ew.a(b, a);
            else
                b.b("Failed to verify username!");
        }
        catch(java.lang.Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
