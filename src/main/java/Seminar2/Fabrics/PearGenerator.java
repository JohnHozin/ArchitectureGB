package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;
import Seminar2.Products.Pear;

public class PearGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Pear();
    }
}
