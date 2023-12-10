package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;

public abstract class ItemGenerator {
    public void openReward() {
        createItem().open();
    }

    public abstract IGameItem createItem();
}
