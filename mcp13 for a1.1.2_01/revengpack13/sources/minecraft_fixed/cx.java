// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
//import Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class cx extends bh
{

    private static final java.util.Random h = new Random();
    java.lang.String a[] = {
        " *   * * *   * *** *** *** *** *** ***", " ** ** * **  * *   *   * * * * *    * ", " * * * * * * * **  *   **  *** **   * ", " *   * * *  ** *   *   * * * * *    * ", " *   * * *   * *** *** * * * * *    * "
    };
    private kc i[][];
    private float j;
    private java.lang.String l;

    public cx()
    {
        j = 0.0F;
        l = "missingno";
        try
        {
            java.util.ArrayList arraylist = new ArrayList();
            java.io.BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (new InputStreamReader(cx.class.getResourceAsStream("/title/splashes.txt")))));
            java.lang.String s = "";
            do
            {
                java.lang.String s1;
                if((s1 = bufferedreader.readLine()) == null)
                    break;
                s1 = s1.trim();
                if(s1.length() > 0)
                    ((java.util.List) (arraylist)).add(((java.lang.Object) (s1)));
            } while(true);
            l = (java.lang.String)((java.util.List) (arraylist)).get(h.nextInt(((java.util.List) (arraylist)).size()));
        }
        catch(java.lang.Exception exception) { }
    }

    public void g()
    {
        j++;
        if(i != null)
        {
            for(int k = 0; k < i.length; k++)
            {
                for(int i1 = 0; i1 < i[k].length; i1++)
                    i[k][i1].a();

            }

        }
    }

    protected void a(char c, int k)
    {
    }

    public void a()
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new Date());
        if(calendar.get(2) + 1 == 11 && calendar.get(5) == 9)
            l = "Happy birthday, ez!";
        else
        if(calendar.get(2) + 1 == 6 && calendar.get(5) == 1)
            l = "Happy birthday, Notch!";
        else
        if(calendar.get(2) + 1 == 12 && calendar.get(5) == 24)
            l = "Merry X-mas!";
        else
        if(calendar.get(2) + 1 == 1 && calendar.get(5) == 1)
            l = "Happy new year!";
        e.clear();
        e.add(((java.lang.Object) (new fk(1, c / 2 - 100, d / 4 + 48, "Singleplayer"))));
        e.add(((java.lang.Object) (new fk(2, c / 2 - 100, d / 4 + 72, "Multiplayer"))));
        e.add(((java.lang.Object) (new fk(3, c / 2 - 100, d / 4 + 96, "Play tutorial level"))));
        e.add(((java.lang.Object) (new fk(0, c / 2 - 100, d / 4 + 120 + 12, "Options..."))));
        ((fk)e.get(2)).g = false;
        if(b.i == null)
            ((fk)e.get(1)).g = false;
    }

    protected void a(fk fk1)
    {
        if(fk1.f == 0)
            b.a(((bh) (new ay(((bh) (this)), b.y))));
        if(fk1.f == 1)
            b.a(((bh) (new jq(((bh) (this))))));
        if(fk1.f == 2)
            b.a(((bh) (new gc(((bh) (this))))));
    }

    public void a(int k, int i1, float f)
    {
        i();
        ho ho1 = ho.a;
        a(f);
        org.lwjgl.opengl.GL11.glBindTexture(3553, b.n.a("/gui/logo.png"));
        org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ho1.b(0xffffff);
        org.lwjgl.opengl.GL11.glPushMatrix();
        org.lwjgl.opengl.GL11.glTranslatef(c / 2 + 90, 70F, 0.0F);
        org.lwjgl.opengl.GL11.glRotatef(-20F, 0.0F, 0.0F, 1.0F);
        float f1 = 1.8F - eo.e(eo.a(((float)(java.lang.System.currentTimeMillis() % 1000L) / 1000F) * 3.141593F * 2.0F) * 0.1F);
        f1 = (f1 * 100F) / (float)(g.a(l) + 32);
        org.lwjgl.opengl.GL11.glScalef(f1, f1, f1);
        a(g, l, 0, -8, 0xffff00);
        org.lwjgl.opengl.GL11.glPopMatrix();
        java.lang.String s = "Copyright Mojang Specifications. Do not distribute.";
        b(g, s, c - g.a(s) - 2, d - 10, 0xffffff);
        long l1 = java.lang.Runtime.getRuntime().maxMemory();
        long l2 = java.lang.Runtime.getRuntime().totalMemory();
        long l3 = java.lang.Runtime.getRuntime().freeMemory();
        long l4 = l1 - l3;
        s = (new StringBuilder()).append("Free memory: ").append((l4 * 100L) / l1).append("% of ").append(l1 / 1024L / 1024L).append("MB").toString();
        b(g, s, c - g.a(s) - 2, 2, 0x808080);
        s = (new StringBuilder()).append("Allocated memory: ").append((l2 * 100L) / l1).append("% (").append(l2 / 1024L / 1024L).append("MB)").toString();
        b(g, s, c - g.a(s) - 2, 12, 0x808080);
        super.a(k, i1, f);
    }

    private void a(float f)
    {
        if(i == null)
        {
            i = new kc[a[0].length()][a.length];
            for(int k = 0; k < i.length; k++)
            {
                for(int i1 = 0; i1 < i[k].length; i1++)
                    i[k][i1] = new kc(this, k, i1);

            }

        }
        org.lwjgl.opengl.GL11.glMatrixMode(5889);
        org.lwjgl.opengl.GL11.glPushMatrix();
        org.lwjgl.opengl.GL11.glLoadIdentity();
        iy iy1 = new iy(b.c, b.d);
        int j1 = 120 * iy1.a;
        org.lwjgl.util.glu.GLU.gluPerspective(70F, (float)b.c / (float)j1, 0.05F, 100F);
        org.lwjgl.opengl.GL11.glViewport(0, b.d - j1, b.c, j1);
        org.lwjgl.opengl.GL11.glMatrixMode(5888);
        org.lwjgl.opengl.GL11.glPushMatrix();
        org.lwjgl.opengl.GL11.glLoadIdentity();
        org.lwjgl.opengl.GL11.glDisable(2884);
        org.lwjgl.opengl.GL11.glCullFace(1029);
        org.lwjgl.opengl.GL11.glDepthMask(true);
        for(int k1 = 0; k1 < 3; k1++)
        {
            org.lwjgl.opengl.GL11.glPushMatrix();
            org.lwjgl.opengl.GL11.glTranslatef(0.4F, 0.6F, -12F);
            if(k1 == 0)
            {
                org.lwjgl.opengl.GL11.glClear(256);
                org.lwjgl.opengl.GL11.glTranslatef(0.0F, -0.4F, 0.0F);
                org.lwjgl.opengl.GL11.glScalef(0.98F, 1.0F, 1.0F);
                org.lwjgl.opengl.GL11.glEnable(3042);
                org.lwjgl.opengl.GL11.glBlendFunc(770, 771);
            }
            if(k1 == 1)
            {
                org.lwjgl.opengl.GL11.glDisable(3042);
                org.lwjgl.opengl.GL11.glClear(256);
            }
            if(k1 == 2)
            {
                org.lwjgl.opengl.GL11.glEnable(3042);
                org.lwjgl.opengl.GL11.glBlendFunc(768, 1);
            }
            org.lwjgl.opengl.GL11.glScalef(1.0F, -1F, 1.0F);
            org.lwjgl.opengl.GL11.glRotatef(15F, 1.0F, 0.0F, 0.0F);
            org.lwjgl.opengl.GL11.glScalef(0.89F, 1.0F, 0.4F);
            org.lwjgl.opengl.GL11.glTranslatef((float)(-a[0].length()) * 0.5F, (float)(-a.length) * 0.5F, 0.0F);
            org.lwjgl.opengl.GL11.glBindTexture(3553, b.n.a("/terrain.png"));
            if(k1 == 0)
                org.lwjgl.opengl.GL11.glBindTexture(3553, b.n.a("/title/black.png"));
            bc bc1 = new bc();
            for(int l1 = 0; l1 < a.length; l1++)
            {
                for(int i2 = 0; i2 < a[l1].length(); i2++)
                {
                    char c = a[l1].charAt(i2);
                    if(c == ' ')
                        continue;
                    org.lwjgl.opengl.GL11.glPushMatrix();
                    kc kc1 = i[i2][l1];
                    float f1 = (float)(kc1.b + (kc1.a - kc1.b) * (double)f);
                    float f2 = 1.0F;
                    float f3 = 1.0F;
                    float f4 = 0.0F;
                    if(k1 == 0)
                    {
                        f2 = f1 * 0.04F + 1.0F;
                        f3 = 1.0F / f2;
                        f1 = 0.0F;
                    }
                    org.lwjgl.opengl.GL11.glTranslatef(i2, l1, f1);
                    org.lwjgl.opengl.GL11.glScalef(f2, f2, f2);
                    org.lwjgl.opengl.GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
                    bc1.a(ly.u, f3);
                    org.lwjgl.opengl.GL11.glPopMatrix();
                }

            }

            org.lwjgl.opengl.GL11.glPopMatrix();
        }

        org.lwjgl.opengl.GL11.glDisable(3042);
        org.lwjgl.opengl.GL11.glMatrixMode(5889);
        org.lwjgl.opengl.GL11.glPopMatrix();
        org.lwjgl.opengl.GL11.glMatrixMode(5888);
        org.lwjgl.opengl.GL11.glPopMatrix();
        org.lwjgl.opengl.GL11.glViewport(0, 0, b.c, b.d);
        org.lwjgl.opengl.GL11.glEnable(2884);
    }

    static java.util.Random j()
    {
        return h;
    }

}
