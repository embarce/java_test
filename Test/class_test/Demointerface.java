package Test.class_test;

import java.util.ArrayList;
import java.util.List;

public class Demointerface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名词，这就是多态写法
        List<String> list=new ArrayList<>();
        List<String> rlist=Demointerface.addName(list);
        for (int i = 0; i <rlist.size(); i++) {
            System.out.println(rlist.get(i));
        }
    }
    public static List<String> addName(List<String> list){
        list.add("chq");
        list.add("chw");
        list.add("che");
        return list;
    }
}
