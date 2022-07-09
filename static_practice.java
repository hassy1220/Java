// staticを理解しよう

public class static_practice {
    public static void main(String[] args) {
        Item apple = new Item(120, 15);
        int total = apple.getTotalAmount();
        System.out.println("合計金額は" + total + "円です。");
        Item orange = new Item(85, 32);
        System.out.println("合計金額は" + orange.getTotalAmount() + "円です。");
    }
}

class Item {
    private int price;
    private int quantity;
    private static double tax = 1.08;

    public Item(int newPrice, int newQuantity) {
        price = newPrice;
        quantity = newQuantity;
    }

    public int getTotalAmount() {
        return (int)(price * quantity * tax);
    }
}
