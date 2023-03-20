// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
//import Minecraft;
//import MinecraftApplet;

public class g extends Minecraft
{

    final MinecraftApplet a;

    public g(MinecraftApplet minecraftapplet, java.awt.Component component, java.awt.Canvas canvas, MinecraftApplet minecraftapplet1, int i, int j, boolean flag)
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
