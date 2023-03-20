// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public abstract class ee extends bh
{

    public ee()
    {
        field_971_a = 176;
        field_974_h = 166;
        field_973_i = new ArrayList();
    }

    public void func_571_a(int j, int k, float f)
    {
        func_578_i();
        int l = (field_951_c - field_971_a) / 2;
        int i1 = (field_950_d - field_974_h) / 2;
        func_589_a(f);
        GL11.glPushMatrix();
        GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
        i.func_1158_b();
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(l, i1, 0.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(32826);
        for(int j1 = 0; j1 < field_973_i.size(); j1++)
        {
            mm mm1 = (mm)field_973_i.get(j1);
            func_590_a(mm1);
            if(mm1.func_781_a(j, k))
            {
                GL11.glDisable(2896);
                GL11.glDisable(2929);
                int k1 = mm1.field_1121_e;
                int l1 = mm1.field_1120_f;
                func_549_a(k1, l1, k1 + 16, l1 + 16, 0x80ffffff, 0x80ffffff);
                GL11.glEnable(2896);
                GL11.glEnable(2929);
            }
        }

        eu eu1 = field_945_b.field_178_g.field_778_b;
        if(eu1.field_846_e != null)
        {
            GL11.glTranslatef(0.0F, 0.0F, 32F);
            field_972_j.func_161_a(field_947_g, field_945_b.field_171_n, eu1.field_846_e, j - l - 8, k - i1 - 8);
            field_972_j.func_164_b(field_947_g, field_945_b.field_171_n, eu1.field_846_e, j - l - 8, k - i1 - 8);
        }
        GL11.glDisable(32826);
        i.func_1159_a();
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        func_587_j();
        GL11.glEnable(2896);
        GL11.glEnable(2929);
        GL11.glPopMatrix();
    }

    protected void func_587_j()
    {
    }

    protected abstract void func_589_a(float f);

    private void func_590_a(mm mm1)
    {
        gh gh1 = mm1.field_1118_b;
        int j = mm1.field_1119_a;
        int k = mm1.field_1121_e;
        int l = mm1.field_1120_f;
        ev ev1 = gh1.func_468_c(j);
        if(ev1 == null)
        {
            int i1 = mm1.func_775_c();
            if(i1 >= 0)
            {
                GL11.glDisable(2896);
                field_945_b.field_171_n.func_1076_b(field_945_b.field_171_n.func_1070_a("/gui/items.png"));
                func_550_b(k, l, (i1 % 16) * 16, (i1 / 16) * 16, 16, 16);
                GL11.glEnable(2896);
                return;
            }
        }
        field_972_j.func_161_a(field_947_g, field_945_b.field_171_n, ev1, k, l);
        field_972_j.func_164_b(field_947_g, field_945_b.field_171_n, ev1, k, l);
    }

    private dk func_588_a(int j, int k)
    {
        for(int l = 0; l < field_973_i.size(); l++)
        {
            mm mm1 = (mm)field_973_i.get(l);
            if(mm1.func_781_a(j, k))
            {
                return mm1;
            }
        }

        return null;
    }

    protected void func_565_a(int j, int k, int l)
    {
        if(l == 0 || l == 1)
        {
            dk dk1 = func_588_a(j, k);
            eu eu1 = field_945_b.field_178_g.field_778_b;
            if(dk1 != null)
            {
                ev ev1 = dk1.func_777_b();
                if(ev1 != null || eu1.field_846_e != null)
                {
                    if(ev1 != null && eu1.field_846_e == null)
                    {
                        int j1 = l != 0 ? (ev1.field_1615_a + 1) / 2 : ev1.field_1615_a;
                        eu1.field_846_e = dk1.field_1118_b.func_473_a(dk1.field_1119_a, j1);
                        if(ev1.field_1615_a == 0)
                        {
                            dk1.func_776_b(null);
                        }
                        dk1.func_778_a();
                    } else
                    if(ev1 == null && eu1.field_846_e != null && dk1.func_780_a(eu1.field_846_e))
                    {
                        int k1 = l != 0 ? 1 : eu1.field_846_e.field_1615_a;
                        if(k1 > dk1.field_1118_b.func_470_e())
                        {
                            k1 = dk1.field_1118_b.func_470_e();
                        }
                        dk1.func_776_b(eu1.field_846_e.func_1085_a(k1));
                        if(eu1.field_846_e.field_1615_a == 0)
                        {
                            eu1.field_846_e = null;
                        }
                    } else
                    if(ev1 != null && eu1.field_846_e != null)
                    {
                        if(dk1.func_780_a(eu1.field_846_e))
                        {
                            if(ev1.field_1617_c != eu1.field_846_e.field_1617_c)
                            {
                                if(eu1.field_846_e.field_1615_a <= dk1.field_1118_b.func_470_e())
                                {
                                    ev ev2 = ev1;
                                    dk1.func_776_b(eu1.field_846_e);
                                    eu1.field_846_e = ev2;
                                }
                            } else
                            if(ev1.field_1617_c == eu1.field_846_e.field_1617_c)
                            {
                                if(l == 0)
                                {
                                    int l1 = eu1.field_846_e.field_1615_a;
                                    if(l1 > dk1.field_1118_b.func_470_e() - ev1.field_1615_a)
                                    {
                                        l1 = dk1.field_1118_b.func_470_e() - ev1.field_1615_a;
                                    }
                                    if(l1 > eu1.field_846_e.func_1089_c() - ev1.field_1615_a)
                                    {
                                        l1 = eu1.field_846_e.func_1089_c() - ev1.field_1615_a;
                                    }
                                    eu1.field_846_e.func_1085_a(l1);
                                    if(eu1.field_846_e.field_1615_a == 0)
                                    {
                                        eu1.field_846_e = null;
                                    }
                                    ev1.field_1615_a += l1;
                                } else
                                if(l == 1)
                                {
                                    int i2 = 1;
                                    if(i2 > dk1.field_1118_b.func_470_e() - ev1.field_1615_a)
                                    {
                                        i2 = dk1.field_1118_b.func_470_e() - ev1.field_1615_a;
                                    }
                                    if(i2 > eu1.field_846_e.func_1089_c() - ev1.field_1615_a)
                                    {
                                        i2 = eu1.field_846_e.func_1089_c() - ev1.field_1615_a;
                                    }
                                    eu1.field_846_e.func_1085_a(i2);
                                    if(eu1.field_846_e.field_1615_a == 0)
                                    {
                                        eu1.field_846_e = null;
                                    }
                                    ev1.field_1615_a += i2;
                                }
                            }
                        } else
                        if(ev1.field_1617_c == eu1.field_846_e.field_1617_c && eu1.field_846_e.func_1089_c() > 1)
                        {
                            int j2 = ev1.field_1615_a;
                            if(j2 > 0 && j2 + eu1.field_846_e.field_1615_a <= eu1.field_846_e.func_1089_c())
                            {
                                eu1.field_846_e.field_1615_a += j2;
                                ev1.func_1085_a(j2);
                                if(ev1.field_1615_a == 0)
                                {
                                    dk1.func_776_b(null);
                                }
                                dk1.func_778_a();
                            }
                        }
                    }
                }
                dk1.func_779_d();
            } else
            if(eu1.field_846_e != null)
            {
                int i1 = (field_951_c - field_971_a) / 2;
                int k2 = (field_950_d - field_974_h) / 2;
                if(j < i1 || k < k2 || j >= i1 + field_971_a || k >= k2 + field_971_a)
                {
                    bi bi1 = field_945_b.field_178_g;
                    if(l == 0)
                    {
                        bi1.func_449_a(eu1.field_846_e);
                        eu1.field_846_e = null;
                    }
                    if(l == 1)
                    {
                        bi1.func_449_a(eu1.field_846_e.func_1085_a(1));
                        if(eu1.field_846_e.field_1615_a == 0)
                        {
                            eu1.field_846_e = null;
                        }
                    }
                }
            }
        }
    }

    protected void func_573_b(int j, int k, int l)
    {
        if(l != 0);
    }

    protected void func_580_a(char c, int j)
    {
        if(j == 1 || j == field_945_b.field_160_y.field_1570_o.field_1370_b)
        {
            field_945_b.func_128_a(null);
        }
    }

    public void func_576_h()
    {
        eu eu1 = field_945_b.field_178_g.field_778_b;
        if(eu1.field_846_e != null)
        {
            field_945_b.field_178_g.func_449_a(eu1.field_846_e);
            eu1.field_846_e = null;
        }
    }

    public boolean func_577_b()
    {
        return false;
    }

    private static ab field_972_j = new ab();
    protected int field_971_a;
    protected int field_974_h;
    protected List field_973_i;

}
