package Hashing;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class New {
    public static void main(String[] args) {
        // Map<String, Integer> map = new LinkedHashMap<>();

        Map<String, Integer> map = new HashMap<>();

        map.put("dhrubo", 1);
        map.put("john", 2);
        map.put("rambo", 3);
        map.put("ghost", 4);
        
        System.out.println(map);

        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // System.out.println(map.remove("dhrubo", 1));
        // System.out.println(map);

        if(map.containsKey("dhrubo")){
            int a = map.get("dhrubo");
            System.out.println(a);
        }else{
            System.out.println("nothing found");
        }
    }
}
