package Fabric;

import Interface.iGameItem;
import Product.NullReward;

public class NullGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new NullReward();
    }
}
