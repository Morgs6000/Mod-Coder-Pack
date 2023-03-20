// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import net.minecraft.server.MinecraftServer;

public final class bm extends java.lang.Thread
{

    final net.minecraft.server.MinecraftServer a;

    public bm(java.lang.String s, net.minecraft.server.MinecraftServer minecraftserver)
    {
        super(s);
        a = minecraftserver;
    }

    public void run()
    {
        a.run();
    }
}
