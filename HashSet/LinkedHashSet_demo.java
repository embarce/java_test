package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
LinkedHashSet的特点：
底层是一个哈希表（数组+链表+红黑树）+链表：多了一条链表（记录元素的储存循序），保证元素的有序
 */
public class LinkedHashSet_demo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("www");
        set.add("aaa");
        set.add("bbb");
        System.out.println("输出是无序的不按存储数据"+set);
        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set.add("www");
        set.add("aaa");
        set.add("bbb");
        System.out.println("输出是有序的按存储数据"+set1);
    }
}
