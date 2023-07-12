package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.ExoticReward;
import seminar_2.Classes.iGameItem;

public class ExoticGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new ExoticReward();
    }
}
