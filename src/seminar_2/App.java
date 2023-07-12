package seminar_2;

import seminar_2.Classes.Generators.*;
import seminar_2.Classes.ItemFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new GemGenerator();
        generator.openReward();
        generator = new SliverGenerator();
        generator.openReward();
        generator = new DullGenerator();
        generator.openReward();
        generator = new ExoticGenerator();
        generator.openReward();
        generator = new RelicGenerator();
        generator.openReward();
        generator = new BronzeGenerator();
        generator.openReward();
    }
}
