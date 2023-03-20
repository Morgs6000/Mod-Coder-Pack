// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

//import net.minecraft.client.Minecraft;

public class fq
{

    public static final int field_1585_a[]; /* synthetic field */

    static 
    {
        field_1585_a = new int[ih.values().length];
        try
        {
            field_1585_a[ih.linux.ordinal()] = 1;
        }
        catch(NoSuchFieldError nosuchfielderror) { }
        try
        {
            field_1585_a[ih.solaris.ordinal()] = 2;
        }
        catch(NoSuchFieldError nosuchfielderror1) { }
        try
        {
            field_1585_a[ih.windows.ordinal()] = 3;
        }
        catch(NoSuchFieldError nosuchfielderror2) { }
        try
        {
            field_1585_a[ih.macos.ordinal()] = 4;
        }
        catch(NoSuchFieldError nosuchfielderror3) { }
    }
}
