package Fabric;

import Interface.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    /**
     * открываем награду
     */
    public void openReward(){
        createItem().open();
    }
}
