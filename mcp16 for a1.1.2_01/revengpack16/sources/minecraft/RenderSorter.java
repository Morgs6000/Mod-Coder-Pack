// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Comparator;

public class RenderSorter
    implements Comparator
{

    public RenderSorter(EntityPlayer entityplayer)
    {
        field_1521_a = entityplayer;
    }

    public int func_993_a(WorldRenderer worldrenderer, WorldRenderer worldrenderer1)
    {
        boolean flag = worldrenderer.field_1749_o;
        boolean flag1 = worldrenderer1.field_1749_o;
        if(flag && !flag1)
        {
            return 1;
        }
        if(flag1 && !flag)
        {
            return -1;
        } else
        {
            return worldrenderer.func_1202_a(field_1521_a) >= worldrenderer1.func_1202_a(field_1521_a) ? -1 : 1;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return func_993_a((WorldRenderer)obj, (WorldRenderer)obj1);
    }

    private EntityPlayer field_1521_a;
}
