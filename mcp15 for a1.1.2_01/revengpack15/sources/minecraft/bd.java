// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
import java.util.Random;

public class bd extends ic
{

    public bd()
    {
        field_829_a = -1;
        field_830_d = 0.0D;
        field_828_b = "Pig";
        field_829_a = 20;
    }

    public boolean func_484_a()
    {
        return field_824_e.func_683_a((double)field_823_f + 0.5D, (double)field_822_g + 0.5D, (double)field_821_h + 0.5D, 16D) != null;
    }

    public void func_475_b()
    {
        field_830_d = field_831_c;
        if(!func_484_a())
        {
            return;
        }
        double d = (float)field_823_f + field_824_e.field_1037_n.nextFloat();
        double d2 = (float)field_822_g + field_824_e.field_1037_n.nextFloat();
        double d4 = (float)field_821_h + field_824_e.field_1037_n.nextFloat();
        field_824_e.func_694_a("smoke", d, d2, d4, 0.0D, 0.0D, 0.0D);
        field_824_e.func_694_a("flame", d, d2, d4, 0.0D, 0.0D, 0.0D);
        for(field_831_c += 1000F / ((float)field_829_a + 200F); field_831_c > 360D;)
        {
            field_831_c -= 360D;
            field_830_d -= 360D;
        }

        if(field_829_a == -1)
        {
            func_483_c();
        }
        if(field_829_a > 0)
        {
            field_829_a--;
            return;
        }
        byte byte0 = 4;
        for(int i = 0; i < byte0; i++)
        {
            ge ge1 = (ge)ew.func_1079_a(field_828_b, field_824_e);
            if(ge1 == null)
            {
                return;
            }
            int j = field_824_e.func_657_a(ge1.getClass(), cf.func_1161_b(field_823_f, field_822_g, field_821_h, field_823_f + 1, field_822_g + 1, field_821_h + 1).func_1177_b(8D, 4D, 8D)).size();
            if(j >= 6)
            {
                func_483_c();
                return;
            }
            if(ge1 == null)
            {
                continue;
            }
            double d6 = (double)field_823_f + (field_824_e.field_1037_n.nextDouble() - field_824_e.field_1037_n.nextDouble()) * 4D;
            double d7 = (field_822_g + field_824_e.field_1037_n.nextInt(3)) - 1;
            double d8 = (double)field_821_h + (field_824_e.field_1037_n.nextDouble() - field_824_e.field_1037_n.nextDouble()) * 4D;
            ge1.func_365_c(d6, d7, d8, field_824_e.field_1037_n.nextFloat() * 360F, 0.0F);
            if(!ge1.func_433_a())
            {
                continue;
            }
            field_824_e.func_674_a(ge1);
            for(int k = 0; k < 20; k++)
            {
                double d1 = (double)field_823_f + 0.5D + ((double)field_824_e.field_1037_n.nextFloat() - 0.5D) * 2D;
                double d3 = (double)field_822_g + 0.5D + ((double)field_824_e.field_1037_n.nextFloat() - 0.5D) * 2D;
                double d5 = (double)field_821_h + 0.5D + ((double)field_824_e.field_1037_n.nextFloat() - 0.5D) * 2D;
                field_824_e.func_694_a("smoke", d1, d3, d5, 0.0D, 0.0D, 0.0D);
                field_824_e.func_694_a("flame", d1, d3, d5, 0.0D, 0.0D, 0.0D);
            }

            ge1.func_415_z();
            func_483_c();
        }

        super.func_475_b();
    }

    private void func_483_c()
    {
        field_829_a = 200 + field_824_e.field_1037_n.nextInt(600);
    }

    public void func_482_a(hm hm1)
    {
        super.func_482_a(hm1);
        field_828_b = hm1.func_755_i("EntityId");
        field_829_a = hm1.func_745_d("Delay");
    }

    public void func_481_b(hm hm1)
    {
        super.func_481_b(hm1);
        hm1.func_754_a("EntityId", field_828_b);
        hm1.func_749_a("Delay", (short)field_829_a);
    }

    public int field_829_a;
    public String field_828_b;
    public double field_831_c;
    public double field_830_d;
}
