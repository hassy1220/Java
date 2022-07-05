import java.util.*;
public class input_next{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    System.out.println(count);
    for (int i = 0;i <= count;i++){
      String date = sc.next();
      System.out.println(date);
    }
    // String date = sc.next();
    
    // date = sc.next();
    // System.out.println(date);
  }
}