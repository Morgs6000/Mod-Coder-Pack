// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;

public class i
{

    private static java.nio.FloatBuffer a = df.d(16);

    public i()
    {
    }

    public static void a()
    {
        org.lwjgl.opengl.GL11.glDisable(2896);
        org.lwjgl.opengl.GL11.glDisable(16384);
        org.lwjgl.opengl.GL11.glDisable(16385);
        org.lwjgl.opengl.GL11.glDisable(2903);
    }

    public static void b()
    {
        org.lwjgl.opengl.GL11.glEnable(2896);
        org.lwjgl.opengl.GL11.glEnable(16384);
        org.lwjgl.opengl.GL11.glEnable(16385);
        org.lwjgl.opengl.GL11.glEnable(2903);
        org.lwjgl.opengl.GL11.glColorMaterial(1032, 5634);
        float f = 0.4F;
        float f1 = 0.6F;
        float f2 = 0.0F;
        aj aj1 = aj.b(0.20000000298023224D, 1.0D, -0.69999998807907104D).b();
        org.lwjgl.opengl.GL11.glLight(16384, 4611, i.a(aj1.a, aj1.b, aj1.c, 0.0D));
        org.lwjgl.opengl.GL11.glLight(16384, 4609, i.a(f1, f1, f1, 1.0F));
        org.lwjgl.opengl.GL11.glLight(16384, 4608, i.a(0.0F, 0.0F, 0.0F, 1.0F));
        org.lwjgl.opengl.GL11.glLight(16384, 4610, i.a(f2, f2, f2, 1.0F));
        aj1 = aj.b(-0.20000000298023224D, 1.0D, 0.69999998807907104D).b();
        org.lwjgl.opengl.GL11.glLight(16385, 4611, i.a(aj1.a, aj1.b, aj1.c, 0.0D));
        org.lwjgl.opengl.GL11.glLight(16385, 4609, i.a(f1, f1, f1, 1.0F));
        org.lwjgl.opengl.GL11.glLight(16385, 4608, i.a(0.0F, 0.0F, 0.0F, 1.0F));
        org.lwjgl.opengl.GL11.glLight(16385, 4610, i.a(f2, f2, f2, 1.0F));
        org.lwjgl.opengl.GL11.glShadeModel(7424);
        org.lwjgl.opengl.GL11.glLightModel(2899, i.a(f, f, f, 1.0F));
    }

    private static java.nio.FloatBuffer a(double d, double d1, double d2, double d3)
    {
        return i.a((float)d, (float)d1, (float)d2, (float)d3);
    }

    private static java.nio.FloatBuffer a(float f, float f1, float f2, float f3)
    {
        a.clear();
        a.put(f).put(f1).put(f2).put(f3);
        a.flip();
        return a;
    }

}
