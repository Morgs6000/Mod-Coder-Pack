// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class nz extends dn
{

    public nz(fo fo, float f, float f1)
    {
        super(fo, f * f1);
        field_204_f = f1;
    }

    protected void func_175_a(hl hl1, float f)
    {
        GL11.glScalef(field_204_f, field_204_f, field_204_f);
    }

    protected void func_168_a(ge ge, float f)
    {
        func_175_a((hl)ge, f);
    }

    private float field_204_f;
}
