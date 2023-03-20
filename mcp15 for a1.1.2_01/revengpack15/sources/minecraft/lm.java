// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class lm
{

    public lm()
    {
        field_923_k = 0.0F;
    }

    protected void func_551_a(int i, int j, int k, int l, int i1)
    {
        float f = (float)(i1 >> 24 & 0xff) / 255F;
        float f1 = (float)(i1 >> 16 & 0xff) / 255F;
        float f2 = (float)(i1 >> 8 & 0xff) / 255F;
        float f3 = (float)(i1 & 0xff) / 255F;
        ho ho1 = ho.field_1512_a;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(f1, f2, f3, f);
        ho1.func_977_b();
        ho1.func_991_a(i, l, 0.0D);
        ho1.func_991_a(k, l, 0.0D);
        ho1.func_991_a(k, j, 0.0D);
        ho1.func_991_a(i, j, 0.0D);
        ho1.func_982_a();
        GL11.glEnable(3553);
        GL11.glDisable(3042);
    }

    protected void func_549_a(int i, int j, int k, int l, int i1, int j1)
    {
        float f = (float)(i1 >> 24 & 0xff) / 255F;
        float f1 = (float)(i1 >> 16 & 0xff) / 255F;
        float f2 = (float)(i1 >> 8 & 0xff) / 255F;
        float f3 = (float)(i1 & 0xff) / 255F;
        float f4 = (float)(j1 >> 24 & 0xff) / 255F;
        float f5 = (float)(j1 >> 16 & 0xff) / 255F;
        float f6 = (float)(j1 >> 8 & 0xff) / 255F;
        float f7 = (float)(j1 & 0xff) / 255F;
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glDisable(3008);
        GL11.glBlendFunc(770, 771);
        GL11.glShadeModel(7425);
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        ho1.func_986_a(f1, f2, f3, f);
        ho1.func_991_a(k, j, 0.0D);
        ho1.func_991_a(i, j, 0.0D);
        ho1.func_986_a(f5, f6, f7, f4);
        ho1.func_991_a(i, l, 0.0D);
        ho1.func_991_a(k, l, 0.0D);
        ho1.func_982_a();
        GL11.glShadeModel(7424);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glEnable(3553);
    }

    public void func_548_a(kd kd1, String s, int i, int j, int k)
    {
        kd1.func_874_a(s, i - kd1.func_871_a(s) / 2, j, k);
    }

    public void func_547_b(kd kd1, String s, int i, int j, int k)
    {
        kd1.func_874_a(s, i, j, k);
    }

    public void func_550_b(int i, int j, int k, int l, int i1, int j1)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        ho ho1 = ho.field_1512_a;
        ho1.func_977_b();
        ho1.func_983_a(i + 0, j + j1, field_923_k, (float)(k + 0) * f, (float)(l + j1) * f1);
        ho1.func_983_a(i + i1, j + j1, field_923_k, (float)(k + i1) * f, (float)(l + j1) * f1);
        ho1.func_983_a(i + i1, j + 0, field_923_k, (float)(k + i1) * f, (float)(l + 0) * f1);
        ho1.func_983_a(i + 0, j + 0, field_923_k, (float)(k + 0) * f, (float)(l + 0) * f1);
        ho1.func_982_a();
    }

    protected float field_923_k;
}
