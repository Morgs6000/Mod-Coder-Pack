// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public class nd
{

    private java.lang.String a[][] = {
        {
            "X", "X", "#"
        }
    };
    private java.lang.Object b[][];

    public nd()
    {
        b = (new java.lang.Object[][] {
            new java.lang.Object[] {
                ly.y, ly.x, di.m, di.l, di.n
            }, new java.lang.Object[] {
                di.p, di.t, di.o, di.x, di.E
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

        dw1.a(new ev(di.i, 1), new java.lang.Object[] {
            " #X", "# X", " #X", java.lang.Character.valueOf('X'), di.I, java.lang.Character.valueOf('#'), di.B
        });
        dw1.a(new ev(di.j, 4), new java.lang.Object[] {
            "X", "#", "Y", java.lang.Character.valueOf('Y'), di.J, java.lang.Character.valueOf('X'), di.an, java.lang.Character.valueOf('#'), di.B
        });
    }
}
