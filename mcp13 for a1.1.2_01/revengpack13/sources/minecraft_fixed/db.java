// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

class db extends java.awt.Canvas
{

    private java.awt.image.BufferedImage a;

    public db()
    {
        try
        {
            a = javax.imageio.ImageIO.read(aq.class.getResource("/gui/logo.png"));
        }
        catch(java.io.IOException ioexception) { }
        byte byte0 = 100;
        setPreferredSize(new Dimension(((int) (byte0)), ((int) (byte0))));
        setMinimumSize(new Dimension(((int) (byte0)), ((int) (byte0))));
    }

    public void paint(java.awt.Graphics g)
    {
        super.paint(g);
        g.drawImage(((java.awt.Image) (a)), getWidth() / 2 - a.getWidth() / 2, 32, ((java.awt.image.ImageObserver) (null)));
    }
}
