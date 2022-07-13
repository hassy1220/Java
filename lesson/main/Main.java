// import comment.Zenhan;

// public class Main{
//   public static void main(String[] args) throws Exception{
//     Zenhan.doWarusa();
//   }
// }
import calcapp.Zenhan;
public class Main{
  public static void main(String[] args){
    int a = 10;
    int b = 2;
    int total = Zenhan.tasu(a,b);
    int delta = calcapp.logics.Zenhan.hiku(a,b);
    System.out.println("足すと" + total + ",引と" + delta);
  }
}