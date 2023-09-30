package Fabric;

import Interface.iGameItem;
import Product.FoodReward;

public class FoodGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new FoodReward();
    }
}
