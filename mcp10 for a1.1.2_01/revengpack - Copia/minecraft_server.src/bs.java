// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
import java.util.Random;

public class bs extends as
{

    public int e;
    public java.lang.String f;
    public double g;
    public double h;

    public bs()
    {
        e = -1;
        h = 0.0D;
        f = "Pig";
        e = 20;
    }

    public boolean a()
    {
        return a.a((double)b + 0.5D, (double)c + 0.5D, (double)d + 0.5D, 16D) != null;
    }

    public void b()
    {
        h = g;
        if(!a())
            return;
        double d1 = (float)b + a.m.nextFloat();
        double d3 = (float)c + a.m.nextFloat();
        double d5 = (float)d + a.m.nextFloat();
        a.a("smoke", d1, d3, d5, 0.0D, 0.0D, 0.0D);
        a.a("flame", d1, d3, d5, 0.0D, 0.0D, 0.0D);
        for(g += 1000F / ((float)e + 200F); g > 360D;)
        {
            g -= 360D;
            h -= 360D;
        }

        if(e == -1)
            d();
        if(e > 0)
        {
            e--;
            return;
        }
        byte byte0 = 4;
        for(int i = 0; i < byte0; i++)
        {
            is is1 = (is)(is)gr.a(f, a);
            if(is1 == null)
                return;
            int j = a.a(((java.lang.Object) (is1)).getClass(), dg.b(b, c, d, b + 1, c + 1, d + 1).b(8D, 4D, 8D)).size();
            if(j >= 6)
            {
                d();
                return;
            }
            if(is1 == null)
                continue;
            double d7 = (double)b + (a.m.nextDouble() - a.m.nextDouble()) * 4D;
            double d8 = (c + a.m.nextInt(3)) - 1;
            double d9 = (double)d + (a.m.nextDouble() - a.m.nextDouble()) * 4D;
            is1.c(d7, d8, d9, a.m.nextFloat() * 360F, 0.0F);
            if(!is1.a())
                continue;
            a.a(((dj) (is1)));
            for(int k = 0; k < 20; k++)
            {
                double d2 = (double)b + 0.5D + ((double)a.m.nextFloat() - 0.5D) * 2D;
                double d4 = (double)c + 0.5D + ((double)a.m.nextFloat() - 0.5D) * 2D;
                double d6 = (double)d + 0.5D + ((double)a.m.nextFloat() - 0.5D) * 2D;
                a.a("smoke", d2, d4, d6, 0.0D, 0.0D, 0.0D);
                a.a("flame", d2, d4, d6, 0.0D, 0.0D, 0.0D);
            }

            is1.D();
            d();
        }

        super.b();
    }

    private void d()
    {
        e = 200 + a.m.nextInt(600);
    }

    public void a(s s1)
    {
        super.a(s1);
        f = s1.h("EntityId");
        e = ((int) (s1.c("Delay")));
    }

    public void b(s s1)
    {
        super.b(s1);
        s1.a("EntityId", f);
        s1.a("Delay", (short)e);
    }
}
