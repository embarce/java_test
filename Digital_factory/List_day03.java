package Digital_factory;

import java.util.ArrayList;
import java.util.List;

public class List_day03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("d");
        list.add("e");
        List<String> list1 = new ArrayList<>();
        list1.add("d");
        list1.add("e");
        list1.add("a");
        list1.add("c");
        boolean flag = list.containsAll(list1);
        list.remove("c");
        System.out.println(flag);
        System.out.println(list.size());
        for (String s : list.toArray(new String[0])) {
            System.out.print(s + " ");
        }

        if (null != list && list.size() > 0) {
            for (String s : list) {
                System.out.println(s);
            }
        }
        //使用简便for
        list.forEach((t) -> System.out.println("字符是" + t));
    }
}
