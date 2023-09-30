package Fabric;

import Interface.iGameItem;
import Product.ElixirReward;

public class ElixirGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new ElixirReward();
    }
}
