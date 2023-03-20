// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.ArrayList;
import java.util.List;

class mk
{

    public mk(iffix iffix1, cn cn1, int i, int j, int k)
    {
        super();
        field_1160_a = iffix1;
        field_1161_g = new ArrayList();
        field_1159_b = cn1;
        field_1165_c = i;
        field_1164_d = j;
        field_1163_e = k;
        field_1162_f = cn1.func_602_e(i, j, k);
        func_789_a();
    }

    private void func_789_a()
    {
        field_1161_g.clear();
        if(field_1162_f == 0)
        {
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e - 1));
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e + 1));
        } else
        if(field_1162_f == 1)
        {
            field_1161_g.add(new mt(field_1165_c - 1, field_1164_d, field_1163_e));
            field_1161_g.add(new mt(field_1165_c + 1, field_1164_d, field_1163_e));
        } else
        if(field_1162_f == 2)
        {
            field_1161_g.add(new mt(field_1165_c - 1, field_1164_d, field_1163_e));
            field_1161_g.add(new mt(field_1165_c + 1, field_1164_d + 1, field_1163_e));
        } else
        if(field_1162_f == 3)
        {
            field_1161_g.add(new mt(field_1165_c - 1, field_1164_d + 1, field_1163_e));
            field_1161_g.add(new mt(field_1165_c + 1, field_1164_d, field_1163_e));
        } else
        if(field_1162_f == 4)
        {
            field_1161_g.add(new mt(field_1165_c, field_1164_d + 1, field_1163_e - 1));
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e + 1));
        } else
        if(field_1162_f == 5)
        {
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e - 1));
            field_1161_g.add(new mt(field_1165_c, field_1164_d + 1, field_1163_e + 1));
        } else
        if(field_1162_f == 6)
        {
            field_1161_g.add(new mt(field_1165_c + 1, field_1164_d, field_1163_e));
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e + 1));
        } else
        if(field_1162_f == 7)
        {
            field_1161_g.add(new mt(field_1165_c - 1, field_1164_d, field_1163_e));
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e + 1));
        } else
        if(field_1162_f == 8)
        {
            field_1161_g.add(new mt(field_1165_c - 1, field_1164_d, field_1163_e));
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e - 1));
        } else
        if(field_1162_f == 9)
        {
            field_1161_g.add(new mt(field_1165_c + 1, field_1164_d, field_1163_e));
            field_1161_g.add(new mt(field_1165_c, field_1164_d, field_1163_e - 1));
        }
    }

    private void func_785_b()
    {
        for(int i = 0; i < field_1161_g.size(); i++)
        {
            mk mk1 = func_795_a((mt)field_1161_g.get(i));
            if(mk1 == null || !mk1.func_793_b(this))
            {
                field_1161_g.remove(i--);
            } else
            {
                field_1161_g.set(i, new mt(mk1.field_1165_c, mk1.field_1164_d, mk1.field_1163_e));
            }
        }

    }

    private boolean func_784_a(int i, int j, int k)
    {
        if(field_1159_b.func_600_a(i, j, k) == field_1160_a.field_376_bc)
        {
            return true;
        }
        if(field_1159_b.func_600_a(i, j + 1, k) == field_1160_a.field_376_bc)
        {
            return true;
        }
        return field_1159_b.func_600_a(i, j - 1, k) == field_1160_a.field_376_bc;
    }

    private mk func_795_a(mt mt1)
    {
        if(field_1159_b.func_600_a(mt1.field_1111_a, mt1.field_1110_b, mt1.field_1112_c) == field_1160_a.field_376_bc)
        {
            return new mk(field_1160_a, field_1159_b, mt1.field_1111_a, mt1.field_1110_b, mt1.field_1112_c);
        }
        if(field_1159_b.func_600_a(mt1.field_1111_a, mt1.field_1110_b + 1, mt1.field_1112_c) == field_1160_a.field_376_bc)
        {
            return new mk(field_1160_a, field_1159_b, mt1.field_1111_a, mt1.field_1110_b + 1, mt1.field_1112_c);
        }
        if(field_1159_b.func_600_a(mt1.field_1111_a, mt1.field_1110_b - 1, mt1.field_1112_c) == field_1160_a.field_376_bc)
        {
            return new mk(field_1160_a, field_1159_b, mt1.field_1111_a, mt1.field_1110_b - 1, mt1.field_1112_c);
        } else
        {
            return null;
        }
    }

    private boolean func_793_b(mk mk1)
    {
        for(int i = 0; i < field_1161_g.size(); i++)
        {
            mt mt1 = (mt)field_1161_g.get(i);
            if(mt1.field_1111_a == mk1.field_1165_c && mt1.field_1112_c == mk1.field_1163_e)
            {
                return true;
            }
        }

        return false;
    }

    private boolean func_794_b(int i, int j, int k)
    {
        for(int l = 0; l < field_1161_g.size(); l++)
        {
            mt mt1 = (mt)field_1161_g.get(l);
            if(mt1.field_1111_a == i && mt1.field_1112_c == k)
            {
                return true;
            }
        }

        return false;
    }

    private int func_790_c()
    {
        int i = 0;
        if(func_784_a(field_1165_c, field_1164_d, field_1163_e - 1))
        {
            i++;
        }
        if(func_784_a(field_1165_c, field_1164_d, field_1163_e + 1))
        {
            i++;
        }
        if(func_784_a(field_1165_c - 1, field_1164_d, field_1163_e))
        {
            i++;
        }
        if(func_784_a(field_1165_c + 1, field_1164_d, field_1163_e))
        {
            i++;
        }
        return i;
    }

    private boolean func_787_c(mk mk1)
    {
        if(func_793_b(mk1))
        {
            return true;
        }
        if(field_1161_g.size() == 2)
        {
            return false;
        }
        if(field_1161_g.size() == 0)
        {
            return true;
        }
        mt mt1 = (mt)field_1161_g.get(0);
        return mk1.field_1164_d != field_1164_d || mt1.field_1110_b != field_1164_d ? true : true;
    }

    private void func_788_d(mk mk1)
    {
        field_1161_g.add(new mt(mk1.field_1165_c, mk1.field_1164_d, mk1.field_1163_e));
        boolean flag = func_794_b(field_1165_c, field_1164_d, field_1163_e - 1);
        boolean flag1 = func_794_b(field_1165_c, field_1164_d, field_1163_e + 1);
        boolean flag2 = func_794_b(field_1165_c - 1, field_1164_d, field_1163_e);
        boolean flag3 = func_794_b(field_1165_c + 1, field_1164_d, field_1163_e);
        byte byte0 = -1;
        if(flag || flag1)
        {
            byte0 = 0;
        }
        if(flag2 || flag3)
        {
            byte0 = 1;
        }
        if(flag1 && flag3 && !flag && !flag2)
        {
            byte0 = 6;
        }
        if(flag1 && flag2 && !flag && !flag3)
        {
            byte0 = 7;
        }
        if(flag && flag2 && !flag1 && !flag3)
        {
            byte0 = 8;
        }
        if(flag && flag3 && !flag1 && !flag2)
        {
            byte0 = 9;
        }
        if(byte0 == 0)
        {
            if(field_1159_b.func_600_a(field_1165_c, field_1164_d + 1, field_1163_e - 1) == field_1160_a.field_376_bc)
            {
                byte0 = 4;
            }
            if(field_1159_b.func_600_a(field_1165_c, field_1164_d + 1, field_1163_e + 1) == field_1160_a.field_376_bc)
            {
                byte0 = 5;
            }
        }
        if(byte0 == 1)
        {
            if(field_1159_b.func_600_a(field_1165_c + 1, field_1164_d + 1, field_1163_e) == field_1160_a.field_376_bc)
            {
                byte0 = 2;
            }
            if(field_1159_b.func_600_a(field_1165_c - 1, field_1164_d + 1, field_1163_e) == field_1160_a.field_376_bc)
            {
                byte0 = 3;
            }
        }
        if(byte0 < 0)
        {
            byte0 = 0;
        }
        field_1159_b.func_691_b(field_1165_c, field_1164_d, field_1163_e, byte0);
    }

    private boolean func_786_c(int i, int j, int k)
    {
        mk mk1 = func_795_a(new mt(i, j, k));
        if(mk1 == null)
        {
            return false;
        } else
        {
            mk1.func_785_b();
            return mk1.func_787_c(this);
        }
    }

    public void func_792_a(boolean flag)
    {
        boolean flag1 = func_786_c(field_1165_c, field_1164_d, field_1163_e - 1);
        boolean flag2 = func_786_c(field_1165_c, field_1164_d, field_1163_e + 1);
        boolean flag3 = func_786_c(field_1165_c - 1, field_1164_d, field_1163_e);
        boolean flag4 = func_786_c(field_1165_c + 1, field_1164_d, field_1163_e);
        int i = -1;
        if((flag1 || flag2) && !flag3 && !flag4)
        {
            i = 0;
        }
        if((flag3 || flag4) && !flag1 && !flag2)
        {
            i = 1;
        }
        if(flag2 && flag4 && !flag1 && !flag3)
        {
            i = 6;
        }
        if(flag2 && flag3 && !flag1 && !flag4)
        {
            i = 7;
        }
        if(flag1 && flag3 && !flag2 && !flag4)
        {
            i = 8;
        }
        if(flag1 && flag4 && !flag2 && !flag3)
        {
            i = 9;
        }
        if(i == -1)
        {
            if(flag1 || flag2)
            {
                i = 0;
            }
            if(flag3 || flag4)
            {
                i = 1;
            }
            if(flag)
            {
                if(flag2 && flag4)
                {
                    i = 6;
                }
                if(flag3 && flag2)
                {
                    i = 7;
                }
                if(flag4 && flag1)
                {
                    i = 9;
                }
                if(flag1 && flag3)
                {
                    i = 8;
                }
            } else
            {
                if(flag1 && flag3)
                {
                    i = 8;
                }
                if(flag4 && flag1)
                {
                    i = 9;
                }
                if(flag3 && flag2)
                {
                    i = 7;
                }
                if(flag2 && flag4)
                {
                    i = 6;
                }
            }
        }
        if(i == 0)
        {
            if(field_1159_b.func_600_a(field_1165_c, field_1164_d + 1, field_1163_e - 1) == field_1160_a.field_376_bc)
            {
                i = 4;
            }
            if(field_1159_b.func_600_a(field_1165_c, field_1164_d + 1, field_1163_e + 1) == field_1160_a.field_376_bc)
            {
                i = 5;
            }
        }
        if(i == 1)
        {
            if(field_1159_b.func_600_a(field_1165_c + 1, field_1164_d + 1, field_1163_e) == field_1160_a.field_376_bc)
            {
                i = 2;
            }
            if(field_1159_b.func_600_a(field_1165_c - 1, field_1164_d + 1, field_1163_e) == field_1160_a.field_376_bc)
            {
                i = 3;
            }
        }
        if(i < 0)
        {
            i = 0;
        }
        field_1162_f = i;
        func_789_a();
        field_1159_b.func_691_b(field_1165_c, field_1164_d, field_1163_e, i);
        for(int j = 0; j < field_1161_g.size(); j++)
        {
            mk mk1 = func_795_a((mt)field_1161_g.get(j));
            if(mk1 == null)
            {
                continue;
            }
            mk1.func_785_b();
            if(mk1.func_787_c(this))
            {
                mk1.func_788_d(this);
            }
        }

    }

    static int func_791_a(mk mk1)
    {
        return mk1.func_790_c();
    }

    private cn field_1159_b;
    private int field_1165_c;
    private int field_1164_d;
    private int field_1163_e;
    private int field_1162_f;
    private List field_1161_g;
    final iffix field_1160_a; /* synthetic field */
}
