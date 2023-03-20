// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


class ln
{

    static final int field_1193_a[]; /* synthetic field */

    static 
    {
        field_1193_a = new int[fa.values().length];
        try
        {
            field_1193_a[fa.linux.ordinal()] = 1;
        }
        catch(NoSuchFieldError nosuchfielderror) { }
        try
        {
            field_1193_a[fa.solaris.ordinal()] = 2;
        }
        catch(NoSuchFieldError nosuchfielderror1) { }
        try
        {
            field_1193_a[fa.windows.ordinal()] = 3;
        }
        catch(NoSuchFieldError nosuchfielderror2) { }
        try
        {
            field_1193_a[fa.macos.ordinal()] = 4;
        }
        catch(NoSuchFieldError nosuchfielderror3) { }
    }
}
