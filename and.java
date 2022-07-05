public class and{
  public static void main(String[] args){
    int number = (int)(Math.random()*100+1);
    System.out.println(number);
    if (number >= 30 && number <= 60){
      System.out.println("あたり");
    } else {
      System.out.println("残念");
    }
  }
}