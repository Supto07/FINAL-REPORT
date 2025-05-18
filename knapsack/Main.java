public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new Item(3, 12),
            new Item(1, 5),
            new Item(4, 16),
            new Item(2, 7),
            new Item(9, 9),
            new Item(4, 11),
            new Item(3, 6),
        };

        int capacity = 15;
        double maxValue = Knapsack.getMaxValue(items, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }
}
