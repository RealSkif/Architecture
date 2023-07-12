package seminar_2.Classes.Rewards;

import seminar_2.Classes.ItemFabric;
import seminar_2.Classes.iGameItem;

public class DulllReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Dull");
    }
}
