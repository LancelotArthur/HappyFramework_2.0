package application.strategy;

import java.util.Random;

public class RandomStrategy implements Orderable{

    public static int total;

    public RandomStrategy(int total) {
        RandomStrategy.total = total;
    }

    @Override
    public int getNextIndex() {
        return new Random().nextInt(total);
    }

}
