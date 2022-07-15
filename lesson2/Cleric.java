package lesson2;

public class Cleric{
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println("HPが最大まで回復した");
	}
	public int pray(int sec) {
		int num = new java.util.Random().nextInt(3);
		int kaihuku = sec + num;
		if(MAXMP - this.mp > kaihuku) {
			return this.mp = MAXMP;
		}else {
			return this.mp += kaihuku;
		}
		
	}
}