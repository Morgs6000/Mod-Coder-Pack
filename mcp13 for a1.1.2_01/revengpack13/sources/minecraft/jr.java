// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.WritableRaster;

public class jr
    implements hb
{

    private int a[];
    private int b;
    private int c;

    public jr()
    {
    }

    public java.awt.image.BufferedImage a(java.awt.image.BufferedImage bufferedimage)
    {
        if(bufferedimage == null)
            return null;
        b = 64;
        c = 32;
        java.awt.image.BufferedImage bufferedimage1 = new BufferedImage(b, c, 2);
        java.awt.Graphics g = bufferedimage1.getGraphics();
        g.drawImage(((java.awt.Image) (bufferedimage)), 0, 0, ((java.awt.image.ImageObserver) (null)));
        g.dispose();
        a = ((java.awt.image.DataBufferInt)bufferedimage1.getRaster().getDataBuffer()).getData();
        b(0, 0, 32, 16);
        a(32, 0, 64, 32);
        b(0, 16, 64, 32);
        boolean flag = false;
        for(int i = 32; i < 64; i++)
        {
            for(int k = 0; k < 16; k++)
            {
                int i1 = a[i + k * 64];
                if((i1 >> 24 & 0xff) < 128)
                    flag = true;
            }

        }

        if(!flag)
        {
            for(int j = 32; j < 64; j++)
            {
                for(int l = 0; l < 16; l++)
                {
                    int j1 = a[j + l * 64];
                    boolean flag1;
                    if((j1 >> 24 & 0xff) < 128)
                        flag1 = true;
                }

            }

        }
        return bufferedimage1;
    }

    private void a(int i, int j, int k, int l)
    {
        if(c(i, j, k, l))
            return;
        for(int i1 = i; i1 < k; i1++)
        {
            for(int j1 = j; j1 < l; j1++)
                a[i1 + j1 * b] &= 0xffffff;

        }

    }

    private void b(int i, int j, int k, int l)
    {
        for(int i1 = i; i1 < k; i1++)
        {
            for(int j1 = j; j1 < l; j1++)
                a[i1 + j1 * b] |= 0xff000000;

        }

    }

    private boolean c(int i, int j, int k, int l)
    {
        for(int i1 = i; i1 < k; i1++)
        {
            for(int j1 = j; j1 < l; j1++)
            {
                int k1 = a[i1 + j1 * b];
                if((k1 >> 24 & 0xff) < 128)
                    return true;
            }

        }

        return false;
    }
}
