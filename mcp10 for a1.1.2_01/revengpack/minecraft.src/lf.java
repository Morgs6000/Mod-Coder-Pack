// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class lf
{

    private java.lang.Object a[][];

    public lf()
    {
        a = (new java.lang.Object[][] {
            new java.lang.Object[] {
                ly.ai, di.n
            }, new java.lang.Object[] {
                ly.aj, di.m
            }, new java.lang.Object[] {
                ly.ay, di.l
            }
        });
    }

    public void a(dw dw1)
    {
        for(int i = 0; i < a.length; i++)
        {
            ly ly1 = (ly)a[i][0];
            di di1 = (di)a[i][1];
            dw1.a(new ev(ly1), new java.lang.Object[] {
                "###", "###", "###", java.lang.Character.valueOf('#'), di1
            });
            dw1.a(new ev(di1, 9), new java.lang.Object[] {
                "#", java.lang.Character.valueOf('#'), ly1
            });
        }

    }
}
