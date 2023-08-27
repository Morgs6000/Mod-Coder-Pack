// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile


public final class js extends java.lang.Enum
{

    public static final js a;
    public static final js b;
    public static final js c;
    private static final js d[];

    public static js[] values()
    {
        return (js[])((js []) (d)).clone();
    }

    public static js valueOf(java.lang.String s)
    {
        return (js)java.lang.Enum.valueOf(js, s);
    }

    private js(java.lang.String s, int i)
    {
        super(s, i);
    }

    static 
    {
        a = new js("everything", 0);
        b = new js("mobs", 1);
        c = new js("players", 2);
        d = (new js[] {
            a, b, c
        });
    }
}
