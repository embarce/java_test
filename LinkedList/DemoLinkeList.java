package LinkedList;

import java.util.LinkedList;

/*
LinkedList集合：
底层是链表结构查询慢增删快
里边有大量的首尾操作
不能使用多态
 */
public class DemoLinkeList {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        LinkedList<String> linked=new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        System.out.println("=========================");
        String removeE=linked.removeFirst();
        System.out.println(linked);

    }

    private static void demo01() {
        LinkedList<String> linked=new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        linked.addFirst("www");
        linked.push("http://");
        linked.addLast(".com");
        System.out.println(linked);
    }
}
