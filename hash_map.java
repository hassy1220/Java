// Hashmapを作る
import java.util.HashMap;
public class hash_map {
    public static void main(String[] args) {
     String[] enemyArray = {"スライム","ドラゴン","魔王"};
     System.out.println(enemyArray[0]);
     System.out.println(enemyArray[1]);
     System.out.println(enemyArray[2]);
     
     System.out.println("---");
     
     HashMap<String,String> enemyMap = new HashMap<String,String>();
     enemyMap.put("雑魚","スライム");
     enemyMap.put("中ボス","ドラゴン");
     enemyMap.put("ラスボス","魔王");
     
     enemyMap.remove("中ボス");
     String level = "中ボス";
     System.out.println(enemyMap.get(level));
     System.out.println(enemyMap.size());
    }
}