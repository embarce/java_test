package Map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable_demo {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);


        Hashtable<String,String> map01=new Hashtable<>();
        map01.put(null,"a");
        map01.put("b",null);
        map01.put(null,null);
    }
}
