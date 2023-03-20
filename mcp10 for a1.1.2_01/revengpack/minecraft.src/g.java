// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MinecraftApplet;

public class g extends net.minecraft.client.Minecraft
{

    final net.minecraft.client.MinecraftApplet a;

    public g(net.minecraft.client.MinecraftApplet minecraftapplet, java.awt.Component component, java.awt.Canvas canvas, net.minecraft.client.MinecraftApplet minecraftapplet1, int i, int j, boolean flag)
    {
        super(component, canvas, minecraftapplet1, i, j, flag);
        a = minecraftapplet;
    }

    public void a(go go)
    {
        a.removeAll();
        a.setLayout(((java.awt.LayoutManager) (new BorderLayout())));
        a.add(((java.awt.Component) (new aq(go))), "Center");
        a.validate();
    }
}
