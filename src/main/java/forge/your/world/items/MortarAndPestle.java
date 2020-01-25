package forge.your.world.items;

import forge.your.world.ForgeYourWorld;
import forge.your.world.init.ItemsHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MortarAndPestle extends Item {

    public MortarAndPestle() {
        super(new Properties()
                .group(ForgeYourWorld.FYW_GROUP)
                .maxStackSize(1)
        );
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(ItemsHandler.MORTAR_AND_PESTLE);
    }
}
