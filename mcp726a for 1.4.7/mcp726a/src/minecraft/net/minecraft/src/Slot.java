package net.minecraft.src;

public class Slot
{
    /** The index of the slot in the inventory. */
    /** O índice do slot no inventário. */
    private final int slotIndex;

    /** The inventory we want to extract a slot from. */
    /** O inventário do qual queremos extrair um slot. */
    public final IInventory inventory;

    /** the id of the slot(also the index in the inventory arraylist) */
    /** o id do slot (também o índice na arraylist do inventário) */
    public int slotNumber;

    /** display position of the inventory slot on the screen x axis */
    /** posição de exibição do slot de inventário na tela eixo x */
    public int xDisplayPosition;

    /** display position of the inventory slot on the screen y axis */
    /** posição de exibição do slot de inventário na tela eixo y */
    public int yDisplayPosition;

    public Slot(IInventory par1IInventory, int par2, int par3, int par4) {
        this.inventory = par1IInventory;
        this.slotIndex = par2;
        this.xDisplayPosition = par3;
        this.yDisplayPosition = par4;
    }

    /**
     * if par2 has more items than par1, onCrafting(item,countIncrease) is called
     */
    /**
     * se par2 tiver mais itens que par1, onCrafting(item,countIncrease) é chamado
     */
    public void onSlotChange(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        if (par1ItemStack != null && par2ItemStack != null) {
            if (par1ItemStack.itemID == par2ItemStack.itemID) {
                int var3 = par2ItemStack.stackSize - par1ItemStack.stackSize;

                if (var3 > 0) {
                    this.onCrafting(par1ItemStack, var3);
                }
            }
        }
    }

    /**
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood. Typically increases an
     * internal count then calls onCrafting(item).
     */
    /**
     * o itemStack passado é a saída - ou seja, lingotes de ferro e picaretas, não minério e madeira. Normalmente aumenta um
      * contagem interna chama onCrafting(item).
     */
    protected void onCrafting(ItemStack par1ItemStack, int par2) {}

    /**
     * the itemStack passed in is the output - ie, iron ingots, and pickaxes, not ore and wood.
     */
    /**
     * o itemStack passado é a saída - ou seja, lingotes de ferro e picaretas, não minério e madeira.
     */
    protected void onCrafting(ItemStack par1ItemStack) {}

    public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
        this.onSlotChanged();
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    /**
     * Verifique se a pilha é um item válido para este slot. Sempre verdadeiro ao lado dos slots de armadura.
     */
    public boolean isItemValid(ItemStack par1ItemStack) {
        return true;
    }

    /**
     * Helper fnct to get the stack in the slot.
     */
    /**
     * Helper fnct para obter a pilha no slot.
     */
    public ItemStack getStack() {
        return this.inventory.getStackInSlot(this.slotIndex);
    }

    /**
     * Returns if this slot contains a stack.
     */
    /**
     * Retorna se este slot contiver uma pilha.
     */
    public boolean getHasStack() {
        return this.getStack() != null;
    }

    /**
     * Helper method to put a stack in the slot.
     */
    /**
     * Método auxiliar para colocar uma pilha no slot.
     */
    public void putStack(ItemStack par1ItemStack) {
        this.inventory.setInventorySlotContents(this.slotIndex, par1ItemStack);
        this.onSlotChanged();
    }

    /**
     * Called when the stack in a Slot changes
     */
    /**
     * Chamado quando a pilha em um Slot muda
     */
    public void onSlotChanged() {
        this.inventory.onInventoryChanged();
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    /**
     * Retorna o tamanho máximo da pilha para um determinado slot (geralmente o mesmo que getInventoryStackLimit(), mas 1 no caso
      * de slots de armadura)
     */
    public int getSlotStackLimit() {
        return this.inventory.getInventoryStackLimit();
    }

    /**
     * Returns the icon index on items.png that is used as background image of the slot.
     */
    /**
     * Retorna o índice do ícone em items.png que é usado como imagem de fundo do slot.
     */
    public int getBackgroundIconIndex() {
        return -1;
    }

    /**
     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
     * stack.
     */
    /**
     * Diminua o tamanho da pilha no slot (primeiro int arg) pela quantidade do segundo int arg. Devolve o novo
      * pilha.
     */
    public ItemStack decrStackSize(int par1) {
        return this.inventory.decrStackSize(this.slotIndex, par1);
    }

    /**
     * returns true if this slot is in par2 of par1
     */
    /**
     * retorna verdadeiro se este slot estiver no par2 do par1
     */
    public boolean isSlotInInventory(IInventory par1IInventory, int par2) {
        return par1IInventory == this.inventory && par2 == this.slotIndex;
    }

    /**
     * Return whether this slot's stack can be taken from this slot.
     */
    /**
     * Retorna se a pilha deste slot pode ser retirada deste slot.
     */
    public boolean canTakeStack(EntityPlayer par1EntityPlayer) {
        return true;
    }
}
