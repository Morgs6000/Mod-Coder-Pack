// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class av extends di
{

    public av(int i)
    {
        super(i);
        field_330_a = i + 256;
        func_205_a(ly.field_345_n[i + 256].func_218_a(2));
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        if(cn1.func_600_a(i, j, k) == ly.field_428_aT.field_376_bc)
        {
            l = 0;
        } else
        {
            if(l == 0)
            {
                j--;
            }
            if(l == 1)
            {
                j++;
            }
            if(l == 2)
            {
                k--;
            }
            if(l == 3)
            {
                k++;
            }
            if(l == 4)
            {
                i--;
            }
            if(l == 5)
            {
                i++;
            }
        }
        if(ev1.field_1615_a == 0)
        {
            return false;
        }
        if(cn1.func_695_a(field_330_a, i, j, k, false))
        {
            ly ly1 = ly.field_345_n[field_330_a];
            if(cn1.func_690_d(i, j, k, field_330_a))
            {
                ly.field_345_n[field_330_a].func_258_d(cn1, i, j, k, l);
                cn1.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, ly1.field_358_bl.func_1145_d(), (ly1.field_358_bl.func_1147_b() + 1.0F) / 2.0F, ly1.field_358_bl.func_1144_c() * 0.8F);
                ev1.field_1615_a--;
            }
        }
        return true;
    }

    private int field_330_a;
}
