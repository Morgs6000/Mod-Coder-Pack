// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Frame;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public final class fm extends net.minecraft.client.Minecraft
{

    final java.awt.Frame a;

    public fm(java.awt.Component component, java.awt.Canvas canvas, net.minecraft.client.MinecraftApplet minecraftapplet, int i, int j, boolean flag, java.awt.Frame frame)
    {
        super(component, canvas, minecraftapplet, i, j, flag);
        a = frame;
    }

    public void a(go go)
    {
        a.removeAll();
        a.add(((java.awt.Component) (new aq(go))), "Center");
        a.validate();
    }
}
