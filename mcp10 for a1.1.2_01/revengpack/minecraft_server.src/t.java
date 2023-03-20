// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import net.minecraft.server.MinecraftServer;

final class t extends java.awt.event.WindowAdapter
{

    final net.minecraft.server.MinecraftServer a;

    t(net.minecraft.server.MinecraftServer minecraftserver)
    {
        super();
        a = minecraftserver;
    }

    public void windowClosing(java.awt.event.WindowEvent windowevent)
    {
        a.a();
        while(!a.g) 
            try
            {
                java.lang.Thread.sleep(100L);
            }
            catch(java.lang.InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
        java.lang.System.exit(0);
    }
}
