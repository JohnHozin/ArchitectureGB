package RewardApp.Fabrics;

import RewardApp.Interface.IGameItem;
import RewardApp.Products.Strawberry;

public class StrawberryGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Strawberry();
    }
}

