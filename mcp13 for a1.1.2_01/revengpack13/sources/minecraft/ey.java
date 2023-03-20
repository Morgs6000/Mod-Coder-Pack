// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

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

public class ey
{

    public static boolean a = false;
    private java.util.HashMap b;
    private java.util.HashMap c;
    private java.nio.IntBuffer d;
    private java.nio.ByteBuffer e;
    private java.util.List f;
    private java.util.Map g;
    private fr h;
    private boolean i;

    public ey(fr fr1)
    {
        b = new HashMap();
        c = new HashMap();
        d = df.c(1);
        e = df.b(0x100000);
        f = ((java.util.List) (new ArrayList()));
        g = ((java.util.Map) (new HashMap()));
        i = false;
        h = fr1;
    }

    public int a(java.lang.String s)
    {
        java.lang.Integer integer = (java.lang.Integer)b.get(((java.lang.Object) (s)));
        if(integer != null)
            return integer.intValue();
        try
        {
            d.clear();
            df.a(d);
            int j = d.get(0);
            if(s.startsWith("##"))
                a(b(javax.imageio.ImageIO.read(ey.class.getResourceAsStream(s.substring(2)))), j);
            else
            if(s.startsWith("%%"))
            {
                i = true;
                a(javax.imageio.ImageIO.read(ey.class.getResourceAsStream(s.substring(2))), j);
                i = false;
            } else
            {
                a(javax.imageio.ImageIO.read(ey.class.getResourceAsStream(s)), j);
            }
            b.put(((java.lang.Object) (s)), ((java.lang.Object) (java.lang.Integer.valueOf(j))));
            return j;
        }
        catch(java.io.IOException ioexception)
        {
            throw new RuntimeException("!!");
        }
    }

    private java.awt.image.BufferedImage b(java.awt.image.BufferedImage bufferedimage)
    {
        int j = bufferedimage.getWidth() / 16;
        java.awt.image.BufferedImage bufferedimage1 = new BufferedImage(16, bufferedimage.getHeight() * j, 2);
        java.awt.Graphics g1 = bufferedimage1.getGraphics();
        for(int k = 0; k < j; k++)
            g1.drawImage(((java.awt.Image) (bufferedimage)), -k * 16, k * bufferedimage.getHeight(), ((java.awt.image.ImageObserver) (null)));

        g1.dispose();
        return bufferedimage1;
    }

    public int a(java.awt.image.BufferedImage bufferedimage)
    {
        d.clear();
        df.a(d);
        int j = d.get(0);
        a(bufferedimage, j);
        c.put(((java.lang.Object) (java.lang.Integer.valueOf(j))), ((java.lang.Object) (bufferedimage)));
        return j;
    }

    public void a(java.awt.image.BufferedImage bufferedimage, int j)
    {
        org.lwjgl.opengl.GL11.glBindTexture(3553, j);
        if(a)
        {
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10241, 9987);
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10240, 9729);
        } else
        {
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10241, 9728);
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10240, 9728);
        }
        if(i)
        {
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10242, 10496);
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10243, 10496);
        } else
        {
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10242, 10497);
            org.lwjgl.opengl.GL11.glTexParameteri(3553, 10243, 10497);
        }
        int k = bufferedimage.getWidth();
        int l = bufferedimage.getHeight();
        int ai[] = new int[k * l];
        byte abyte0[] = new byte[k * l * 4];
        bufferedimage.getRGB(0, 0, k, l, ai, 0, k);
        for(int i1 = 0; i1 < ai.length; i1++)
        {
            int k1 = ai[i1] >> 24 & 0xff;
            int i2 = ai[i1] >> 16 & 0xff;
            int k2 = ai[i1] >> 8 & 0xff;
            int i3 = ai[i1] & 0xff;
            if(h != null && h.g)
            {
                int k3 = (i2 * 30 + k2 * 59 + i3 * 11) / 100;
                int i4 = (i2 * 30 + k2 * 70) / 100;
                int k4 = (i2 * 30 + i3 * 70) / 100;
                i2 = k3;
                k2 = i4;
                i3 = k4;
            }
            abyte0[i1 * 4 + 0] = (byte)i2;
            abyte0[i1 * 4 + 1] = (byte)k2;
            abyte0[i1 * 4 + 2] = (byte)i3;
            abyte0[i1 * 4 + 3] = (byte)k1;
        }

        e.clear();
        e.put(abyte0);
        e.position(0).limit(abyte0.length);
        org.lwjgl.opengl.GL11.glTexImage2D(3553, 0, 6408, k, l, 0, 6408, 5121, e);
        if(a)
        {
            for(int j1 = 1; j1 <= 4; j1++)
            {
                int l1 = k >> j1 - 1;
                int j2 = k >> j1;
                int l2 = l >> j1;
                for(int j3 = 0; j3 < j2; j3++)
                {
                    for(int l3 = 0; l3 < l2; l3++)
                    {
                        int j4 = e.getInt((j3 * 2 + 0 + (l3 * 2 + 0) * l1) * 4);
                        int l4 = e.getInt((j3 * 2 + 1 + (l3 * 2 + 0) * l1) * 4);
                        int i5 = e.getInt((j3 * 2 + 1 + (l3 * 2 + 1) * l1) * 4);
                        int j5 = e.getInt((j3 * 2 + 0 + (l3 * 2 + 1) * l1) * 4);
                        int k5 = b(b(j4, l4), b(i5, j5));
                        e.putInt((j3 + l3 * j2) * 4, k5);
                    }

                }

                org.lwjgl.opengl.GL11.glTexImage2D(3553, j1, 6408, j2, l2, 0, 6408, 5121, e);
            }

        }
    }

    public void a(int j)
    {
        c.remove(((java.lang.Object) (java.lang.Integer.valueOf(j))));
        d.clear();
        d.put(j);
        d.flip();
        org.lwjgl.opengl.GL11.glDeleteTextures(d);
    }

    public int a(java.lang.String s, java.lang.String s1)
    {
        cc cc1 = (cc)g.get(((java.lang.Object) (s)));
        if(cc1 != null && cc1.a != null && !cc1.d)
        {
            if(cc1.c < 0)
                cc1.c = a(cc1.a);
            else
                a(cc1.a, cc1.c);
            cc1.d = true;
        }
        if(cc1 == null || cc1.c < 0)
            return a(s1);
        else
            return cc1.c;
    }

    public cc a(java.lang.String s, hb hb)
    {
        cc cc1 = (cc)g.get(((java.lang.Object) (s)));
        if(cc1 == null)
            g.put(((java.lang.Object) (s)), ((java.lang.Object) (new cc(s, hb))));
        else
            cc1.b++;
        return cc1;
    }

    public void b(java.lang.String s)
    {
        cc cc1 = (cc)g.get(((java.lang.Object) (s)));
        if(cc1 != null)
        {
            cc1.b--;
            if(cc1.b == 0)
            {
                if(cc1.c >= 0)
                    a(cc1.c);
                g.remove(((java.lang.Object) (s)));
            }
        }
    }

    public void a(z z1)
    {
        f.add(((java.lang.Object) (z1)));
        z1.a();
    }

    public void a()
    {
        for(int j = 0; j < f.size(); j++)
        {
            z z1 = (z)f.get(j);
            z1.c = h.g;
            z1.a();
            e.clear();
            e.put(z1.a);
            e.position(0).limit(z1.a.length);
            z1.a(this);
            for(int l = 0; l < z1.e; l++)
            {
label0:
                for(int j1 = 0; j1 < z1.e; j1++)
                {
                    org.lwjgl.opengl.GL11.glTexSubImage2D(3553, 0, (z1.b % 16) * 16 + l * 16, (z1.b / 16) * 16 + j1 * 16, 16, 16, 6408, 5121, e);
                    if(!a)
                        continue;
                    int l1 = 1;
                    do
                    {
                        if(l1 > 4)
                            continue label0;
                        int j2 = 16 >> l1 - 1;
                        int l2 = 16 >> l1;
                        for(int j3 = 0; j3 < l2; j3++)
                        {
                            for(int l3 = 0; l3 < l2; l3++)
                            {
                                int j4 = e.getInt((j3 * 2 + 0 + (l3 * 2 + 0) * j2) * 4);
                                int l4 = e.getInt((j3 * 2 + 1 + (l3 * 2 + 0) * j2) * 4);
                                int j5 = e.getInt((j3 * 2 + 1 + (l3 * 2 + 1) * j2) * 4);
                                int l5 = e.getInt((j3 * 2 + 0 + (l3 * 2 + 1) * j2) * 4);
                                int i6 = a(a(j4, l4), a(j5, l5));
                                e.putInt((j3 + l3 * l2) * 4, i6);
                            }

                        }

                        org.lwjgl.opengl.GL11.glTexSubImage2D(3553, l1, (z1.b % 16) * l2, (z1.b / 16) * l2, l2, l2, 6408, 5121, e);
                        l1++;
                    } while(true);
                }

            }

        }

label1:
        for(int k = 0; k < f.size(); k++)
        {
            z z2 = (z)f.get(k);
            if(z2.d <= 0)
                continue;
            e.clear();
            e.put(z2.a);
            e.position(0).limit(z2.a.length);
            org.lwjgl.opengl.GL11.glBindTexture(3553, z2.d);
            org.lwjgl.opengl.GL11.glTexSubImage2D(3553, 0, 0, 0, 16, 16, 6408, 5121, e);
            if(!a)
                continue;
            int i1 = 1;
            do
            {
                if(i1 > 4)
                    continue label1;
                int k1 = 16 >> i1 - 1;
                int i2 = 16 >> i1;
                for(int k2 = 0; k2 < i2; k2++)
                {
                    for(int i3 = 0; i3 < i2; i3++)
                    {
                        int k3 = e.getInt((k2 * 2 + 0 + (i3 * 2 + 0) * k1) * 4);
                        int i4 = e.getInt((k2 * 2 + 1 + (i3 * 2 + 0) * k1) * 4);
                        int k4 = e.getInt((k2 * 2 + 1 + (i3 * 2 + 1) * k1) * 4);
                        int i5 = e.getInt((k2 * 2 + 0 + (i3 * 2 + 1) * k1) * 4);
                        int k5 = a(a(k3, i4), a(k4, i5));
                        e.putInt((k2 + i3 * i2) * 4, k5);
                    }

                }

                org.lwjgl.opengl.GL11.glTexSubImage2D(3553, i1, 0, 0, i2, i2, 6408, 5121, e);
                i1++;
            } while(true);
        }

    }

    private int a(int j, int k)
    {
        int l = (j & 0xff000000) >> 24 & 0xff;
        int i1 = (k & 0xff000000) >> 24 & 0xff;
        return ((l + i1 >> 1) << 24) + ((j & 0xfefefe) + (k & 0xfefefe) >> 1);
    }

    private int b(int j, int k)
    {
        int l = (j & 0xff000000) >> 24 & 0xff;
        int i1 = (k & 0xff000000) >> 24 & 0xff;
        char c1 = '\377';
        if(l + i1 == 0)
        {
            l = 1;
            i1 = 1;
            c1 = '\0';
        }
        int j1 = (j >> 16 & 0xff) * l;
        int k1 = (j >> 8 & 0xff) * l;
        int l1 = (j & 0xff) * l;
        int i2 = (k >> 16 & 0xff) * i1;
        int j2 = (k >> 8 & 0xff) * i1;
        int k2 = (k & 0xff) * i1;
        int l2 = (j1 + i2) / (l + i1);
        int i3 = (k1 + j2) / (l + i1);
        int j3 = (l1 + k2) / (l + i1);
        return c1 << 24 | l2 << 16 | i3 << 8 | j3;
    }

    public void b()
    {
        int j;
        java.awt.image.BufferedImage bufferedimage;
        for(java.util.Iterator iterator = c.keySet().iterator(); iterator.hasNext(); a(bufferedimage, j))
        {
            j = ((java.lang.Integer)iterator.next()).intValue();
            bufferedimage = (java.awt.image.BufferedImage)c.get(((java.lang.Object) (java.lang.Integer.valueOf(j))));
        }

        for(java.util.Iterator iterator1 = g.values().iterator(); iterator1.hasNext();)
        {
            cc cc1 = (cc)iterator1.next();
            cc1.d = false;
        }

        for(java.util.Iterator iterator2 = b.keySet().iterator(); iterator2.hasNext();)
        {
            java.lang.String s = (java.lang.String)iterator2.next();
            try
            {
                java.awt.image.BufferedImage bufferedimage1;
                if(s.startsWith("##"))
                    bufferedimage1 = b(javax.imageio.ImageIO.read(ey.class.getResourceAsStream(s.substring(2))));
                else
                if(s.startsWith("%%"))
                {
                    i = true;
                    bufferedimage1 = javax.imageio.ImageIO.read(ey.class.getResourceAsStream(s.substring(2)));
                    i = false;
                } else
                {
                    bufferedimage1 = javax.imageio.ImageIO.read(ey.class.getResourceAsStream(s));
                }
                int k = ((java.lang.Integer)b.get(((java.lang.Object) (s)))).intValue();
                a(bufferedimage1, k);
            }
            catch(java.io.IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }

    }

    public void b(int j)
    {
        if(j < 0)
        {
            return;
        } else
        {
            org.lwjgl.opengl.GL11.glBindTexture(3553, j);
            return;
        }
    }

}
