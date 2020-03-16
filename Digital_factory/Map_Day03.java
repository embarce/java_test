package Digital_factory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Day03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");
        map.put("d", "d");
        Map<String, String> map2 = new HashMap<>();
        map2.put("d", "d");
        map2.put("e", "e");
        map2.put("f", "f");
        map2.put("g", "g");
        map2.put("2", "2");
        map.putAll(map2);
        //增强for使用Entry来遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":-->" + entry.getValue());
        }
        //增强for获取key值
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        //简便for增强写法
        map.forEach((t, v) -> System.out.println("key: " + t + " value : " + v));
        int i = find(10);
        System.out.println(i);
    }

    /**
     *
     * @param num 输入一个数字
     * @return
     * Embrace
     * 2020年3月4日 10:42:24
     */
    public static int find(int num){
        return num;
    }
}
