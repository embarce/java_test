package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person_demo {
    public static void main(String[] args) {
        show1();
        show2();
    }

    private static void show2() {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("俊朗",18),"男");
        map.put(new Person("小明",18),"男");
        map.put(new Person("小强",18),"男");
        map.put(new Person("小红",18),"男");
        map.put(new Person("小明",18),"女");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person person = entry.getKey();
            String value = entry.getValue();
            System.out.println(person+"--->"+value);
        }

    }

    /*
    key：String类型自定义类型
    必须重写hashCode和equals
     */
    private static void show1() {
        HashMap<String,Person> map=new HashMap<>();
        map.put("班长",new Person("小明",18));
        map.put("副班长",new Person("小红",18));
        map.put("体育委员",new Person("小强",18));
        map.put("普通同学",new Person("小明",18));
        map.put("班花",new Person("俊朗",18));
        Set<String> set = map.keySet();
        for (String s : set) {
            Person value=map.get(s);
            System.out.println(value);
        }

    }
}
