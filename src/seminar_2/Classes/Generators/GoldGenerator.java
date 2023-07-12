package seminar_2.Classes.Generators;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.Rewards.GoldReward;
import seminar_2.Classes.iGameItem;

public class GoldGenerator extends ItemFabric {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
     }
    
}
