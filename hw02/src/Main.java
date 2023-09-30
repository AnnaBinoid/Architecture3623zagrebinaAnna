import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        ItemGenerator f1 = new GemGenerator();
        ItemGenerator f2 = new GoldGenerator();
        ItemGenerator f3 = new SilverGenerator();
        ItemGenerator f4 = new FoodGenerator();
        ItemGenerator f5 = new ElixirGenerator();
        ItemGenerator f6 = new NullGenerator();
        ItemGenerator f7 = new StoneGenerator();
        ItemGenerator f8 = new MoneyGenerator();

        List<ItemGenerator> itemGeneration = new ArrayList<>();
        itemGeneration.add(f1);
        itemGeneration.add(f2);
        itemGeneration.add(f2);
        itemGeneration.add(f2);
        for (int i = 0; i < 10; i++) {
            itemGeneration.add(f3);
            itemGeneration.add(f4);
            itemGeneration.add(f5);
            itemGeneration.add(f6);
            itemGeneration.add(f7);
            itemGeneration.add(f8);
        }


        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            itemGeneration.get(rnd.nextInt(64)).openReward();
        }
    }
}
