//データを受け取る機能を扱えるように
import java.util.*;
public class receive{
  public static void main(String[] args){
    //データを受け取る為の機能 System.inが標準入力することを指定するもの
    Scanner scan = new Scanner(System.in);
    String text = scan.next();
    System.out.println("Hello " + text);
  }
}