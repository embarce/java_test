package HashSet;

import java.util.HashSet;

/*
HashSet存储自定义类型元素
要求：
同名同年龄的视为同一个人只能存储一次
 */
public class Demo_preson {
    public static void main(String[] args) {
        HashSet<Preson> set=new HashSet<>();
        Preson p1=new Preson("张伟",18);
        Preson p2=new Preson("张伟",18);
        Preson p3=new Preson("张伟",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
