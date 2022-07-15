package lesson3;
public class Thief{
	String name;
	int hp;
	int mp;

	public Thief(String name,int hp, int mp){
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}
	public Thief(String name,int hp) {
		this.hp = hp;
		this.name = name;
		this.mp = 5;
	}
	public Thief(String name) {
		this.name = name;
		this.hp = 40;
		this.mp = 5;
	}
}