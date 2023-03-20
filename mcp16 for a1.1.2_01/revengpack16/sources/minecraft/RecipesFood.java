// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class RecipesFood
{

    public RecipesFood()
    {
    }

    public void func_976_a(CraftingManager craftingmanager)
    {
        craftingmanager.func_1121_a(new ItemStack(Item.bowlSoup), new Object[] {
            "Y", "X", "#", Character.valueOf('X'), Block.mushroomBrown, Character.valueOf('Y'), Block.mushroomRed, Character.valueOf('#'), Item.bowlEmpty
        });
        craftingmanager.func_1121_a(new ItemStack(Item.bowlSoup), new Object[] {
            "Y", "X", "#", Character.valueOf('X'), Block.mushroomRed, Character.valueOf('Y'), Block.mushroomBrown, Character.valueOf('#'), Item.bowlEmpty
        });
    }
}
