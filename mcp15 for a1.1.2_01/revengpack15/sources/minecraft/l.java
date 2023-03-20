// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class l
{

    public l()
    {
        field_1680_b = (new Object[][] {
            new Object[] {
                di.field_306_aD, ly.field_402_as, di.field_223_m, di.field_224_l, di.field_222_n
            }, new Object[] {
                di.field_241_T, di.field_237_X, di.field_285_ab, di.field_281_af, di.field_277_aj
            }, new Object[] {
                di.field_240_U, di.field_236_Y, di.field_284_ac, di.field_280_ag, di.field_276_ak
            }, new Object[] {
                di.field_239_V, di.field_235_Z, di.field_283_ad, di.field_279_ah, di.field_275_al
            }, new Object[] {
                di.field_238_W, di.field_286_aa, di.field_282_ae, di.field_278_ai, di.field_274_am
            }
        });
    }

    public void func_1148_a(dw dw1)
    {
        for(int i = 0; i < field_1680_b[0].length; i++)
        {
            Object obj = field_1680_b[0][i];
            for(int j = 0; j < field_1680_b.length - 1; j++)
            {
                di di1 = (di)field_1680_b[j + 1][i];
                dw1.func_1121_a(new ev(di1), new Object[] {
                    field_1681_a[j], Character.valueOf('X'), obj
                });
            }

        }

    }

    private String field_1681_a[][] = {
        {
            "XXX", "X X"
        }, {
            "X X", "XXX", "XXX"
        }, {
            "XXX", "X X", "X X"
        }, {
            "X X", "X X"
        }
    };
    private Object field_1680_b[][];
}
