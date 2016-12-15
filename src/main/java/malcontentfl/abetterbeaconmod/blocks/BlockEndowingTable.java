package malcontentfl.abetterbeaconmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockEndowingTable extends Block implements ITileEntityProvider
{
	public BlockEndowingTable()
	{
		super(Material.ROCK);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return null;
	}
}
