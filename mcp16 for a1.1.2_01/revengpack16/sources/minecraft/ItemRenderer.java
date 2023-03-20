// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ItemRenderer
{

    public ItemRenderer(Minecraft minecraft)
    {
        field_1355_b = null;
        field_1359_c = 0.0F;
        field_1358_d = 0.0F;
        field_1357_e = new RenderBlocks();
        field_1356_a = minecraft;
    }

    public void func_897_a(ItemStack itemstack)
    {
        GL11.glPushMatrix();
        if(itemstack.itemID < 256 && RenderBlocks.func_1219_a(Block.allBlocks[itemstack.itemID].func_210_f()))
        {
            GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1070_a("/terrain.png"));
            field_1357_e.func_1227_a(Block.allBlocks[itemstack.itemID]);
        } else
        {
            if(itemstack.itemID < 256)
            {
                GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1070_a("/terrain.png"));
            } else
            {
                GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1070_a("/gui/items.png"));
            }
            Tessellator tessellator = Tessellator.field_1512_a;
            float f = (float)((itemstack.func_1088_b() % 16) * 16 + 0) / 256F;
            float f1 = (float)((itemstack.func_1088_b() % 16) * 16 + 16) / 256F;
            float f2 = (float)((itemstack.func_1088_b() / 16) * 16 + 0) / 256F;
            float f3 = (float)((itemstack.func_1088_b() / 16) * 16 + 16) / 256F;
            float f4 = 1.0F;
            float f5 = 0.0F;
            float f6 = 0.3F;
            GL11.glEnable(32826);
            GL11.glTranslatef(-f5, -f6, 0.0F);
            float f7 = 1.5F;
            GL11.glScalef(f7, f7, f7);
            GL11.glRotatef(50F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(335F, 0.0F, 0.0F, 1.0F);
            GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
            float f8 = 0.0625F;
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 0.0F, 1.0F);
            tessellator.func_983_a(0.0D, 0.0D, 0.0D, f1, f3);
            tessellator.func_983_a(f4, 0.0D, 0.0D, f, f3);
            tessellator.func_983_a(f4, 1.0D, 0.0D, f, f2);
            tessellator.func_983_a(0.0D, 1.0D, 0.0D, f1, f2);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 0.0F, -1F);
            tessellator.func_983_a(0.0D, 1.0D, 0.0F - f8, f1, f2);
            tessellator.func_983_a(f4, 1.0D, 0.0F - f8, f, f2);
            tessellator.func_983_a(f4, 0.0D, 0.0F - f8, f, f3);
            tessellator.func_983_a(0.0D, 0.0D, 0.0F - f8, f1, f3);
            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(-1F, 0.0F, 0.0F);
            for(int i = 0; i < 16; i++)
            {
                float f9 = (float)i / 16F;
                float f13 = (f1 + (f - f1) * f9) - 0.001953125F;
                float f17 = f4 * f9;
                tessellator.func_983_a(f17, 0.0D, 0.0F - f8, f13, f3);
                tessellator.func_983_a(f17, 0.0D, 0.0D, f13, f3);
                tessellator.func_983_a(f17, 1.0D, 0.0D, f13, f2);
                tessellator.func_983_a(f17, 1.0D, 0.0F - f8, f13, f2);
            }

            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(1.0F, 0.0F, 0.0F);
            for(int j = 0; j < 16; j++)
            {
                float f10 = (float)j / 16F;
                float f14 = (f1 + (f - f1) * f10) - 0.001953125F;
                float f18 = f4 * f10 + 0.0625F;
                tessellator.func_983_a(f18, 1.0D, 0.0F - f8, f14, f2);
                tessellator.func_983_a(f18, 1.0D, 0.0D, f14, f2);
                tessellator.func_983_a(f18, 0.0D, 0.0D, f14, f3);
                tessellator.func_983_a(f18, 0.0D, 0.0F - f8, f14, f3);
            }

            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, 1.0F, 0.0F);
            for(int k = 0; k < 16; k++)
            {
                float f11 = (float)k / 16F;
                float f15 = (f3 + (f2 - f3) * f11) - 0.001953125F;
                float f19 = f4 * f11 + 0.0625F;
                tessellator.func_983_a(0.0D, f19, 0.0D, f1, f15);
                tessellator.func_983_a(f4, f19, 0.0D, f, f15);
                tessellator.func_983_a(f4, f19, 0.0F - f8, f, f15);
                tessellator.func_983_a(0.0D, f19, 0.0F - f8, f1, f15);
            }

            tessellator.func_982_a();
            tessellator.func_977_b();
            tessellator.func_980_b(0.0F, -1F, 0.0F);
            for(int l = 0; l < 16; l++)
            {
                float f12 = (float)l / 16F;
                float f16 = (f3 + (f2 - f3) * f12) - 0.001953125F;
                float f20 = f4 * f12;
                tessellator.func_983_a(f4, f20, 0.0D, f, f16);
                tessellator.func_983_a(0.0D, f20, 0.0D, f1, f16);
                tessellator.func_983_a(0.0D, f20, 0.0F - f8, f1, f16);
                tessellator.func_983_a(f4, f20, 0.0F - f8, f, f16);
            }

            tessellator.func_982_a();
            GL11.glDisable(32826);
        }
        GL11.glPopMatrix();
    }

    public void func_894_a(float f)
    {
        float f1 = field_1358_d + (field_1359_c - field_1358_d) * f;
        EntityPlayerSP entityplayersp = field_1356_a.field_178_g;
        GL11.glPushMatrix();
        GL11.glRotatef(((EntityPlayer) (entityplayersp)).field_602_at + (((EntityPlayer) (entityplayersp)).rotationPitch - ((EntityPlayer) (entityplayersp)).field_602_at) * f, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(((EntityPlayer) (entityplayersp)).field_603_as + (((EntityPlayer) (entityplayersp)).rotationYaw - ((EntityPlayer) (entityplayersp)).field_603_as) * f, 0.0F, 1.0F, 0.0F);
        RenderHelper.func_1158_b();
        GL11.glPopMatrix();
        float f2 = field_1356_a.field_180_e.func_598_c(MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posX), MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posY), MathHelper.func_1108_b(((EntityPlayer) (entityplayersp)).posZ));
        GL11.glColor4f(f2, f2, f2, 1.0F);
        if(field_1355_b != null)
        {
            GL11.glPushMatrix();
            float f3 = 0.8F;
            float f5 = entityplayersp.func_431_d(f);
            float f7 = MathHelper.func_1106_a(f5 * 3.141593F);
            float f9 = MathHelper.func_1106_a(MathHelper.func_1113_c(f5) * 3.141593F);
            GL11.glTranslatef(-f9 * 0.4F, MathHelper.func_1106_a(MathHelper.func_1113_c(f5) * 3.141593F * 2.0F) * 0.2F, -f7 * 0.2F);
            GL11.glTranslatef(0.7F * f3, -0.65F * f3 - (1.0F - f1) * 0.6F, -0.9F * f3);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable(32826);
            f5 = entityplayersp.func_431_d(f);
            f7 = MathHelper.func_1106_a(f5 * f5 * 3.141593F);
            f9 = MathHelper.func_1106_a(MathHelper.func_1113_c(f5) * 3.141593F);
            GL11.glRotatef(-f7 * 20F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f9 * 20F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(-f9 * 80F, 1.0F, 0.0F, 0.0F);
            f5 = 0.4F;
            GL11.glScalef(f5, f5, f5);
            func_897_a(field_1355_b);
            GL11.glPopMatrix();
        } else
        {
            GL11.glPushMatrix();
            float f4 = 0.8F;
            float f6 = entityplayersp.func_431_d(f);
            float f8 = MathHelper.func_1106_a(f6 * 3.141593F);
            float f10 = MathHelper.func_1106_a(MathHelper.func_1113_c(f6) * 3.141593F);
            GL11.glTranslatef(-f10 * 0.3F, MathHelper.func_1106_a(MathHelper.func_1113_c(f6) * 3.141593F * 2.0F) * 0.4F, -f8 * 0.4F);
            GL11.glTranslatef(0.8F * f4, -0.75F * f4 - (1.0F - f1) * 0.6F, -0.9F * f4);
            GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            GL11.glEnable(32826);
            f6 = entityplayersp.func_431_d(f);
            f8 = MathHelper.func_1106_a(f6 * f6 * 3.141593F);
            f10 = MathHelper.func_1106_a(MathHelper.func_1113_c(f6) * 3.141593F);
            GL11.glRotatef(f10 * 70F, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(-f8 * 20F, 0.0F, 0.0F, 1.0F);
            GL11.glBindTexture(3553, field_1356_a.field_171_n.func_1071_a(field_1356_a.field_178_g.field_622_aY, field_1356_a.field_178_g.func_356_x()));
            GL11.glTranslatef(-1F, 3.6F, 3.5F);
            GL11.glRotatef(120F, 0.0F, 0.0F, 1.0F);
            GL11.glRotatef(200F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-135F, 0.0F, 1.0F, 0.0F);
            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glTranslatef(5.6F, 0.0F, 0.0F);
            Render render = RenderManager.field_1233_a.func_855_a(field_1356_a.field_178_g);
            RenderPlayer renderplayer = (RenderPlayer)render;
            f10 = 1.0F;
            GL11.glScalef(f10, f10, f10);
            renderplayer.func_185_b();
            GL11.glPopMatrix();
        }
        GL11.glDisable(32826);
        RenderHelper.func_1159_a();
    }

    public void func_893_b(float f)
    {
        GL11.glDisable(3008);
        if(field_1356_a.field_178_g.fire > 0)
        {
            int i = field_1356_a.field_171_n.func_1070_a("/terrain.png");
            GL11.glBindTexture(3553, i);
            func_890_d(f);
        }
        if(field_1356_a.field_178_g.func_345_I())
        {
            int j = MathHelper.func_1108_b(field_1356_a.field_178_g.posX);
            int l = MathHelper.func_1108_b(field_1356_a.field_178_g.posY);
            int i1 = MathHelper.func_1108_b(field_1356_a.field_178_g.posZ);
            int j1 = field_1356_a.field_171_n.func_1070_a("/terrain.png");
            GL11.glBindTexture(3553, j1);
            int k1 = field_1356_a.field_180_e.func_600_a(j, l, i1);
            if(Block.allBlocks[k1] != null)
            {
                func_898_a(f, Block.allBlocks[k1].func_218_a(2));
            }
        }
        if(field_1356_a.field_178_g.func_393_a(Material.water))
        {
            int k = field_1356_a.field_171_n.func_1070_a("/water.png");
            GL11.glBindTexture(3553, k);
            func_892_c(f);
        }
        GL11.glEnable(3008);
    }

    private void func_898_a(float f, int i)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        float f1 = field_1356_a.field_178_g.func_382_a(f);
        f1 = 0.1F;
        GL11.glColor4f(f1, f1, f1, 0.5F);
        GL11.glPushMatrix();
        float f2 = -1F;
        float f3 = 1.0F;
        float f4 = -1F;
        float f5 = 1.0F;
        float f6 = -0.5F;
        float f7 = 0.0078125F;
        float f8 = (float)(i % 16) / 256F - f7;
        float f9 = ((float)(i % 16) + 15.99F) / 256F + f7;
        float f10 = (float)(i / 16) / 256F - f7;
        float f11 = ((float)(i / 16) + 15.99F) / 256F + f7;
        tessellator.func_977_b();
        tessellator.func_983_a(f2, f4, f6, f9, f11);
        tessellator.func_983_a(f3, f4, f6, f8, f11);
        tessellator.func_983_a(f3, f5, f6, f8, f10);
        tessellator.func_983_a(f2, f5, f6, f9, f10);
        tessellator.func_982_a();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void func_892_c(float f)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        float f1 = field_1356_a.field_178_g.func_382_a(f);
        GL11.glColor4f(f1, f1, f1, 0.5F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glPushMatrix();
        float f2 = 4F;
        float f3 = -1F;
        float f4 = 1.0F;
        float f5 = -1F;
        float f6 = 1.0F;
        float f7 = -0.5F;
        float f8 = -field_1356_a.field_178_g.rotationYaw / 64F;
        float f9 = field_1356_a.field_178_g.rotationPitch / 64F;
        tessellator.func_977_b();
        tessellator.func_983_a(f3, f5, f7, f2 + f8, f2 + f9);
        tessellator.func_983_a(f4, f5, f7, 0.0F + f8, f2 + f9);
        tessellator.func_983_a(f4, f6, f7, 0.0F + f8, 0.0F + f9);
        tessellator.func_983_a(f3, f6, f7, f2 + f8, 0.0F + f9);
        tessellator.func_982_a();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
    }

    private void func_890_d(float f)
    {
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        float f1 = 1.0F;
        for(int i = 0; i < 2; i++)
        {
            GL11.glPushMatrix();
            int j = Block.fire.field_378_bb + i * 16;
            int k = (j & 0xf) << 4;
            int l = j & 0xf0;
            float f2 = (float)k / 256F;
            float f3 = ((float)k + 15.99F) / 256F;
            float f4 = (float)l / 256F;
            float f5 = ((float)l + 15.99F) / 256F;
            float f6 = (0.0F - f1) / 2.0F;
            float f7 = f6 + f1;
            float f8 = 0.0F - f1 / 2.0F;
            float f9 = f8 + f1;
            float f10 = -0.5F;
            GL11.glTranslatef((float)(-(i * 2 - 1)) * 0.24F, -0.3F, 0.0F);
            GL11.glRotatef((float)(i * 2 - 1) * 10F, 0.0F, 1.0F, 0.0F);
            tessellator.func_977_b();
            tessellator.func_983_a(f6, f8, f10, f3, f5);
            tessellator.func_983_a(f7, f8, f10, f2, f5);
            tessellator.func_983_a(f7, f9, f10, f2, f4);
            tessellator.func_983_a(f6, f9, f10, f3, f4);
            tessellator.func_982_a();
            GL11.glPopMatrix();
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3042);
    }

    public void func_895_a()
    {
        field_1358_d = field_1359_c;
        EntityPlayerSP entityplayersp = field_1356_a.field_178_g;
        ItemStack itemstack = ((EntityPlayer) (entityplayersp)).field_778_b.func_494_a();
        ItemStack itemstack1 = itemstack;
        float f = 0.4F;
        float f1 = itemstack1 != field_1355_b ? 0.0F : 1.0F;
        float f2 = f1 - field_1359_c;
        if(f2 < -f)
        {
            f2 = -f;
        }
        if(f2 > f)
        {
            f2 = f;
        }
        field_1359_c += f2;
        if(field_1359_c < 0.1F)
        {
            field_1355_b = itemstack1;
        }
    }

    public void func_891_b()
    {
        field_1359_c = 0.0F;
    }

    public void func_896_c()
    {
        field_1359_c = 0.0F;
    }

    private Minecraft field_1356_a;
    private ItemStack field_1355_b;
    private float field_1359_c;
    private float field_1358_d;
    private RenderBlocks field_1357_e;
}
