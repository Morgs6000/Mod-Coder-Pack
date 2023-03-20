// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.Random;

public class jg extends di
{

    public jg(int i)
    {
        super(i);
        field_290_aT = 1;
    }

    public ev func_193_a(ev ev, cn cn1, dm dm1)
    {
        if(dm1.field_778_b.func_510_b(di.field_226_j.field_291_aS))
        {
            cn1.func_623_a(dm1, "random.bow", 1.0F, 1.0F / (field_234_b.nextFloat() * 0.4F + 0.8F));
            cn1.func_674_a(new kg(cn1, dm1));
        }
        return ev;
    }
}
