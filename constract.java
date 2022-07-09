// 引数ありのコンストラクタ

public class constract {
    public static void main(String[] args) {
        Box box = new Box("悪魔の剣");
        box.open();

        System.out.println();

        JewelryBox jewelryBox = new JewelryBox("天使の指輪");
        jewelryBox.look();
        jewelryBox.open();
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

class JewelryBox extends Box {
     public JewelryBox(String item){
      super(item);
     }
    public void look() {
        System.out.println("宝箱はキラキラと輝いている。");
    }
}