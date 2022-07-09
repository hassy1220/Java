import java.util.*;

public class class_teki {
  public static void main(String[] args){
    
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    enemies.add(new Enemy("スライム"));
    enemies.add(new Enemy("モンスター"));
    enemies.add(new Enemy("ドラゴン"));
    
    for(Enemy member : enemies){
      member.attack();
    }
  }
    
    
}

class Enemy{
  private String myName;
  
  public Enemy(String name){
    myName = name;
  }
  public void attack(){
      System.out.println(myName+"は勇者を攻撃した");
  }
  
}

