package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.GemReward;
import seminar_2.Classes.iGameItem;

public class GemGenerator  extends ItemFabric  {
        @Override
    public iGameItem createItem() {
        return new GemReward();
     }
}
