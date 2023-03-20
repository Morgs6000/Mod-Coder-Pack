// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.io.PrintStream;
import java.util.*;

public class CraftingManager
{

    public static final CraftingManager func_1120_a()
    {
        return instance;
    }

    private CraftingManager()
    {
        recipes = new ArrayList();
        (new RecipesTools()).func_1122_a(this);
        (new RecipesWeapons()).func_766_a(this);
        (new RecipesIngots()).func_810_a(this);
        (new RecipesFood()).func_976_a(this);
        (new RecipesCrafting()).func_1051_a(this);
        (new RecipesArmor()).func_1148_a(this);
        func_1121_a(new ItemStack(Item.paper, 3), new Object[] {
            "###", Character.valueOf('#'), Item.reed
        });
        func_1121_a(new ItemStack(Item.book, 1), new Object[] {
            "#", "#", "#", Character.valueOf('#'), Item.paper
        });
        func_1121_a(new ItemStack(Block.fence, 2), new Object[] {
            "###", "###", Character.valueOf('#'), Item.stick
        });
        func_1121_a(new ItemStack(Block.jukebox, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Block.planks, Character.valueOf('X'), Item.diamond
        });
        func_1121_a(new ItemStack(Block.bookShelf, 1), new Object[] {
            "###", "XXX", "###", Character.valueOf('#'), Block.planks, Character.valueOf('X'), Item.book
        });
        func_1121_a(new ItemStack(Block.blockSnow, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.snowball
        });
        func_1121_a(new ItemStack(Block.blockClay, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.clay
        });
        func_1121_a(new ItemStack(Block.brick, 1), new Object[] {
            "##", "##", Character.valueOf('#'), Item.brick
        });
        func_1121_a(new ItemStack(Block.cloth, 1), new Object[] {
            "###", "###", "###", Character.valueOf('#'), Item.silk
        });
        func_1121_a(new ItemStack(Block.tnt, 1), new Object[] {
            "X#X", "#X#", "X#X", Character.valueOf('X'), Item.gunpowder, Character.valueOf('#'), Block.sand
        });
        func_1121_a(new ItemStack(Block.stairSingle, 3), new Object[] {
            "###", Character.valueOf('#'), Block.cobblestone
        });
        func_1121_a(new ItemStack(Block.ladder, 1), new Object[] {
            "# #", "###", "# #", Character.valueOf('#'), Item.stick
        });
        func_1121_a(new ItemStack(Item.doorWood, 1), new Object[] {
            "##", "##", "##", Character.valueOf('#'), Block.planks
        });
        func_1121_a(new ItemStack(Item.doorSteel, 1), new Object[] {
            "##", "##", "##", Character.valueOf('#'), Item.ingotIron
        });
        func_1121_a(new ItemStack(Item.sign, 1), new Object[] {
            "###", "###", " X ", Character.valueOf('#'), Block.planks, Character.valueOf('X'), Item.stick
        });
        func_1121_a(new ItemStack(Block.planks, 4), new Object[] {
            "#", Character.valueOf('#'), Block.wood
        });
        func_1121_a(new ItemStack(Item.stick, 4), new Object[] {
            "#", "#", Character.valueOf('#'), Block.planks
        });
        func_1121_a(new ItemStack(Block.torchWood, 4), new Object[] {
            "X", "#", Character.valueOf('X'), Item.coal, Character.valueOf('#'), Item.stick
        });
        func_1121_a(new ItemStack(Item.bowlEmpty, 4), new Object[] {
            "# #", " # ", Character.valueOf('#'), Block.planks
        });
        func_1121_a(new ItemStack(Block.minecartTrack, 16), new Object[] {
            "X X", "X#X", "X X", Character.valueOf('X'), Item.ingotIron, Character.valueOf('#'), Item.stick
        });
        func_1121_a(new ItemStack(Item.minecartEmpty, 1), new Object[] {
            "# #", "###", Character.valueOf('#'), Item.ingotIron
        });
        func_1121_a(new ItemStack(Item.minecartBox, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.crate, Character.valueOf('B'), Item.minecartEmpty
        });
        func_1121_a(new ItemStack(Item.minecartEngine, 1), new Object[] {
            "A", "B", Character.valueOf('A'), Block.stoneOvenIdle, Character.valueOf('B'), Item.minecartEmpty
        });
        func_1121_a(new ItemStack(Item.boat, 1), new Object[] {
            "# #", "###", Character.valueOf('#'), Block.planks
        });
        func_1121_a(new ItemStack(Item.bucketEmpty, 1), new Object[] {
            "# #", " # ", Character.valueOf('#'), Item.ingotIron
        });
        func_1121_a(new ItemStack(Item.striker, 1), new Object[] {
            "A ", " B", Character.valueOf('A'), Item.ingotIron, Character.valueOf('B'), Item.flint
        });
        func_1121_a(new ItemStack(Item.bread, 1), new Object[] {
            "###", Character.valueOf('#'), Item.wheat
        });
        func_1121_a(new ItemStack(Block.stairCompact_Wood, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.planks
        });
        func_1121_a(new ItemStack(Item.fishingRod, 1), new Object[] {
            "  #", " #X", "# X", Character.valueOf('#'), Item.stick, Character.valueOf('X'), Item.silk
        });
        func_1121_a(new ItemStack(Block.stairCompactStone, 4), new Object[] {
            "#  ", "## ", "###", Character.valueOf('#'), Block.cobblestone
        });
        func_1121_a(new ItemStack(Item.painting, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Item.stick, Character.valueOf('X'), Block.cloth
        });
        func_1121_a(new ItemStack(Item.appleGold, 1), new Object[] {
            "###", "#X#", "###", Character.valueOf('#'), Block.blockGold, Character.valueOf('X'), Item.appleRed
        });
        func_1121_a(new ItemStack(Block.lever, 1), new Object[] {
            "X", "#", Character.valueOf('#'), Block.cobblestone, Character.valueOf('X'), Item.stick
        });
        func_1121_a(new ItemStack(Block.torchRedstoneActive, 1), new Object[] {
            "X", "#", Character.valueOf('#'), Item.stick, Character.valueOf('X'), Item.redstone
        });
        func_1121_a(new ItemStack(Item.compass, 1), new Object[] {
            " # ", "#X#", " # ", Character.valueOf('#'), Item.ingotIron, Character.valueOf('X'), Item.redstone
        });
        func_1121_a(new ItemStack(Block.button, 1), new Object[] {
            "#", "#", Character.valueOf('#'), Block.stone
        });
        func_1121_a(new ItemStack(Block.pressurePlateStone, 1), new Object[] {
            "###", Character.valueOf('#'), Block.stone
        });
        func_1121_a(new ItemStack(Block.pressurePlateWood, 1), new Object[] {
            "###", Character.valueOf('#'), Block.planks
        });
        Collections.sort(recipes, new RecipeSorter(this));
        System.out.println((new StringBuilder()).append(recipes.size()).append(" recipes").toString());
    }

    void func_1121_a(ItemStack itemstack, Object aobj[])
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;
        if(aobj[i] instanceof String[])
        {
            String as[] = (String[])aobj[i++];
            for(int l = 0; l < as.length; l++)
            {
                String s2 = as[l];
                k++;
                j = s2.length();
                s = (new StringBuilder()).append(s).append(s2).toString();
            }

        } else
        {
            while(aobj[i] instanceof String) 
            {
                String s1 = (String)aobj[i++];
                k++;
                j = s1.length();
                s = (new StringBuilder()).append(s).append(s1).toString();
            }
        }
        HashMap hashmap = new HashMap();
        for(; i < aobj.length; i += 2)
        {
            Character character = (Character)aobj[i];
            int i1 = 0;
            if(aobj[i + 1] instanceof Item)
            {
                i1 = ((Item)aobj[i + 1]).swiftedIndex;
            } else
            if(aobj[i + 1] instanceof Block)
            {
                i1 = ((Block)aobj[i + 1]).blockID;
            }
            hashmap.put(character, Integer.valueOf(i1));
        }

        int ai[] = new int[j * k];
        for(int j1 = 0; j1 < j * k; j1++)
        {
            char c = s.charAt(j1);
            if(hashmap.containsKey(Character.valueOf(c)))
            {
                ai[j1] = ((Integer)hashmap.get(Character.valueOf(c))).intValue();
            } else
            {
                ai[j1] = -1;
            }
        }

        recipes.add(new CraftingRecipe(j, k, ai, itemstack));
    }

    public ItemStack func_1119_a(int ai[])
    {
        for(int i = 0; i < recipes.size(); i++)
        {
            CraftingRecipe craftingrecipe = (CraftingRecipe)recipes.get(i);
            if(craftingrecipe.func_1182_a(ai))
            {
                return craftingrecipe.func_1183_b(ai);
            }
        }

        return null;
    }

    private static final CraftingManager instance = new CraftingManager();
    private List recipes;

}
