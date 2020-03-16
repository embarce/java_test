package Test.ArrayList;

import java.util.ArrayList;
import java.util.Random;

/* 题目:
生成6个1-33之间的随机数，添加到集合，并且遍历

 */
public class ArrayListRandom {
    public static void main(String[] args) {
        Random r=new Random(33);
        ArrayList<Integer> list=new ArrayList<>();
       for (int i=0;i<6;i++){
           list.add(r.nextInt(33)+1);
       }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
