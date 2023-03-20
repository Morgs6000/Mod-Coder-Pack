// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ll
{

    public ll(ed aed[])
    {
        field_1194_b = 0;
        field_1196_c = false;
        field_1195_a = aed;
        field_1194_b = aed.length;
    }

    public ll(ed aed[], int i, int j, int k, int l)
    {
        this(aed);
        float f = 0.0015625F;
        float f1 = 0.003125F;
        aed[0] = aed[0].func_1115_a((float)k / 64F - f, (float)j / 32F + f1);
        aed[1] = aed[1].func_1115_a((float)i / 64F + f, (float)j / 32F + f1);
        aed[2] = aed[2].func_1115_a((float)i / 64F + f, (float)l / 32F - f1);
        aed[3] = aed[3].func_1115_a((float)k / 64F - f, (float)l / 32F - f1);
    }

    public void func_809_a()
    {
        ed aed[] = new ed[field_1195_a.length];
        for(int i = 0; i < field_1195_a.length; i++)
        {
            aed[i] = field_1195_a[field_1195_a.length - i - 1];
        }

        field_1195_a = aed;
    }

    public void func_808_a(ho ho1, float f)
    {
        aj aj1 = field_1195_a[1].field_1655_a.func_1262_a(field_1195_a[0].field_1655_a);
        aj aj2 = field_1195_a[1].field_1655_a.func_1262_a(field_1195_a[2].field_1655_a);
        aj aj3 = aj2.func_1246_b(aj1).func_1252_b();
        ho1.func_977_b();
        if(field_1196_c)
        {
            ho1.func_980_b(-(float)aj3.field_1776_a, -(float)aj3.field_1775_b, -(float)aj3.field_1779_c);
        } else
        {
            ho1.func_980_b((float)aj3.field_1776_a, (float)aj3.field_1775_b, (float)aj3.field_1779_c);
        }
        for(int i = 0; i < 4; i++)
        {
            ed ed1 = field_1195_a[i];
            ho1.func_983_a((float)ed1.field_1655_a.field_1776_a * f, (float)ed1.field_1655_a.field_1775_b * f, (float)ed1.field_1655_a.field_1779_c * f, ed1.field_1654_b, ed1.field_1656_c);
        }

        ho1.func_982_a();
    }

    public ed field_1195_a[];
    public int field_1194_b;
    private boolean field_1196_c;
}
