// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class TexturedQuad
{

    public TexturedQuad(PositionTexureVertex apositiontexurevertex[])
    {
        field_1194_b = 0;
        field_1196_c = false;
        field_1195_a = apositiontexurevertex;
        field_1194_b = apositiontexurevertex.length;
    }

    public TexturedQuad(PositionTexureVertex apositiontexurevertex[], int i, int j, int k, int l)
    {
        this(apositiontexurevertex);
        float f = 0.0015625F;
        float f1 = 0.003125F;
        apositiontexurevertex[0] = apositiontexurevertex[0].func_1115_a((float)k / 64F - f, (float)j / 32F + f1);
        apositiontexurevertex[1] = apositiontexurevertex[1].func_1115_a((float)i / 64F + f, (float)j / 32F + f1);
        apositiontexurevertex[2] = apositiontexurevertex[2].func_1115_a((float)i / 64F + f, (float)l / 32F - f1);
        apositiontexurevertex[3] = apositiontexurevertex[3].func_1115_a((float)k / 64F - f, (float)l / 32F - f1);
    }

    public void func_809_a()
    {
        PositionTexureVertex apositiontexurevertex[] = new PositionTexureVertex[field_1195_a.length];
        for(int i = 0; i < field_1195_a.length; i++)
        {
            apositiontexurevertex[i] = field_1195_a[field_1195_a.length - i - 1];
        }

        field_1195_a = apositiontexurevertex;
    }

    public void func_808_a(Tessellator tessellator, float f)
    {
        Vec3D vec3d = field_1195_a[1].field_1655_a.func_1262_a(field_1195_a[0].field_1655_a);
        Vec3D vec3d1 = field_1195_a[1].field_1655_a.func_1262_a(field_1195_a[2].field_1655_a);
        Vec3D vec3d2 = vec3d1.func_1246_b(vec3d).func_1252_b();
        tessellator.func_977_b();
        if(field_1196_c)
        {
            tessellator.func_980_b(-(float)vec3d2.field_1776_a, -(float)vec3d2.field_1775_b, -(float)vec3d2.field_1779_c);
        } else
        {
            tessellator.func_980_b((float)vec3d2.field_1776_a, (float)vec3d2.field_1775_b, (float)vec3d2.field_1779_c);
        }
        for(int i = 0; i < 4; i++)
        {
            PositionTexureVertex positiontexurevertex = field_1195_a[i];
            tessellator.func_983_a((float)positiontexurevertex.field_1655_a.field_1776_a * f, (float)positiontexurevertex.field_1655_a.field_1775_b * f, (float)positiontexurevertex.field_1655_a.field_1779_c * f, positiontexurevertex.field_1654_b, positiontexurevertex.field_1656_c);
        }

        tessellator.func_982_a();
    }

    public PositionTexureVertex field_1195_a[];
    public int field_1194_b;
    private boolean field_1196_c;
}
