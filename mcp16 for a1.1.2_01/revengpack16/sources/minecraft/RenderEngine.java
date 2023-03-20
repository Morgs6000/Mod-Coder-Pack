// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.imageio.ImageIO;
import org.lwjgl.opengl.GL11;

public class RenderEngine
{

    public RenderEngine(GameSettings gamesettings)
    {
        textureMap = new HashMap();
        field_1607_c = new HashMap();
        field_1606_d = GLAllocation.func_1125_c(1);
        field_1605_e = GLAllocation.func_1127_b(0x100000);
        field_1604_f = new ArrayList();
        field_1603_g = new HashMap();
        field_1601_i = false;
        field_1602_h = gamesettings;
    }

    public int func_1070_a(String s)
    {
        Integer integer = (Integer)textureMap.get(s);
        if(integer != null)
        {
            return integer.intValue();
        }
        try
        {
            field_1606_d.clear();
            GLAllocation.func_1128_a(field_1606_d);
            int i = field_1606_d.get(0);
            if(s.startsWith("##"))
            {
                func_1068_a(func_1069_b(ImageIO.read((RenderEngine.class).getResourceAsStream(s.substring(2)))), i);
            } else
            if(s.startsWith("%%"))
            {
                field_1601_i = true;
                func_1068_a(ImageIO.read((RenderEngine.class).getResourceAsStream(s.substring(2))), i);
                field_1601_i = false;
            } else
            {
                func_1068_a(ImageIO.read((RenderEngine.class).getResourceAsStream(s)), i);
            }
            textureMap.put(s, Integer.valueOf(i));
            return i;
        }
        catch(IOException ioexception)
        {
            throw new RuntimeException("!!");
        }
    }

    private BufferedImage func_1069_b(BufferedImage bufferedimage)
    {
        int i = bufferedimage.getWidth() / 16;
        BufferedImage bufferedimage1 = new BufferedImage(16, bufferedimage.getHeight() * i, 2);
        Graphics g = bufferedimage1.getGraphics();
        for(int j = 0; j < i; j++)
        {
            g.drawImage(bufferedimage, -j * 16, j * bufferedimage.getHeight(), null);
        }

        g.dispose();
        return bufferedimage1;
    }

    public int func_1074_a(BufferedImage bufferedimage)
    {
        field_1606_d.clear();
        GLAllocation.func_1128_a(field_1606_d);
        int i = field_1606_d.get(0);
        func_1068_a(bufferedimage, i);
        field_1607_c.put(Integer.valueOf(i), bufferedimage);
        return i;
    }

    public void func_1068_a(BufferedImage bufferedimage, int i)
    {
        GL11.glBindTexture(3553, i);
        if(field_1609_a)
        {
            GL11.glTexParameteri(3553, 10241, 9987);
            GL11.glTexParameteri(3553, 10240, 9729);
        } else
        {
            GL11.glTexParameteri(3553, 10241, 9728);
            GL11.glTexParameteri(3553, 10240, 9728);
        }
        if(field_1601_i)
        {
            GL11.glTexParameteri(3553, 10242, 10496);
            GL11.glTexParameteri(3553, 10243, 10496);
        } else
        {
            GL11.glTexParameteri(3553, 10242, 10497);
            GL11.glTexParameteri(3553, 10243, 10497);
        }
        int j = bufferedimage.getWidth();
        int k = bufferedimage.getHeight();
        int ai[] = new int[j * k];
        byte abyte0[] = new byte[j * k * 4];
        bufferedimage.getRGB(0, 0, j, k, ai, 0, j);
        for(int l = 0; l < ai.length; l++)
        {
            int j1 = ai[l] >> 24 & 0xff;
            int l1 = ai[l] >> 16 & 0xff;
            int j2 = ai[l] >> 8 & 0xff;
            int l2 = ai[l] & 0xff;
            if(field_1602_h != null && field_1602_h.anaglyph)
            {
                int j3 = (l1 * 30 + j2 * 59 + l2 * 11) / 100;
                int l3 = (l1 * 30 + j2 * 70) / 100;
                int j4 = (l1 * 30 + l2 * 70) / 100;
                l1 = j3;
                j2 = l3;
                l2 = j4;
            }
            abyte0[l * 4 + 0] = (byte)l1;
            abyte0[l * 4 + 1] = (byte)j2;
            abyte0[l * 4 + 2] = (byte)l2;
            abyte0[l * 4 + 3] = (byte)j1;
        }

        field_1605_e.clear();
        field_1605_e.put(abyte0);
        field_1605_e.position(0).limit(abyte0.length);
        GL11.glTexImage2D(3553, 0, 6408, j, k, 0, 6408, 5121, field_1605_e);
        if(field_1609_a)
        {
            for(int i1 = 1; i1 <= 4; i1++)
            {
                int k1 = j >> i1 - 1;
                int i2 = j >> i1;
                int k2 = k >> i1;
                for(int i3 = 0; i3 < i2; i3++)
                {
                    for(int k3 = 0; k3 < k2; k3++)
                    {
                        int i4 = field_1605_e.getInt((i3 * 2 + 0 + (k3 * 2 + 0) * k1) * 4);
                        int k4 = field_1605_e.getInt((i3 * 2 + 1 + (k3 * 2 + 0) * k1) * 4);
                        int l4 = field_1605_e.getInt((i3 * 2 + 1 + (k3 * 2 + 1) * k1) * 4);
                        int i5 = field_1605_e.getInt((i3 * 2 + 0 + (k3 * 2 + 1) * k1) * 4);
                        int j5 = func_1077_b(func_1077_b(i4, k4), func_1077_b(l4, i5));
                        field_1605_e.putInt((i3 + k3 * i2) * 4, j5);
                    }

                }

                GL11.glTexImage2D(3553, i1, 6408, i2, k2, 0, 6408, 5121, field_1605_e);
            }

        }
    }

    public void func_1078_a(int i)
    {
        field_1607_c.remove(Integer.valueOf(i));
        field_1606_d.clear();
        field_1606_d.put(i);
        field_1606_d.flip();
        GL11.glDeleteTextures(field_1606_d);
    }

    public int func_1071_a(String s, String s1)
    {
        DownloadImageThreadData downloadimagethreaddata = (DownloadImageThreadData)field_1603_g.get(s);
        if(downloadimagethreaddata != null && downloadimagethreaddata.field_1706_a != null && !downloadimagethreaddata.field_1707_d)
        {
            if(downloadimagethreaddata.field_1708_c < 0)
            {
                downloadimagethreaddata.field_1708_c = func_1074_a(downloadimagethreaddata.field_1706_a);
            } else
            {
                func_1068_a(downloadimagethreaddata.field_1706_a, downloadimagethreaddata.field_1708_c);
            }
            downloadimagethreaddata.field_1707_d = true;
        }
        if(downloadimagethreaddata == null || downloadimagethreaddata.field_1708_c < 0)
        {
            return func_1070_a(s1);
        } else
        {
            return downloadimagethreaddata.field_1708_c;
        }
    }

    public DownloadImageThreadData func_1075_a(String s, ImageBuffer imagebuffer)
    {
        DownloadImageThreadData downloadimagethreaddata = (DownloadImageThreadData)field_1603_g.get(s);
        if(downloadimagethreaddata == null)
        {
            field_1603_g.put(s, new DownloadImageThreadData(s, imagebuffer));
        } else
        {
            downloadimagethreaddata.field_1705_b++;
        }
        return downloadimagethreaddata;
    }

    public void func_1073_b(String s)
    {
        DownloadImageThreadData downloadimagethreaddata = (DownloadImageThreadData)field_1603_g.get(s);
        if(downloadimagethreaddata != null)
        {
            downloadimagethreaddata.field_1705_b--;
            if(downloadimagethreaddata.field_1705_b == 0)
            {
                if(downloadimagethreaddata.field_1708_c >= 0)
                {
                    func_1078_a(downloadimagethreaddata.field_1708_c);
                }
                field_1603_g.remove(s);
            }
        }
    }

    public void func_1066_a(TextureFX texturefx)
    {
        field_1604_f.add(texturefx);
        texturefx.func_783_a();
    }

    public void func_1067_a()
    {
        for(int i = 0; i < field_1604_f.size(); i++)
        {
            TextureFX texturefx = (TextureFX)field_1604_f.get(i);
            texturefx.field_1131_c = field_1602_h.anaglyph;
            texturefx.func_783_a();
            field_1605_e.clear();
            field_1605_e.put(texturefx.field_1127_a);
            field_1605_e.position(0).limit(texturefx.field_1127_a.length);
            texturefx.func_782_a(this);
            for(int k = 0; k < texturefx.field_1129_e; k++)
            {
label0:
                for(int i1 = 0; i1 < texturefx.field_1129_e; i1++)
                {
                    GL11.glTexSubImage2D(3553, 0, (texturefx.field_1126_b % 16) * 16 + k * 16, (texturefx.field_1126_b / 16) * 16 + i1 * 16, 16, 16, 6408, 5121, field_1605_e);
                    if(!field_1609_a)
                    {
                        continue;
                    }
                    int k1 = 1;
                    do
                    {
                        if(k1 > 4)
                        {
                            continue label0;
                        }
                        int i2 = 16 >> k1 - 1;
                        int k2 = 16 >> k1;
                        for(int i3 = 0; i3 < k2; i3++)
                        {
                            for(int k3 = 0; k3 < k2; k3++)
                            {
                                int i4 = field_1605_e.getInt((i3 * 2 + 0 + (k3 * 2 + 0) * i2) * 4);
                                int k4 = field_1605_e.getInt((i3 * 2 + 1 + (k3 * 2 + 0) * i2) * 4);
                                int i5 = field_1605_e.getInt((i3 * 2 + 1 + (k3 * 2 + 1) * i2) * 4);
                                int k5 = field_1605_e.getInt((i3 * 2 + 0 + (k3 * 2 + 1) * i2) * 4);
                                int l5 = func_1072_a(func_1072_a(i4, k4), func_1072_a(i5, k5));
                                field_1605_e.putInt((i3 + k3 * k2) * 4, l5);
                            }

                        }

                        GL11.glTexSubImage2D(3553, k1, (texturefx.field_1126_b % 16) * k2, (texturefx.field_1126_b / 16) * k2, k2, k2, 6408, 5121, field_1605_e);
                        k1++;
                    } while(true);
                }

            }

        }

label1:
        for(int j = 0; j < field_1604_f.size(); j++)
        {
            TextureFX texturefx1 = (TextureFX)field_1604_f.get(j);
            if(texturefx1.field_1130_d <= 0)
            {
                continue;
            }
            field_1605_e.clear();
            field_1605_e.put(texturefx1.field_1127_a);
            field_1605_e.position(0).limit(texturefx1.field_1127_a.length);
            GL11.glBindTexture(3553, texturefx1.field_1130_d);
            GL11.glTexSubImage2D(3553, 0, 0, 0, 16, 16, 6408, 5121, field_1605_e);
            if(!field_1609_a)
            {
                continue;
            }
            int l = 1;
            do
            {
                if(l > 4)
                {
                    continue label1;
                }
                int j1 = 16 >> l - 1;
                int l1 = 16 >> l;
                for(int j2 = 0; j2 < l1; j2++)
                {
                    for(int l2 = 0; l2 < l1; l2++)
                    {
                        int j3 = field_1605_e.getInt((j2 * 2 + 0 + (l2 * 2 + 0) * j1) * 4);
                        int l3 = field_1605_e.getInt((j2 * 2 + 1 + (l2 * 2 + 0) * j1) * 4);
                        int j4 = field_1605_e.getInt((j2 * 2 + 1 + (l2 * 2 + 1) * j1) * 4);
                        int l4 = field_1605_e.getInt((j2 * 2 + 0 + (l2 * 2 + 1) * j1) * 4);
                        int j5 = func_1072_a(func_1072_a(j3, l3), func_1072_a(j4, l4));
                        field_1605_e.putInt((j2 + l2 * l1) * 4, j5);
                    }

                }

                GL11.glTexSubImage2D(3553, l, 0, 0, l1, l1, 6408, 5121, field_1605_e);
                l++;
            } while(true);
        }

    }

    private int func_1072_a(int i, int j)
    {
        int k = (i & 0xff000000) >> 24 & 0xff;
        int l = (j & 0xff000000) >> 24 & 0xff;
        return ((k + l >> 1) << 24) + ((i & 0xfefefe) + (j & 0xfefefe) >> 1);
    }

    private int func_1077_b(int i, int j)
    {
        int k = (i & 0xff000000) >> 24 & 0xff;
        int l = (j & 0xff000000) >> 24 & 0xff;
        char c = '\377';
        if(k + l == 0)
        {
            k = 1;
            l = 1;
            c = '\0';
        }
        int i1 = (i >> 16 & 0xff) * k;
        int j1 = (i >> 8 & 0xff) * k;
        int k1 = (i & 0xff) * k;
        int l1 = (j >> 16 & 0xff) * l;
        int i2 = (j >> 8 & 0xff) * l;
        int j2 = (j & 0xff) * l;
        int k2 = (i1 + l1) / (k + l);
        int l2 = (j1 + i2) / (k + l);
        int i3 = (k1 + j2) / (k + l);
        return c << 24 | k2 << 16 | l2 << 8 | i3;
    }

    public void func_1065_b()
    {
        int i;
        BufferedImage bufferedimage;
        for(Iterator iterator = field_1607_c.keySet().iterator(); iterator.hasNext(); func_1068_a(bufferedimage, i))
        {
            i = ((Integer)iterator.next()).intValue();
            bufferedimage = (BufferedImage)field_1607_c.get(Integer.valueOf(i));
        }

        for(Iterator iterator1 = field_1603_g.values().iterator(); iterator1.hasNext();)
        {
            DownloadImageThreadData downloadimagethreaddata = (DownloadImageThreadData)iterator1.next();
            downloadimagethreaddata.field_1707_d = false;
        }

        for(Iterator iterator2 = textureMap.keySet().iterator(); iterator2.hasNext();)
        {
            String s = (String)iterator2.next();
            try
            {
                BufferedImage bufferedimage1;
                if(s.startsWith("##"))
                {
                    bufferedimage1 = func_1069_b(ImageIO.read((RenderEngine.class).getResourceAsStream(s.substring(2))));
                } else
                if(s.startsWith("%%"))
                {
                    field_1601_i = true;
                    bufferedimage1 = ImageIO.read((RenderEngine.class).getResourceAsStream(s.substring(2)));
                    field_1601_i = false;
                } else
                {
                    bufferedimage1 = ImageIO.read((RenderEngine.class).getResourceAsStream(s));
                }
                int j = ((Integer)textureMap.get(s)).intValue();
                func_1068_a(bufferedimage1, j);
            }
            catch(IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }

    }

    public void func_1076_b(int i)
    {
        if(i < 0)
        {
            return;
        } else
        {
            GL11.glBindTexture(3553, i);
            return;
        }
    }

    public static boolean field_1609_a = false;
    private HashMap textureMap;
    private HashMap field_1607_c;
    private IntBuffer field_1606_d;
    private ByteBuffer field_1605_e;
    private java.util.List field_1604_f;
    private Map field_1603_g;
    private GameSettings field_1602_h;
    private boolean field_1601_i;

}
