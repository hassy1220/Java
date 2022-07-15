package lesson2;

public class Main{
	public static void main(String[] args) {
		Cleric hero = new Cleric();
		hero.name = "橋本";
		System.out.println("名前は" + hero.name + "。HPは" + hero.hp + "。MPは" + hero.mp + "です");
	}
}