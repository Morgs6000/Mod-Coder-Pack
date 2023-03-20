// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.File;

class WorldIso extends World
{

    WorldIso(IsoListener isolistener, File file, String s)
    {
        super(file, s);
        field_1051_z = isolistener;
    }

    protected IChunkProvider func_610_a(File file)
    {
        return new ChunkProviderIso(this, new ChunkLoader(file, false));
    }

    final IsoListener field_1051_z; /* synthetic field */
}
