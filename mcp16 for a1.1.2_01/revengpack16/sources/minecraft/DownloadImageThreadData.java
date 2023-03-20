// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.awt.image.BufferedImage;

public class DownloadImageThreadData
{

    public DownloadImageThreadData(String s, ImageBuffer imagebuffer)
    {
        field_1705_b = 1;
        field_1708_c = -1;
        field_1707_d = false;
        (new ThreadDownloadImage(this, s, imagebuffer)).start();
    }

    public BufferedImage field_1706_a;
    public int field_1705_b;
    public int field_1708_c;
    public boolean field_1707_d;
}
