// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.Random;

public class fh extends is
    implements dz
{

    public float a;
    public float b;
    private int ae;
    public int ad;

    public fh(dy dy1)
    {
        super(dy1);
        ae = 0;
        ad = 1;
        aC = "/mob/slime.png";
        ad = 1 << R.nextInt(3);
        C = 0.0F;
        ae = R.nextInt(20) + 10;
        c(ad);
    }

    public void c(int i)
    {
        ad = i;
        a(0.6F * (float)i, 0.6F * (float)i);
        aM = i * i;
        a(l, m, n);
    }

    public void a(s s1)
    {
        super.a(s1);
        s1.a("Size", ad - 1);
    }

    public void b(s s1)
    {
        super.b(s1);
        ad = s1.d("Size") + 1;
    }

    public void b_()
    {
        b = a;
        boolean flag = w;
        super.b_();
        if(w && !flag)
        {
            for(int i = 0; i < ad * 8; i++)
            {
                float f1 = R.nextFloat() * 3.141593F * 2.0F;
                float f2 = R.nextFloat() * 0.5F + 0.5F;
                float f3 = gj.a(f1) * (float)ad * 0.5F * f2;
                float f4 = gj.b(f1) * (float)ad * 0.5F * f2;
                h.a("slime", l + (double)f3, v.b, n + (double)f4, 0.0D, 0.0D, 0.0D);
            }

            if(ad > 2)
                h.a(((dj) (this)), "mob.slime", f(), ((R.nextFloat() - R.nextFloat()) * 0.2F + 1.0F) / 0.8F);
            a = -0.5F;
        }
        a = a * 0.6F;
    }

    protected void d_()
    {
        fc fc1 = h.a(((dj) (this)), 16D);
        if(fc1 != null)
            b(((dj) (fc1)), 10F);
        if(w && ae-- <= 0)
        {
            ae = R.nextInt(20) + 10;
            if(fc1 != null)
                ae /= 3;
            bg = true;
            if(ad > 1)
                h.a(((dj) (this)), "mob.slime", f(), ((R.nextFloat() - R.nextFloat()) * 0.2F + 1.0F) * 0.8F);
            a = 1.0F;
            bd = 1.0F - R.nextFloat() * 2.0F;
            be = 1 * ad;
        } else
        {
            bg = false;
            if(w)
                bd = be = 0.0F;
        }
    }

    public void j()
    {
        if(ad > 1 && aM == 0)
        {
            for(int i = 0; i < 4; i++)
            {
                float f1 = (((float)(i % 2) - 0.5F) * (float)ad) / 4F;
                float f2 = (((float)(i / 2) - 0.5F) * (float)ad) / 4F;
                fh fh1 = new fh(h);
                fh1.c(ad / 2);
                fh1.c(l + (double)f1, m + 0.5D, n + (double)f2, R.nextFloat() * 360F, 0.0F);
                h.a(((dj) (fh1)));
            }

        }
        super.j();
    }

    public void a(fc fc1)
    {
        if(ad > 1 && g(((dj) (fc1))) && (double)a(((dj) (fc1))) < 0.59999999999999998D * (double)ad && fc1.a(((dj) (this)), ad))
            h.a(((dj) (this)), "mob.slimeattack", 1.0F, (R.nextFloat() - R.nextFloat()) * 0.2F + 1.0F);
    }

    protected java.lang.String d()
    {
        return "mob.slime";
    }

    protected java.lang.String e()
    {
        return "mob.slime";
    }

    protected int g()
    {
        if(ad == 1)
            return ez.aK.aS;
        else
            return 0;
    }

    public boolean a()
    {
        im im1 = h.a(gj.b(l), gj.b(m));
        return (ad == 1 || h.l > 0) && R.nextInt(10) == 0 && im1.a(0x3ad8025fL).nextInt(10) == 0 && m < 16D;
    }

    protected float f()
    {
        return 0.6F;
    }
}
