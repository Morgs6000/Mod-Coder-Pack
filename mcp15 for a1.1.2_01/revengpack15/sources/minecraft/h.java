// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.Canvas;
//import net.minecraft.client.MinecraftApplet;

public class h extends Canvas
{

    public h(MinecraftApplet minecraftapplet)
    {
        super();
        field_1696_a = minecraftapplet;
    }

    public synchronized void addNotify()
    {
        super.addNotify();
        field_1696_a.func_103_a();
    }

    public synchronized void removeNotify()
    {
        field_1696_a.func_102_b();
        super.removeNotify();
    }

    final MinecraftApplet field_1696_a; /* synthetic field */
}
