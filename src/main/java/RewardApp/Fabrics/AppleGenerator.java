package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Apple;

public class AppleGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Apple();
    }
}
