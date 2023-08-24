package net.minecraft.src.item;

public enum EnumArmorMaterial {
    CLOTH(5, new int[] { 1, 3, 2, 1 }, 15),
    CHAIN(15, new int[] { 2, 5, 4, 1 }, 12),
    IRON(15, new int[] { 2, 6, 5, 2 }, 9),
    GOLD(7, new int[] { 2, 5, 3, 1 }, 25),
    DIAMOND(33, new int[] { 3, 8, 6, 3 }, 10);

    /**
     * Holds the maximum damage factor (each piece multiply this by it's own value)
     * of the material, this is the item
     * damage (how much can absorb before breaks)
     */
    /**
     * Mantém o fator de dano máximo (cada peça multiplica isso pelo seu próprio valor) do material, este é o dano do item (quanto pode absorver antes de quebrar)
     */
    private int maxDamageFactor;

    /**
     * Holds the damage reduction (each 1 points is half a shield on gui) of each
     * piece of armor (helmet, plate, legs
     * and boots)
     */
    /**
     * Mantém a redução de dano (cada 1 ponto equivale a meio escudo na gui) de cada peça da armadura (capacete, placa, pernas e botas)
     */
    private int[] damageReductionAmountArray;

    /** Return the enchantability factor of the material */
    /** Retorne o fator de encantabilidade do material */
    private int enchantability;

    private EnumArmorMaterial(int par3, int[] par4ArrayOfInteger, int par5) {
        this.maxDamageFactor = par3;
        this.damageReductionAmountArray = par4ArrayOfInteger;
        this.enchantability = par5;
    }

    /**
     * Returns the durability for a armor slot of for this type.
     */
    /**
     * Retorna a durabilidade de um slot de armadura deste tipo.
     */
    public int getDurability(int par1) {
        return ItemArmor.getMaxDamageArray()[par1] * this.maxDamageFactor;
    }

    /**
     * Return the damage reduction (each 1 point is a half a shield on gui) of the
     * piece index passed (0 = helmet, 1 =
     * plate, 2 = legs and 3 = boots)
     */
    /**
     * Retorna a redução de dano (cada 1 ponto é meio escudo na gui) do índice da peça passada (0 = capacete, 1 = placa, 2 = pernas e 3 = botas)
     */
    public int getDamageReductionAmount(int par1) {
        return this.damageReductionAmountArray[par1];
    }

    /**
     * Return the enchantability factor of the material.
     */
    /**
     * Retorne o fator de encantabilidade do material.
     */
    public int getEnchantability() {
        return this.enchantability;
    }

    /**
     * Return the crafting material for this armor material, used to determine the
     * item that can be used to repair an
     * armor piece with an anvil
     */
    /**
     * Devolva o material de fabricação deste material de armadura, usado para determinar o item que pode ser usado para reparar uma peça de armadura com uma bigorna
     */
    public int getArmorCraftingMaterial() {
        return this == CLOTH ? Item.leather.itemID
                : (this == CHAIN ? Item.ingotIron.itemID
                        : (this == GOLD ? Item.ingotGold.itemID
                                : (this == IRON ? Item.ingotIron.itemID
                                        : (this == DIAMOND ? Item.diamond.itemID : 0))));
    }
}
