package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Gold;

public class GoldGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
