public class four_lesson{
  public static void main(String[] args){
    int[] points = new int[4];
    double[] weights = new double[5];
    boolean[] answers = new boolean[3];
    String[] names = new String[3];
    System.out.print(points.length);
    System.out.print(weights.length);
    System.out.print(answers.length);
    System.out.print(names.length);
    System.out.println("");
    System.out.println("");
    
    int[] moneyList = {121902,8302,55100};
    for(int i = 0;i < moneyList.length; i++){
      System.out.println(moneyList[i]);
    }
    
    System.out.println("");
    for(int money : moneyList){
      System.out.println(money);
    }
    
    int[] numbers = {3,4,9};
    System.out.print("１桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    
    for(int i = 0;i < numbers.length; i++){
      if(numbers[i] == input){
        System.out.println("あたり");
      }
    }
  }
}