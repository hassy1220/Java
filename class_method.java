public class class_method {
    public static void main(String[] args) {
      Item apple = new Item(120,15);
      int total = apple.getTotalAmount();
      System.out.println("合計金額は" + total + "です");
      Item orange = new Item(150,30);
      System.out.println("合計金額は" + orange.getTotalAmount() + "です");
    }
}

class Item{
  private int price;
  private int quantity;
  public Item(int newPrice,int newQuantity){
    price = newPrice;
    quantity = newQuantity;
  }
  
  public int getTotalAmount(){
    return price * quantity;
  }
}