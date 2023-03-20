// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;
//import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ea extends ee
{

    public ea(gh gh1, gh gh2)
    {
        field_980_m = 0;
        field_982_j = gh1;
        field_981_l = gh2;
        field_948_f = false;
        char c = '\336';
        int i = c - 108;
        field_980_m = gh2.func_469_c() / 9;
        field_974_h = i + field_980_m * 18;
        int j = (field_980_m - 4) * 18;
        for(int k = 0; k < field_980_m; k++)
        {
            for(int j1 = 0; j1 < 9; j1++)
            {
                field_973_i.add(new mm(this, gh2, j1 + k * 9, 8 + j1 * 18, 18 + k * 18));
            }

        }

        for(int l = 0; l < 3; l++)
        {
            for(int k1 = 0; k1 < 9; k1++)
            {
                field_973_i.add(new mm(this, gh1, k1 + (l + 1) * 9, 8 + k1 * 18, 103 + l * 18 + j));
            }

        }

        for(int i1 = 0; i1 < 9; i1++)
        {
            field_973_i.add(new mm(this, gh1, i1, 8 + i1 * 18, 161 + j));
        }

    }

    protected void func_587_j()
    {
        field_947_g.func_873_b(field_981_l.func_471_d(), 8, 6, 0x404040);
        field_947_g.func_873_b(field_982_j.func_471_d(), 8, (field_974_h - 96) + 2, 0x404040);
    }

    protected void func_589_a(float f)
    {
        int i = field_945_b.field_171_n.func_1070_a("/gui/container.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        field_945_b.field_171_n.func_1076_b(i);
        int j = (field_951_c - field_971_a) / 2;
        int k = (field_950_d - field_974_h) / 2;
        func_550_b(j, k, 0, 0, field_971_a, field_980_m * 18 + 17);
        func_550_b(j, k + field_980_m * 18 + 17, 0, 126, field_971_a, 96);
    }

    private gh field_982_j;
    private gh field_981_l;
    private int field_980_m;
}
