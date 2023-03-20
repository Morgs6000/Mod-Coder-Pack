// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import net.minecraft.server.MinecraftServer;

public class bp extends java.lang.Thread
{

    final net.minecraft.server.MinecraftServer a;

    public bp(net.minecraft.server.MinecraftServer minecraftserver)
    {
        super();
        a = minecraftserver;
        setDaemon(true);
        start();
    }

    public void run()
    {
        do
            try
            {
                java.lang.Thread.sleep(0x7fffffffL);
            }
            catch(java.lang.InterruptedException interruptedexception) { }
        while(true);
    }
}
