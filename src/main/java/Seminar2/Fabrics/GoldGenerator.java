package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;
import Seminar2.Products.Gold;

public class GoldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
