package forgingaura.forgeyourworld.farmory.proxy;

import forgingaura.forgeyourworld.farmory.init.ArmoryWeaponToolItem;

/**
 * Created by AlasDiablo on 30/10/2017.
 */
public class ArmoryClient implements ArmoryCommon {
    @Override
    public void preInit() {

    }

    @Override
    public void registerRenders() {
        ArmoryWeaponToolItem.registerRenders();
        System.out.println("[Forge Your World Armory] Weapon Item Renders Done");

    }

    @Override
    public void init() {

    }
}
