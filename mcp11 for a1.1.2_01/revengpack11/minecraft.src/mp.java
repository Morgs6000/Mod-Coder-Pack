// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.Component;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Cursor;
import org.lwjgl.input.Mouse;

public class mp
{

    private java.awt.Component c;
    private org.lwjgl.input.Cursor d;
    public int a;
    public int b;
    private int e;

    public mp(java.awt.Component component)
    {
        e = 10;
        c = component;
        java.nio.IntBuffer intbuffer = df.c(1);
        intbuffer.put(0);
        intbuffer.flip();
        java.nio.IntBuffer intbuffer1 = df.c(1024);
        try
        {
            d = new Cursor(32, 32, 16, 16, 1, intbuffer1, intbuffer);
        }
        catch(org.lwjgl.LWJGLException lwjglexception)
        {
            lwjglexception.printStackTrace();
        }
    }

    public void a()
    {
        org.lwjgl.input.Mouse.setGrabbed(true);
        a = 0;
        b = 0;
    }

    public void b()
    {
        org.lwjgl.input.Mouse.setCursorPosition(c.getWidth() / 2, c.getHeight() / 2);
        org.lwjgl.input.Mouse.setGrabbed(false);
    }

    public void c()
    {
        a = org.lwjgl.input.Mouse.getDX();
        b = org.lwjgl.input.Mouse.getDY();
    }
}
