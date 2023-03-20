// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import org.lwjgl.opengl.GL11;

public class ip
{

    public ip(int i, int j)
    {
        field_1397_n = false;
        field_1396_o = 0;
        field_1404_g = false;
        field_1403_h = true;
        field_1402_i = false;
        field_1399_l = i;
        field_1398_m = j;
    }

    public void func_921_a(float f, float f1, float f2, int i, int j, int k)
    {
        func_923_a(f, f1, f2, i, j, k, 0.0F);
    }

    public void func_923_a(float f, float f1, float f2, int i, int j, int k, float f3)
    {
        field_1401_j = new ed[8];
        field_1400_k = new ll[6];
        float f4 = f + (float)i;
        float f5 = f1 + (float)j;
        float f6 = f2 + (float)k;
        f -= f3;
        f1 -= f3;
        f2 -= f3;
        f4 += f3;
        f5 += f3;
        f6 += f3;
        if(field_1404_g)
        {
            float f7 = f4;
            f4 = f;
            f = f7;
        }
        ed ed1 = new ed(f, f1, f2, 0.0F, 0.0F);
        ed ed2 = new ed(f4, f1, f2, 0.0F, 8F);
        ed ed3 = new ed(f4, f5, f2, 8F, 8F);
        ed ed4 = new ed(f, f5, f2, 8F, 0.0F);
        ed ed5 = new ed(f, f1, f6, 0.0F, 0.0F);
        ed ed6 = new ed(f4, f1, f6, 0.0F, 8F);
        ed ed7 = new ed(f4, f5, f6, 8F, 8F);
        ed ed8 = new ed(f, f5, f6, 8F, 0.0F);
        field_1401_j[0] = ed1;
        field_1401_j[1] = ed2;
        field_1401_j[2] = ed3;
        field_1401_j[3] = ed4;
        field_1401_j[4] = ed5;
        field_1401_j[5] = ed6;
        field_1401_j[6] = ed7;
        field_1401_j[7] = ed8;
        field_1400_k[0] = new ll(new ed[] {
            ed6, ed2, ed3, ed7
        }, field_1399_l + k + i, field_1398_m + k, field_1399_l + k + i + k, field_1398_m + k + j);
        field_1400_k[1] = new ll(new ed[] {
            ed1, ed5, ed8, ed4
        }, field_1399_l + 0, field_1398_m + k, field_1399_l + k, field_1398_m + k + j);
        field_1400_k[2] = new ll(new ed[] {
            ed6, ed5, ed1, ed2
        }, field_1399_l + k, field_1398_m + 0, field_1399_l + k + i, field_1398_m + k);
        field_1400_k[3] = new ll(new ed[] {
            ed3, ed4, ed8, ed7
        }, field_1399_l + k + i, field_1398_m + 0, field_1399_l + k + i + i, field_1398_m + k);
        field_1400_k[4] = new ll(new ed[] {
            ed2, ed1, ed4, ed3
        }, field_1399_l + k, field_1398_m + k, field_1399_l + k + i, field_1398_m + k + j);
        field_1400_k[5] = new ll(new ed[] {
            ed5, ed6, ed7, ed8
        }, field_1399_l + k + i + k, field_1398_m + k, field_1399_l + k + i + k + i, field_1398_m + k + j);
        if(field_1404_g)
        {
            for(int l = 0; l < field_1400_k.length; l++)
            {
                field_1400_k[l].func_809_a();
            }

        }
    }

    public void func_925_a(float f, float f1, float f2)
    {
        field_1410_a = f;
        field_1409_b = f1;
        field_1408_c = f2;
    }

    public void func_922_a(float f)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!field_1397_n)
        {
            func_924_c(f);
        }
        if(field_1407_d != 0.0F || field_1406_e != 0.0F || field_1405_f != 0.0F)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(field_1410_a * f, field_1409_b * f, field_1408_c * f);
            if(field_1405_f != 0.0F)
            {
                GL11.glRotatef(field_1405_f * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(field_1406_e != 0.0F)
            {
                GL11.glRotatef(field_1406_e * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(field_1407_d != 0.0F)
            {
                GL11.glRotatef(field_1407_d * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
            GL11.glCallList(field_1396_o);
            GL11.glPopMatrix();
        } else
        if(field_1410_a != 0.0F || field_1409_b != 0.0F || field_1408_c != 0.0F)
        {
            GL11.glTranslatef(field_1410_a * f, field_1409_b * f, field_1408_c * f);
            GL11.glCallList(field_1396_o);
            GL11.glTranslatef(-field_1410_a * f, -field_1409_b * f, -field_1408_c * f);
        } else
        {
            GL11.glCallList(field_1396_o);
        }
    }

    public void func_926_b(float f)
    {
        if(field_1402_i)
        {
            return;
        }
        if(!field_1403_h)
        {
            return;
        }
        if(!field_1397_n)
        {
            func_924_c(f);
        }
        if(field_1407_d != 0.0F || field_1406_e != 0.0F || field_1405_f != 0.0F)
        {
            GL11.glTranslatef(field_1410_a * f, field_1409_b * f, field_1408_c * f);
            if(field_1405_f != 0.0F)
            {
                GL11.glRotatef(field_1405_f * 57.29578F, 0.0F, 0.0F, 1.0F);
            }
            if(field_1406_e != 0.0F)
            {
                GL11.glRotatef(field_1406_e * 57.29578F, 0.0F, 1.0F, 0.0F);
            }
            if(field_1407_d != 0.0F)
            {
                GL11.glRotatef(field_1407_d * 57.29578F, 1.0F, 0.0F, 0.0F);
            }
        } else
        if(field_1410_a != 0.0F || field_1409_b != 0.0F || field_1408_c != 0.0F)
        {
            GL11.glTranslatef(field_1410_a * f, field_1409_b * f, field_1408_c * f);
        }
    }

    private void func_924_c(float f)
    {
        field_1396_o = df.func_1124_a(1);
        GL11.glNewList(field_1396_o, 4864);
        ho ho1 = ho.field_1512_a;
        for(int i = 0; i < field_1400_k.length; i++)
        {
            field_1400_k[i].func_808_a(ho1, f);
        }

        GL11.glEndList();
        field_1397_n = true;
    }

    private ed field_1401_j[];
    private ll field_1400_k[];
    private int field_1399_l;
    private int field_1398_m;
    public float field_1410_a;
    public float field_1409_b;
    public float field_1408_c;
    public float field_1407_d;
    public float field_1406_e;
    public float field_1405_f;
    private boolean field_1397_n;
    private int field_1396_o;
    public boolean field_1404_g;
    public boolean field_1403_h;
    public boolean field_1402_i;
}
