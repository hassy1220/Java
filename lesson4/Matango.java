package lesson4;
public class Matango{
	int hp = 50;
	char suffix;
	public Matango(char suffix){
		this.suffix = suffix;
	}
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "ダメージ");
//		if(this.poisonCount == 0) {
//			System.out.println("キノコ" + this.suffix + "ダメージ");
//		}
	}
}