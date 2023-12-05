import java.util.HashMap;

public class Iteratory {

    public static String getStart(HashMap<String, String> maps){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : maps.keySet()){
            revMap.put(maps.get(key), key);
        }
        for(String key : maps.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("JFK","SFO");
        map.put("JFK","ATL");
        map.put("SFO","ATL");
        map.put("ATL","JFK");

        String start = getStart(map);

        while(map.containsKey(start)){
            System.out.println(start);

            start = map.get(start);
        }

        System.out.println(start);
    }
}
