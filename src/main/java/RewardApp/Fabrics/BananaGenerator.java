package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Banana;

public class BananaGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Banana();
    }
}
