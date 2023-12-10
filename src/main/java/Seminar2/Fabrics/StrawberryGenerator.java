package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;
import Seminar2.Products.Strawberry;

public class StrawberryGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Strawberry();
    }
}

