public class method_first {
    public static void main(String[] args) {
     int num1 = sum(3,5);
     System.out.println(num1);
     
     int num2 = sum(300,500);
     System.out.println(num2);
    }
    public static int sum(int x,int y){
      return x + y;
    }
}