// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

import java.util.List;
//import Minecraft;
import org.lwjgl.opengl.GL11;

public class id extends ee
{

    private ke j;

    public id(eu eu, ke ke1)
    {
        j = ke1;
        this.i.add(((java.lang.Object) (new mm(((ee) (this)), ((gh) (ke1)), 0, 56, 17))));
        this.i.add(((java.lang.Object) (new mm(((ee) (this)), ((gh) (ke1)), 1, 56, 53))));
        this.i.add(((java.lang.Object) (new mm(((ee) (this)), ((gh) (ke1)), 2, 116, 35))));
        for(int i = 0; i < 3; i++)
        {
            for(int l = 0; l < 9; l++)
                this.i.add(((java.lang.Object) (new mm(((ee) (this)), ((gh) (eu)), l + (i + 1) * 9, 8 + l * 18, 84 + i * 18))));

        }

        for(int k = 0; k < 9; k++)
            this.i.add(((java.lang.Object) (new mm(((ee) (this)), ((gh) (eu)), k, 8 + k * 18, 142))));

    }

    protected void j()
    {
        g.b("Furnace", 60, 6, 0x404040);
        g.b("Inventory", 8, (h - 96) + 2, 0x404040);
    }

    protected void a(float f)
    {
        int i = b.n.a("/gui/furnace.png");
        org.lwjgl.opengl.GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        b.n.b(i);
        int k = (c - a) / 2;
        int l = (d - h) / 2;
        b(k, l, 0, 0, a, h);
        if(j.a())
        {
            int i1 = j.b(12);
            b(k + 56, (l + 36 + 12) - i1, 176, 12 - i1, 14, i1 + 2);
        }
        int j1 = j.a(24);
        b(k + 79, l + 34, 176, 14, j1 + 1, 16);
    }
}
