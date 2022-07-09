public class object_what {
    public static void main(String[] args) {
      String text = new String("Hello world");
      System.out.println(text);
      System.out.println(text.length());
      
      int[] numbers = new int[4];
      for (int item : numbers){
        System.out.println(item);
      }
      System.out.println(numbers.length);
    }
}