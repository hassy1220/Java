import java.util.*;
public class split{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String date = sc.nextLine();
    System.out.println(date);
    
    String[] array = date.split(",");
    System.out.println(array[0]);
    System.out.println(array.length);
    
    for (String name : array){
      System.out.println(name + "が現れた");
    }
  }
}