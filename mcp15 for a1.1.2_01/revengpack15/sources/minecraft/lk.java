// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.File;

class lk extends cn
{

    lk(ad ad1, File file, String s)
    {
        super(file, s);
        field_1051_z = ad1;
    }

    protected aw func_610_a(File file)
    {
        return new ck(this, new le(file, false));
    }

    final ad field_1051_z; /* synthetic field */
}
