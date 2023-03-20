// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.IOException;

public class ck
    implements aw
{

    public ck(cn cn, af af1)
    {
        field_898_b = new ga[256];
        field_899_a = new byte[32768];
        field_901_c = cn;
        field_900_d = af1;
    }

    public boolean func_537_a(int i, int j)
    {
        int k = i & 0xf | (j & 0xf) * 16;
        return field_898_b[k] != null && field_898_b[k].func_1017_a(i, j);
    }

    public ga func_533_b(int i, int j)
    {
        int k = i & 0xf | (j & 0xf) * 16;
        try
        {
            if(!func_537_a(i, j))
            {
                ga ga1 = func_543_c(i, j);
                if(ga1 == null)
                {
                    ga1 = new ga(field_901_c, field_899_a, i, j);
                    ga1.field_1524_q = true;
                    ga1.field_1525_p = true;
                }
                field_898_b[k] = ga1;
            }
            return field_898_b[k];
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return null;
    }

    private synchronized ga func_543_c(int i, int j)
    {
        try
        {
            return field_900_d.func_813_a(field_901_c, i, j);
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return null;
    }

    public void func_534_a(aw aw1, int i, int j)
    {
    }

    public boolean func_535_a(boolean flag, nu nu)
    {
        return true;
    }

    public boolean func_532_a()
    {
        return false;
    }

    public boolean func_536_b()
    {
        return false;
    }

    private ga field_898_b[];
    private cn field_901_c;
    private af field_900_d;
    byte field_899_a[];
}
