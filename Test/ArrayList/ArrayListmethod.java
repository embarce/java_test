package Test.ArrayList;

import java.util.ArrayList;

/*

 */
public class ArrayListmethod {
    public static void main(String[] args) {
        /*添加元素，add*/
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        boolean success=list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list);
        System.out.println("success "+success);
        /*读取元素*/
        String name=list.get(2);
        System.out.println(name);
        /*删除元素*/
        String whoRemoved= list.remove(3);
        System.out.println(list);
        System.out.println("被删除的是"+whoRemoved);
        /*获取元素个数，长度*/
        int size=list.size();
        System.out.println("你的个数是"+size);
        /*遍历集合*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        /* 集合是不可以存放基本类型的,解决办法只能包装成类
        byte   Byte
        short  Short
        int    Integer
        long   Long
        float  Float
        double Double
        char   Character
        boolean Boolean
         */
        ArrayList<Integer> listA=new ArrayList<>();
        listA.add(100);
        listA.add(200);
        int listA_2=listA.get(1);
        System.out.println(listA_2);
    }
}
