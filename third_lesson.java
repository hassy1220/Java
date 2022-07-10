public class third_lesson{
  public static void main(String[] arags){
    System.out.print("「【数当てゲーム】」");
    int ans = new java.util.Random().nextInt(9);
    for(int i = 0;i < 4;i++){
      System.out.print("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if(num == ans){
        System.out.println("あたり");
        break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}