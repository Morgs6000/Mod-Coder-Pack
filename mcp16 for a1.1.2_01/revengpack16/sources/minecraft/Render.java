// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public abstract class Render
{

    public Render()
    {
        field_193_d = new ModelBiped();
        field_192_e = new RenderBlocks();
        field_190_b = 0.0F;
        field_194_c = 1.0F;
    }

    public abstract void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1);

    protected void func_151_a(String s)
    {
        RenderEngine renderengine = field_191_a.field_1229_e;
        renderengine.func_1076_b(renderengine.func_1070_a(s));
    }

    protected void func_140_a(String s, String s1)
    {
        RenderEngine renderengine = field_191_a.field_1229_e;
        renderengine.func_1076_b(renderengine.func_1071_a(s, s1));
    }

    private void func_148_a(Entity entity, double d, double d1, double d2, 
            float f)
    {
        GL11.glDisable(2896);
        int i = Block.fire.field_378_bb;
        int j = (i & 0xf) << 4;
        int k = i & 0xf0;
        float f1 = (float)j / 256F;
        float f2 = ((float)j + 15.99F) / 256F;
        float f3 = (float)k / 256F;
        float f4 = ((float)k + 15.99F) / 256F;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float f5 = entity.field_644_aC * 1.4F;
        GL11.glScalef(f5, f5, f5);
        func_151_a("/terrain.png");
        Tessellator tessellator = Tessellator.field_1512_a;
        float f6 = 1.0F;
        float f7 = 0.5F;
        float f8 = 0.0F;
        float f9 = entity.field_643_aD / entity.field_644_aC;
        GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 0.4F + (float)(int)f9 * 0.02F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tessellator.func_977_b();
        while(f9 > 0.0F) 
        {
            tessellator.func_983_a(f6 - f7, 0.0F - f8, 0.0D, f2, f4);
            tessellator.func_983_a(0.0F - f7, 0.0F - f8, 0.0D, f1, f4);
            tessellator.func_983_a(0.0F - f7, 1.4F - f8, 0.0D, f1, f3);
            tessellator.func_983_a(f6 - f7, 1.4F - f8, 0.0D, f2, f3);
            f9--;
            f8--;
            f6 *= 0.9F;
            GL11.glTranslatef(0.0F, 0.0F, -0.04F);
        }
        tessellator.func_982_a();
        GL11.glPopMatrix();
        GL11.glEnable(2896);
    }

    private void func_144_c(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        RenderEngine renderengine = field_191_a.field_1229_e;
        renderengine.func_1076_b(renderengine.func_1070_a("%%/shadow.png"));
        World world = func_149_b();
        GL11.glDepthMask(false);
        float f2 = field_190_b;
        double d3 = entity.field_638_aI + (entity.posX - entity.field_638_aI) * (double)f1;
        double d4 = entity.field_637_aJ + (entity.posY - entity.field_637_aJ) * (double)f1 + (double)entity.func_392_h_();
        double d5 = entity.field_636_aK + (entity.posZ - entity.field_636_aK) * (double)f1;
        int i = MathHelper.func_1108_b(d3 - (double)f2);
        int j = MathHelper.func_1108_b(d3 + (double)f2);
        int k = MathHelper.func_1108_b(d4 - (double)f2);
        int l = MathHelper.func_1108_b(d4);
        int i1 = MathHelper.func_1108_b(d5 - (double)f2);
        int j1 = MathHelper.func_1108_b(d5 + (double)f2);
        double d6 = d - d3;
        double d7 = d1 - d4;
        double d8 = d2 - d5;
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        for(int k1 = i; k1 <= j; k1++)
        {
            for(int l1 = k; l1 <= l; l1++)
            {
                for(int i2 = i1; i2 <= j1; i2++)
                {
                    int j2 = world.func_600_a(k1, l1 - 1, i2);
                    if(j2 > 0 && world.func_618_j(k1, l1, i2) > 3)
                    {
                        func_145_a(Block.allBlocks[j2], d, d1 + (double)entity.func_392_h_(), d2, k1, l1, i2, f, f2, d6, d7 + (double)entity.func_392_h_(), d8);
                    }
                }

            }

        }

        tessellator.func_982_a();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
    }

    private World func_149_b()
    {
        return field_191_a.field_1227_g;
    }

    private void func_145_a(Block block, double d, double d1, double d2, 
            int i, int j, int k, float f, float f1, double d3, 
            double d4, double d5)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        if(!block.func_242_c())
        {
            return;
        }
        double d6 = ((double)f - (d1 - ((double)j + d4)) / 2D) * 0.5D * (double)func_149_b().func_598_c(i, j, k);
        if(d6 < 0.0D)
        {
            return;
        }
        if(d6 > 1.0D)
        {
            d6 = 1.0D;
        }
        tessellator.func_986_a(1.0F, 1.0F, 1.0F, (float)d6);
        double d7 = (double)i + block.field_370_bf + d3;
        double d8 = (double)i + block.field_364_bi + d3;
        double d9 = (double)j + block.field_368_bg + d4 + 0.015625D;
        double d10 = (double)k + block.field_366_bh + d5;
        double d11 = (double)k + block.field_360_bk + d5;
        float f2 = (float)((d - d7) / 2D / (double)f1 + 0.5D);
        float f3 = (float)((d - d8) / 2D / (double)f1 + 0.5D);
        float f4 = (float)((d2 - d10) / 2D / (double)f1 + 0.5D);
        float f5 = (float)((d2 - d11) / 2D / (double)f1 + 0.5D);
        tessellator.func_983_a(d7, d9, d10, f2, f4);
        tessellator.func_983_a(d7, d9, d11, f2, f5);
        tessellator.func_983_a(d8, d9, d11, f3, f5);
        tessellator.func_983_a(d8, d9, d10, f3, f4);
    }

    public static void func_146_a(AxisAlignedBB axisalignedbb, double d, double d1, double d2)
    {
        GL11.glDisable(3553);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        tessellator.func_977_b();
        tessellator.func_984_b(d, d1, d2);
        tessellator.func_980_b(0.0F, 0.0F, -1F);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_980_b(0.0F, 0.0F, 1.0F);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_980_b(0.0F, -1F, 0.0F);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_980_b(0.0F, 1.0F, 0.0F);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_980_b(-1F, 0.0F, 0.0F);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_980_b(1.0F, 0.0F, 0.0F);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_984_b(0.0D, 0.0D, 0.0D);
        tessellator.func_982_a();
        GL11.glEnable(3553);
    }

    public static void func_142_a(AxisAlignedBB axisalignedbb)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        tessellator.func_977_b();
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1698_a, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1704_c);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1702_e, axisalignedbb.field_1701_f);
        tessellator.func_991_a(axisalignedbb.field_1703_d, axisalignedbb.field_1697_b, axisalignedbb.field_1701_f);
        tessellator.func_982_a();
    }

    public void func_150_a(RenderManager rendermanager)
    {
        field_191_a = rendermanager;
    }

    public void func_141_b(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        if(field_191_a.field_1223_k.fancyGraphics && field_190_b > 0.0F)
        {
            double d3 = field_191_a.func_851_a(entity.posX, entity.posY, entity.posZ);
            float f2 = (float)((1.0D - d3 / 256D) * (double)field_194_c);
            if(f2 > 0.0F)
            {
                func_144_c(entity, d, d1, d2, f2, f1);
            }
        }
        if(entity.fire > 0)
        {
            func_148_a(entity, d, d1, d2, f1);
        }
    }

    public FontRenderer func_143_a()
    {
        return field_191_a.func_856_a();
    }

    protected RenderManager field_191_a;
    private ModelBase field_193_d;
    private RenderBlocks field_192_e;
    protected float field_190_b;
    protected float field_194_c;
}
