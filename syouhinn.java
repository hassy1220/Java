public class syouhinn{
  public static void main(String[] args){
    int price = 1980;
    System.out.println("定価" + price + "円");
    int discountPrice = (int)(price * 0.85);
    System.out.println("割引価格は" + discountPrice + "円です");
    int amount = (int)(discountPrice * 1.08);
    System.out.println("税込金額は" + amount + "円です");
    int person = 5;
    System.out.println("人数が"+ person + "の場合");
    int amountPerPerson = amount / person;
    System.out.println("一人当たり" + amountPerPerson + "円です");
    int remainder = amount % person;
    System.out.println("あまりは" + remainder + "円です");
  }
}