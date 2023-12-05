import java.util.HashSet;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);

        // int a = set.size();
        // System.out.println("Size of set " + a);

        // System.out.println(set);

        // if (set.contains(1)) {
        // System.out.println("True");
        // }
        // if (!set.contains(3)) {
        // System.out.println("False");
        // }

        // Iterator it = set.iterator();
        // it.next();
        // it.next();
        // if(!it.hasNext()){
        // System.out.println("True");
        // }

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 120);
        map.put("China", 130);

        System.out.println(map);

        map.containsKey("China");

        map.get("India");
        System.out.println(map.get("India"));

        // for(int val:arr)

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        ;

    }
}
