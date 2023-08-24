package net.minecraft.src.item.crafting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.src.item.ItemStack;

public class ShapelessRecipes implements IRecipe {
    /** Is the ItemStack that you get when craft the recipe. */
    /** É o ItemStack que você obtém ao criar a receita. */
    private final ItemStack recipeOutput;

    /** Is a List of ItemStack that composes the recipe. */
    /** É uma lista do ItemStack que compõe a receita. */
    private final List recipeItems;

    public ShapelessRecipes(ItemStack par1ItemStack, List par2List) {
        this.recipeOutput = par1ItemStack;
        this.recipeItems = par2List;
    }

    public ItemStack getRecipeOutput() {
        return this.recipeOutput;
    }

    /**
     * Used to check if a recipe matches current crafting inventory
     */
    /**
     * Usado para verificar se uma receita corresponde ao inventário de fabricação atual
     */
    public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World) {
        ArrayList var3 = new ArrayList(this.recipeItems);

        for (int var4 = 0; var4 < 3; ++var4) {
            for (int var5 = 0; var5 < 3; ++var5) {
                ItemStack var6 = par1InventoryCrafting.getStackInRowAndColumn(var5, var4);

                if (var6 != null) {
                    boolean var7 = false;
                    Iterator var8 = var3.iterator();

                    while (var8.hasNext()) {
                        ItemStack var9 = (ItemStack) var8.next();

                        if (var6.itemID == var9.itemID
                                && (var9.getItemDamage() == -1 || var6.getItemDamage() == var9.getItemDamage())) {
                            var7 = true;
                            var3.remove(var9);
                            break;
                        }
                    }

                    if (!var7) {
                        return false;
                    }
                }
            }
        }

        return var3.isEmpty();
    }

    /**
     * Returns an Item that is the result of this recipe
     */
    /**
     * Retorna um Item que é resultado desta receita
     */
    public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting) {
        return this.recipeOutput.copy();
    }

    /**
     * Returns the size of the recipe area
     */
    /**
     * Retorna o tamanho da área da receita
     */
    public int getRecipeSize() {
        return this.recipeItems.size();
    }
}
