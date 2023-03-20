// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.*;
import org.lwjgl.opengl.GL11;

public class bq
{

    public bq(cn cn1, ey ey1)
    {
        field_1728_b = new List[4];
        field_1730_d = new Random();
        if(cn1 != null)
        {
            field_1729_a = cn1;
        }
        field_1731_c = ey1;
        for(int i = 0; i < 4; i++)
        {
            field_1728_b[i] = new ArrayList();
        }

    }

    public void func_1192_a(nq nq1)
    {
        int i = nq1.func_404_c();
        field_1728_b[i].add(nq1);
    }

    public void func_1193_a()
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < field_1728_b[i].size(); j++)
            {
                nq nq1 = (nq)field_1728_b[i].get(j);
                nq1.func_370_e_();
                if(nq1.field_646_aA)
                {
                    field_1728_b[i].remove(j--);
                }
            }

        }

    }

    public void func_1189_a(kh kh1, float f)
    {
        float f1 = eo.func_1114_b((kh1.field_605_aq * 3.141593F) / 180F);
        float f2 = eo.func_1106_a((kh1.field_605_aq * 3.141593F) / 180F);
        float f3 = -f2 * eo.func_1106_a((kh1.field_604_ar * 3.141593F) / 180F);
        float f4 = f1 * eo.func_1106_a((kh1.field_604_ar * 3.141593F) / 180F);
        float f5 = eo.func_1114_b((kh1.field_604_ar * 3.141593F) / 180F);
        nq.field_660_l = kh1.field_638_aI + (kh1.field_611_ak - kh1.field_638_aI) * (double)f;
        nq.field_659_m = kh1.field_637_aJ + (kh1.field_610_al - kh1.field_637_aJ) * (double)f;
        nq.field_658_n = kh1.field_636_aK + (kh1.field_609_am - kh1.field_636_aK) * (double)f;
        for(int i = 0; i < 3; i++)
        {
            if(field_1728_b[i].size() == 0)
            {
                continue;
            }
            int j = 0;
            if(i == 0)
            {
                j = field_1731_c.func_1070_a("/particles.png");
            }
            if(i == 1)
            {
                j = field_1731_c.func_1070_a("/terrain.png");
            }
            if(i == 2)
            {
                j = field_1731_c.func_1070_a("/gui/items.png");
            }
            GL11.glBindTexture(3553, j);
            ho ho1 = ho.field_1512_a;
            ho1.func_977_b();
            for(int k = 0; k < field_1728_b[i].size(); k++)
            {
                nq nq1 = (nq)field_1728_b[i].get(k);
                nq1.func_406_a(ho1, f, f1, f5, f2, f3, f4);
            }

            ho1.func_982_a();
        }

    }

    public void func_1187_b(kh kh1, float f)
    {
        byte byte0 = 3;
        if(field_1728_b[byte0].size() == 0)
        {
            return;
        }
        ho ho1 = ho.field_1512_a;
        for(int i = 0; i < field_1728_b[byte0].size(); i++)
        {
            nq nq1 = (nq)field_1728_b[byte0].get(i);
            nq1.func_406_a(ho1, f, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        }

    }

    public void func_1188_a(cn cn1)
    {
        field_1729_a = cn1;
        for(int i = 0; i < 4; i++)
        {
            field_1728_b[i].clear();
        }

    }

    public void func_1186_a(int i, int j, int k)
    {
        int l = field_1729_a.func_600_a(i, j, k);
        if(l == 0)
        {
            return;
        }
        ly ly1 = ly.field_345_n[l];
        int i1 = 4;
        for(int j1 = 0; j1 < i1; j1++)
        {
            for(int k1 = 0; k1 < i1; k1++)
            {
                for(int l1 = 0; l1 < i1; l1++)
                {
                    double d = (double)i + ((double)j1 + 0.5D) / (double)i1;
                    double d1 = (double)j + ((double)k1 + 0.5D) / (double)i1;
                    double d2 = (double)k + ((double)l1 + 0.5D) / (double)i1;
                    func_1192_a(new iw(field_1729_a, d, d1, d2, d - (double)i - 0.5D, d1 - (double)j - 0.5D, d2 - (double)k - 0.5D, ly1));
                }

            }

        }

    }

    public void func_1191_a(int i, int j, int k, int l)
    {
        int i1 = field_1729_a.func_600_a(i, j, k);
        if(i1 == 0)
        {
            return;
        }
        ly ly1 = ly.field_345_n[i1];
        float f = 0.1F;
        double d = (double)i + field_1730_d.nextDouble() * (ly1.field_364_bi - ly1.field_370_bf - (double)(f * 2.0F)) + (double)f + ly1.field_370_bf;
        double d1 = (double)j + field_1730_d.nextDouble() * (ly1.field_362_bj - ly1.field_368_bg - (double)(f * 2.0F)) + (double)f + ly1.field_368_bg;
        double d2 = (double)k + field_1730_d.nextDouble() * (ly1.field_360_bk - ly1.field_366_bh - (double)(f * 2.0F)) + (double)f + ly1.field_366_bh;
        if(l == 0)
        {
            d1 = ((double)j + ly1.field_368_bg) - (double)f;
        }
        if(l == 1)
        {
            d1 = (double)j + ly1.field_362_bj + (double)f;
        }
        if(l == 2)
        {
            d2 = ((double)k + ly1.field_366_bh) - (double)f;
        }
        if(l == 3)
        {
            d2 = (double)k + ly1.field_360_bk + (double)f;
        }
        if(l == 4)
        {
            d = ((double)i + ly1.field_370_bf) - (double)f;
        }
        if(l == 5)
        {
            d = (double)i + ly1.field_364_bi + (double)f;
        }
        func_1192_a((new iw(field_1729_a, d, d1, d2, 0.0D, 0.0D, 0.0D, ly1)).func_407_b(0.2F).func_405_d(0.6F));
    }

    public String func_1190_b()
    {
        return (new StringBuilder()).append("").append(field_1728_b[0].size() + field_1728_b[1].size() + field_1728_b[2].size()).toString();
    }

    protected cn field_1729_a;
    private List field_1728_b[];
    private ey field_1731_c;
    private Random field_1730_d;
}
