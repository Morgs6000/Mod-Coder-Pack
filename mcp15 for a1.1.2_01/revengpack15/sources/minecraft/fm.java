// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.*;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.MinecraftApplet;

public final class fm extends Minecraft
{

    public fm(Component component, Canvas canvas, MinecraftApplet minecraftapplet, int i, int j, boolean flag, Frame frame)
    {
        super(component, canvas, minecraftapplet, i, j, flag);
        field_185_a = frame;
    }

    public void func_110_a(go go)
    {
        field_185_a.removeAll();
        field_185_a.add(new aq(go), "Center");
        field_185_a.validate();
    }

    final Frame field_185_a; /* synthetic field */
}
