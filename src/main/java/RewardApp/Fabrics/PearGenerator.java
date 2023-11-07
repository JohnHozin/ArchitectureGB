package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Pear;

public class PearGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Pear();
    }
}
