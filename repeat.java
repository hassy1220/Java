public class repeat{
  public static void main(String[] args){
    String greeting = "Hello world";
    
    //int i = 0で整数の０を代入。iが２未満の間は処理をループさせる
    for (int i = 0; i < 2; i++){
      System.out.println(greeting + ":" + i);
    }
  }
}