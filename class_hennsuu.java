public class class_hennsuu {
    public static void main(String[] args) {
     Player player1 = new Player("戦士");
     player1.walk();
     Player player2 = new Player("マノうつ会");
     player2.walk();
    }
}

class Player{
  private String myName;
  
  public Player(String name){
    myName = name;
  }
  public void walk(){
    System.out.println(myName+"勇者は荒野を歩いていた");
  }
}