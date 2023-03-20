// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class kd
{

    public kd(fr fr1, String s, ey ey1)
    {
        field_1307_b = new int[256];
        field_1308_a = 0;
        field_1309_d = df.func_1125_c(1024);
        BufferedImage bufferedimage;
        try
        {
            bufferedimage = ImageIO.read((ey.class).getResourceAsStream(s));
        }
        catch(IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        int i = bufferedimage.getWidth();
        int j = bufferedimage.getHeight();
        int ai[] = new int[i * j];
        bufferedimage.getRGB(0, 0, i, j, ai, 0, i);
        for(int k = 0; k < 256; k++)
        {
            int l = k % 16;
            int k1 = k / 16;
            int j2 = 7;
            do
            {
                if(j2 < 0)
                {
                    break;
                }
                int i3 = l * 8 + j2;
                boolean flag = true;
                for(int l3 = 0; l3 < 8 && flag; l3++)
                {
                    int i4 = (k1 * 8 + l3) * i;
                    int k4 = ai[i3 + i4] & 0xff;
                    if(k4 > 0)
                    {
                        flag = false;
                    }
                }

                if(!flag)
                {
                    break;
                }
                j2--;
            } while(true);
            if(k == 32)
            {
                j2 = 2;
            }
            field_1307_b[k] = j2 + 2;
        }

        field_1308_a = ey1.func_1074_a(bufferedimage);
        field_1310_c = df.func_1124_a(288);
        ho ho1 = ho.field_1512_a;
        for(int i1 = 0; i1 < 256; i1++)
        {
            GL11.glNewList(field_1310_c + i1, 4864);
            ho1.func_977_b();
            int l1 = (i1 % 16) * 8;
            int k2 = (i1 / 16) * 8;
            float f = 7.99F;
            float f1 = 0.0F;
            float f2 = 0.0F;
            ho1.func_983_a(0.0D, 0.0F + f, 0.0D, (float)l1 / 128F + f1, ((float)k2 + f) / 128F + f2);
            ho1.func_983_a(0.0F + f, 0.0F + f, 0.0D, ((float)l1 + f) / 128F + f1, ((float)k2 + f) / 128F + f2);
            ho1.func_983_a(0.0F + f, 0.0D, 0.0D, ((float)l1 + f) / 128F + f1, (float)k2 / 128F + f2);
            ho1.func_983_a(0.0D, 0.0D, 0.0D, (float)l1 / 128F + f1, (float)k2 / 128F + f2);
            ho1.func_982_a();
            GL11.glTranslatef(field_1307_b[i1], 0.0F, 0.0F);
            GL11.glEndList();
        }

        for(int j1 = 0; j1 < 32; j1++)
        {
            int i2 = (j1 >> 3 & 1) * 85;
            int l2 = (j1 >> 2 & 1) * 170 + i2;
            int j3 = (j1 >> 1 & 1) * 170 + i2;
            int k3 = (j1 >> 0 & 1) * 170 + i2;
            if(j1 == 6)
            {
                l2 += 85;
            }
            boolean flag1 = j1 >= 16;
            if(fr1.field_1578_g)
            {
                int j4 = (l2 * 30 + j3 * 59 + k3 * 11) / 100;
                int l4 = (l2 * 30 + j3 * 70) / 100;
                int i5 = (l2 * 30 + k3 * 70) / 100;
                l2 = j4;
                j3 = l4;
                k3 = i5;
            }
            if(flag1)
            {
                l2 /= 4;
                j3 /= 4;
                k3 /= 4;
            }
            GL11.glNewList(field_1310_c + 256 + j1, 4864);
            GL11.glColor3f((float)l2 / 255F, (float)j3 / 255F, (float)k3 / 255F);
            GL11.glEndList();
        }

    }

    public void func_874_a(String s, int i, int j, int k)
    {
        func_872_a(s, i + 1, j + 1, k, true);
        func_873_b(s, i, j, k);
    }

    public void func_873_b(String s, int i, int j, int k)
    {
        func_872_a(s, i, j, k, false);
    }

    public void func_872_a(String s, int i, int j, int k, boolean flag)
    {
        if(s == null)
        {
            return;
        }
        if(flag)
        {
            int l = k & 0xff000000;
            k = (k & 0xfcfcfc) >> 2;
            k += l;
        }
        GL11.glBindTexture(3553, field_1308_a);
        float f = (float)(k >> 16 & 0xff) / 255F;
        float f1 = (float)(k >> 8 & 0xff) / 255F;
        float f2 = (float)(k & 0xff) / 255F;
        float f3 = (float)(k >> 24 & 0xff) / 255F;
        if(f3 == 0.0F)
        {
            f3 = 1.0F;
        }
        GL11.glColor4f(f, f1, f2, f3);
        field_1309_d.clear();
        GL11.glPushMatrix();
        GL11.glTranslatef(i, j, 0.0F);
        for(int i1 = 0; i1 < s.length(); i1++)
        {
            for(; s.charAt(i1) == '\247' && s.length() > i1 + 1; i1 += 2)
            {
                int j1 = "0123456789abcdef".indexOf(s.toLowerCase().charAt(i1 + 1));
                if(j1 < 0 || j1 > 15)
                {
                    j1 = 15;
                }
                field_1309_d.put(field_1310_c + 256 + j1 + (flag ? 16 : 0));
                if(field_1309_d.remaining() == 0)
                {
                    field_1309_d.flip();
                    GL11.glCallLists(field_1309_d);
                    field_1309_d.clear();
                }
            }

            int k1 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\307\374\351\342\344\340\345\347\352\353\350\357\356\354\304\305\311\346\306\364\366\362\373\371\377\326\334\370\243\330\327\u0192\341\355\363\372\361\321\252\272\277\256\254\275\274\241\253\273".indexOf(s.charAt(i1));
            if(k1 >= 0)
            {
                field_1309_d.put(field_1310_c + k1 + 32);
            }
            if(field_1309_d.remaining() == 0)
            {
                field_1309_d.flip();
                GL11.glCallLists(field_1309_d);
                field_1309_d.clear();
            }
        }

        field_1309_d.flip();
        GL11.glCallLists(field_1309_d);
        GL11.glPopMatrix();
    }

    public int func_871_a(String s)
    {
        if(s == null)
        {
            return 0;
        }
        int i = 0;
        for(int j = 0; j < s.length(); j++)
        {
            if(s.charAt(j) == '\247')
            {
                j++;
                continue;
            }
            int k = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_'abcdefghijklmnopqrstuvwxyz{|}~\u2302\307\374\351\342\344\340\345\347\352\353\350\357\356\354\304\305\311\346\306\364\366\362\373\371\377\326\334\370\243\330\327\u0192\341\355\363\372\361\321\252\272\277\256\254\275\274\241\253\273".indexOf(s.charAt(j));
            if(k >= 0)
            {
                i += field_1307_b[k + 32];
            }
        }

        return i;
    }

    private int field_1307_b[];
    public int field_1308_a;
    private int field_1310_c;
    private IntBuffer field_1309_d;
}
