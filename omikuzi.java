public class omikuzi{
  public static void main(String[] args){
    int omikuzi = (int)(Math.random()*10 + 1);
    // System.out.println(omikuzi);
    if (omikuzi == 1){
      System.out.println("大吉");
    } else if (omikuzi ==2){
      System.out.println("中吉");
    } else if (omikuzi <= 4){
      System.out.println("小吉");
    } else if (omikuzi <= 7){
      System.out.println("凶");
    } else {
      System.out.println("大凶");
    }
  }
}