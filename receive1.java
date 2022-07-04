import java.util.*;

public class receive1 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String text = scan.next();
    System.out.println(text);
    //scan.nextで入力した値を受け取れる(INT江尾つけると数値として受け取れる)
    int number = scan.nextInt();
    System.out.println(number * 10);
    System.out.println("お小遣い"+ number + "円");
  }
}

