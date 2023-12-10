package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;
import Seminar2.Products.Orange;

public class OrangeGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Orange();
    }
}
