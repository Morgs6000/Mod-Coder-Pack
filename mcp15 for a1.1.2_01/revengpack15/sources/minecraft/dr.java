// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class dr
{

    public dr()
    {
        field_1664_b = (new Object[][] {
            new Object[] {
                ly.field_334_y, ly.field_335_x, di.field_223_m, di.field_224_l, di.field_222_n
            }, new Object[] {
                di.field_218_r, di.field_214_v, di.field_231_e, di.field_210_z, di.field_257_G
            }, new Object[] {
                di.field_219_q, di.field_215_u, di.field_232_d, di.field_211_y, di.field_259_F
            }, new Object[] {
                di.field_217_s, di.field_213_w, di.field_230_f, di.field_268_A, di.field_255_H
            }, new Object[] {
                di.field_249_L, di.field_248_M, di.field_247_N, di.field_246_O, di.field_245_P
            }
        });
    }

    public void func_1122_a(dw dw1)
    {
        for(int i = 0; i < field_1664_b[0].length; i++)
        {
            Object obj = field_1664_b[0][i];
            for(int j = 0; j < field_1664_b.length - 1; j++)
            {
                di di1 = (di)field_1664_b[j + 1][i];
                dw1.func_1121_a(new ev(di1), new Object[] {
                    field_1665_a[j], Character.valueOf('#'), di.field_266_B, Character.valueOf('X'), obj
                });
            }

        }

    }

    private String field_1665_a[][] = {
        {
            "XXX", " # ", " # "
        }, {
            "X", "#", "#"
        }, {
            "XX", "X#", " #"
        }, {
            "XX", " #", " #"
        }
    };
    private Object field_1664_b[][];
}
