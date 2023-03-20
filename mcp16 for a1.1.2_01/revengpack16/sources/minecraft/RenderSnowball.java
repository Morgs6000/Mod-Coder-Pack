// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class RenderSnowball extends Render
{

    public RenderSnowball()
    {
    }

    public void func_155_a(EntitySnowball entitysnowball, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glEnable(32826);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        int i = Item.snowball.func_196_a(null);
        func_151_a("/gui/items.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        float f2 = (float)((i % 16) * 16 + 0) / 256F;
        float f3 = (float)((i % 16) * 16 + 16) / 256F;
        float f4 = (float)((i / 16) * 16 + 0) / 256F;
        float f5 = (float)((i / 16) * 16 + 16) / 256F;
        float f6 = 1.0F;
        float f7 = 0.5F;
        float f8 = 0.25F;
        GL11.glRotatef(180F - field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        tessellator.func_977_b();
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        tessellator.func_983_a(0.0F - f7, 0.0F - f8, 0.0D, f2, f5);
        tessellator.func_983_a(f6 - f7, 0.0F - f8, 0.0D, f3, f5);
        tessellator.func_983_a(f6 - f7, 1.0F - f8, 0.0D, f3, f4);
        tessellator.func_983_a(0.0F - f7, 1.0F - f8, 0.0D, f2, f4);
        tessellator.func_982_a();
        GL11.glDisable(32826);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_155_a((EntitySnowball)entity, d, d1, d2, f, f1);
    }
}
