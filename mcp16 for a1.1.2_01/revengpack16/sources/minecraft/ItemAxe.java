// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class ItemAxe extends ItemTool
{

    public ItemAxe(int i, int j)
    {
        super(i, 3, j, field_327_aX);
    }

    private static Block field_327_aX[];

    static 
    {
        field_327_aX = (new Block[] {
            Block.planks, Block.bookShelf, Block.wood, Block.crate
        });
    }
}
