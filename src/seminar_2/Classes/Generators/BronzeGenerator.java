package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.BronzeReward;
import seminar_2.Classes.iGameItem;

public class BronzeGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new BronzeReward();
    }
}
