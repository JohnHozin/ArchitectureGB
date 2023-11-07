package RewardApp;

import RewardApp.Fabrics.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(new GemGenerator());

        ItemGenerator goldGenerator = new GoldGenerator();
        for (int i = 0; i < 3; i++) {
            generators.add(goldGenerator);
        }

        ItemGenerator appleGenerator = new AppleGenerator();
        ItemGenerator bananaGenerator = new BananaGenerator();
        ItemGenerator orangeGenerator = new OrangeGenerator();
        ItemGenerator pearGenerator = new PearGenerator();
        ItemGenerator strawberryGenerator = new StrawberryGenerator();
        for (int i = 0; i < 10; i++) {
            generators.add(appleGenerator);
            generators.add(bananaGenerator);
            generators.add(orangeGenerator);
            generators.add(pearGenerator);
            generators.add(strawberryGenerator);
        }

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int rnd = random.nextInt(generators.size());
            list.add(rnd);
            generators.get(rnd).openReward();
        }
        Collections.sort(list);
        System.out.println(list); // 0 - Gem; 1,2,3 - Gold
    }
}
