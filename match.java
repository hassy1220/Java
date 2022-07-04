import java.util.*;

public class match {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    System.out.println("Hello " + name);
    //equals(引数)と一致するかどうか
    if (name.equals("java")){
      System.out.println("Welcome");
    } else if (name.equals("JAVA")){
      System.out.println("Good morning");
    } else {
      System.out.println("Good Bye");
    }
  }
}