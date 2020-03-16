package Digital_factory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("小米", 2000);
        map.put("华为", 3000);
        map.put("苹果", 4000);

        //使用map中的entrySet方法把map中的多个entry拿出来放到一个set中
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //使用迭代器来便利集合
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "-->" + value);
        }
        map.remove("苹果");
        //使用forearch循环
        System.out.println("=============使用forearch循环======================");
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

    }
}
