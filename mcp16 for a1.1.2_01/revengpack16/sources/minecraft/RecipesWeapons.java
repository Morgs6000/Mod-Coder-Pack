// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 


public class RecipesWeapons
{

    public RecipesWeapons()
    {
        field_1099_b = (new Object[][] {
            new Object[] {
                Block.planks, Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold
            }, new Object[] {
                Item.swordWood, Item.swordStone, Item.swordSteel, Item.swordDiamond, Item.swordGold
            }
        });
    }

    public void func_766_a(CraftingManager craftingmanager)
    {
        for(int i = 0; i < field_1099_b[0].length; i++)
        {
            Object obj = field_1099_b[0][i];
            for(int j = 0; j < field_1099_b.length - 1; j++)
            {
                Item item = (Item)field_1099_b[j + 1][i];
                craftingmanager.func_1121_a(new ItemStack(item), new Object[] {
                    field_1100_a[j], Character.valueOf('#'), Item.stick, Character.valueOf('X'), obj
                });
            }

        }

        craftingmanager.func_1121_a(new ItemStack(Item.bow, 1), new Object[] {
            " #X", "# X", " #X", Character.valueOf('X'), Item.silk, Character.valueOf('#'), Item.stick
        });
        craftingmanager.func_1121_a(new ItemStack(Item.arrow, 4), new Object[] {
            "X", "#", "Y", Character.valueOf('Y'), Item.feather, Character.valueOf('X'), Item.flint, Character.valueOf('#'), Item.stick
        });
    }

    private String field_1100_a[][] = {
        {
            "X", "X", "#"
        }
    };
    private Object field_1099_b[][];
}
