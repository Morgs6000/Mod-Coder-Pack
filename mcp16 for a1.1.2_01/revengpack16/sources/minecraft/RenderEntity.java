// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class RenderEntity extends Render
{

    public RenderEntity()
    {
    }

    public void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        func_146_a(entity.boundingBox, d - entity.field_638_aI, d1 - entity.field_637_aJ, d2 - entity.field_636_aK);
        GL11.glPopMatrix();
    }
}
