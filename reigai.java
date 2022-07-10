// 例外処理 - 0除算

public class reigai {
    public static void main(String[] args) {
      System.out.println("Hello world");
      try {
        int number = 2;
        int answer = 100 / number;
        System.out.println(answer);
      } catch(Exception e){
        e.printStackTrace();
      } finally {
        System.out.println("Hello java");
      }
      
    }
}