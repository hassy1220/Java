// クラスを継承する

public class class_keisyo {
    public static void main(String[] args) {
        Box box = new Box();
        box.open();
        
        JewelryBox jewelrybox = new JewelryBox();
        jewelrybox.look();
        jewelrybox.open();
      
    }
}
class Box{
  public String myItem;
  
  public Box(){
      myItem = "新しいアイテム";
  }
  
  public void open(){
      System.out.println("宝箱を開いた"+myItem+"を手に入れた");
  }
}

class JewelryBox extends Box{
    public void look(){
        System.out.println("宝箱はきらきらと輝いている");
    }
}
