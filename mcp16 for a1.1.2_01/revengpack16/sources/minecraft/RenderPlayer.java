// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class RenderPlayer extends RenderLiving
{

    public RenderPlayer()
    {
        super(new ModelBiped(0.0F), 0.5F);
        field_209_f = (ModelBiped)field_203_d;
        field_208_g = new ModelBiped(1.0F);
        field_207_h = new ModelBiped(0.5F);
    }

    protected boolean func_187_a(EntityPlayer entityplayer, int i)
    {
        ItemStack itemstack = entityplayer.field_778_b.func_492_d(3 - i);
        if(itemstack != null)
        {
            Item item = itemstack.func_1091_a();
            if(item instanceof ItemArmor)
            {
                ItemArmor itemarmor = (ItemArmor)item;
                func_151_a((new StringBuilder()).append("/armor/").append(field_206_i[itemarmor.field_311_aZ]).append("_").append(i != 2 ? 1 : 2).append(".png").toString());
                ModelBiped modelbiped = i != 2 ? field_208_g : field_207_h;
                modelbiped.field_1286_a.field_1403_h = i == 0;
                modelbiped.field_1285_b.field_1403_h = i == 0;
                modelbiped.field_1284_c.field_1403_h = i == 1 || i == 2;
                modelbiped.field_1283_d.field_1403_h = i == 1;
                modelbiped.field_1282_e.field_1403_h = i == 1;
                modelbiped.field_1281_f.field_1403_h = i == 2 || i == 3;
                modelbiped.field_1280_g.field_1403_h = i == 2 || i == 3;
                func_169_a(modelbiped);
                return true;
            }
        }
        return false;
    }

    public void func_188_a(EntityPlayer entityplayer, double d, double d1, double d2, 
            float f, float f1)
    {
        ItemStack itemstack = entityplayer.field_778_b.func_494_a();
        field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = itemstack != null;
        field_208_g.field_1277_j = field_207_h.field_1277_j = field_209_f.field_1277_j = entityplayer.func_381_o();
        super.func_171_a(entityplayer, d, d1 - (double)entityplayer.field_645_aB, d2, f, f1);
        field_208_g.field_1277_j = field_207_h.field_1277_j = field_209_f.field_1277_j = false;
        field_208_g.field_1278_i = field_207_h.field_1278_i = field_209_f.field_1278_i = false;
        FontRenderer fontrenderer = func_143_a();
        float f2 = 1.6F;
        float f3 = 0.01666667F * f2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d + 0.0F, (float)d1 + 2.3F, (float)d2);
        GL11.glNormal3f(0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-field_191_a.field_1225_i, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(field_191_a.field_1224_j, 1.0F, 0.0F, 0.0F);
        float f4 = entityplayer.func_379_d(field_191_a.field_1226_h);
        f3 = (float)((double)f3 * (Math.sqrt(f4) / 2D));
        GL11.glScalef(-f3, -f3, f3);
        String s = entityplayer.field_771_i;
        GL11.glDisable(2896);
        GL11.glDepthMask(false);
        GL11.glDisable(2929);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        Tessellator tessellator = Tessellator.field_1512_a;
        GL11.glDisable(3553);
        tessellator.func_977_b();
        int i = fontrenderer.func_871_a(s) / 2;
        tessellator.func_986_a(0.0F, 0.0F, 0.0F, 0.25F);
        tessellator.func_991_a(-i - 1, -1D, 0.0D);
        tessellator.func_991_a(-i - 1, 8D, 0.0D);
        tessellator.func_991_a(i + 1, 8D, 0.0D);
        tessellator.func_991_a(i + 1, -1D, 0.0D);
        tessellator.func_982_a();
        GL11.glEnable(3553);
        fontrenderer.func_873_b(s, -fontrenderer.func_871_a(s) / 2, 0, 0x20ffffff);
        GL11.glEnable(2929);
        GL11.glDepthMask(true);
        fontrenderer.func_873_b(s, -fontrenderer.func_871_a(s) / 2, 0, -1);
        GL11.glEnable(2896);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glPopMatrix();
    }

    protected void func_189_a(EntityPlayer entityplayer, float f)
    {
        ItemStack itemstack = entityplayer.field_778_b.func_494_a();
        if(itemstack != null)
        {
            GL11.glPushMatrix();
            field_209_f.field_1283_d.func_926_b(0.0625F);
            GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
            if(itemstack.itemID < 256 && RenderBlocks.func_1219_a(Block.allBlocks[itemstack.itemID].func_210_f()))
            {
                float f1 = 0.5F;
                GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
                f1 *= 0.75F;
                GL11.glRotatef(20F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
                GL11.glScalef(f1, -f1, f1);
            } else
            if(Item.itemsList[itemstack.itemID].func_194_a())
            {
                float f2 = 0.625F;
                GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
                GL11.glScalef(f2, -f2, f2);
                GL11.glRotatef(-100F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(45F, 0.0F, 1.0F, 0.0F);
            } else
            {
                float f3 = 0.375F;
                GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
                GL11.glScalef(f3, f3, f3);
                GL11.glRotatef(60F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(20F, 0.0F, 0.0F, 1.0F);
            }
            field_191_a.field_1228_f.func_897_a(itemstack);
            GL11.glPopMatrix();
        }
    }

    protected void func_186_b(EntityPlayer entityplayer, float f)
    {
        float f1 = 0.9375F;
        GL11.glScalef(f1, f1, f1);
    }

    public void func_185_b()
    {
        field_209_f.field_1244_k = 0.0F;
        field_209_f.func_863_a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        field_209_f.field_1283_d.func_922_a(0.0625F);
    }

    protected void func_168_a(EntityLiving entityliving, float f)
    {
        func_186_b((EntityPlayer)entityliving, f);
    }

    protected boolean func_166_a(EntityLiving entityliving, int i)
    {
        return func_187_a((EntityPlayer)entityliving, i);
    }

    protected void func_174_b(EntityLiving entityliving, float f)
    {
        func_189_a((EntityPlayer)entityliving, f);
    }

    public void func_171_a(EntityLiving entityliving, double d, double d1, double d2, 
            float f, float f1)
    {
        func_188_a((EntityPlayer)entityliving, d, d1, d2, f, f1);
    }

    public void func_147_a(Entity entity, double d, double d1, double d2, 
            float f, float f1)
    {
        func_188_a((EntityPlayer)entity, d, d1, d2, f, f1);
    }

    private ModelBiped field_209_f;
    private ModelBiped field_208_g;
    private ModelBiped field_207_h;
    private static final String field_206_i[] = {
        "cloth", "chain", "iron", "diamond", "gold"
    };

}
