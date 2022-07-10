// HashMapをループで処理する
import java.util.HashMap;
import java.util.Map.Entry;
public class hash_roop {
    public static void main(String[] args) {
     HashMap<String,String> enemyMap = new HashMap<String,String>();
     enemyMap.put("ザコ","スライム");
     enemyMap.put("中ボス","ドラゴン");
     enemyMap.put("ラスボス","魔王");
     
     for(Entry<String,String> entry : enemyMap.entrySet()){
       System.out.print(entry.getValue());
       System.out.println(entry.getKey());
     }
     //System.out.println(enemyMap.get("中ボス"));
    
    
    }
}