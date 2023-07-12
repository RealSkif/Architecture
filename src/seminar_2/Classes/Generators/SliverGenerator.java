package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.SilverReward;
import seminar_2.Classes.iGameItem;

public class SliverGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
