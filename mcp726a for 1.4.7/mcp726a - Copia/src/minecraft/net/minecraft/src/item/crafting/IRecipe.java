package net.minecraft.src.item.crafting;

import net.minecraft.src.item.ItemStack;

public interface IRecipe {
    /**
     * Used to check if a recipe matches current crafting inventory
     */
    /**
     * Usado para verificar se uma receita corresponde ao inventário de fabricação atual
     */
    boolean matches(InventoryCrafting var1, World var2);

    /**
     * Returns an Item that is the result of this recipe
     */
    /**
     * Retorna um Item que é resultado desta receita
     */
    ItemStack getCraftingResult(InventoryCrafting var1);

    /**
     * Returns the size of the recipe area
     */
    /**
     * Retorna o tamanho da área da receita
     */
    int getRecipeSize();

    ItemStack getRecipeOutput();
}
