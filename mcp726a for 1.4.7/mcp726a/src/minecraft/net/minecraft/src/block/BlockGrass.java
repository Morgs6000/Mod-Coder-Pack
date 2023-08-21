package block;

import java.util.Random;

import block.material.Material;
import creativetab.CreativeTabs;
import world.ColorizerGrass;
import world.IBlockAccess;
import world.World;

public class BlockGrass extends Block {
    protected BlockGrass(int par1) {
        super(par1, Material.grass);
        this.blockIndexInTexture = 3;
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    /**
     * Do lado especificado e os metadados do bloco recuperam a textura dos blocos. Args: lado, metadados
     */
    public int getBlockTextureFromSideAndMetadata(int par1, int par2) {
        return par1 == 1 ? 0 : (par1 == 0 ? 2 : 3);
    }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    /**
     * Recupera a textura do bloco a ser usada com base no lado da tela. Args: iBlockAccess, x, y, z, lado
     */
    public int getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
        if (par5 == 1) {
            return 0;
        }
        else if (par5 == 0) {
            return 2;
        }
        else {
            Material var6 = par1IBlockAccess.getBlockMaterial(par2, par3 + 1, par4);
            return var6 != Material.snow && var6 != Material.craftedSnow ? 3 : 68;
        }
    }

    public int getBlockColor() {
        double var1 = 0.5D;
        double var3 = 1.0D;
        return ColorizerGrass.getGrassColor(var1, var3);
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    /**
     * Retorna a cor que este bloco deve ser renderizado. Usado por folhas.
     */
    public int getRenderColor(int par1) {
        return this.getBlockColor();
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    /**
     * Retorna um inteiro com hexadecimal para 0xrrggbb com esta cor multiplicada pela cor dos blocos. Nota apenas chamada
      * ao determinar pela primeira vez o que renderizar.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;

        for (int var8 = -1; var8 <= 1; ++var8) {
            for (int var9 = -1; var9 <= 1; ++var9) {
                int var10 = par1IBlockAccess.getBiomeGenForCoords(par2 + var9, par4 + var8).getBiomeGrassColor();
                var5 += (var10 & 16711680) >> 16;
                var6 += (var10 & 65280) >> 8;
                var7 += var10 & 255;
            }
        }

        return (var5 / 9 & 255) << 16 | (var6 / 9 & 255) << 8 | var7 / 9 & 255;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    /**
     * Marca o bloco se foi agendado
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote) {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && Block.lightOpacity[par1World.getBlockId(par2, par3 + 1, par4)] > 2) {
                par1World.setBlockWithNotify(par2, par3, par4, Block.dirt.blockID);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9) {
                for (int var6 = 0; var6 < 4; ++var6) {
                    int var7 = par2 + par5Random.nextInt(3) - 1;
                    int var8 = par3 + par5Random.nextInt(5) - 3;
                    int var9 = par4 + par5Random.nextInt(3) - 1;
                    int var10 = par1World.getBlockId(var7, var8 + 1, var9);

                    if (par1World.getBlockId(var7, var8, var9) == Block.dirt.blockID && par1World.getBlockLightValue(var7, var8 + 1, var9) >= 4 && Block.lightOpacity[var10] <= 2) {
                        par1World.setBlockWithNotify(var7, var8, var9, Block.grass.blockID);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    /**
     * Retorna o ID dos itens a serem descartados na destruição.
     */
    public int idDropped(int par1, Random par2Random, int par3) {
        return Block.dirt.idDropped(0, par2Random, par3);
    }
}
