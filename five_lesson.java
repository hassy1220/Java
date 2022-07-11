public class five_lesson{
  public static void main(String[] args){
    introduceOneself("橋本亮",25,177.0,'虎');
    email("今日に天気は","aaa@aaa","今日の天気は晴れです");
    email("qq@qq","こんにちわ");
    double area = calcTriangleArea(20,20);
    System.out.println(area + "cm2");
    double circleArea = calcCircleArea(5);
    System.out.println(circleArea + "cm2");
  }
  public static void introduceOneself(String name,int age,double height,char zodiac){
    System.out.println("私の名前は" + name + "です。年齢は" + age+ "歳です。身長は" + height + "cm。干支は" + zodiac + "です");
  }
  public static void email(String title,String address,String text){
    System.out.println(address + "に、以下のメールを送信しました。");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void email(String address,String title){
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("無題");
    System.out.println(title);
  }
  public static double calcTriangleArea(double bottom,double height){
    double area = (bottom * height) / 2;
    return area;
  }
  public static double calcCircleArea(double radius){
    final double pi = 3.14;
    double area = radius * radius * pi;
    return area;
  }
}