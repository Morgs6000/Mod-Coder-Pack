// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public enum ih
{
    linux,
    solaris,
    windows,
    macos,
    unknown;
/*
    public static ih[] values()
    {
        return (ih[])field_1481_f.clone();
    }

    public static ih valueOf(String s)
    {
        return (ih)Enum.valueOf(ih.class, s);
    }

    private ih(String s, int i)
    {
        super(s, i);
    }

    public static final ih linux;
    public static final ih solaris;
    public static final ih windows;
    public static final ih macos;
    public static final ih unknown;
    private static final ih field_1481_f[]; /* synthetic field */
/*
    static 
    {
        linux = new ih("linux", 0);
        solaris = new ih("solaris", 1);
        windows = new ih("windows", 2);
        macos = new ih("macos", 3);
        unknown = new ih("unknown", 4);
        field_1481_f = (new ih[] {
            linux, solaris, windows, macos, unknown
        });
    }
*/
}
