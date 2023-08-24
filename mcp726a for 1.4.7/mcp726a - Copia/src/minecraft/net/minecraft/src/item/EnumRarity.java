package net.minecraft.src.item;

public enum EnumRarity {
    common(15, "Common"),
    uncommon(14, "Uncommon"),
    rare(11, "Rare"),
    epic(13, "Epic");

    /**
     * A decimal representation of the hex color codes of a the color assigned to
     * this rarity type. (13 becomes d as in
     * \247d which is light purple)
     */
    /**
     * Uma representação decimal dos códigos de cores hexadecimais da cor atribuída a este tipo de raridade. (13 torna-se d como em \247d que é roxo claro)
     */
    public final int rarityColor;

    /** Rarity name. */
    /** Nome de raridade. */
    public final String rarityName;

    private EnumRarity(int par3, String par4Str) {
        this.rarityColor = par3;
        this.rarityName = par4Str;
    }
}
