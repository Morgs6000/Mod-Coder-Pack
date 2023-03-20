// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class l
{

    private java.lang.String a[][] = {
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
    private java.lang.Object b[][];

    public l()
    {
        b = (new java.lang.Object[][] {
            new java.lang.Object[] {
                di.aD, ly.as, di.m, di.l, di.n
            }, new java.lang.Object[] {
                di.T, di.X, di.ab, di.af, di.aj
            }, new java.lang.Object[] {
                di.U, di.Y, di.ac, di.ag, di.ak
            }, new java.lang.Object[] {
                di.V, di.Z, di.ad, di.ah, di.al
            }, new java.lang.Object[] {
                di.W, di.aa, di.ae, di.ai, di.am
            }
        });
    }

    public void a(dw dw1)
    {
        for(int i = 0; i < b[0].length; i++)
        {
            java.lang.Object obj = b[0][i];
            for(int j = 0; j < b.length - 1; j++)
            {
                di di1 = (di)b[j + 1][i];
                dw1.a(new ev(di1), new java.lang.Object[] {
                    a[j], java.lang.Character.valueOf('X'), obj
                });
            }

        }

    }
}
