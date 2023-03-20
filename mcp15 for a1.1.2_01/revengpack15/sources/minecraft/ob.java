// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ob extends ic
{

    public ob()
    {
        field_825_b = -1;
    }

    public void func_481_b(hm hm1)
    {
        super.func_481_b(hm1);
        hm1.func_754_a("Text1", field_826_a[0]);
        hm1.func_754_a("Text2", field_826_a[1]);
        hm1.func_754_a("Text3", field_826_a[2]);
        hm1.func_754_a("Text4", field_826_a[3]);
    }

    public void func_482_a(hm hm1)
    {
        super.func_482_a(hm1);
        for(int i = 0; i < 4; i++)
        {
            field_826_a[i] = hm1.func_755_i((new StringBuilder()).append("Text").append(i + 1).toString());
            if(field_826_a[i].length() > 15)
            {
                field_826_a[i] = field_826_a[i].substring(0, 15);
            }
        }

    }

    public String field_826_a[] = {
        "", "", "", ""
    };
    public int field_825_b;
}
