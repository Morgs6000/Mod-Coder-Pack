// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;

public class be
{

    private static boolean a = false;

    public be()
    {
    }

    public boolean a()
    {
        return a && org.lwjgl.opengl.GLContext.getCapabilities().GL_ARB_occlusion_query;
    }

}
