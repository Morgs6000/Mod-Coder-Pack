// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class dr
{

    private java.lang.String a[][] = {
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
    private java.lang.Object b[][];

    public dr()
    {
        b = (new java.lang.Object[][] {
            new java.lang.Object[] {
                ly.y, ly.x, di.m, di.l, di.n
            }, new java.lang.Object[] {
                di.r, di.v, di.e, di.z, di.G
            }, new java.lang.Object[] {
                di.q, di.u, di.d, di.y, di.F
            }, new java.lang.Object[] {
                di.s, di.w, di.f, di.A, di.H
            }, new java.lang.Object[] {
                di.L, di.M, di.N, di.O, di.P
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
                    a[j], java.lang.Character.valueOf('#'), di.B, java.lang.Character.valueOf('X'), obj
                });
            }

        }

    }
}
