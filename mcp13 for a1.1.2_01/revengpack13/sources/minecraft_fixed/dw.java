// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dw
{

    private static final dw a = new dw();
    private java.util.List b;

    public static final dw a()
    {
        return a;
    }

    private dw()
    {
        b = ((java.util.List) (new ArrayList()));
        (new dr()).a(this);
        (new nd()).a(this);
        (new lf()).a(this);
        (new hr()).a(this);
        (new fj()).a(this);
        (new l()).a(this);
        a(new ev(di.aI, 3), new java.lang.Object[] {
            "###", java.lang.Character.valueOf('#'), di.aH
        });
        a(new ev(di.aJ, 1), new java.lang.Object[] {
            "#", "#", "#", java.lang.Character.valueOf('#'), di.aI
        });
        a(new ev(ly.ba, 2), new java.lang.Object[] {
            "###", "###", java.lang.Character.valueOf('#'), di.B
        });
        a(new ev(ly.aZ, 1), new java.lang.Object[] {
            "###", "#X#", "###", java.lang.Character.valueOf('#'), ly.y, java.lang.Character.valueOf('X'), di.l
        });
        a(new ev(ly.ao, 1), new java.lang.Object[] {
            "###", "XXX", "###", java.lang.Character.valueOf('#'), ly.y, java.lang.Character.valueOf('X'), di.aJ
        });
        a(new ev(ly.aV, 1), new java.lang.Object[] {
            "##", "##", java.lang.Character.valueOf('#'), di.aB
        });
        a(new ev(ly.aX, 1), new java.lang.Object[] {
            "##", "##", java.lang.Character.valueOf('#'), di.aG
        });
        a(new ev(ly.am, 1), new java.lang.Object[] {
            "##", "##", java.lang.Character.valueOf('#'), di.aF
        });
        a(new ev(ly.ac, 1), new java.lang.Object[] {
            "###", "###", "###", java.lang.Character.valueOf('#'), di.I
        });
        a(new ev(ly.an, 1), new java.lang.Object[] {
            "X#X", "#X#", "X#X", java.lang.Character.valueOf('X'), di.K, java.lang.Character.valueOf('#'), ly.F
        });
        a(new ev(ly.al, 3), new java.lang.Object[] {
            "###", java.lang.Character.valueOf('#'), ly.x
        });
        a(new ev(ly.aG, 1), new java.lang.Object[] {
            "# #", "###", "# #", java.lang.Character.valueOf('#'), di.B
        });
        a(new ev(di.at, 1), new java.lang.Object[] {
            "##", "##", "##", java.lang.Character.valueOf('#'), ly.y
        });
        a(new ev(di.az, 1), new java.lang.Object[] {
            "##", "##", "##", java.lang.Character.valueOf('#'), di.m
        });
        a(new ev(di.as, 1), new java.lang.Object[] {
            "###", "###", " X ", java.lang.Character.valueOf('#'), ly.y, java.lang.Character.valueOf('X'), di.B
        });
        a(new ev(ly.y, 4), new java.lang.Object[] {
            "#", java.lang.Character.valueOf('#'), ly.K
        });
        a(new ev(di.B, 4), new java.lang.Object[] {
            "#", "#", java.lang.Character.valueOf('#'), ly.y
        });
        a(new ev(ly.ar, 4), new java.lang.Object[] {
            "X", "#", java.lang.Character.valueOf('X'), di.k, java.lang.Character.valueOf('#'), di.B
        });
        a(new ev(di.C, 4), new java.lang.Object[] {
            "# #", " # ", java.lang.Character.valueOf('#'), ly.y
        });
        a(new ev(ly.aH, 16), new java.lang.Object[] {
            "X X", "X#X", "X X", java.lang.Character.valueOf('X'), di.m, java.lang.Character.valueOf('#'), di.B
        });
        a(new ev(di.ax, 1), new java.lang.Object[] {
            "# #", "###", java.lang.Character.valueOf('#'), di.m
        });
        a(new ev(di.aL, 1), new java.lang.Object[] {
            "A", "B", java.lang.Character.valueOf('A'), ly.av, java.lang.Character.valueOf('B'), di.ax
        });
        a(new ev(di.aM, 1), new java.lang.Object[] {
            "A", "B", java.lang.Character.valueOf('A'), ly.aC, java.lang.Character.valueOf('B'), di.ax
        });
        a(new ev(di.aC, 1), new java.lang.Object[] {
            "# #", "###", java.lang.Character.valueOf('#'), ly.y
        });
        a(new ev(di.au, 1), new java.lang.Object[] {
            "# #", " # ", java.lang.Character.valueOf('#'), di.m
        });
        a(new ev(di.g, 1), new java.lang.Object[] {
            "A ", " B", java.lang.Character.valueOf('A'), di.m, java.lang.Character.valueOf('B'), di.an
        });
        a(new ev(di.S, 1), new java.lang.Object[] {
            "###", java.lang.Character.valueOf('#'), di.R
        });
        a(new ev(ly.au, 4), new java.lang.Object[] {
            "#  ", "## ", "###", java.lang.Character.valueOf('#'), ly.y
        });
        a(new ev(di.aP, 1), new java.lang.Object[] {
            "  #", " #X", "# X", java.lang.Character.valueOf('#'), di.B, java.lang.Character.valueOf('X'), di.I
        });
        a(new ev(ly.aI, 4), new java.lang.Object[] {
            "#  ", "## ", "###", java.lang.Character.valueOf('#'), ly.x
        });
        a(new ev(di.aq, 1), new java.lang.Object[] {
            "###", "#X#", "###", java.lang.Character.valueOf('#'), di.B, java.lang.Character.valueOf('X'), ly.ac
        });
        a(new ev(di.ar, 1), new java.lang.Object[] {
            "###", "#X#", "###", java.lang.Character.valueOf('#'), ly.ai, java.lang.Character.valueOf('X'), di.h
        });
        a(new ev(ly.aK, 1), new java.lang.Object[] {
            "X", "#", java.lang.Character.valueOf('#'), ly.x, java.lang.Character.valueOf('X'), di.B
        });
        a(new ev(ly.aR, 1), new java.lang.Object[] {
            "X", "#", java.lang.Character.valueOf('#'), di.B, java.lang.Character.valueOf('X'), di.aA
        });
        a(new ev(di.aO, 1), new java.lang.Object[] {
            " # ", "#X#", " # ", java.lang.Character.valueOf('#'), di.m, java.lang.Character.valueOf('X'), di.aA
        });
        a(new ev(ly.aS, 1), new java.lang.Object[] {
            "#", "#", java.lang.Character.valueOf('#'), ly.u
        });
        a(new ev(ly.aL, 1), new java.lang.Object[] {
            "###", java.lang.Character.valueOf('#'), ly.u
        });
        a(new ev(ly.aN, 1), new java.lang.Object[] {
            "###", java.lang.Character.valueOf('#'), ly.y
        });
        java.util.Collections.sort(b, ((java.util.Comparator) (new fs(this))));
        java.lang.System.out.println((new StringBuilder()).append(b.size()).append(" recipes").toString());
    }

    void a(ev ev1, java.lang.Object aobj[])
    {
        java.lang.String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        if(aobj[i] instanceof java.lang.String[])
        {
            java.lang.String as[] = (java.lang.String[])(java.lang.String[])aobj[i++];
            for(int i1 = 0; i1 < as.length; i1++)
            {
                java.lang.String s2 = as[i1];
                k++;
                j = s2.length();
                s = (new StringBuilder()).append(s).append(s2).toString();
            }

        } else
        {
            while(aobj[i] instanceof java.lang.String) 
            {
                java.lang.String s1 = (java.lang.String)aobj[i++];
                k++;
                j = s1.length();
                s = (new StringBuilder()).append(s).append(s1).toString();
            }
        }
        java.util.HashMap hashmap = new HashMap();
        for(; i < aobj.length; i += 2)
        {
            java.lang.Character character = (java.lang.Character)aobj[i];
            int j1 = 0;
            if(aobj[i + 1] instanceof di)
                j1 = ((di)aobj[i + 1]).aS;
            else
            if(aobj[i + 1] instanceof ly)
                j1 = ((ly)aobj[i + 1]).bc;
            ((java.util.Map) (hashmap)).put(((java.lang.Object) (character)), ((java.lang.Object) (java.lang.Integer.valueOf(j1))));
        }

        int ai[] = new int[j * k];
        for(int k1 = 0; k1 < j * k; k1++)
        {
            char c = s.charAt(k1);
            if(((java.util.Map) (hashmap)).containsKey(((java.lang.Object) (java.lang.Character.valueOf(c)))))
                ai[k1] = ((java.lang.Integer)((java.util.Map) (hashmap)).get(((java.lang.Object) (java.lang.Character.valueOf(c))))).intValue();
            else
                ai[k1] = -1;
        }

        b.add(((java.lang.Object) (new bv(j, k, ai, ev1))));
    }

    public ev a(int ai[])
    {
        for(int i = 0; i < b.size(); i++)
        {
            bv bv1 = (bv)b.get(i);
            if(bv1.a(ai))
                return bv1.b(ai);
        }

        return null;
    }

}
