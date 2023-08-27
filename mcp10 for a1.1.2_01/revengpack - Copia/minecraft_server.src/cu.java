// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.IOException;
import java.net.ServerSocket;
import net.minecraft.server.MinecraftServer;

class cu extends java.lang.Thread
{

    final net.minecraft.server.MinecraftServer a;
    final dc b;

    cu(dc dc1, java.lang.String s, net.minecraft.server.MinecraftServer minecraftserver)
    {
        super(s);
        b = dc1;
        a = minecraftserver;
    }

    public void run()
    {
        do
        {
            if(!b.b)
                break;
            try
            {
                java.net.Socket socket = dc.a(b).accept();
                if(socket != null)
                {
                    ew ew1 = new ew(a, socket, (new StringBuilder()).append("Connection #").append(dc.b(b)).toString());
                    dc.a(b, ew1);
                }
            }
            catch(java.io.IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        } while(true);
    }
}
