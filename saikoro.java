//サイコロ
public class saikoro{
  public static void main(String[] args){
    //randomメソッドは0と１の間の数値をランダムで返す(*a + b)とするとbからaの間の数値を返す
    double rand = Math.random() *6 + 1;
    int number = (int)rand;
    System.out.println(number);
  }
}
