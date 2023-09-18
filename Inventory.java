public class Inventory {
    private ItemCategory[][] item;
    private double[][] price;
    private int[][] quant;

    public Inventory() {
        item = new ItemCategory[6][6];
        price = new double[6][6];
        quant = new int[6][6];

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 6; col++) {
                item[row][col] = ItemCategory.EMPTY;
                price[row][col] = 0.0;
                quant[row][col] = 0;
            }
        }
        item[0][0] = ItemCategory.SODA;
        price[0][0] = 2.50;
        quant[0][0] = 5;

        item[0][1] = ItemCategory.CHIPS;
        price[0][1] = 2.00;
        quant[0][1] = 5;

        item[0][2] = ItemCategory.CANDY;
        price[0][2] = 1.75;
        quant[0][2] = 5;

        item[0][3] = ItemCategory.WATER;
        price[0][3] = 2.25;
        quant[0][3] = 5;
    }

    public ItemCategory getItemType(int row, int col) {
        return item[row][col];
    }

    public double getItemPrice(int row, int col) {
        return price[row][col];
    }

    public boolean isItemAvailable(int row, int col) {
        return quant[row][col] > 0;
    }

    public void dispenseItem(int row, int col) {
        if (quant[row][col] > 0) {
            quant[row][col]--;
        }
    }
}
