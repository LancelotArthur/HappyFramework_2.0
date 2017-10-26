package application.strategy;

public class SequentialOrder implements Orderable {

    private static int total;
    private static int currentIndex;

    public SequentialOrder(int total) {
        SequentialOrder.total = total;
        currentIndex = 0;
    }

    @Override
    public int getNextIndex() {
        currentIndex = (currentIndex + 1) % total;
        return currentIndex;
    }

}
