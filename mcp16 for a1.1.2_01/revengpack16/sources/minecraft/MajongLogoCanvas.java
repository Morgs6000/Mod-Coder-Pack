// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

class MajongLogoCanvas extends Canvas
{

    public MajongLogoCanvas()
    {
        try
        {
            field_1672_a = ImageIO.read((GuiCrashReport.class).getResource("/gui/logo.png"));
        }
        catch(IOException ioexception) { }
        byte byte0 = 100;
        setPreferredSize(new Dimension(byte0, byte0));
        setMinimumSize(new Dimension(byte0, byte0));
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawImage(field_1672_a, getWidth() / 2 - field_1672_a.getWidth() / 2, 32, null);
    }

    private BufferedImage field_1672_a;
}
