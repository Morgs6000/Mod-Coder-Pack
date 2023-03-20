// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class bp extends di
{

    public bp(int i)
    {
        super(i);
        field_290_aT = 16;
    }

    public ev func_193_a(ev ev1, cn cn1, dm dm)
    {
        ev1.field_1615_a--;
        cn1.func_623_a(dm, "random.bow", 0.5F, 0.4F / (field_234_b.nextFloat() * 0.4F + 0.8F));
        cn1.func_674_a(new ao(cn1, dm));
        return ev1;
    }
}
