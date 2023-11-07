package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Gem;

public class GemGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
