package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
set接口的特点：
1.不允许存储重复的元素
2.没有索引，不能使用for循环遍历
HashSet接口：
1.不允许存储重复的元素
2.没有索引，不能使用for循环遍历
3.是一个无序的集合，存储元素和取出元素的顺序可能不一致
4.底层是一个哈希表的结构（查询速度非常快）
 */
public class HashSet_demo {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            Integer n=it.next();
            System.out.println(n);
        }
        System.out.println("==========================");
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
