import java.util.*;
public class hairetus{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<String>array = new ArrayList<String>();
     while(scan.hasNextLine()){
       String date = scan.nextLine();
       array.add(date);
     }

     for(String name : array){

       System.out.println(array);
     }

  }
}