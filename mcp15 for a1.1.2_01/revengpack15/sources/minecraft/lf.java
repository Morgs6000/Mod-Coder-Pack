// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class lf
{

    public lf()
    {
        field_1198_a = (new Object[][] {
            new Object[] {
                ly.field_413_ai, di.field_222_n
            }, new Object[] {
                ly.field_412_aj, di.field_223_m
            }, new Object[] {
                ly.field_389_ay, di.field_224_l
            }
        });
    }

    public void func_810_a(dw dw1)
    {
        for(int i = 0; i < field_1198_a.length; i++)
        {
            ly ly1 = (ly)field_1198_a[i][0];
            di di1 = (di)field_1198_a[i][1];
            dw1.func_1121_a(new ev(ly1), new Object[] {
                "###", "###", "###", Character.valueOf('#'), di1
            });
            dw1.func_1121_a(new ev(di1, 9), new Object[] {
                "#", Character.valueOf('#'), ly1
            });
        }

    }

    private Object field_1198_a[][];
}
