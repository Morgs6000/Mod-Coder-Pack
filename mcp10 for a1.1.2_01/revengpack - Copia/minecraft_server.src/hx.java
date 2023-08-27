// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.Timer;

public class hx extends javax.swing.JComponent
{

    private int a[];
    private int b;
    private java.lang.String c[];

    public hx()
    {
        a = new int[256];
        b = 0;
        c = new java.lang.String[10];
        setPreferredSize(new Dimension(256, 196));
        setMinimumSize(new Dimension(256, 196));
        setMaximumSize(new Dimension(256, 196));
        (new Timer(500, ((java.awt.event.ActionListener) (new it(this))))).start();
        setBackground(java.awt.Color.BLACK);
    }

    private void a()
    {
        long l = java.lang.Runtime.getRuntime().totalMemory() - java.lang.Runtime.getRuntime().freeMemory();
        java.lang.System.gc();
        c[0] = (new StringBuilder()).append("Memory use: ").append(l / 1024L / 1024L).append(" mb (").append((java.lang.Runtime.getRuntime().freeMemory() * 100L) / java.lang.Runtime.getRuntime().maxMemory()).append("% free)").toString();
        c[1] = (new StringBuilder()).append("Threads: ").append(bb.b).append(" + ").append(bb.c).toString();
        a[b++ & 0xff] = (int)((l * 100L) / java.lang.Runtime.getRuntime().maxMemory());
        repaint();
    }

    public void paint(java.awt.Graphics g)
    {
        g.setColor(new Color(0xffffff));
        g.fillRect(0, 0, 256, 192);
        for(int i = 0; i < 256; i++)
        {
            int k = a[i + b & 0xff];
            g.setColor(new Color(k + 28 << 16));
            g.fillRect(i, 100 - k, 1, k);
        }

        g.setColor(java.awt.Color.BLACK);
        for(int j = 0; j < c.length; j++)
        {
            java.lang.String s = c[j];
            if(s != null)
                g.drawString(s, 32, 116 + j * 16);
        }

    }

    static void a(hx hx1)
    {
        hx1.a();
    }
}
