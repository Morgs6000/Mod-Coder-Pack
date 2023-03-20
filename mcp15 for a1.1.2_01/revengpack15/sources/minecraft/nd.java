// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class nd
{

    public nd()
    {
        field_1099_b = (new Object[][] {
            new Object[] {
                ly.field_334_y, ly.field_335_x, di.field_223_m, di.field_224_l, di.field_222_n
            }, new Object[] {
                di.field_220_p, di.field_216_t, di.field_221_o, di.field_212_x, di.field_261_E
            }
        });
    }

    public void func_766_a(dw dw1)
    {
        for(int i = 0; i < field_1099_b[0].length; i++)
        {
            Object obj = field_1099_b[0][i];
            for(int j = 0; j < field_1099_b.length - 1; j++)
            {
                di di1 = (di)field_1099_b[j + 1][i];
                dw1.func_1121_a(new ev(di1), new Object[] {
                    field_1100_a[j], Character.valueOf('#'), di.field_266_B, Character.valueOf('X'), obj
                });
            }

        }

        dw1.func_1121_a(new ev(di.field_227_i, 1), new Object[] {
            " #X", "# X", " #X", Character.valueOf('X'), di.field_253_I, Character.valueOf('#'), di.field_266_B
        });
        dw1.func_1121_a(new ev(di.field_226_j, 4), new Object[] {
            "X", "#", "Y", Character.valueOf('Y'), di.field_251_J, Character.valueOf('X'), di.field_273_an, Character.valueOf('#'), di.field_266_B
        });
    }

    private String field_1100_a[][] = {
        {
            "X", "X", "#"
        }
    };
    private Object field_1099_b[][];
}
