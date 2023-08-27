// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import org.lwjgl.opengl.GL11;

public class nz extends dn
{

    private float f;

    public nz(fo fo, float f1, float f2)
    {
        super(fo, f1 * f2);
        f = f2;
    }

    protected void a(hl hl1, float f1)
    {
        org.lwjgl.opengl.GL11.glScalef(f, f, f);
    }

    protected void a(ge ge, float f1)
    {
        a((hl)ge, f1);
    }
}
