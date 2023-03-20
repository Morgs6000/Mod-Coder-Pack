// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class RenderMinecart extends Render
{

    public RenderMinecart()
    {
        field_190_b = 0.5F;
        field_195_d = new ModelMinecart();
    }

    public void func_152_a(EntityMinecart entityminecart, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        double d3 = entityminecart.field_638_aI + (entityminecart.posX - entityminecart.field_638_aI) * (double)f1;
        double d4 = entityminecart.field_637_aJ + (entityminecart.posY - entityminecart.field_637_aJ) * (double)f1;
        double d5 = entityminecart.field_636_aK + (entityminecart.posZ - entityminecart.field_636_aK) * (double)f1;
        double d6 = 0.30000001192092896D;
        Vec3D vec3d = entityminecart.func_514_g(d3, d4, d5);
        float f2 = entityminecart.field_602_at + (entityminecart.rotationPitch - entityminecart.field_602_at) * f1;
        if(vec3d != null)
        {
            Vec3D vec3d1 = entityminecart.func_515_a(d3, d4, d5, d6);
            Vec3D vec3d2 = entityminecart.func_515_a(d3, d4, d5, -d6);
            if(vec3d1 == null)
            {
                vec3d1 = vec3d;
            }
            if(vec3d2 == null)
            {
                vec3d2 = vec3d;
            }
            d += vec3d.field_1776_a - d3;
            d1 += (vec3d1.field_1775_b + vec3d2.field_1775_b) / 2D - d4;
            d2 += vec3d.field_1779_c - d5;
            Vec3D vec3d3 = vec3d2.func_1257_c(-vec3d1.field_1776_a, -vec3d1.field_1775_b, -vec3d1.field_1779_c);
            if(vec3d3.func_1253_c() != 0.0D)
            {
                vec3d3 = vec3d3.func_1252_b();
                f = (float)((Math.atan2(vec3d3.field_1779_c, vec3d3.field_1776_a) * 180D) / 3.1415926535897931D);
                f2 = (float)(Math.atan(vec3d3.field_1775_b) * 73D);
            }
        }
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180F - f, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-f2, 0.0F, 0.0F, 1.0F);
        float f3 = (float)entityminecart.field_863_b - f1;
        float f4 = (float)entityminecart.field_864_a - f1;
        if(f4 < 0.0F)
        {
            f4 = 0.0F;
        }
        if(f3 > 0.0F)
        {
            GL11.glRotatef(((MathHelper.func_1106_a(f3) * f3 * f4) / 10F) * (float)entityminecart.field_862_c, 1.0F, 0.0F, 0.0F);
        }
        if(entityminecart.minecartType != 0)
        {
            func_151_a("/terrain.png");
            float f5 = 0.75F;
            GL11.glScalef(f5, f5, f5);
            GL11.glTranslatef(0.0F, 0.3125F, 0.0F);
            GL11.glRotatef(90F, 0.0F, 1.0F, 0.0F);
            if(entityminecart.minecartType == 1)
            {
                (new RenderBlocks()).func_1227_a(Block.crate);
            } else
            if(entityminecart.minecartType == 2)
            {
                (new RenderBlocks()).func_1227_a(Block.stoneOvenIdle);
            }
            GL11.glRotatef(-90F, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -0.3125F, 0.0F);
            GL11.glScalef(1.0F / f5, 1.0F / f5, 1.0F / f5);
        }
        func_151_a("/item/cart.png");
        GL11.glScalef(-1F, -1F, 1.0F);
        field_195_d.func_864_b(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_152_a((EntityMinecart)entity, d, d1, d2, f, f1);
    }

    protected ModelBase field_195_d;
}
