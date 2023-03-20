// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public enum fa
{
    linux,
    solaris,
    windows,
    macos,
    unknown;
/*
    public static fa[] values()
    {
        return (fa[])field_1597_f.clone();
    }

    public static fa valueOf(String s)
    {
        return (fa)Enum.valueOf(fa.class, s);
    }

    private fa(String s, int i)
    {
        super(s, i);
    }

    public static final fa linux;
    public static final fa solaris;
    public static final fa windows;
    public static final fa macos;
    public static final fa unknown;
    private static final fa field_1597_f[]; /* synthetic field */
/*
    static 
    {
        linux = new fa("linux", 0);
        solaris = new fa("solaris", 1);
        windows = new fa("windows", 2);
        macos = new fa("macos", 3);
        unknown = new fa("unknown", 4);
        field_1597_f = (new fa[] {
            linux, solaris, windows, macos, unknown
        });
    }
*/
}
