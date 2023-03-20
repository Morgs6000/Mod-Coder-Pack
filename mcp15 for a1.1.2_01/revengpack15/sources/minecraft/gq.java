// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class gq extends dn
{

    public gq(fo fo, fo fo1, float f)
    {
        super(fo, f);
        field_205_f = fo1;
    }

    protected boolean func_179_a(ma ma1, int i)
    {
        if(i == 0)
        {
            func_169_a(field_205_f);
            GL11.glEnable(2977);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            return true;
        }
        if(i == 1)
        {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        }
        return false;
    }

    protected void func_178_a(ma ma1, float f)
    {
        float f1 = (ma1.field_767_b + (ma1.field_768_a - ma1.field_767_b) * f) / ((float)ma1.field_770_c * 0.5F + 1.0F);
        float f2 = 1.0F / (f1 + 1.0F);
        float f3 = ma1.field_770_c;
        GL11.glScalef(f2 * f3, (1.0F / f2) * f3, f2 * f3);
    }

    protected void func_168_a(ge ge, float f)
    {
        func_178_a((ma)ge, f);
    }

    protected boolean func_166_a(ge ge, int i)
    {
        return func_179_a((ma)ge, i);
    }

    private fo field_205_f;
}
