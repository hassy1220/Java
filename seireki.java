import java.util.Calendar;
public class seireki{
  public static void main(String[] args){
    Calendar calendar = Calendar.getInstance();
    int seireki = calendar.get(calendar.YEAR);
    // int seireki = 2015;
    System.out.print("西暦" + seireki + "年は");

    int heisei = seireki-1988;
    System.out.println("平成" + heisei + "年です。");
  }
}