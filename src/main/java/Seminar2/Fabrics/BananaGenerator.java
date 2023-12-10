package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;
import Seminar2.Products.Banana;

public class BananaGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Banana();
    }
}
