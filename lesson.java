public class lesson{
  public static void main(String[] args){
    int isHungry = 1;
    String food = "apple";
    System.out.println("こんにちわ！");
    if(isHungry == 0){
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした");
  }
}