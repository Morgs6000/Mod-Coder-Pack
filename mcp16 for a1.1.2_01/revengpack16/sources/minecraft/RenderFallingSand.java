// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class RenderFallingSand extends Render
{

    public RenderFallingSand()
    {
        field_197_d = new RenderBlocks();
        field_190_b = 0.5F;
    }

    public void func_156_a(EntityFallingSand entityfallingsand, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        func_151_a("/terrain.png");
        Block block = Block.allBlocks[entityfallingsand.field_799_a];
        World world = entityfallingsand.func_465_i();
        GL11.glDisable(2896);
        field_197_d.func_1243_a(block, world, MathHelper.func_1108_b(entityfallingsand.posX), MathHelper.func_1108_b(entityfallingsand.posY), MathHelper.func_1108_b(entityfallingsand.posZ));
        GL11.glEnable(2896);
        GL11.glPopMatrix();
    }

    public void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_156_a((EntityFallingSand)entity, d, d1, d2, f, f1);
    }

    private RenderBlocks field_197_d;
}
