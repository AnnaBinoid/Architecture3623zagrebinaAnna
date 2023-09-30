package Fabric;

import Interface.iGameItem;
import Product.MoneyReward;

public class MoneyGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new MoneyReward();
    }
}
