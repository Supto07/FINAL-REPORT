import java.util.Arrays;

public class Knapsack {
    public static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> Double.compare(b.getRatio(), a.getRatio()));
        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity >= item.getWeight()) {
                totalValue += item.getValue();
                capacity -= item.getWeight();
            } else {
                totalValue += item.getRatio() * capacity;
                break;
            }
        }

        return totalValue;
    }
}
