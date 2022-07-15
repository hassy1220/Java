package lesson3;
public class Main{
	public static void main(String[] args) {
		Thief thief = new Thief("橋本",50,5);
		System.out.println("名前は" + thief.name +"、HP:" + thief.hp + "、MP:" + thief.mp);
	}
}