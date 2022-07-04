import java.util.*;

public class terms_next {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    System.out.println(number);

    if (number == 10){
      System.out.println("Welcome");
    } else if (number > 10) {
      System.out.println("Good morning");
    }  else {
      System.out.println("Goodbye");
    }
  }
}