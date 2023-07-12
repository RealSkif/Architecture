package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.DulllReward;
import seminar_2.Classes.iGameItem;

public class DullGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new DulllReward();
    }
}
