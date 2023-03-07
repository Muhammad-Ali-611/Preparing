package Practice;

import java.util.Set;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<Integer,String> map = new java.util.HashMap<>();

        map.put(1, "NY");
        map.put(2 , "LA");
        map.put(3, "LONDON");

        Set<Integer> keys = map.keySet();

        for ( int key: keys) {
            System.out.println(key + " " + map.get(key));
        }
        }
    }

