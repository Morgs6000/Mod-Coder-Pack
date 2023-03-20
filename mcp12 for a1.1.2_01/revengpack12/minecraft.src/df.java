// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class df
{

    private static java.util.List a = new ArrayList();
    private static java.util.List b = new ArrayList();

    public df()
    {
    }

    public static synchronized int a(int i)
    {
        int j = org.lwjgl.opengl.GL11.glGenLists(i);
        a.add(((java.lang.Object) (java.lang.Integer.valueOf(j))));
        a.add(((java.lang.Object) (java.lang.Integer.valueOf(i))));
        return j;
    }

    public static synchronized void a(java.nio.IntBuffer intbuffer)
    {
        org.lwjgl.opengl.GL11.glGenTextures(intbuffer);
        for(int i = intbuffer.position(); i < intbuffer.limit(); i++)
            b.add(((java.lang.Object) (java.lang.Integer.valueOf(intbuffer.get(i)))));

    }

    public static synchronized void a()
    {
        for(int i = 0; i < a.size(); i += 2)
            org.lwjgl.opengl.GL11.glDeleteLists(((java.lang.Integer)a.get(i)).intValue(), ((java.lang.Integer)a.get(i + 1)).intValue());

        java.nio.IntBuffer intbuffer = df.c(b.size());
        intbuffer.flip();
        org.lwjgl.opengl.GL11.glDeleteTextures(intbuffer);
        for(int j = 0; j < b.size(); j++)
            intbuffer.put(((java.lang.Integer)b.get(j)).intValue());

        intbuffer.flip();
        org.lwjgl.opengl.GL11.glDeleteTextures(intbuffer);
        a.clear();
        b.clear();
    }

    public static synchronized java.nio.ByteBuffer b(int i)
    {
        java.nio.ByteBuffer bytebuffer = java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        return bytebuffer;
    }

    public static java.nio.IntBuffer c(int i)
    {
        return df.b(i << 2).asIntBuffer();
    }

    public static java.nio.FloatBuffer d(int i)
    {
        return df.b(i << 2).asFloatBuffer();
    }

}
