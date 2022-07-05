public class critical{
  public static void main(String[] args){
    int hit = (int)(Math.random()*10+1);
	    System.out.println(hit);
	  if (hit < 6){
	        System.out.println("スライムに" + hit + "のダメージを与えた");
	  }else {
	        System.out.println("スライムに１００ダメージを与えた");
	  }
  }
}