// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class cx extends bh
{

    public cx()
    {
        field_989_j = 0.0F;
        field_987_l = "missingno";
        try
        {
            ArrayList arraylist = new ArrayList();
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((cx.class).getResourceAsStream("/title/splashes.txt")));
            String s = "";
            do
            {
                String s1;
                if((s1 = bufferedreader.readLine()) == null)
                {
                    break;
                }
                s1 = s1.trim();
                if(s1.length() > 0)
                {
                    arraylist.add(s1);
                }
            } while(true);
            field_987_l = (String)arraylist.get(field_991_h.nextInt(arraylist.size()));
        }
        catch(Exception exception) { }
    }

    public void func_570_g()
    {
        field_989_j++;
        if(field_990_i != null)
        {
            for(int i = 0; i < field_990_i.length; i++)
            {
                for(int j = 0; j < field_990_i[i].length; j++)
                {
                    field_990_i[i][j].func_875_a();
                }

            }

        }
    }

    protected void func_580_a(char c, int i)
    {
    }

    public void func_575_a()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if(calendar.get(2) + 1 == 11 && calendar.get(5) == 9)
        {
            field_987_l = "Happy birthday, ez!";
        } else
        if(calendar.get(2) + 1 == 6 && calendar.get(5) == 1)
        {
            field_987_l = "Happy birthday, Notch!";
        } else
        if(calendar.get(2) + 1 == 12 && calendar.get(5) == 24)
        {
            field_987_l = "Merry X-mas!";
        } else
        if(calendar.get(2) + 1 == 1 && calendar.get(5) == 1)
        {
            field_987_l = "Happy new year!";
        }
        field_949_e.clear();
        field_949_e.add(new fk(1, field_951_c / 2 - 100, field_950_d / 4 + 48, "Singleplayer"));
        field_949_e.add(new fk(2, field_951_c / 2 - 100, field_950_d / 4 + 72, "Multiplayer"));
        field_949_e.add(new fk(3, field_951_c / 2 - 100, field_950_d / 4 + 96, "Play tutorial level"));
        field_949_e.add(new fk(0, field_951_c / 2 - 100, field_950_d / 4 + 120 + 12, "Options..."));
        ((fk)field_949_e.get(2)).field_937_g = false;
        if(field_945_b.field_176_i == null)
        {
            ((fk)field_949_e.get(1)).field_937_g = false;
        }
    }

    protected void func_572_a(fk fk1)
    {
        if(fk1.field_938_f == 0)
        {
            field_945_b.func_128_a(new ay(this, field_945_b.field_160_y));
        }
        if(fk1.field_938_f == 1)
        {
            field_945_b.func_128_a(new jq(this));
        }
        if(fk1.field_938_f == 2)
        {
            field_945_b.func_128_a(new gc(this));
        }
    }

    public void func_571_a(int i, int j, float f)
    {
        func_578_i();
        ho ho1 = ho.field_1512_a;
        func_591_a(f);
        GL11.glBindTexture(3553, field_945_b.field_171_n.func_1070_a("/gui/logo.png"));
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        ho1.func_990_b(0xffffff);
        GL11.glPushMatrix();
        GL11.glTranslatef(field_951_c / 2 + 90, 70F, 0.0F);
        GL11.glRotatef(-20F, 0.0F, 0.0F, 1.0F);
        float f1 = 1.8F - eo.func_1112_e(eo.func_1106_a(((float)(System.currentTimeMillis() % 1000L) / 1000F) * 3.141593F * 2.0F) * 0.1F);
        f1 = (f1 * 100F) / (float)(field_947_g.func_871_a(field_987_l) + 32);
        GL11.glScalef(f1, f1, f1);
        func_548_a(field_947_g, field_987_l, 0, -8, 0xffff00);
        GL11.glPopMatrix();
        String s = "Copyright Mojang Specifications. Do not distribute.";
        func_547_b(field_947_g, s, field_951_c - field_947_g.func_871_a(s) - 2, field_950_d - 10, 0xffffff);
        long l = Runtime.getRuntime().maxMemory();
        long l1 = Runtime.getRuntime().totalMemory();
        long l2 = Runtime.getRuntime().freeMemory();
        long l3 = l - l2;
        s = (new StringBuilder()).append("Free memory: ").append((l3 * 100L) / l).append("% of ").append(l / 1024L / 1024L).append("MB").toString();
        func_547_b(field_947_g, s, field_951_c - field_947_g.func_871_a(s) - 2, 2, 0x808080);
        s = (new StringBuilder()).append("Allocated memory: ").append((l1 * 100L) / l).append("% (").append(l1 / 1024L / 1024L).append("MB)").toString();
        func_547_b(field_947_g, s, field_951_c - field_947_g.func_871_a(s) - 2, 12, 0x808080);
        super.func_571_a(i, j, f);
    }

    private void func_591_a(float f)
    {
        if(field_990_i == null)
        {
            field_990_i = new kc[field_988_a[0].length()][field_988_a.length];
            for(int i = 0; i < field_990_i.length; i++)
            {
                for(int j = 0; j < field_990_i[i].length; j++)
                {
                    field_990_i[i][j] = new kc(this, i, j);
                }

            }

        }
        GL11.glMatrixMode(5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        iy iy1 = new iy(field_945_b.field_182_c, field_945_b.field_181_d);
        int k = 120 * iy1.field_1368_a;
        GLU.gluPerspective(70F, (float)field_945_b.field_182_c / (float)k, 0.05F, 100F);
        GL11.glViewport(0, field_945_b.field_181_d - k, field_945_b.field_182_c, k);
        GL11.glMatrixMode(5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glDisable(2884);
        GL11.glCullFace(1029);
        GL11.glDepthMask(true);
        for(int l = 0; l < 3; l++)
        {
            GL11.glPushMatrix();
            GL11.glTranslatef(0.4F, 0.6F, -12F);
            if(l == 0)
            {
                GL11.glClear(256);
                GL11.glTranslatef(0.0F, -0.4F, 0.0F);
                GL11.glScalef(0.98F, 1.0F, 1.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
            }
            if(l == 1)
            {
                GL11.glDisable(3042);
                GL11.glClear(256);
            }
            if(l == 2)
            {
                GL11.glEnable(3042);
                GL11.glBlendFunc(768, 1);
            }
            GL11.glScalef(1.0F, -1F, 1.0F);
            GL11.glRotatef(15F, 1.0F, 0.0F, 0.0F);
            GL11.glScalef(0.89F, 1.0F, 0.4F);
            GL11.glTranslatef((float)(-field_988_a[0].length()) * 0.5F, (float)(-field_988_a.length) * 0.5F, 0.0F);
            GL11.glBindTexture(3553, field_945_b.field_171_n.func_1070_a("/terrain.png"));
            if(l == 0)
            {
                GL11.glBindTexture(3553, field_945_b.field_171_n.func_1070_a("/title/black.png"));
            }
            bc bc1 = new bc();
            for(int i1 = 0; i1 < field_988_a.length; i1++)
            {
                for(int j1 = 0; j1 < field_988_a[i1].length(); j1++)
                {
                    char c = field_988_a[i1].charAt(j1);
                    if(c == ' ')
                    {
                        continue;
                    }
                    GL11.glPushMatrix();
                    kc kc1 = field_990_i[j1][i1];
                    float f1 = (float)(kc1.field_1311_b + (kc1.field_1312_a - kc1.field_1311_b) * (double)f);
                    float f2 = 1.0F;
                    float f3 = 1.0F;
                    float f4 = 0.0F;
                    if(l == 0)
                    {
                        f2 = f1 * 0.04F + 1.0F;
                        f3 = 1.0F / f2;
                        f1 = 0.0F;
                    }
                    GL11.glTranslatef(j1, i1, f1);
                    GL11.glScalef(f2, f2, f2);
                    GL11.glRotatef(f4, 0.0F, 1.0F, 0.0F);
                    bc1.func_1238_a(ly.field_338_u, f3);
                    GL11.glPopMatrix();
                }

            }

            GL11.glPopMatrix();
        }

        GL11.glDisable(3042);
        GL11.glMatrixMode(5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glPopMatrix();
        GL11.glViewport(0, 0, field_945_b.field_182_c, field_945_b.field_181_d);
        GL11.glEnable(2884);
    }

    static Random func_592_j()
    {
        return field_991_h;
    }

    private static final Random field_991_h = new Random();
    String field_988_a[] = {
        " *   * * *   * *** *** *** *** *** ***", " ** ** * **  * *   *   * * * * *    * ", " * * * * * * * **  *   **  *** **   * ", " *   * * *  ** *   *   * * * * *    * ", " *   * * *   * *** *** * * * * *    * "
    };
    private kc field_990_i[][];
    private float field_989_j;
    private String field_987_l;

}
