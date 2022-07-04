import java.util.*;
public class several_next{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();

    for (int i = 0 ; i < count; i ++){
     int number = scan.nextInt();
     if (number == 10){
       System.out.println(number + "は１０に等しい");
     } else if (number > 10){
       System.out.println(number + "は１０より大きい");
     } else {
       System.out.println(number + "は１０未満");
     }
     
    }
  }
}