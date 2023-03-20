// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.*;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.MinecraftApplet;

public class g extends Minecraft
{

    public g(MinecraftApplet minecraftapplet, Component component, Canvas canvas, MinecraftApplet minecraftapplet1, int i, int j, boolean flag)
    {
        super(component, canvas, minecraftapplet1, i, j, flag);
        field_186_a = minecraftapplet;
    }

    public void func_110_a(go go)
    {
        field_186_a.removeAll();
        field_186_a.setLayout(new BorderLayout());
        field_186_a.add(new aq(go), "Center");
        field_186_a.validate();
    }

    final MinecraftApplet field_186_a; /* synthetic field */
}
