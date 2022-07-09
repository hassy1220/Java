// メソッドのオーバーライド

public class over {
    public static void main(String[] args) {
        Box box = new Box("鋼鉄の剣");
        box.open();
        
        MagicBox magicbox = new MagicBox("モノマネモンスター");
        magicbox.look();
        magicbox.open();
    }
}

class Box {
    public String myItem;

    public Box(String item) {
        myItem = item;
    }

    public void open() {
        System.out.println("宝箱を開いた。" + myItem + "を手にいれた。");
    }
}

class MagicBox extends Box{
  public MagicBox(String item){
    super(item);
  } 
  public void look(){
    System.out.println("宝箱は怪しく光り輝いている");
  }
  
  public void open(){
    System.out.println("宝箱を開いた"+myItem+"が襲ってきた");
  }
}