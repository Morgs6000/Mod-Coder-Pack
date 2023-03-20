// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.Canvas;
import net.minecraft.client.MinecraftApplet;

public class h extends java.awt.Canvas
{

    final net.minecraft.client.MinecraftApplet a;

    public h(net.minecraft.client.MinecraftApplet minecraftapplet)
    {
        super();
        a = minecraftapplet;
    }

    public synchronized void addNotify()
    {
        super.addNotify();
        a.a();
    }

    public synchronized void removeNotify()
    {
        a.b();
        super.removeNotify();
    }
}
