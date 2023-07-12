package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.RelicReward;
import seminar_2.Classes.iGameItem;

public class RelicGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new RelicReward();
    }
}
