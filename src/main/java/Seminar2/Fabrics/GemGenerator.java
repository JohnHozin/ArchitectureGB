package Seminar2.Fabrics;

import Seminar2.Interface.IGameItem;
import Seminar2.Products.Gem;

public class GemGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
