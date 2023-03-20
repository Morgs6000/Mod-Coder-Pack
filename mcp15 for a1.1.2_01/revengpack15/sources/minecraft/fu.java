// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class fu extends di
{

    public fu(int i, int j)
    {
        super(i);
        field_290_aT = 1;
        field_289_aU = 32 << j;
    }

    public boolean func_192_a(ev ev1, dm dm, cn cn1, int i, int j, int k, int l)
    {
        int i1 = cn1.func_600_a(i, j, k);
        gb gb1 = cn1.func_599_f(i, j + 1, k);
        if(!gb1.func_878_a() && i1 == ly.field_337_v.field_376_bc || i1 == ly.field_336_w.field_376_bc)
        {
            ly ly1 = ly.field_446_aB;
            cn1.func_684_a((float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F, ly1.field_358_bl.func_1145_d(), (ly1.field_358_bl.func_1147_b() + 1.0F) / 2.0F, ly1.field_358_bl.func_1144_c() * 0.8F);
            cn1.func_690_d(i, j, k, ly1.field_376_bc);
            ev1.func_1101_b(1);
            if(cn1.field_1037_n.nextInt(8) == 0 && i1 == ly.field_337_v.field_376_bc)
            {
                int j1 = 1;
                for(int k1 = 0; k1 < j1; k1++)
                {
                    float f = 0.7F;
                    float f1 = cn1.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                    float f2 = 1.2F;
                    float f3 = cn1.field_1037_n.nextFloat() * f + (1.0F - f) * 0.5F;
                    dx dx1 = new dx(cn1, (float)i + f1, (float)j + f2, (float)k + f3, new ev(di.field_244_Q));
                    dx1.field_805_c = 10;
                    cn1.func_674_a(dx1);
                }

            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean func_194_a()
    {
        return true;
    }
}
