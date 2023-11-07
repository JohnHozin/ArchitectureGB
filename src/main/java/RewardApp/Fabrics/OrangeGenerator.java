package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Orange;

public class OrangeGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Orange();
    }
}
