import java.util.*;
public class arraylist{
  public static void main(String[] arags){
    ArrayList<String> team = new ArrayList<String>();
    team.add("勇者");
    team.add("戦士");
    for(String member : team){
      System.out.println(member);
    }
    System.out.println(team.get(0));
    System.out.println(team.size());
    
    team.add("魔法使い");
    for(String member : team){
      System.out.println(member);
    }
    
    System.out.println(team.size());
    
    team.set(1,"忍");
    for(String member : team){
      System.out.println(member);
    }
    
    System.out.println(team.size());
    
    
    team.remove(2);
    for(String member : team){
      System.out.println(member);
    }
    
    System.out.println(team.size());
    
  }
}