// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class cu extends ik
{

    public cu(int i, int j)
    {
        field_884_a = i;
        field_883_b = j;
    }

    public boolean func_516_a(cn cn1, Random random, int i, int j, int k)
    {
        float f = random.nextFloat() * 3.141593F;
        double d = (float)(i + 8) + (eo.func_1106_a(f) * (float)field_883_b) / 8F;
        double d1 = (float)(i + 8) - (eo.func_1106_a(f) * (float)field_883_b) / 8F;
        double d2 = (float)(k + 8) + (eo.func_1114_b(f) * (float)field_883_b) / 8F;
        double d3 = (float)(k + 8) - (eo.func_1114_b(f) * (float)field_883_b) / 8F;
        double d4 = j + random.nextInt(3) + 2;
        double d5 = j + random.nextInt(3) + 2;
        for(int l = 0; l <= field_883_b; l++)
        {
            double d6 = d + ((d1 - d) * (double)l) / (double)field_883_b;
            double d7 = d4 + ((d5 - d4) * (double)l) / (double)field_883_b;
            double d8 = d2 + ((d3 - d2) * (double)l) / (double)field_883_b;
            double d9 = (random.nextDouble() * (double)field_883_b) / 16D;
            double d10 = (double)(eo.func_1106_a(((float)l * 3.141593F) / (float)field_883_b) + 1.0F) * d9 + 1.0D;
            double d11 = (double)(eo.func_1106_a(((float)l * 3.141593F) / (float)field_883_b) + 1.0F) * d9 + 1.0D;
            for(int i1 = (int)(d6 - d10 / 2D); i1 <= (int)(d6 + d10 / 2D); i1++)
            {
                for(int j1 = (int)(d7 - d11 / 2D); j1 <= (int)(d7 + d11 / 2D); j1++)
                {
                    for(int k1 = (int)(d8 - d10 / 2D); k1 <= (int)(d8 + d10 / 2D); k1++)
                    {
                        double d12 = (((double)i1 + 0.5D) - d6) / (d10 / 2D);
                        double d13 = (((double)j1 + 0.5D) - d7) / (d11 / 2D);
                        double d14 = (((double)k1 + 0.5D) - d8) / (d10 / 2D);
                        if(d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && cn1.func_600_a(i1, j1, k1) == ly.field_338_u.field_376_bc)
                        {
                            cn1.func_634_a(i1, j1, k1, field_884_a);
                        }
                    }

                }

            }

        }

        return true;
    }

    private int field_884_a;
    private int field_883_b;
}