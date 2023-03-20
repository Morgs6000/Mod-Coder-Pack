// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class r extends ex
{

    public r()
    {
        field_1412_b = new HashMap();
    }

    public void func_931_a(bd bd1, double d, double d1, double d2, 
            float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.5F, (float)d1, (float)d2 + 0.5F);
        kh kh1 = (kh)field_1412_b.get(bd1.field_828_b);
        if(kh1 == null)
        {
            kh1 = ew.func_1079_a(bd1.field_828_b, null);
            field_1412_b.put(bd1.field_828_b, kh1);
        }
        if(kh1 != null)
        {
            kh1.func_398_a(bd1.field_824_e);
            float f1 = 0.4375F;
            GL11.glTranslatef(0.0F, 0.4F, 0.0F);
            GL11.glRotatef((float)(bd1.field_830_d + (bd1.field_831_c - bd1.field_830_d) * (double)f) * 10F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-30F, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.4F, 0.0F);
            GL11.glScalef(f1, f1, f1);
            kh1.func_365_c(d, d1, d2, 0.0F, 0.0F);
            kx.field_1233_a.func_853_a(kh1, 0.0D, 0.0D, 0.0D, 0.0F, f);
        }
        GL11.glPopMatrix();
    }

    public void func_930_a(ic ic, double d, double d1, double d2, 
            float f)
    {
        func_931_a((bd)ic, d, d1, d2, f);
    }

    private Map field_1412_b;
}
