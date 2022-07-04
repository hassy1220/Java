import java.util.*;

public class several{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    System.out.println(count);

    for (int i = 0; i < count; i++){
      String name = scan.next();
      System.out.println("Hello " + name);
    }
  }
}